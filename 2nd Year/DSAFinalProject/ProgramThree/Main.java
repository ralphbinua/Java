package DSAFinalProject.ProgramThree;

import java.util.*;

public class Main {
    static class Graph {
        private final Map<String, List<Edge>> adjacencyList = new HashMap<>();

        static class Edge {
            String destination;
            int weight;

            Edge(String destination, int weight) {
                this.destination = destination;
                this.weight = weight;
            }
        }

        void addEdge(String source, String destination, int weight) {
            adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Edge(destination, weight));
            adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(new Edge(source, weight));
        }

        List<String> dijkstra(String start, String end, Result result) {
            PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
            Map<String, Integer> distances = new HashMap<>();
            Map<String, String> previous = new HashMap<>();
            Set<String> visited = new HashSet<>();
            List<String> path = new ArrayList<>();

            for (String node : adjacencyList.keySet()) {
                distances.put(node, Integer.MAX_VALUE);
            }
            distances.put(start, 0);
            pq.add(new Edge(start, 0));

            while (!pq.isEmpty()) {
                Edge current = pq.poll();
                String currentNode = current.destination;
                result.operations++; // Increment operation count

                if (visited.contains(currentNode)) continue;
                visited.add(currentNode);

                if (currentNode.equals(end)) break;

                for (Edge neighbor : adjacencyList.getOrDefault(currentNode, new ArrayList<>())) {
                    int newDist = distances.get(currentNode) + neighbor.weight;
                    if (newDist < distances.get(neighbor.destination)) {
                        distances.put(neighbor.destination, newDist);
                        pq.add(new Edge(neighbor.destination, newDist));
                        previous.put(neighbor.destination, currentNode);
                    }
                }
            }

            String current = end;
            while (previous.containsKey(current)) {
                path.add(0, current);
                current = previous.get(current);
            }
            if (start.equals(end) || previous.containsKey(current)) path.add(0, start);
            result.totalTime = distances.getOrDefault(end, -1);
            return path;
        }

        List<String> bfs(String start, String end, Result result) {
            Queue<String> queue = new LinkedList<>();
            Map<String, String> previous = new HashMap<>();
            Set<String> visited = new HashSet<>();
            List<String> path = new ArrayList<>();

            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                String current = queue.poll();
                result.operations++; // Increment operation count

                if (current.equals(end)) break;

                for (Edge neighbor : adjacencyList.getOrDefault(current, new ArrayList<>())) {
                    if (!visited.contains(neighbor.destination)) {
                        visited.add(neighbor.destination);
                        queue.add(neighbor.destination);
                        previous.put(neighbor.destination, current);
                    }
                }
            }

            String current = end;
            while (previous.containsKey(current)) {
                path.add(0, current);
                current = previous.get(current);
            }
            if (start.equals(end) || previous.containsKey(current)) path.add(0, start);
            result.totalTime = calculatePathTime(path);
            return path;
        }

        private int calculatePathTime(List<String> path) {
            if (path.size() < 2) return 0;
            int total = 0;
            for (int i = 0; i < path.size() - 1; i++) {
                for (Edge edge : adjacencyList.get(path.get(i))) {
                    if (edge.destination.equals(path.get(i + 1))) {
                        total += edge.weight;
                        break;
                    }
                }
            }
            return total;
        }
    }

    static class Result {
        int totalTime = 0;
        int operations = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        // Sample town map with routes
        graph.addEdge("A", "B", 10);
        graph.addEdge("B", "C",  15);
        graph.addEdge("A", "D", 20);
        graph.addEdge("D", "E", 10);
        graph.addEdge("E", "C", 17);

        System.out.print("Starting District: ");
        String start = sc.nextLine();
        System.out.print("Destination District: ");
        String end = sc.nextLine();

        // Validate input districts
        if (!graph.adjacencyList.containsKey(start) || !graph.adjacencyList.containsKey(end)) {
            System.out.println("Invalid district names. Please ensure both districts exist in the graph.");
            sc.close();
            return;
        }

        Result dijkstraResult = new Result();
        Result bfsResult = new Result();
        List<String> dijkstraPath = graph.dijkstra(start, end, dijkstraResult);
        List<String> bfsPath = graph.bfs(start, end, bfsResult);

        System.out.println("\nAlgorithm 1 (Dijkstra's):");
        System.out.println("Path found: " + String.join(" -> ", dijkstraPath) + " -> " + end);
        System.out.println("Total time: " + dijkstraResult.totalTime + " minutes");
        System.out.println("Number of operations: " + dijkstraResult.operations);

        System.out.println("\nAlgorithm 2 (BFS):");
        System.out.println("Path found: " + String.join(" -> ", bfsPath) + " -> " + end);
        System.out.println("Total time: " + bfsResult.totalTime + " minutes");
        System.out.println("Number of operations: " + bfsResult.operations);

        // Compare performance
        int operationDifference = Math.abs(dijkstraResult.operations - bfsResult.operations);
        String recommendedAlgorithm;
        String reason;

        if (dijkstraResult.operations < bfsResult.operations) {
            recommendedAlgorithm = "Dijkstra's";
            reason = "it uses fewer operations and is more efficient with weighted graphs.";
        } else {
            recommendedAlgorithm = "BFS";
            reason = "it is simpler and faster in unweighted graphs, though less optimal for this problem.";
        }

        System.out.println("\nComparison:");
        System.out.println("Algorithm 1 is faster by " + operationDifference + " operations");
        System.out.println("Recommended algorithm: " + recommendedAlgorithm + " because " + reason);

        // Sample package data
        System.out.println("\nInitial packages:");
        System.out.println("P1: Express to District C");
        System.out.println("P2: Regular to District B");
        System.out.println("P3: Next day to District E");
        System.out.println("P4: Express to District D");

        // Priority Queue Implementations
        ArrayPriorityQueue arrayQueue = new ArrayPriorityQueue();
        arrayQueue.add(new Package("P1", 1, "C"));
        arrayQueue.add(new Package("P2", 3, "B"));
        arrayQueue.add(new Package("P3", 2, "E"));
        arrayQueue.add(new Package("P4", 1, "D"));

        System.out.println("\nArray-based Priority Queue:");
        System.out.println("Delivery Order:");
        arrayQueue.printQueue();
        System.out.println("Operations taken: " + arrayQueue.operations);

        HeapPriorityQueue heapQueue = new HeapPriorityQueue();
        heapQueue.add(new Package("P1", 1, "C"));
        heapQueue.add(new Package("P2", 3, "B"));
        heapQueue.add(new Package("P3", 2, "E"));
        heapQueue.add(new Package("P4", 1, "D"));

        System.out.println("\nHeap-based Priority Queue:");
        System.out.println("Delivery Order:");
        heapQueue.printQueue();
        System.out.println("Operations taken: " + heapQueue.operations);

        // Compare heap vs array priority queue
        int heapVsArrayDifference = Math.abs(arrayQueue.operations - heapQueue.operations);
        System.out.println("\nComparison:");
        System.out.println("Heap implementation was faster by " + heapVsArrayDifference + " operations");

        sc.close();
    }

    // Package class to store package info
    static class Package {
        String id;
        int priority;
        String destination;

        Package(String id, int priority, String destination) {
            this.id = id;
            this.priority = priority;
            this.destination = destination;
        }
    }

    // Array-based Priority Queue implementation
    static class ArrayPriorityQueue {
        List<Package> queue = new ArrayList<>();
        int operations = 0;

        void add(Package p) {
            queue.add(p);
            queue.sort(Comparator.comparingInt(pkg -> pkg.priority));
            operations++; // Increment operation count for add
        }

        void printQueue() {
            for (Package p : queue) {
                System.out.println(p.id + " (" + (p.priority == 1 ? "Express" : (p.priority == 2 ? "Next day" : "Regular")) + " to District " + p.destination + ")");
            }
        }
    }

    // Heap-based Priority Queue implementation
    static class HeapPriorityQueue {
        PriorityQueue<Package> queue = new PriorityQueue<>(Comparator.comparingInt(pkg -> pkg.priority));
        int operations = 0;

        void add(Package p) {
            queue.add(p);
            operations++; // Increment operation count for add
        }

        void printQueue() {
            while (!queue.isEmpty()) {
                Package p = queue.poll();
                System.out.println(p.id + " (" + (p.priority == 1 ? "Express" : (p.priority == 2 ? "Next day" : "Regular")) + " to District " + p.destination + ")");
            }
        }
    }
}
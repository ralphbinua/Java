import java.util.Scanner;

class TrainCar {
    private int carNumber;
    private String cargo;
    private TrainCar next;

    public TrainCar(int carNumber) {
        this.carNumber = carNumber;
        this.cargo = "";
        this.next = null;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public TrainCar getNext() {
        return next;
    }

    public void setNext(TrainCar next) {
        this.next = next;
    }
}

class Train {
    private TrainCar engine;

    public Train() {
        this.engine = new TrainCar(0);
    }

    public void addCar() {
        TrainCar newCar = new TrainCar(getNextAvailableCarNumber());
        addCarToTheEnd(newCar);
    }

    private int getNextAvailableCarNumber() {
        int carNumber = 1;
        TrainCar currentCar = engine;
        while (currentCar.getNext() != null) {
            currentCar = currentCar.getNext();
            carNumber++;
        }
        return carNumber;
    }

    private void addCarToTheEnd(TrainCar newCar) {
        TrainCar currentCar = engine;
        while (currentCar.getNext() != null) {
            currentCar = currentCar.getNext();
        }
        currentCar.setNext(newCar);
    }

    public void removeCar(int carNumber) {
        if (carNumber == 0) {
            System.out.println("Cannot remove the engine (car 0)");
            return;
        }
        TrainCar currentCar = engine;
        while (currentCar.getNext() != null) {
            if (currentCar.getNext().getCarNumber() == carNumber) {
                currentCar.setNext(currentCar.getNext().getNext());
                System.out.println("Removed car number " + carNumber);
                return;
            }
            currentCar = currentCar.getNext();
        }
        System.out.println("Car not found");
    }

    public void switchCars(int car1, int car2) {
        if (car1 == 0 || car2 == 0) {
            System.out.println("Cannot switch the engine (car 0)");
            return;
        }

        TrainCar car1Prev = null, car1Node = null;
        TrainCar car2Prev = null, car2Node = null;

        TrainCar currentCar = engine;

        while (currentCar != null) {
            if (currentCar.getNext() != null && currentCar.getNext().getCarNumber() == car1) {
                car1Prev = currentCar;
                car1Node = currentCar.getNext();
            }
            if (currentCar.getNext() != null && currentCar.getNext().getCarNumber() == car2) {
                car2Prev = currentCar;
                car2Node = currentCar.getNext();
            }
            currentCar = currentCar.getNext();
        }

        if (car1Node == null || car2Node == null) {
            System.out.println("One or both cars not found");
            return;
        }

        // Swap nodes
        if (car1Prev != null) {
            car1Prev.setNext(car2Node);
        }
        if (car2Prev != null) {
            car2Prev.setNext(car1Node);
        }

        // Swap next pointers
        TrainCar temp = car1Node.getNext();
        car1Node.setNext(car2Node.getNext());
        car2Node.setNext(temp);
    }

    private TrainCar findCar(int carNumber) {
        TrainCar currentCar = engine;
        while (currentCar != null) {
            if (currentCar.getCarNumber() == carNumber) {
                return currentCar;
            }
            currentCar = currentCar.getNext();
        }
        return null;
    }

    public void loadCargo(int carNumber, String cargo) {
        TrainCar carNode = findCar(carNumber);
        if (carNode == null) {
            System.out.println("Car not found");
            return;
        }
        carNode.setCargo(cargo);
    }

    public void unloadCargo(int carNumber) {
        TrainCar carNode = findCar(carNumber);
        if (carNode == null) {
            System.out.println("Car not found");
            return;
        }
        carNode.setCargo("");
    }

    public void displayTrain() {
        TrainCar currentCar = engine.getNext(); // Start from the first car
        while (currentCar != null) {
            System.out.println("Car " + currentCar.getCarNumber() + ": " + currentCar.getCargo());
            currentCar = currentCar.getNext();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train train = new Train();
        int choice;

        do {
            System.out.println("\nTrain Simulation Menu:");
            System.out.println("1. Add Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Switch Cars");
            System.out.println("4. Load Cargo");
            System.out.println("5. Unload Cargo");
            System.out.println("6. Display Train");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    train.addCar();
                    break;
                case 2:
                    System.out.print("Enter car number to remove: ");
                    int removeCarNumber = scanner.nextInt();
                    train.removeCar(removeCarNumber);
                    break;
                case 3:
                    System.out.print("Enter the first car number to switch: ");
                    int car1 = scanner.nextInt();
                    System.out.print("Enter the second car number to switch: ");
                    int car2 = scanner.nextInt();
                    train.switchCars(car1, car2);
                    break;
                case 4:
                    System.out.print("Enter car number to load cargo: ");
                    int loadCarNumber = scanner.nextInt();
                    System.out.print("Enter cargo to load: ");
                    String cargoToLoad = scanner.next();
                    train.loadCargo(loadCarNumber, cargoToLoad);
                    break;
                case 5:
                    System.out.print("Enter car number to unload cargo: ");
                    int unloadCarNumber = scanner.nextInt();
                    train.unloadCargo(unloadCarNumber);
                    break;
                case 6:
                    train.displayTrain();
                    break;
                case 0:
                    System.out.println("Exiting the simulation.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

    }
}

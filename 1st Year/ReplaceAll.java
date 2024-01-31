public class ReplaceAll {
    public static void main(String[] args) {
        
        String name = "Hello, Ralph Binua"; // i create a string that says hello to ralph

        //the first double quotation refers to the target string that want to change
        //the second double quoatatons refers on what will be the replacement for it
        String newName = name.replaceAll("Ralph Binua","Mary Jane");

        System.out.println("Old: "+name);
        System.out.println("New: "+newName);
    }
}

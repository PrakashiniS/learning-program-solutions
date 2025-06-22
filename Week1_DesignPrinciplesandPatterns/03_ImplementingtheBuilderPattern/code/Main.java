public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i3")
            .setRAM("8GB")
            .build();
        System.out.println("Basic Configuration:");
        basicComputer.displayConfig();
        System.out.println("\n------------------\n");
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .setGraphicsCard("Snapdragon 8 Gen 2")
            .build();
        System.out.println("Gaming Configuration:");
        gamingComputer.displayConfig();
    }
}
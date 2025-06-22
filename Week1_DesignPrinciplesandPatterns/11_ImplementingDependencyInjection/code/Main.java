public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        repository.addCustomer(101, "Alice");
        repository.addCustomer(102, "Bob");
        System.out.println(repository.findCustomerById(101));  
        System.out.println(repository.findCustomerById(103));  
    }
}

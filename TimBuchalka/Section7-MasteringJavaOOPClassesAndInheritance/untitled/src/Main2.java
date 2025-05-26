public class Main2 {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim",1000, "tie@gmai.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLImit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLImit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLImit());
        System.out.println(thirdCustomer.getEmail());
    }
}

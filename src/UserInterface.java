public class UserInterface {

    private InputReader reader;

    public UserInterface(){ //Constructor
        reader = new InputReader();
    }

    public void showMainMenu(){
        boolean quit = false;

        while (quit == false){
            System.out.println("--Main Menu--\n");
            System.out.println("Please Choose: ");
            System.out.println("1. createCustomer");
            System.out.println("2. list Update Customer");
            System.out.println("3. Display Customer Details");
            System.out.println("4. Open Account");
            System.out.println("5. Close Account");
            System.out.println("6. Deposit");
            System.out.println("7. Withdraw");
            System.out.println("8. List All Customers");
            System.out.println("9. List All Accounts And Customers");
            System.out.println("9. List All Accounts And Customers");
            System.out.println("0. exit application");

            String userInput = reader.getInput();

            switch (userInput){
                case "1":
                    createCustomer();
                    break;
                case "2":
                    updateCustomer();
                    break;
                case "3":
                    displayCustomerDetails();
                    break;
                case "4":
                    openAccount();
                    break;
                case "5":
                    closeAccount();
                    break;
                case "6":
                    deposit();
                    break;
                case "7":
                    withdraw();
                    break;
                case "8":
                    listAllCustomers();
                    break;
                case "9":
                    listAllAccountsAndCustomers();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("That is not a valid choice, Please try again\n");
                    break;
            }
        }
    }
}

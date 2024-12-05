import java.util.Scanner;
import java.util.ArrayList;
public class waitingList {
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        ArrayList<String> customers = new ArrayList<>();
        while(true){
        System.out.println("Hi! Do you need help?");
        System.out.println("1- New customer");
        System.out.println("2- Call someone");
        System.out.println("3- Waiting list");
        System.out.println("4- Exit");
        String choice = obj.nextLine(); 
        if(choice.equals("1")){
            System.out.println("What's your name?");
            String name = obj.nextLine();
            customers.add(name);
            System.out.println("Welcome " + name + "!");
        }
        else if(choice.equals("2")){
            System.out.println("What's his name?");
            String customer = obj.nextLine();
            boolean exist = false;
            for(int i = 0; i < customers.size(); i++){
                if(customers.get(i).equals(customer)){
                    System.out.println(customer + " is coming.");
                    exist = true;
                    break;
                }
            }
            if(exist == false){
                System.out.println("This customer doesn't exist.");
            } 
        }
        else if(choice.equals("3")){
            System.out.println("Waiting list: " + customers);
        }
        else if(choice.equals("4")){
            System.out.println("Thank you for coming!");
            break;
        }
        else {
            System.out.println("error");
        }
    }
}
}


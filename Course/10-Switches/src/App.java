public class App {

    public static void main(String[] args) {

        String day = "Pizza";

        switch(day) {

            case "Sunday":
                System.out.println("It is Sunday");
                break;

            case "Saturday":
                System.out.println("It is Saturday");
                break;

            case "Friday":
                System.out.println("It is Friday");
                break;

            case "Thursday":
                System.out.println("It is Thursday");
                break;

            case "Wednesday":
                System.out.println("It is Wednesday");
                break;

            case "Tuesday":
                System.out.println("It is Tuesday");
                break;

            case "Monday":
                System.out.println("It is Monday");
                break;    

            default:
                System.out.println(day + " is not a day");
                break;
        }
        
    }
}

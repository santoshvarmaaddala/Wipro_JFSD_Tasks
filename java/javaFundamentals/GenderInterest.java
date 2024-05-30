public class GenderInterest {
    public static void main(String[] args) {
        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        if (gender.equalsIgnoreCase("female") && age >= 1 && age <= 58) {
            System.out.println("The percentage of interest is 8.2%");
        } else if (gender.equalsIgnoreCase("female") && age >= 59 && age <= 100) {
            System.out.println("The percentage of interest is 9.2%");
        } else if (gender.equalsIgnoreCase("male") && age >= 1 && age <= 58) {
            System.out.println("The percentage of interest is 8.4%");
        } else if (gender.equalsIgnoreCase("male") && age >= 59 && age <= 100) {
            System.out.println("The percentage of interest is 10.4%");
        } else {
            System.out.println("Invalid input. Please check the gender and age values.");
        }
    }

}
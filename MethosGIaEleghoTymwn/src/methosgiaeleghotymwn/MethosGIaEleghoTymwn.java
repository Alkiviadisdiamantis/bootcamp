package methosgiaeleghotymwn;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Scanner;

public class MethosGIaEleghoTymwn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello What is your name ? : ");
        String name = input.next();
        System.out.print("Ok " + name + " please press 'M' if your are male or 'F' if you are female :  ");
        String gender;
        gender = getGender(input);
        System.out.print("And what is your age " + name + "? : ");
        int age;
        age = getAge(input);
        ageCheck(age, name);

        ArrayList<String> season = new ArrayList();
        season.add("Winter");
        season.add("Spring");
        season.add("Summer");
        season.add("Autumn");

        seasonsQuestion();

        
        int choice = getNumber(input);
       
        while (choice > 4 || choice < 0) {
            if (choice > 4 || choice < 0){
                System.out.println("---------invalid----------");
                System.out.println("choose between 1 - 4 ");
            }
            while (!input.hasNextInt()) {
                System.out.println("Invalid");
                System.out.println("choose between 1 - 4 ");
                input.next();
            }
            System.out.println("Invalid");
            System.out.println("choose between 1 - 4 ");
            choice = input.nextInt();
        }

        if (choice == 1) {
            System.out.println(" It must be cold outside ");
        } else if (choice == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");
        } else if (choice == 3) {
            System.out.println("Let's go for swimming ");
        } else if (choice == 4) {
            System.out.println("The trees are full of brown leaves ");
        }
        System.out.print("What is your height ? : ");
        double height;
        while (!input.hasNextDouble()) {
            System.out.println("Invalid");
            System.out.print("Enter Height again : ");
            input.next();
        }

        height = input.nextDouble();
        System.out.print("Whats is your weight ? : ");
        int weight;
        while (!input.hasNextInt()) {
            System.out.println("Invalid");
            System.out.print("insert Weight again : ");
            input.next();
        }
        weight = input.nextInt();

        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("Underweight ");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal weight ");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println(" Overweight");
        } else if (BMI > 30) {
            System.out.println("Obesity ");
        }
        int AgeToDays = age * 365;
        int sum = 0;
        while (AgeToDays > 0) {
            sum = sum + AgeToDays % 10;
            AgeToDays = AgeToDays / 10;
        }
        if (sum > 6) {
            sum = sum % 7;
        }
        ArrayList<String> days = new ArrayList();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println("your lucky day is " + days.get(sum));
        if (days.get(sum).equals("Wednesday") && age >= 20 && age <= 40) {
            if (age >= 20 && age <= 25 && gender.equals("M")) {
                System.out.println("WELCOME " + name);
            }
            if (age > 25 && gender.equals("M")) {
                System.out.println("WELCOME " + "Mr " + name);
            }
            if (gender.equals("F")) {
                System.out.print("Are you Maried?? answer with a 'Y' for yes or 'N' for  no : ");
                String answer = input.next();
                while (!answer.equals("N") && !answer.equals("Y")) {
                    System.out.println("Invalid");
                    System.out.println("Are you Maried?? answer with a 'Y' for yes or 'N' for  no : ");
                    answer = input.next();
                }
                if (answer.equals("Y")) {
                    System.out.println("Welcome Mrs. " + name);
                } else if (answer.equals("N")) {
                    System.out.println("Welcome Ms. " + name);
                }

            }
        } else {
            if (age < 20) {
                System.out.println("Too Young");
            }
            if (age > 40) {
                System.out.println("Too old");
            }
            if (!days.get(sum).equals("Wednesday")) {
                System.out.println("Its not your lucky day");
            }
            System.out.println("You Cannot Enter ");
        }

    }

          

//  -----------------This Method checks if the scanner input is an integer---------------
    static int getNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid");
            System.out.println("choose between 1 - 4 ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // ------------- This Method asks you for your favorite Season-----
    static void seasonsQuestion() {
        System.out.println("What is your favorite season press 1 - 4 to the following choises ");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        System.out.print("Enter number : ");
    }

    //-------------------------This Method is void takes the age and a name and checks 
    //                             your age at 1980 and 2040 it --------
    static void ageCheck(int age, String name) {
        if (age < 6) {
            System.out.println("You are too young for this app. " + name);
            System.out.println("Come back in " + (6 - age) + " years when you will be a student");
        } else if (age >= 6 && age < 19) {
            System.out.println("Oh you are a student ");
            System.out.println("Keep up..." + (18 - age) + " more years left and afterwards you will make money");
        } else if (age >= 19 && age <= 40) {
            System.out.println(" Well, you must be employed. ");
            System.out.println(" You finished school  " + (age - 18) + " years ago");
        } else {
            System.out.println("Sorry You are too old for this app");
        }
        System.out.println("In 2040 you will be " + (age + (2040 - 2020)));
        if (2020 - age > 1980) {
            System.out.println("You were not born back in 1980");
        } else {
            System.out.println("Back in 1980 you were " + ((-1) * ((2020 - age) - 1980)));
        }
    }

//  ---------------This  method checks the scanner input thats not a string or negative
//                  and returns a valid int age value    
    static int getAge(Scanner scanner) {
        int age;
        while (!scanner.hasNextInt()) {
            System.out.println("-------------Invalid--------------");
            System.out.print("What is your age ? :");
            scanner.next();
        }
        age = scanner.nextInt();
        if (age < 0) {
            System.out.println("-------------Invalid--------------");
            System.out.print("What is your age ? :");
        }

        while (age < 0) {
            while (!scanner.hasNextInt()) {
                System.out.println("-----------Invalid----------");
                System.out.print("What is your age ? :");
                scanner.next();
            }
            System.out.println("------------Invalid--------------");
            System.out.println("What is your age?");
            age = scanner.nextInt();
        }
        return age;
    }

//       --------This is a Method that takes a Scanner input and checks if 
//                 it is an 'F' or an 'M'-------------------     
    static String getGender(Scanner scanner) {
        while (!scanner.hasNext("M") && !scanner.hasNext("F")) {
            System.out.println("----------Invalid-----------");
            System.out.println("Please insert 'M' for male 'F' for female");
            scanner.next();
        }
        return scanner.next();
    }
}

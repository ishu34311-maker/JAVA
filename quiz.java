import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        //JAVA Quiz game 

        //Question Arrays[]

        String[] questions = {"What is the main function of  router? ",
                               "Which part of the computer is considered the brain?",
                               "What year was Facebook launched? ",
                               "Who is known as the father of computer? ",
                               "What was the first programming languaage?"};
        //Optional array[][]

        String[][] options ={{"1. Storing files" , "2. Encrypting data", "3. Directing Internet traffic", "4. Managing Passwprd"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4.GPU"},
                              {"1. 2000 ", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortnan", "4. Assembly"}};
        //Declare variables

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        //welcome message
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("!!Welcome to the quiz game!!");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println();


        //question(loop)
        // options 
        // get guess from user 
        // check our guess
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter you choice: ");
            guess = sc.nextInt();

            if (guess == answers[i]) {
                System.out.println("$$$$$$$$$$$$$$$$$");
                System.out.println("correct answer!!");
                System.out.println("$$$$$$$$$$$$$$$$$");
                score++;
            }else{
                System.out.println("$$$$$$$$$$$$$$$$$");
                System.out.println("Wrong Answer");
                System.out.println("$$$$$$$$$$$$$$$$$");
            }
        }
        
        // Display final score 
        System.out.println("your final score is "+ score + " out of "+ questions.length);
        

        sc.close();
    }
}

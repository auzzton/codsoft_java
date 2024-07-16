import java.util.Scanner;

public class SimpleQuizApp {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "What is the capital of Spain?",
            "Who is the Prime minister of India?",
            "What is the capital of India?",
            "Who is the current champions league winner?",
            "What is 2x5?"
        };
    
         String[][] options = {
            {"1. Paris", "2. London", "3. Berlin", "4. Madrid"},
            {"1. Narendra Modi", "2. Amit Shah", "3. Rahul Gandhi", "4. Sonia Gandhi"},
            {"1. Delhi", "2. Bengaluru", "3. Chennai", "4. Mumbai"},
            {"1. AC Milan", "2. Real Madrid", "3. Chelsea", "4. AFC Ajax"},
            {"1. 10", "2. 11", "3. 14", "4. 15"}
        };
    
         int[] correctAnswers = {1, 3, 2, 2, 1}; // 1-based index for correct options
    
         int time = 10; // seconds
         int score = 0;
    
    

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            long startTime = System.currentTimeMillis();
            long endTime = startTime + time * 1000;

            int userAnswer = 0;
            while (System.currentTimeMillis() < endTime) {
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    break;
                }
            }

            if (userAnswer == correctAnswers[i]) {
                score++;
            }
        }
        
    
        System.out.println("Quiz Completed!");
        System.out.println("Your score: " + score + "/" + questions.length);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Correct answer: " + options[i][correctAnswers[i] - 1]);
        }
    

    }
}

// Quiz Program
// 4 questions, 4 multiple choice answers. Questions varies related to (fun facts, programming, sports, and video games)

import java.util.Scanner; // for user input
import java.util.HashMap; // to store questions and answers

public class QuizProgram {
    public static void main(String[] args) {
        HashMap<String, String> questions = new HashMap<>();

        questions.put("What is the oldest programming language out of these 4?", "C");
        questions.put("What is my favorite sport?", "Football");
        questions.put("What is my my most played games that are first person shooters?", "Call of Duty");
        questions.put("What is my major?", "Computer Science");

        // Init score counter
        int score = 0;

        // Set up scanner to take user input
        Scanner user_input = new Scanner(System.in);

        // Loop through the questions in the quiz
        for (String question : questions.keySet()) {
            System.out.println(question);

            // Get the user's answer
            String userAnswer = user_input.nextLine();

            // Check if the answer is correct
            String correctAnswer = questions.get(question);
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                // if correct, increment score
                System.out.println("Correct!");
                score++;
            } else {
                // if incorrect, provide feedback (optional)
                System.out.println("Incorrect. The correct answer is: " + correctAnswer);
            }
        }

        // After the loop, return the final score.
        System.out.printf("Your final score is: %d/%d\n", score, 4);
        
        // Close the scanner
        user_input.close();
    }

} // QuizProgram class
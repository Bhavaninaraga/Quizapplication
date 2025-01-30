import java.util.Scanner;

class Question {
    String question;
    String[] options;
    char correctAnswer;

    public Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class Quizapplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question[] questions = {
            new Question("What is the capital of France?", new String[]{"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"}, 'C'),
            new Question("Which programming language is used for Android development?", new String[]{"A. Java", "B. Swift", "C. Python", "D. C#"}, 'A'),
            new Question("What is 5 + 3?", new String[]{"A. 5", "B. 8", "C. 10", "D. 15"}, 'B')
        };

        int score = 0;

        for (Question q : questions) {
            System.out.println(q.question);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = scanner.next().toUpperCase().charAt(0);
            
            if (answer == q.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is " + q.correctAnswer + "\n");
            }
        }
        
        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.length);
        scanner.close();
    }
}

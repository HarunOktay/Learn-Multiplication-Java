import java.util.ArrayList;

public class exam {
    // This class is used to create an exam object.
    // exam takes input for range of numbers and number of questions.
    // exam generates questions and stores them in an array.
    // exam has a method to check answers.
    // exam has a method to calculate score.
    // exam has a method to calculate time taken.
    // exam has a method to calculate average time taken per question.
    // exam has a method to calculate average score per question.

    private int range;
    private int numberOfQuestions;
    private ArrayList<Integer> answers = new ArrayList<Integer>();

    private ArrayList<question> questions = new ArrayList<question>();

    public exam(int range, int numberOfQuestions) {
        this.range = range;
        this.numberOfQuestions = numberOfQuestions;
        for (int i = 0; i < numberOfQuestions; i++) {
            questions.add(new question(range));
        }
    }
    

    public ArrayList<question> getQuestions() {
        return questions;
    }

    // This method checks answers and returns score.
    public int checkAnswers() {
        int score = 0;
        for (int i = 0; i < numberOfQuestions; i++) {
            if (questions.get(i).getAnswer()  == questions.get(i).getUserAnswer()) {
                score++;
            }
        }
 
        return score;   
    }

    // This method calculates time taken.
    public int calculateTimeTaken(int startTime, int endTime) {
        int timeTaken = endTime - startTime;
        return timeTaken;
    }

    

}

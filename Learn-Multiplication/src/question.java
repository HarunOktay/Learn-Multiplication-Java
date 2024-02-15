public class question {
    // This class is used to create a question object.
    // questions are multiplication questions.
    //questions has 2 numbers and 1 answer.
    //numbers are randomly generated.
    //answer is calculated by multiplying the numbers.
    //constructor takes range of numbers as parameters.
    //constructor generates random numbers and calculates answer.

    private int number1;
    private int number2;
    private int answer;
    private int userAnswer; //user answer is the answer given by the user.
    private int timeTaken;

    //time taken is the time taken to answer the question.

    // timeTaken = endTime - startTime;
    // endTime = System.currentTimeMillis();
    // startTime = System.currentTimeMillis();
    
    public question(int range) {
        this.number1 = (int) (Math.random() * range);
        this.number2 = (int) (Math.random() * range);
        this.answer = number1 * number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getAnswer() {
        return answer;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public int getTimeTaken() {
        return timeTaken;
    }


    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void generateQuestion(int range) {
        this.number1 = (int) (Math.random() * range);
        this.number2 = (int) (Math.random() * range);
        this.answer = number1 * number2;
    }
    
    public question getRandQuestion() {
        return this;
    }


}

public class examRes {
    //exams and exam results and time spent on exam stored
    // of examQuestionNumber
    // of exam results
    // of time spent on exam   
    

    private String examID;
    private String examQuestionNumber;
    private String examResult;
    private String timeSpentOnExam;


    public examRes(String examID, String examQuestionNumber, String examResult, String timeSpentOnExam) {
        this.examID = examID;
        this.examQuestionNumber = examQuestionNumber;
        this.examResult = examResult;
        this.timeSpentOnExam = timeSpentOnExam;
    }

    public examRes() {
    }

    public String getExamID() {
        return examID;
    }

    public String getExamQuestionNumber() {
        return examQuestionNumber;
    }

    public String getExamResult() {
        return examResult;
    }

    public String getTimeSpentOnExam() {
        return timeSpentOnExam;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public void setExamQuestionNumber(String examQuestionNumber) {
        this.examQuestionNumber = examQuestionNumber;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult;
    }

    public void setTimeSpentOnExam(String timeSpentOnExam) {
        this.timeSpentOnExam = timeSpentOnExam;
    }

    @Override
    public String toString() {
        return "examRes{" + "examID=" + examID + ", examQuestionNumber=" + examQuestionNumber + ", examResult=" + examResult + ", timeSpentOnExam=" + timeSpentOnExam + '}';
    }

}

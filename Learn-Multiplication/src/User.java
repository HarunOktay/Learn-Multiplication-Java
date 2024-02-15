/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//**
 *
 * @author harun*/
public class User implements java.io.Serializable{


    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
        this.setQuestionNumber(10);
        this.setQuestionRange(10);
    }


    public User() {
    
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public int getExamTime() {
        return examTime;
    }

    public void setExamTime(int examTime) {
        this.examTime = examTime;
    }

    public int getQuestionRange() {
        return questionRange;
    }

    public void setQuestionRange(int questionRange) {
        this.questionRange = questionRange;
    }
    private String userID;
    private String password;
    private int questionNumber;
    private int examTime;
    private int questionRange;

    
}

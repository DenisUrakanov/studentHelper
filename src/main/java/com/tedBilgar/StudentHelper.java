package com.tedBilgar;

public class StudentHelper {
    private String message = "Nothing";

    public StudentHelper() {
    }

    public StudentHelper(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        StudentHelper2 studentHelper2 = new StudentHelper2();
        studentHelper2.setMessage("StudentHelper2");
        this.message = message+" "+studentHelper2.getMessage();
        this.message = message;
    }

}

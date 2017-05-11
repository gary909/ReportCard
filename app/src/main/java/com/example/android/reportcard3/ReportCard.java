package com.example.android.reportcard3;

//Declares a Class named ReportCard which is public
public class ReportCard {

    private String mStudentName;    //Student name variable
    private int mMathsScore;        //Maths Score variable
    private int mEnglishScore;      //English Score variable
    private int mScienceScore;      //Science Score variable
    private int mFrenchScore;       //French Score variable
    private int mGeographyScore;    //Geography Score variable

    // Setting public constructor
    public ReportCard(String StudentName, int MathsScore, int EnglishScore, int ScienceScore, int FrenchScore, int GeographyScore) {
        mStudentName = StudentName;
        mMathsScore = MathsScore;
        mEnglishScore = EnglishScore;
        mScienceScore = ScienceScore;
        mFrenchScore = FrenchScore;
        mGeographyScore = GeographyScore;
    }

    //STUDENT NAME
    //get student name
    public String getStudentName() {
        return mStudentName;
    }

    //setter method for setting student name
    public void setStudentName(String studentName) {
        this.mStudentName = studentName;
    }

    //MATHS
    //Sets Method
    public void setmMathsScore(int MathsScore) {
        mMathsScore = MathsScore;
    }
    //Gets Method
    public int getmMathsScore() {
        return mMathsScore;
    }

    //ENGLISH
    //Sets Method
    public void setmEnglishScore(int EnglishScore) {
        mMathsScore = EnglishScore;
    }
    //Gets Method
    public int getmEnglishScore() {
        return mEnglishScore;
    }

    //SCIENCE
    //Sets Method
    public void setmScienceScore(int ScienceScore) {
        mScienceScore = ScienceScore;
    }
    //Gets Method
    public int getmScienceScore() {
        return mScienceScore;
    }

    //FRENCH
    //Sets Method
    public void setmFrenchScore(int FrenchScore) {
        mFrenchScore = FrenchScore;
    }
    //Gets Method
    public int getmFrenchScore() {
        return mFrenchScore;
    }

    //GEOGRAPHY
    //Sets Method
    public void setmGeographyScore(int GeographyScore) {
        mGeographyScore = GeographyScore;
    }
    //Gets Method
    public int getmGeographyScore() {
        return mGeographyScore;
    }

    //Student Results Appear Here
    @Override
    public String toString() {
        return "Student Name: " + mStudentName + "\nMaths: " + getmMathsScore() + "\nEnglish: "
                + getmEnglishScore() + "\nScience: " + getmScienceScore() +
                "\nFrench: " + getmFrenchScore() + "\nGeography: " + getmGeographyScore();
    }
}

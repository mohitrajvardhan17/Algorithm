/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author emorajv
 */
public class Student implements Comparable<Student>{
    private int rollNumber;
    private int score;
    private String Name;
    public Student(){
        
    }
    public Student(int rollNumber, int score, String Name) {
        this.rollNumber = rollNumber;
        this.score = score;
        this.Name = Name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", score=" + score + ", Name=" + Name + "}\n";
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
        /*
        if(this.getScore() < o.getScore()){
            return -1;
        }
        if(this.getScore() > o.getScore()){
            return 1;
        }
        return 0;
        */
    }
    
}

/*
 Name : Gyuchan Hwang
 Student ID : 001336372
 */

public class TestScores {
 double score1;
 double score2;
 double score3;
 //TestScores class has fields to hold three test scores
 
 TestScores(double num1, double num2, double num3) {
  score1 = num1;
  score2 = num2;
  score3 = num3;
  //constructor for the three scores
 }
 
 public double getScore1() {
  return score1;
 }
 public void setScore1(double score1) {
  this.score1 = score1;
 }
 public double getScore2() {
  return score2;
 }
 public void setScore2(double score2) {
  this.score2 = score2;
 }
 public double getScore3() {
  return score3;
 }
 public void setScore3(double score3) {
  this.score3 = score3;
 }
 //accessor and mutator for the test scores fields
 
 public double getAverage() {
  return (score1 + score2 + score3) / 3;
 }
 //method that returns the average of the test scores
}

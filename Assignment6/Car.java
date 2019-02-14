/*
Name : Gyuchan Hwang
Student ID : 001336372
*/

public class Car {
 private String make, model;
 private int year, price;
 // fields of Car class
 
 public void setMake(String mk) {
  make = mk;
 }
 public void setModel(String md) {
  model = md;
 }
 public void setYear(int yr) {
  year = yr;
 }
 public void setPrice(int pr) {
  price = pr;
 }
 // mutators of Car class
 
 public String getMake() {
  return make;
 }
 public String getModel() {
  return model;
 }
 public int getYear() {
  return year;
 }
 public int getPrice() {
  return price;
 } 
 public static int getTotalPrice(int a, int b, int c) {
  return (a + b + c);
 }
 // accessors of Car class
 
 Car(String mk, String md, int yr, int pr) {
  make = mk;
  model = md;
  year = yr;
  price = pr;
 }
 // Constructor

 
}

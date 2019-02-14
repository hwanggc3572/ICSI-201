/*
 Name : Gyuchan Hwang
 Student ID : 001336372
 */

public class Book {
 
 private String title;
  //-title:String
 private String author;
  //-autore:String
 private String publisher;
  //-publisher:String
 private int numberCopies;
  //-numberCopies:int
 
 public void setTitle(String tit) {
  title = tit;
 }
 //+setTitle(tit:String):void
 public void setAuthor(String aut) {
  author = aut;
 }
 //+setAuthor(aut:String):void
 public void setPublisher(String pub) {
  publisher = pub;
 }
 //+setPublisher(pub:String):void
 public void setCopies(int cop) {
  numberCopies = cop;
 }
 //+setCopies(cop:int):void
 
 public String getTitle() {
  return title;
 }
 //+getTitle():String
 public String getAuthor() {
  return author;
 }
 //+getAuthor():String
 public String getPublisher() {
  return publisher;
 }
 //+getPublisher():String
 public int getCopies() {
  return numberCopies;
 }
}

/*
 Name : Gyuchan Hwang
 Student ID : 001336372
 */

public class TemperaturePattern {
  int number_of_days_in_period;
  int temperature_on_first_day;
  //A TemperaturePattern class has two fields
  
  public TemperaturePattern( int days, int temperature ) { //Constructor set values of these two fields
   number_of_days_in_period = days;
   temperature_on_first_day = temperature;
  }
  
  public int findFinalDayTemperature(int days, int temperature) {
   // Argument : the number of days and temperature on the first day
   
   for (int i=1; i<=days; i++) {
    if (i < days/2) {
     temperature -= 2;
    } else {
     temperature ++;
    }
   }
   return temperature-1;
   // calculate the temperature on the final day and return in
  }
}
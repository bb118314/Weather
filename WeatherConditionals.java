import java.util.Scanner;
public class WeatherConditionals
{
    public static String getWeatherAdvice(String description) {
    boolean windy = false;
    System.out.println("Enter Temperature: ");
     Scanner scanner = new Scanner(System.in);
     int temperature = scanner.nextInt();
    if(description.indexOf("windy") >= 0) {
     windy = true;   
    }
        if((temperature > 100) && (description.indexOf("Snow") >= 0)){
            return("Fake News, I trusted you and you lied to me");
    }
    if ((temperature < -1 ) && (temperature > -54)) {
     return("It's " + temperature + " degrees outside, you might be in Iowa!");   
    }
    if(!windy && (temperature > 30)){
        return("It's safe to go outside: " + temperature + " degrees and " + description + ".");
    }
    else
    return "Too windy or cold! Stay indoors!";
}
}

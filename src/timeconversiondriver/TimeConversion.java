package timeconversiondriver;

public class TimeConversion {
    


    public void showDecaseconds(int seconds){
        double showDecaseconds = seconds*10;
        System.out.print(showDecaseconds + " in Decaseconds");
        System.out.println(" (A Decasecond is 10 seconds)");
    }
   

    public void showJiffies(int seconds){
        double showJiffies = (seconds/1000)*10;
        System.out.print(showJiffies + " in Jiffies");
        System.out.println(" (A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds.)");
    }

    public void showNewYorkMinutes(int seconds){
        double showNewYorkMinutes = seconds/20;
        System.out.print(showNewYorkMinutes + " in New York Minutes");
        System.out.println(" (A New York Minute is the period of time between a traffic light turning green and the cab behind you honking. It is 1/20th of 1 second.)");
    }

    public void showNanoCenturies(int seconds){
        double showNanoCenturies = seconds*3.156;
        System.out.print(showNanoCenturies + " in Nano Centuries");
        System.out.println(" (A NanoCentury is a computing measurement coined from the expression - 'never to let the user wait more than a few Nano Centuries for a response'. It is 3.156 seconds.)");
    }

    public void showScaramuccis(int seconds){
        double showScaramuccis = seconds/(86400*11);
        System.out.print(showScaramuccis + " in Scaramuccis");
        System.out.println(" (A Scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.)");
}
}
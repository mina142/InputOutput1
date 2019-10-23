import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String firstInitial, lastName, streetName, streetType, city;
        int houseNumber;
        System.out.print( "firstInitial: " );
        firstInitial = keyboard.next();

        System.out.print( "Last Name: " );
        lastName = keyboard.next();

        System.out.print( "House Number: " );
        houseNumber = keyboard.nextInt();

        System.out.print( "Street Name: " );
        streetName = keyboard.next();

        System.out.print( "Street Type: " );
        streetType = keyboard.next();

        System.out.print( "City: " );
        city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }

}

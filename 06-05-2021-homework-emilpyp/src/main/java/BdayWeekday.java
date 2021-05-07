import java.time.LocalDate;
import java.util.Scanner;

public class BdayWeekday {
    public static void main(String[] args) {
        System.out.println("Please enter your date of birth (format Year-Month-Day ):");
        String birthDate = readUserInput();
        printWeekdaysOnBirthday(birthDate);

        String customBirthDate = "2010-09-09";
        //printWeekdaysOnBirthday(customBirthDate);
    }

    public static void printWeekdaysOnBirthday(String birthDate){
        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.parse(birthDate);
        while(bday.isBefore(today)){
            System.out.println(bday.getDayOfWeek());
            bday = bday.plusYears(1);
        }
    }

    public static String readUserInput(){
        Scanner in = new Scanner(System.in);
        String bday = in.nextLine();
        return bday;
    }
}

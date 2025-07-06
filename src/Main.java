//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int secFromStart = 21002;
        int hoursFromStart = secFromStart / 3600;
        int minFromStartLastHour = (secFromStart % 3600) / 60;
        int secFromStartLastMinutes = minFromStartLastHour / 60;


        System.out.println("S nachala sutok proshlo: " + hoursFromStart + " chasov");
        System.out.println("S nachala chasa proshlo: " + minFromStartLastHour + " minutes");
        System.out.println("S nachala posledney minuy prosholo: " + secFromStartLastMinutes + " secund");


    }
}
public class Miles {

    public static void main(String[] args) {
        int ticketPrice = 1435;
        int miles = 1;
        int spentRubles = 20;
        int accruedMiles = ticketPrice / spentRubles * miles;

        System.out.println(accruedMiles);

    }
}

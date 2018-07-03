package adhoc3_Weckdienst;

public class WakeUpServiceTest {
    public static void main(String[] args) {
        WakeUpService Service = new WakeUpService(12);

        // lokale Klasse
        class Murmeltier implements WakeUpServiceClient {

            @Override
            public void wakeUp(int wakeUpTime) {
                System.out.println("Oh - schon " + wakeUpTime + "Uhr!");
                System.out.println("Murmeltier auferstanden!!");

            }

        }

        Murmeltier murmel = new Murmeltier();
        Service.register(murmel);
        Service.startService();
    }
}

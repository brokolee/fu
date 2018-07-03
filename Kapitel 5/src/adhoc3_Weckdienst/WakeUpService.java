package adhoc3_Weckdienst;

import java.time.*;
import java.util.*;

public class WakeUpService {
    private int wakeUpTime;
    private ArrayList<WakeUpServiceClient> clientListe = new ArrayList<WakeUpServiceClient>();

    public WakeUpService(int wakeUpTime) throws IllegalArgumentException {

        if (wakeUpTime > 0 && wakeUpTime < 23) {
            this.wakeUpTime = wakeUpTime;
        } else
            throw new IllegalAccessError("KEINE GUELTIGE ALARMZEIT!");
    }

    public void register(WakeUpServiceClient client) {
        clientListe.add(client);
    }

    private void wakeUpAllClients() {
        for (WakeUpServiceClient clientInListe : clientListe) {
            clientInListe.wakeUp(wakeUpTime);
        }
    }

    public void startService() {
        boolean finished = false;
        System.out.println("Weckdienst fuer Weckzeit " + wakeUpTime + ":00 Uhr gestartet.");
        while (!finished) {
            int currentHour = LocalTime.now().getHour();
            if (currentHour == wakeUpTime) {
                wakeUpAllClients();
                finished = true;
            }
            try {
                Thread.sleep(1000); // Eine Sekunde Pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

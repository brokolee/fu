package EA1;

public class gauss {

    Integer forSumme(int startWert) {
        int sum = 0;

        for (int i = 1; i < startWert + 1; i++) {
            sum = sum + i;
        }

        return sum;
    }

    Integer kleinerGauss(int startWert) {
        return ((startWert * (startWert + 1)) / 2);
    }

    Integer rekursiveSumme(int startWert) {
        if (startWert == 1) {
            return 1;
        } else {
            return (startWert + rekursiveSumme(startWert - 1));
        }

    }

    public static void main(String[] args) {
        int startWert = 1000000000;
        gauss GaussObj = new gauss();

        System.out.println("FOR-Schleife: " + GaussObj.forSumme(startWert));
        System.out.println("Summenformel: " + GaussObj.kleinerGauss(startWert));
        System.out.println("Rekursiv: " + GaussObj.kleinerGauss(startWert));
    }

}

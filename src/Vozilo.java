

public class Vozilo {

    private String tipVozila;
    private int zapreminaMotora;
    private int godiste;

    public Vozilo(String ime, int zapreminaMotora, int godiste) {
        this.tipVozila = ime;
        this.zapreminaMotora = zapreminaMotora;
        this.godiste = godiste;
    }

    public String getTipVozila() {
        return tipVozila;
    }

    public void setTipVozila(String tipVozila) {
        this.tipVozila = tipVozila;
    }

    public int getZapreminaMotora() {
        return zapreminaMotora;
    }

    public void setZapreminaMotora(int zapreminaMotora) {
        this.zapreminaMotora = zapreminaMotora;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vozilo je tipa " + tipVozila + " ima zapreminu motora "
                + zapreminaMotora + " ccm  i proizvedeno je " + godiste + " godine.");

        return sb.toString();
    }

    public static boolean proveraPiliM (String tipVozila){
        if (tipVozila.equals("m") || tipVozila.equals("p"))
            return true;
        else
            return false;
    }

}

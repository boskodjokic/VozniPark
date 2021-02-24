public class PrivatniVP extends VozniPark {
public Vozilo vozilo;
    public PrivatniVP(String adresa) {
        super(adresa);
    }
    public void setVozilo (Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    @Override
    public double porezNaCeneRegistracije(int godina) {
        double UKPorez = 0;
        double cenaPoreza;
        double procenat = 1;

            if(vozilo.getTipVozila().equals("p")){
                if(vozilo.getZapreminaMotora() <= 2000){
                    cenaPoreza = 10150;
                }else if(vozilo.getZapreminaMotora() > 2000 && vozilo.getZapreminaMotora() <= 3000){
                    cenaPoreza = 50350;
                }else{
                    cenaPoreza = 210920;
                }
            }else{
                if(vozilo.getZapreminaMotora() <= 500){
                    cenaPoreza = 3400;
                }else if(vozilo.getZapreminaMotora() > 500 && vozilo.getZapreminaMotora() <= 1100){
                    cenaPoreza = 8800;
                }else{
                    cenaPoreza = 11890;
                }

            }
            if(godina - vozilo.getGodiste()>5 && godina - vozilo.getGodiste()<=10){
                procenat = 0.75;
            }
            if(godina - vozilo.getGodiste()>10){
                procenat = 0.5;
            }
            UKPorez+= (cenaPoreza * procenat);

        return UKPorez;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vozilo je tipa " + vozilo.getTipVozila() + " ima zapreminu motora "
                + vozilo.getZapreminaMotora() + " ccm  i proizvedeno je " + vozilo.getGodiste() + " godine.");

        return sb.toString();
    }
}

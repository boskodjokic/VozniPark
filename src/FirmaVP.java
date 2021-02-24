import java.util.ArrayList;

public class FirmaVP extends VozniPark{
    ArrayList<Vozilo> vozila;

    public FirmaVP(String adresa) {
        super(adresa);
        vozila = new ArrayList();
    }

    public void addVozilo(Vozilo v){
        vozila.add(v);
    }

    @Override
    public double porezNaCeneRegistracije(int godina) {
        double UKPorez = 0;
        double cenaPoreza;
        double procenat = 1;

        for(int i = 0; i<vozila.size(); i++){
            if(vozila.get(i).getTipVozila().equals("p")){
                if(vozila.get(i).getZapreminaMotora() <= 2000){
                    cenaPoreza = 10150;
                }else if(vozila.get(i).getZapreminaMotora() > 2000 && vozila.get(i).getZapreminaMotora() <= 3000){
                    cenaPoreza = 50350;
                }else{
                    cenaPoreza = 210920;
                }
            }else{
                    if(vozila.get(i).getZapreminaMotora() <= 500){
                        cenaPoreza = 3400;
                    }else if(vozila.get(i).getZapreminaMotora() > 500 && vozila.get(i).getZapreminaMotora() <= 1100){
                        cenaPoreza = 8800;
                    }else{
                        cenaPoreza = 11890;
                    }

            }
            if(godina - vozila.get(i).getGodiste()>5 && godina - vozila.get(i).getGodiste()<=10){
                procenat = 0.75;
            }
            if(godina - vozila.get(i).getGodiste()>10){
                procenat = 0.5;
            }
            UKPorez+= (cenaPoreza * procenat);
        }
        return UKPorez;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vozila.size(); i++) {
            sb.append("Vozilo je tipa " + vozila.get(i).getTipVozila() + " ima zapreminu motora "
                    + vozila.get(i).getZapreminaMotora() + " ccm  i proizvedeno je " + vozila.get(i).getGodiste() + " godine.");
        }
        return sb.toString();
    }
}

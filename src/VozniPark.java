public abstract class VozniPark {
    private String adresa;

    public VozniPark(String adresa) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public abstract double porezNaCeneRegistracije (int godina);


}

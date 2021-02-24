import java.util.Scanner;

public class TestVozila {

    public static void main(String[] args) {

        System.out.println("Adresa:");
        String adresa = sc.next();

        System.out.println("Koji vozni park (p-privatni, f-poslovni):");
        String tipParka = sc.next();
        int broj;
        while (proveraFiliP(tipParka) != true) {
            System.out.println("Unet je pogresan znak");
            System.out.println("Koji vozni park (p-privatni, f-poslovni):");
            tipParka = sc.next();
        }
        if (tipParka.equals("p")){
            PrivatniVP privatnoVozilo = new PrivatniVP(adresa);
            privatnoVozilo.setVozilo(unosVozila());
            System.out.println("Godina za porez");
            int godinaZaPorez = sc.nextInt();
            System.out.println("Ukupan porez je: " + privatnoVozilo.porezNaCeneRegistracije(godinaZaPorez));

        }else{
            FirmaVP firminPark = new FirmaVP(adresa);
            System.out.println("Unesite broj vozila u voznom parku:");
            broj = sc.nextInt();
            for(int i = 0; i < broj; i++){
                firminPark.addVozilo(unosVozila());
            }
            System.out.println("Godina za porez");
            int godinaZaPorez = sc.nextInt();
            System.out.println("Ukupan porez je: " + firminPark.porezNaCeneRegistracije(godinaZaPorez));

        }

    }
    static Scanner sc = new Scanner(System.in);
    public static Vozilo unosVozila(){
        System.out.println("Unesite tip vozila (p - putnicko ili m - motocikl):");
        String tipVozila = sc.next();
        while (Vozilo.proveraPiliM(tipVozila) != true) {
            System.out.println("Unet je pogresan znak");
            System.out.println("Unesite tip vozila (p - putnicko ili m - motocikl):");
            tipVozila = sc.next();
        }
        System.out.println("Unesite zapreminu motora vozila ");
        int zapreminaMotora = sc.nextInt();
        System.out.println("Unesite godinu proizvodnje vozila ");
        int godiste = sc.nextInt();
        Vozilo vozilo = new Vozilo(tipVozila, zapreminaMotora, godiste);
        return vozilo;
    }

    public static boolean proveraFiliP (String tipParka){
        if (tipParka.equals("p") || tipParka.equals("f"))
            return true;
         else
            return false;

    }


    }



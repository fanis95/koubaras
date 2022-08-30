// icsd13126, biniakou theofanis, askisi 2

public class Main {

    
    public static void main(String[] args) {
        piggy p = new piggy(); // dhmiourgeia enos adeiou koumpara
        
        System.out.println(p.toString());
        p.katathesi(1500);
        System.out.println("to poso tou koubara einai: " + p.epistrofiYpoloipou());
        p.adeiasma();
        System.out.println(p.toString());
        p.katathesi(500);
        System.out.println("to poso tou koubara einai: " + p.epistrofiYpoloipou());
        p.analipsi(260);
        System.out.println(p.toString());
        p.tarakounise();
        p.katathesi(1500);
        System.out.println(p.ypologiseYpoloipo(1200));

    }
    
}

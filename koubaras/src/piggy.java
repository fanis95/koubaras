// icsd13126, biniakou theofanis, askisi 2

public class piggy {
    protected float poson;
    
    public piggy()
    {
        System.out.println("dimiourgithike enas adeios koumparas");
    }
    
    public piggy(float arxiko)
    {
        if (arxiko > 0) //an to poso pou dinei o xristis einai >0 tote vazw ston koumpara afto to poso
            poson = arxiko;
        else //an einai <0 tote apla midenizw ton koumpara
            poson = 0;
    }
    
    public float epistrofiYpoloipou()
    {
        return poson;
            // epistrefw to poso pou exei o koumparas afth thn stigmh
    }
    
    public void katathesi (float plus)
    {
        if (plus > 0)// an einai thetikos o arithmos p dinei o xristis tote prosthetw sto posos to plus 
        {
            poson += plus;
            System.out.println("egine katathesh tou posou twn " + plus + "euro");
        }
        else
            System.out.println("den einai dunath h katathesh twn " + plus + "euro");
        //an to poso p dwsei o xristis einai arnhtiko, den kanw tipota
    }
    
    public void adeiasma ()
    {
        poson = 0; // thetw to poson se 0 gia na adeiasei o koumparas
        System.out.println("adeiasate ton koubara sas. to poso einai: " + poson + "euro");
    }
    
    public void analipsi (float minus)
    {
        if (poson - minus > 0 && minus > 0){ // an o arithmos tou xristi einai thetikos, kai to 
            // afairesw apo to poso tou koumpara kai to apotelesma einai thetiko
            // tote afairw to poso p edwse o xristis apo to poso tou koumpara
            poson -= minus;
            System.out.println("egine analpisi " + minus + "euro");
        }
        else if(poson - minus < 0 && minus > 0){ // an o arithmos tou xristi einai thetikos, kai to 
            //afairesw apo to poso tou koumpara kai to apotelesma einai arnhtiko
            // tote midenizw ton koumpara
            System.out.println("egine analpisi " + poson + "euro");
            poson = 0;
        }
        //an to poso p dwsei o xristis einai arnhtiko, den kanw tipota 
        else
            System.out.println("den einai dunath h analhpsh");
    }
    
    public void tarakounise ()
    {
        if (poson > 0) // an to poso tou koumpara einai >0, exei kapoio upoloipo dhladh, tupwnei to 
            // parakatw mhnuma
            System.out.println("Cling Cling!!");
    }
    
    public String ypologiseYpoloipo (float diakopes)
    {
        if (diakopes > 0) // an to poso gia tis diakopes einai thetiko tote epistrefw thn diafora tous
            return "to poso pou tha meinei meta tis diakopes einai: " + (this.poson - diakopes);
        else // alliws epistrefw mono to poso pou uparxei ston koubara
            return "to poso ston koubara einai: " + this.poson;
    }
    
    @Override
    public String toString()
    {
        if (poson > 0) // an uparxei diathesimo upoloipo ston koumpara emfanizei to parakatw mhnyma
            return "O koymparas sas periexei " + poson + "euro";
        else // alliws emfanizei to epomeno
            return "Den yparxei ypoloipo";
    }
    
    
}

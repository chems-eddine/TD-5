package TD5;

public class employeTempPartiel extends employe {
	private double montantH;
	final int heure=35;
	public employeTempPartiel(double montantH,String name,String job){
		super(name,job);
		this.montantH= montantH;
	}
	public double getMontantH(double montantH){return montantH;}
	public void setMontantH(double montantH){this.montantH= montantH;}

	public double calculePaie(){ setSalaire(montantH*heure);
		if(this.heure=<0 )
			trow new ArithmeticExepcetion("vous n'avez pas travaillé assez");
			else{
				if(this.heure<35)
					trow new ArithmeticExepcetion("vous avez travailez moins que 35 H");
				else
					return getSalaire();}}
	    
}

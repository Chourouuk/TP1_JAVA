package tp1_java;

public class Boite<T>{
	private T contenu ;
	
public Boite (T contenu )
	{
		this.contenu=contenu;
	}
public T getcontenu()
	{  return contenu; }

public void setcontenu()
	{ this.contenu=contenu;  }
	

public static void main(String[]args )
{
	Boite<Integer> boiterEntier = new Boite<Integer>(2);
	System.out.println("Contenu de la boite d'entier : " +boiterEntier.getcontenu());
	
	Boite <Double> BoiteChaine = new Boite<Double>(2.3);
	System.out.println("Contenu de la boite de chaine : " +BoiteChaine.getcontenu());
}
}

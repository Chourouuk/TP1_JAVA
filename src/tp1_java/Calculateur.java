package tp1_java;

public class Calculateur {
	public static <T extends Number> double somme (T[]tableau )
	{
		double somme =0.0;
		for (T element : tableau)
		{ 
			somme +=element.doubleValue();
		}
		return somme;
	}
    public static void main(String[] args)
    {
    	Integer[] entiers = {1,2,3,4,5};
    	Double[] doubles = { 1.1,2.2,3.3,4.4,5.5};
    	System.out.println("Somme des entiers : " +somme(entiers));
    	System.out.println("Somme des doubles  : " +somme(doubles));
    }
}

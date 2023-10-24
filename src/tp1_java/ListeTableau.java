package tp1_java;

import java.util.ArrayList;
import java.util.List;

interface ListeGenerique<T>
{
	void ajouter(T element);
	T get(int indice);
	int taille();
}
 
public class ListeTableau<T>
{
  List<T> l= new ArrayList<T>();
  public static void main (String[] args)
  {
	  ListeTableau<String> lt = new ListeTableau<String>();
	  lt.ajouter("hello");
	  lt.ajouter("beatiful");
	  lt.ajouter("world");
	  System.out.println(lt.get(0));
	  System.out.println(lt.taille());
  }
public  T get(int indice) {
	// TODO Auto-generated method stub
	return l.get(indice);
}
public int taille() {
	// TODO Auto-generated method stub
	return l.size();
}
public void ajouter(T element) {
	// TODO Auto-generated method stub
	   l.add(element);
}
}

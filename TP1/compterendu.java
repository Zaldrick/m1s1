import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class main {

class Batiment{
		int debutX;
		int finX;
		int hauteur;
		Batiment(int deb, int fin, int h){
			debutX = deb;
			finX = fin;
			hauteur = h;
		}
}

class Couple{
		int abscisse;
		int ordonne;
		Batiment(int a, int o){
			abscisse = a;
			ordonne = o;
		}
}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Batiment batiment = new Batiment(14,10,18);
		ArrayList<Couple> ligne = new ArrayList<Couple>(){
			(1, 1)(5,1)(5, 13)(9,13)(9, 20)(12,20)(12, 27)(14,27)(16, 3)(19,3)(19, 0)(22,0)(22, 3)(25,3)(25, 0)
		};
		recalculLigneToit(ligne, batiment);
	}
}

void recalculLigneToit(Ligne ligne,Batiment batiment){
	for(i = 0; i < ligne.size();i++){

		if (ligne.get(i).abscisse > batiment.debutX){
			if (batiment.hauteur > ligne.get(i).ordonnee || batiment.hauteur > ligne.get(i+1).ordonnee){
				ligne.get(i).abscisse = batiment.debutX;
					ligne.add(i+1,new Couple(batiment.debutX, batiment.hauteur));
				if (ligne.get(i+2).abscisse > batiment.finX){
					ligne.add(i+2,ligne, new Couple(batiment.finX, batiment.hauteur));
					ligne.add(i+2,ligne, new Couple(batiment.finX, ligne.get(i).ordonnee));
				}else {
					ligne.add((i+2,ligne, new Couple(ligne.get(i+1).abscisse, batiment.hauteur));
				}
				}
		}

	}
}

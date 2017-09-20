import java.util.ArrayList;
import java.util.Arrays;

public class main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Batiment batiment = new Batiment(14,10,20);
		ArrayList<Couple> ligne = new ArrayList<>(Arrays.asList(new Couple(1,1),new Couple(5,1),new Couple(5,13),new Couple(9,13),new Couple(9,20),new Couple(12,20),new Couple(12,27),new Couple(16,27),new Couple(16, 3),new Couple(19,3),new Couple(19, 0), new Couple(22,0)));
			//(1, 1)(5,1)(5, 13)(9,13)(9, 20)(12,20)(12, 27)(14,27)(16, 3)(19,3)(19, 0)(22,0)(22, 3)(25,3)(25, 0)
		
		ArrayList<Couple> ligne1 = new ArrayList<>(Arrays.asList(new Couple(1,10),new Couple(5,6),new Couple(8,0),new Couple(10,8),new Couple(12,0)));
		ArrayList<Couple> ligne2 = new ArrayList<>(Arrays.asList(new Couple(2,12),new Couple(7,0),new Couple(9,4),new Couple(11,2),new Couple(14,0)));
		
		/*System.out.println("Ligne avant : "+ligne);
		recalculLigneToit(ligne, batiment);
		System.out.println("Ligne après : "+ligne);*/
	}

	static void recalculLigneToit(ArrayList<Couple> ligne,Batiment batiment){
		for(int i = 0; i < ligne.size();i++){
	
			if (batiment.debutX <= ligne.get(i).abscisse){
				
				if (batiment.hauteur > ligne.get(i).ordonnee){
					ligne.get(i).abscisse = batiment.debutX;
					ligne.add(i+1,new Couple(batiment.debutX, batiment.hauteur));
					if (ligne.get(i+2).abscisse > batiment.finX){
						ligne.add(i+2, new Couple(batiment.finX, batiment.hauteur));
						ligne.add(i+2, new Couple(batiment.finX, ligne.get(i).ordonnee));
					}else {
						ligne.add(i+2, new Couple(ligne.get(i+2).abscisse, batiment.hauteur));
					}
					break;
					
				}
				
			}else if (batiment.finX < ligne.get(i).abscisse){
				//si abscisse supérieur on créé un nouveau point
				if (batiment.debutX > ligne.get(i-1).abscisse){

				// sinon on modifie juste l'ancien
				}else if(ligne.get(i-1).abscisse > batiment.debutX){
					ligne.get(i-1).ordonnee = batiment.hauteur;
				}
				

			}
		}
	}
	static void fusionLignesToit(ArrayList<Couple> ligne,ArrayList<Couple> ligne2){
	
	}

	
}

/*
else if (batiment.hauteur > ligne.get(i+1).ordonnee){
ligne.get(i).abscisse = batiment.debutX;
ligne.add(i+1,new Couple(batiment.debutX, batiment.hauteur));
if (ligne.get(i+2).abscisse > batiment.finX){
	ligne.add(i+2, new Couple(batiment.finX, batiment.hauteur));
	ligne.add(i+2, new Couple(batiment.finX, ligne.get(i).ordonnee));
}else {
	ligne.add(i+2, new Couple(ligne.get(i+2).abscisse, batiment.hauteur));
}

break;
}*/
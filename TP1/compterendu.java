Objets :
Batiment
int debutX
int finX
int hauteur

Couple
int abscisse
int ordonnee



main(args[]){
Batiment batiment = new Batiment(14,10,18);


ArrayList<Couple> ligne = new ArrayList<Couple>(){
	(1, 1)(5,1)(5, 13)(9,13)(9, 20)(12,20)(12, 27)(14,27)(16, 3)(19,3)(19, 0)(22,0)(22, 3)(25,3)(25, 0)
};


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

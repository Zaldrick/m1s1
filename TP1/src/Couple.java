public class Couple{
		int abscisse;
		int ordonnee;
		Couple(int a, int o){
			abscisse = a;
			ordonnee = o;
		}
		@Override
		public String toString() {
			return "(" + abscisse + "," + ordonnee + ")";
		}
}
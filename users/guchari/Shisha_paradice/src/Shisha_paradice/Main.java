package Shisha_paradice;

	public class Main {

		public static void main (String args[]){
			String play = "no";

			play = "yes";

			if (valueOf(play)){
				System.out.println ("水タバコを吸います");
				Flavour flavour = new Flavour();
			}else{
				System.out.println ("水タバコを吸いませんでした");
			}
		}

		public static Boolean valueOf(String play){
			if (play == "yes"){
				return true;
			} else {
				return false;
			}
		}

}

package Shisha_paradice;

public class Flavour {

	public Flavour (){
		String one = "1";
		String two = "2";

		int ione = 1;
		int itwo = 2;
		System.out.println(one + two);
		System.out.println(ione + itwo);
//文字列型String と 数字型intの違い。

		System.out.println(one + ione);

	//Stringの文字列が入ってた場合自動的にString型になる
		System.out.println(ione + itwo + one);
		//左から順番に実行されて、最初の二つが計算されたのち、文字列連結
	}

}

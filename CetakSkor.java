public class CetakSkor{
	
public static void main (String []args){
		SkorPertandingan<Integer, Integer> genChar = new SkorPertandingan<>();
	genChar.setType(2);
	System.out.print(genChar.getType()+" - ");
	genChar.setType1(8);
	System.out.println(genChar.getType1());
}
}
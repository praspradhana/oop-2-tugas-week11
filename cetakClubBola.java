public class cetakClubBola implements ClubSepakBola{
	public void tuanrumah(String nama){
	System.out.println(nama);
	}
	public void timtamu (String nama){
	System.out.println(nama);
	}

	public static void main (String []args){
	cetakClubBola tim = new cetakClubBola();
	tim.tuanrumah("Real Madrid");
	tim.timtamu("Juventus");

	}
}
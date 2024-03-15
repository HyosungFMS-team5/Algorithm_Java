package A;

public class Jinsu_trans {

	public static void main(String[] args) {
		
		
		char n[] = new char[100];
		
		int num = 19;
		int jinsu = 16;
		
		int i =0;
		while(num > 0) {
			int tmp = num % jinsu;
			
			if(tmp >= 10 && tmp <= 15) {
				n[i] = (char)('A' + (tmp-10));
			}
			else {
				n[i] = (char)('0'+tmp);
			}
			
			i++;
		}
		
		for(; i <= 0; i--) {
			System.out.println(n[i]);
		}
	}

}

public class P1{
	public static void main(String args []){
		//for printing numbers from 0 - 6
		for (int i = 0; i < 6; i++ ){
			//prevents the no. 3 from being printed
			if (i == 3){
				continue; //breaks one iteration and continues with next iteration
			}
		System.out.println(i);
		}
	}
}
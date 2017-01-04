

class NumChk{

int highest;

 NumChk(int x,int y,int z){
	 
	 if(x>=y && x>=z){
		 highest = x;
	 }else if(y>=x && y>=z){
		 highest = y;
	 }else{
		 highest = z;
	 }
	 
	 System.out.println("Highest Num: "+highest);
 }


}

public class HighestNum {
	public static void main(String args[]){

		NumChk chk = new NumChk(123,150,100);
	}
}



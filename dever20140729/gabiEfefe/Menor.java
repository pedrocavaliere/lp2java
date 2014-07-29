import java.util.*;

class Maior{
	public ArrayList<Integer> sequencia(int a){

	ArrayList<Integer> seq = new ArrayList<Integer>();
	seq.add(a);
	while(a > 1){
		if(a % 2 == 0){
			a = a/2;
		}
		else{
			a = (3*a) + 1;
		}
		seq.add(a);
	}
	return seq;
	}
}
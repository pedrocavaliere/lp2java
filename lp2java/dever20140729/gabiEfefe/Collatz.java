import java.util.*;

class Collatz{
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

	public int maior(int a){
		ArrayList<Integer> seq = new ArrayList<Integer>();
		int maior = seq.size();
		int i;
		for (i = 0; i < 1000001; i++){
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
		return seq.size();
		}
	return seq.size();
	}
}
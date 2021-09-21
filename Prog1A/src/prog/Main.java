package prog;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static char isOffside(ArrayList<Integer> attck, ArrayList<Integer> def) {
		Collections.sort(attck);
		Collections.sort(def);
		
		if (def.size() < 2 || attck.get(0) < def.get(1))
			return 'Y';

		return 'N';
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int nAttck, nDef, aux;
		ArrayList<Integer> distAttck, distDef;

		do {
			nAttck = key.nextInt();
			nDef = key.nextInt();

			if (nAttck == 0 && nDef == 0)
				break;

			distAttck = new ArrayList<Integer>();
			for (int i = 0; i < nAttck; i++) {
				aux = key.nextInt();

				distAttck.add(aux);
			}

			distDef = new ArrayList<Integer>();
			for (int i = 0; i < nDef; i++) {
				aux = key.nextInt();

				distDef.add(aux);
			}

			System.out.println(isOffside(distAttck, distDef));
			
		} while (true);

		key.close();
	}
}


public class Array2DJava {

	public static void main(String[] args) {
		
		//Two-Dimensional Array
		int a[][] = {
				{12,13,14,15},
				{21,22,23},         //Jagged Array
				{34,35,36,37}
		};
		
		//Enhanced loop for two-dimensional array
		for(int k[]: a) {
			for(int j: k) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		/*for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}*/
		
		
		
	}
	
	
}

public class Patt3{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int no=5;
		for(int i=1;i<=no;i++){
			for(int sp=1;sp<=no-i;sp++){
				System.out.print(" ");
				}
			for(int j=0;j<(1+(i-1)*2);j++){
				System.out.print((no+1)-i);
			}
			System.out.println();
				
			}
		}

	}


package p28_12_2021;

public class HelperMethods {

	public static void main(String[] args) {
	int [] niz = {1,2,3,4,5};
		
		stampaj(niz);
printReverse(niz);
	}public static void stampaj(int [] niz) {
		int i;
		for(i=0;i<niz.length;i++)
		System.out.print(niz[i]);
	}public static void printReverse (int [] niz) {
		int i;
		for (i=niz.length - 1; i>=0;i--) {
			System.out.print(niz[i]);
		}
	}

}

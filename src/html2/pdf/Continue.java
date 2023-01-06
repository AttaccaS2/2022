package html2.pdf;

public class Continue {

	public static void main(String[] args) {
		outer: for(int i=0 ; i<10; i++) { 
		//초깃값 0 ; i가 10보다 작다는 조건을 만족하면 for 반복문 수행한다 ; 그 후 i는 1만큼 증가
			for(int j=0 ; j<10; j++) {
				if(j>i) {
		//j가 i보다 큰 경우 수행하지 않고 outer로 돌아가고			
					System.out.println();
					continue outer;
				}
		//j가 i보다 작으면 i*j 출력		
				System.out.print(" "+(i*j));
			}
			
		}
	}
}

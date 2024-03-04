package Quiz;

public class Pibonacci {

	public static void main(String[] args) {
		
		int arr[] = new int[100];
		
		// 1,2 번째는 고정이기 때문에 1 , 1 로 정의
		arr[1] = 1;
		arr[2] = 1;
		
		// 앞의 2개를 더한 것이 그 다음 인덱스의 값
		for(int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

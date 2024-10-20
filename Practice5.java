package controlStatementPractice;

import java.util.Scanner;

public class Practice5 {
//	마트에서 구입한 물건값과 구입 시간을 입력받아 실제 지불한 금액을 출력하는 프로그램을 작성하시오.
//	마트는 시간대별로 할인율을 다르게 적용한다.
//	낮 12시 이전: 구입 금액의 5% 할인
//	낮 12시 이후(12시 포함): 구입 금액의 2.5% 할인
//	 실행 결과
//	 구입 시간: 10시
//	 총 구입액: 100000
//	 실제 지불 금액: 95000
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double discount = 0;
		
		System.out.println("구입한 물건 값을 입력해 주세요");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.println("구입 시간을 입력해 주세요");
		int time = Integer.parseInt(sc.nextLine());
		
		if (time < 12 && time >= 0) {
			discount = 5.0;
			double netPrice = price*(1-(discount/100.0));
			System.out.printf("구입시간 : %d시\n총 구입액 : %d\n실제 지불 금액: %.0f",
								time, price, netPrice);
		}else if(time <=24 ){
			discount = 2.5;
			double netPrice = price*(1-(discount/100.0));
			System.out.printf("구입시간 : %d시\n총 구입액 : %d\n실제 지불 금액: %.0f",
								time, price, netPrice);
		}
		else {
			System.out.println("시간을 0~24시 이내로 입력해 주세요"); 
		}
	}
}

package day4;

import java.util.ArrayList;
import java.util.Collections;
//로또 번호 제작기 2탄 - ArrayList를 쓴 유식한 방법
import java.util.Random;

public class ex05 {
	private static final int MAX = 45;
	private static final int SIZE = 6;

	public static void main(String[] args) {
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		Random random = new Random();

		// 먼저 숫자 6개를 추가해주자
		// 근데 추가할 때 마다 indexOf로 미리 체크를 한다.
		// 그리고 추가는 while문을 통해서 한다.
		while (lottoNumbers.size() < 6) {
			Integer number = random.nextInt(MAX) + 1;
			if (lottoNumbers.indexOf(number) == -1) {
				lottoNumbers.add(number);
			}
		}
		
		//정렬을 해보자
		//근데 왜 정렬을 우리가 해야돼
		//자바의 정렬을 이용하자
		Collections.sort(lottoNumbers);
		
		//중복제거 완료, 정렬 끝
		for(int i = 0; i < lottoNumbers.size(); i++) {
			System.out.println(lottoNumbers.get(i));
		}
	}

}

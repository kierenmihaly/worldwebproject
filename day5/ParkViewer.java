package day5;
//사실 Viewer는 

//jsp 또는 html 웹페이지가 되어야 한다
//하지만 우리는 컨솔 프로그램이기 때문에
//메인 메소드가 여기로 들어가게 된다 

import java.util.ArrayList;
import java.util.Scanner;

public class ParkViewer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<ParkDTO> list = new ArrayList<>();
		ParkController controller = new ParkController(list);
		while (true) {
			System.out.println("정현 주차장 관리 프로그램");
			System.out.println("1. 입차 2. 출차 2. 종료");
			int choise = scanner.nextInt();
			if (choise == 1) {
				// 입차 시작
				// 1. 빈칸이 있는 지 확인한다
				if (controller.checkEmptySpot()) {
					// 빈칸이 있으므로 주차 시작
					// 차량번호와 시간을 담을
					// 임시 객체 하나 만들어 준다
					ParkDTO p = new ParkDTO();
					//우리가 만드는 객체는
					//필요할 때 만들어주면 된다
					System.out.println("차량 번호 입력: ");
					scanner.nextLine();
					p.setPlateNumber(scanner.nextLine());
					while(controller.indexOf(p) != -1) {
						System.out.println("중복된 번호");
						System.out.println("차량 번호 입력:");
						p.setPlateNumber(scanner.nextLine());
					}
					System.out.println("입차 시간 입력: ");
					int inTime = scanner.nextInt();
					while(controller.validateTime(inTime) == false) {
						System.out.println("잘못된 형식");
						System.out.println("입차 시간 입력: ");
						inTime = scanner.nextInt();
					}
					p.setInTime(inTime);
					controller.add(p);
					System.out.println("주차가 완료");
				} else {
					// 없으니까 메세지 출력
					System.out.println("There are not enough place");
				}
			} else if (choise == 2) {
				// 출차 시작
			} else if (choise == 3) {
				System.out.println("감사합니다");
				break;
			} else {
				System.out.println("잘못");
			}
		}

		scanner.close();
	}
}

package day5;
//사실 Viewer는 

//jsp 또는 html 웹페이지가 되어야 한다
//하지만 우리는 컨솔 프로그램이기 때문에
//메인 메소드가 여기로 들어가게 된다 

import java.util.ArrayList;
import java.util.Scanner;

public class ParkViewer {
	private static final int SIZE = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<ParkDTO> list = new ArrayList<>();
		ParkController controller = new ParkController(list);
		while (true) {
			System.out.println("정현 주차장 관리 프로그램");
			System.out.println("1. 입차 2. 출차 3. 종료");
			int choise = scanner.nextInt();
			if (choise == 1) {
				// 입차 시작
				// 1. 빈칸이 있는 지 확인한다
				if (controller.size() < SIZE) {
					// 빈칸이 있으므로 주차 시작
					// 차량번호와 시간을 담을
					// 임시 객체 하나 만들어 준다
					ParkDTO p = new ParkDTO();
					// 우리가 만드는 객체는
					// 필요할 때 만들어주면 된다
					System.out.println("차량 번호 입력: ");
					scanner.nextLine();
					p.setPlateNumber(scanner.nextLine());
					while (controller.indexOf(p) != -1) {
						System.out.println("중복된 번호");
						System.out.println("차량 번호 입력:");
						p.setPlateNumber(scanner.nextLine());
					}
					System.out.println("입차 시간 입력: ");
					int inTime = scanner.nextInt();
					while (controller.validateTime(inTime) == false) {
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
				// 출차시작
				//제일 먼저 주차된 차량이 존재하는지
				//체크하고 없으면 메시지를 띄운다 
				if(controller.size() == 0) {
					System.out.println("주차된 차량이 없다 시발놈아");
				}else {
					//주차된 차량이 존재하므로
					//출차 시작
					//먼저 차량 번호를 입력받아서
					//ParkDTO 객체에 넣어서
					//해당하는 객체의 위치가 -1인지
					//아닌지 확인한다.
					//왜냐! -1 이면 list에 존재하지 
					//않는 의미이기 때문에
					//다시 입력을 받아야 하기 때문이다. 
					scanner.nextLine();
					System.out.println("출차할 차량의 번호를 입력: ");
					ParkDTO p = new ParkDTO();
					p.setPlateNumber(scanner.nextLine());
					while(controller.indexOf(p) == -1) {
						System.out.println("존재하지 않는 번호");
						System.out.println("출차할 차량 번호 입력: ");
						p.setPlateNumber(scanner.nextLine());
					}
					
					//while 문을 빠져나왔다 -> 해당하는 차량을 찾았다!
					//그러면 indexOf(p) 의 결과값으로
					//p 를 초기화 해주면?
					//list 에 저장되어있는 inTime도 우리가 쓸 수 있다! 
					p = controller.selectOne(controller.indexOf(p));
					//이제 p에 inTime도 들어갔으니깐
					//출차시간을 입력 받아서
					//유효한 시간의 형태 + inTime보다 늦은시간이
					//나올때까지
					//while문을 돌려준다! 
					System.out.println("출차 시간을 입력");
					int outTime = scanner.nextInt();
					while(!controller.validateTime(outTime) || p.getInTime() > outTime) {
						System.out.println("시간 오류");
						System.out.println("출차 시간입력: ");
						outTime = scanner.nextInt();
					}
					
					//이제 요금 계산 결과를 출력하고
					//차량을 삭제해준다! 
					System.out.println("총 요금은" + controller.calculateRate(p.getInTime(), outTime) + "원 입니다");
					controller.remove(p);
					
				}
			} else if (choise == 3) {
				System.out.println("감사합니다");
				break;
			} else {
				System.out.println("오류");
			}
		}

		scanner.close();
	}
}

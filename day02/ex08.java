package day02;

//http status code�� ����
//����� �������ֱ� 
public class ex08 {
	public static void main(String[] args) {
		int statusCode = 200;
		
		String response = "http://localhost:8080/main/";
		switch (statusCode) {
		case 400:
			response = 
			"http://localhost:8080/error/400";
			break;
		case 404:
			response =
			"http://localhost:8080/error/404";
			break;
		default:
			break;
		}
		System.out.println(response);
	}
}

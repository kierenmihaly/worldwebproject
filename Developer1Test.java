public class  Developer1Test{

	public static void main(String[] args) {
	
		Developer1 developer = new Developer1();
		System.out.println("�̸��� : "+developer.name);
		System.out.println("������ : "+developer.namjob);
		System.out.println("��ռ����� : "+developer.avgIncome);
		System.out.println("�̸��� : "+developer.projectCareer);
		
		System.out.printl("=====================");

		developer.participateProject();
		System.out.println("��ռ�����:"+developer.avgIncome);
		System.out.println("Project ���� ����� : "+developer.projectCareer");

		System.out.printl("=====================");

		developer.instruct();
		System.out.println("��ռ�����:" +developer.avgIncome);

		

		String projectName = "�ѹ�����";
		developer.participateProject(projectName);
		System.out.println("��ռ�����: "developer.avgIncome);
		System.out.println("project���� �����: "developer.projectCareer);

		System.out.printl("=====================");

		int lectureCount = 2;
		developer.instruct(lectureCount);
		System.out.println("��ռ����� : "developer.avgIncome);

	}
}

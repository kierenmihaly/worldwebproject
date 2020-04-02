class Account  {

	private String accNo;
	private int balance;

	public Account() {

	}

	public Account(String accNo){
		this.accNo = accNo;
		System.out.println(accNo+"���°� �����Ǿ����ϴ�.");
	}

	public String getAccNo(){
			return accNo;
	}

	public int getBalance(){
			return balance;
	}

	public void save(int money){
			balance += money;
			System.out.println(accNo+"���¿�"+money+"������ �ԱݵǾ����ϴ�.");
	}

	public void deposit(int money){
		balance -= money;
		System.out.println(accNo+"���¿�"+money+"������ ��ݵǾ����ϴ�.");
	}

}//class
class TestAccount{


	public static void main(String[] args)throws Exception {

		String accNo = null;
		int balance = 0;

		Account accObj = new Account("010-111-111");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+"������ �ܰ���"+balance+"�����Դϴ�.");

		accObj.save(100);
		balance=accObj.getBalance();
		System.out.println(accObj.getAccNo()+"������ �ܰ���"+balance+"�����Դϴ�.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo+"������ �ܰ���"+balance+"�����Դϴ�.");


	}//main
}//class
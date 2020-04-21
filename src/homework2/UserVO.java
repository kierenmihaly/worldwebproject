package homework2;

public class UserVO {
	
	private String name;
	private String sex;
	private String birth;

	private boolean active;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", sex=" + sex + ", birth=" + birth + "]";
	}
	
	
	
}

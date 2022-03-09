package day10.solve;

public class Friend {
	/*
	
	이 클래스는 친구 한명의 정보를 기억할 클래스
	이 클래스의 객체를 이용하면
	여러명의 친구의 정보를 기억시켜둘 수 있음
	이 말은 친구의 정보는 변수에 기억시킬 것이고
	각 친구마다 그 변수들의 데이터가 따로 입력되어서 기억되어야 하므로
	따로 초기화는 필요하지 않음
	
	친구의 정보는
	이 클래스를 객체로 만든 후
	변수의 내용을 변경시켜서 기억시키면됨
	
	이 때
	변수의 경우 아무나 이 객체의 변수에 접근해서 데이터를 변경시키면 안되므로
	변수는 감춰두고 변수에 접근할 수 있는 함수들을 만들어서 데이터를 처리함
	
 */
	
	private String name, addr, tel, mail, birth;
	private int age;
	private char gen;
	
	// 이름을 기억시키는 함수
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "name=" + name + ", addr=" + addr + ", tel=" + tel + ", mail=" + mail + ", birth=" + birth
				+ ", age=" + age + ", gen=" + gen + "]";
	}
}


	
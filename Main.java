

class User {

	private Integer id;
	private String userName;
	private String password;

	// Zero Parameterized Constructor
	public User() {

	}

	//Parameterized Constructor
	public User(Integer id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}


class UserBO {


	private User[] getUsers() {
		User[] users = new User[5];

		users[0] = new User(1, "Bharat", "BCDEF");
		users[1] = new User(2, "Dhaneswar", "AK##$!!#");
		users[2] = new User(3, "Tankadhar", "KS979873");
		users[3] = new User(4, "Ketan", "LKKJ@14413");
		users[4] = new User(5, "Bond", "AsfkjI*(^");

		return users;
	}


	private String encryptPassword(String password) {

		String res = "";

		for(int i=0; i<password.length(); i++) {
			res += (char)(password.charAt(i) + 1);
		}

		return res;
	}


	public boolean validate(String userName, String password) {
		User[] users = getUsers();

		for(int i=0; i<users.length; i++) {
			String un = users[i].getUserName();
			String pw = users[i].getPassword();
			if(un.equals(userName) && pw.equals(encryptPassword(password))) {
				return true;
			}
		}
		return false;
	}

}


public class Main{
	public static void main(String[] args) {

		UserBO u = new UserBO();

		System.out.println(u.validate("Bharat", "ABCDE"));
		System.out.println(u.validate("Ridhi", "Jksjfeor"));
	}
}





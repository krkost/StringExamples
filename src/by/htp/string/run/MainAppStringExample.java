package by.htp.string.run;

public class MainAppStringExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s = "abc"; // разместить ссылку в пуле
		String s1 = "abc";
		String s2 = s + "def";
		String s3 = s2.replace('e', 'j');
		String s4 = new String("abc"); // не размещать ссылку в пуле
		
		String s5 = new String("Hello world");
		String s41 = s4.intern();
		String s42 = "abc";
		
		String s51 = s5.intern();
		String s52 = "Hello world";
		String s53 = new String ("Hello world");
		String s54 = "Hello world";
		
		
		//System.out.println(s1.equals(s4));
		
		User user = new User(1, "User1");
		User user2 = new User(1, "User1");
		User user3 = user;
		
		System.out.println(user);
		System.out.println(user.equals(user3));
		
	}

}

class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // проверяем ссылку на объект, если ссылка равна ссылке на текущий объект > true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

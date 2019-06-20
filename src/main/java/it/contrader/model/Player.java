package it.contrader.model;

public class Player {
	
	private int id;
	
	private int idcoach;
	
	private String password;
	
	private String playertype;
	
	private String name;
	
	private String surname;
	
	private int height;
	
	private double weight;
	
	private int age;
	
	private int pr;
	
	private int gf;
	
	private int gs;
	
	private double kmp;
	
	private int min;
	
	public Player () {
		
	}
	
	public Player (int id, int idcoach, String password, String playertype, String name, String surname, int height, double weight, int age, int pr, int gf, int gs, double kmp, int min) {
		this.id = id;
		this.idcoach = idcoach;
		this.password = password;
		this.playertype = playertype;
		this.name = name;
		this.surname = surname;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.pr = pr;
		this.gf = gf;
		this.gs = gs;
		this.kmp = kmp;
		this.min = min;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdcoach() {
		return idcoach;
	}

	public void setIdcoach(int idcoach) {
		this.idcoach = idcoach;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlayertype() {
		return playertype;
	}

	public void setPlayertype(String playertype) {
		this.playertype = playertype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPr() {
		return pr;
	}

	public void setPr(int pr) {
		this.pr = pr;
	}

	public int getGf() {
		return gf;
	}

	public void setGf(int gf) {
		this.gf = gf;
	}

	public int getGs() {
		return gs;
	}

	public void setGs(int gs) {
		this.gs = gs;
	}

	public double getKmp() {
		return kmp;
	}

	public void setKmp(double kmp) {
		this.kmp = kmp;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	@Override
	public String toString() {
		return  id + "\t"  + idcoach +"\t\t" + password + "\t\t" +  playertype + "\t\t" + name + "\t\t" + surname + "\t\t" + height + "\t\t" + weight + "\t\t" + age + "\t\t" + pr + "\t\t" + gf + "\t\t" + gs + "\t\t" + kmp + "\t\t" + min ;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if(id != other.id)
			return false;
		if(idcoach != other.idcoach)
			return false;
		if(height != other.height)
			return false;
		if(age != other.age)
			return false;
		if(pr != other.pr)
			return false;
		if(gf != other.gf)
			return false;
		if(gs != other.gs)
			return false;
		if(min != other.min)
			return false;
		if(weight != other.weight)
			return false;
		if(kmp != other.kmp)
			return false;
		if (password == null) {	
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (playertype == null) {
			if (other.playertype != null)
				return false;
		} else if (!playertype.equals(other.playertype))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}

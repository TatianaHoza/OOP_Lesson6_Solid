public class User implements Saveable {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void save() {
		Persister persister = new Persister(this);
    	persister.save();
	}


}
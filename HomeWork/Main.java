public class Main{
	public static void main(String[] args){
		User user = new User("Bob");

		Saveable saveable = new Persister(user);
		saveable.save();

		Repotable repotable = new ReportUser(user);
		repotable.report();


	}
}
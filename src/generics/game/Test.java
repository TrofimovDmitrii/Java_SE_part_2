package generics.game;

public class Test {
	public static void main(String[] args) {
		Schoolar schoolar1 = new Schoolar("Ivan", 13);
		Schoolar schoolar2 = new Schoolar("Mariya", 15);

		Schoolar schoolar3 = new Schoolar("Sergey", 12);
		Schoolar schoolar4 = new Schoolar("Olya", 14);

		Student student1 = new Student("Nikolay", 20);
		Student student2 = new Student("Kseniya", 21);

		Employee employee1 = new Employee("Mikhail", 30);
		Employee employee2 = new Employee("Pavel", 36);

		Team<Schoolar> schoolarTeam = new Team<>("Drakoni");
		schoolarTeam.addNewParticipant(schoolar1);
		schoolarTeam.addNewParticipant(schoolar2);

		Team<Schoolar> schoolarTeam2 = new Team<>("Mudreci");
		schoolarTeam2.addNewParticipant(schoolar3);
		schoolarTeam2.addNewParticipant(schoolar4);

		Team<Student> studentTeam = new Team<>("Vpered!");
		studentTeam.addNewParticipant(student1);
		studentTeam.addNewParticipant(student2);

		Team<Employee> employeeTeam = new Team<>("Rabotyagi");
		employeeTeam.addNewParticipant(employee1);
		employeeTeam.addNewParticipant(employee2);


		schoolarTeam.playWith(schoolarTeam2);
	}
}

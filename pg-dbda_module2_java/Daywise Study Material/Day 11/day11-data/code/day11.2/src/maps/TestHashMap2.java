package maps;

import java.util.HashMap;

public class TestHashMap2 {

	public static void main(String[] args) {
		// create empty hashmap to store student details : def ctor
		HashMap<String,Student> students=new HashMap<>();//size =0, init capa =16 
		//to add the entry in the map
		//Map API : public V put(K key, V value) : inserts new entry --rets null
		//in case of dup key -- replaces old value by new val n rets -- old value
		Student[] studentArr= {new Student("dbda-0001", "Rama Kher", 78),
				new Student("dbda-0009", "Ramesh Kher", 78),
				new Student("dbda-0004", "Riya Sen", 98),
				new Student("dbda-0003", "Parag Seth", 85),
				new Student("dbda-0006", "Priya Kadam", 70),
				new Student("dbda-0005", "Ritu Ghosh",82),
				new Student("dbda-0004", "Rahul Mujumdar",80)
				};
		  //populate the map using for-each --> array
		for(Student s : studentArr)
			System.out.println("put rets  : "+students.putIfAbsent(s.getPrn(), s));
		//display the map conents : toString
	//	System.out.println(students);
		System.out.println("Student details from HashMap");
		for(Student s : students.values())//values : rets Collection<V>
			System.out.println(s);
			
			
		

	}

}

package maven.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class StreamDemo {
	
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<Student>();
		stList.add(new Student(101, "Sayan"));
		stList.add(new Student(102, "Deb"));
		stList.add(new Student(103, "Avi"));
		stList.add(new Student(104, "Roni"));
		
		List<Student> upst=stList.stream().map((s)-> {
			s.setName(s.getName().toUpperCase());
			return s;
		}).collect(Collectors.toList());
		
		upst.forEach(e -> System.out.println(e.toString()));
		
	}

}

package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;
public class basic_priority_queue {
	
	static class Student implements Comparable<Student>{
		String name;
		int rank;
		public Student(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}
		@Override
		public int compareTo(Student s2) {
			return this.rank - s2.rank;
		}
	}
	
	
	public static void main(String[] args) {
//		 PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
		 PriorityQueue<Student> pq = new PriorityQueue<>();
		 
		//O(log n)
		 pq.add(new Student("tejas", 10));  
		 pq.add(new Student("Rahul", 9090));
		 pq.add(new Student("Virat", 21));
		 pq.add(new Student("Rohit", 5));
		 pq.add(new Student("Rakesh", 100));
		 
		 while(!pq.isEmpty()) {
			 System.out.println(pq.peek().name+"->"+pq.peek().rank); //O(1)
			 pq.remove();  //O(log n)
		 }

	}

}

import java.util.*;

class classRoom {
	private double length;
	private double breadth;

	public void getdata() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the room: ");
		length = scanner.nextDouble();
		System.out.print("Enter the breadth of the room: ");
		breadth = scanner.nextDouble();
	}

	public double area() {
		return length * breadth;
	}
}

public class Class_room {
	public static void main(String[] args) {
		classRoom obj = new classRoom();
		obj.getdata();
		double RoomArea = obj.area();
		System.out.println("The area of room is : " + RoomArea);
	}
}

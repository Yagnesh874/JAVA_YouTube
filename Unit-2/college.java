// // import java.util.*;
//  class College
// {
//     public String name;
//     public String location;
//     public int year;
//     void display()
//     {
//         System.out.println("The name is : "+name);
//         System.out.println("The location is : "+location);
//         System.out.println("The year is : "+year);
//     }
// }
// public class college
// {
//     public static void main(String[] args) {
//         College sc = new College();
//         sc.name = "GLS university";
//         sc.location = "ahmedabad";
//         sc.year = 3;
//         sc.display();
//     }
// }


class College {
    public String name;
    public String location;
    public int year;
    
    public void display() {
        System.out.println("The name is: " + name);
        System.out.println("The location is: " + location);
        System.out.println("The year is: " + year);
    }
}

public class college {
    public static void main(String[] args) {
        College sc = new College();
        sc.name = "GLS university";
        sc.location = "ahmedabad";
        sc.year = 3;
        sc.display();
    }
}










// // // College.java
// // class College {
// //     String name;
// //     String location;
// //     int foundedYear;

// //     void displayInfo() {
// //         System.out.println("College Name: " + name);
// //         System.out.println("Location: " + location);
// //         System.out.println("Founded Year: " + foundedYear);
// //     }
// // }

// // public class college {
// //     public static void main(String[] args) {
// //         // Create an object of the College class
// //         College myCollege = new College();

// //         // Assign values to the object's members
// //         myCollege.name = "My University";
// //         myCollege.location = "Cityville";
// //         myCollege.foundedYear = 1990;

// //         // Display the information using the object's method
// //         myCollege.displayInfo();
// //     }
// // }

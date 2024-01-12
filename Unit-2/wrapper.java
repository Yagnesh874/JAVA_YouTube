// // public class wrapper {
// //     public static void main(String[] args)
// //     {
// //         Integer numWrapper=10;
// //         int pri = numWrapper;
// //         System.out.println("Primitive values is : "+pri);
// //     }

// // }

// interface sports {
//     int sportMarks = 50;

//     public void putweight();
// }

// class result implements sports {
//     int sub1, sub2, sub3;
//     int total;
//     double per;

//     result(int sub1, int sub2, int sub3) {
//         this.sub1 = sub1;
//         this.sub2 = sub2;
//         this.sub3 = sub3;
//         this.total = sub1 + sub2 + sub3;

//     }

//     @Override

//     public void putweight() {
//         per = (total + sportMarks) / 4.0;
//     }

//     void display() {
//         System.out.println("Subject 1 Marks: " + sub1);
//         System.out.println("Subject 2 Marks: " + sub2);
//         System.out.println("Subject 3 Marks: " + sub3);
//         System.out.println("Total Marks: " + total);
//         System.out.println("Sports Marks: " + sportMarks);
//         System.out.println("Percentage: " + per);

//         // Calculate and display grade based on percentage
//         if (per >= 80) {
//             System.out.println("Grade: A");
//         } else if (per >= 60) {
//             System.out.println("Grade: B");
//         } else if (per >= 40) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("Grade: F");
//         }
//     }
// }

// public class wrapper {
//     public static void main(String[] args) {
//         result obj = new result(34, 76, 90);
//         obj.putweight();
//         obj.display();
//     }
// }

import java.util.Scanner;

interface area {
    float pi = 3.14f;

    public void circle();
}

class result implements area {
    int radius;
    double cir;

    result(int radius, double cir) {
        this.radius = radius;
        this.cir = cir;
    }

    @Override
    public void circle() {
        cir = pi * radius * radius;
    }

    void display() {
        System.out.println("The area of circle is : " + cir);
    }
}

public class wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        int radius = sc.nextInt();
        result obj = new result(radius, radius);
        obj.circle();
        obj.display();
    }
}
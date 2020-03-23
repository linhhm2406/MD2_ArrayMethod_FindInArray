import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        String[] studentList;

        System.out.print("Nhap vao chieu dai mang: ");
        size = input.nextInt();

        input.nextLine();
        studentList = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhap vao ten sinh vien " + (i+1) +": ");
            studentList[i] = input.nextLine();
        }

        System.out.println();

        System.out.print("Nhap vao ten sinh vien muon tim : ");
        String studentToFind = input.nextLine();

        for (int i = 0; i < size; i++) {
            if (studentList[i].equals(studentToFind)){
                System.out.printf("Co sinh vien %s trong mang, tai vi tri %d",studentToFind,i+1);
                break;
            }
        }
    }
}

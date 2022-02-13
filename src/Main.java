import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[5];
        listBook[0] = new Book("Dac nhan tam", "Dale Carnegie", 60, 5, 0.4);
        listBook[1] = new Book("Nha gia kim", "Paulo Coelho", 50, 7, 0.2);
        listBook[2] = new Book("Dam nghi lon", " David J. Schwartz. Ph.D", 80, 8, 0.3);
        listBook[3] = new Book("Cha giau cha ngheo", "Robert Kiyosaki Sharon Lechter", 150, 10, 0.5);
        listBook[4] = new Book("7 Thoi quen de thanh dat", " Stephen R. Covey", 200, 20, 0.6);

        int sum = getSumQuantity(listBook);
        System.out.println("Tổng số sách là : " + sum + " quyển");
        double sum1 = getTotalPrice(listBook);
        System.out.println("Tổng số tiền của 5 tựa sách là : " + sum1 + " nghìn");
        double sum2 = getTotalWeight(listBook);
        System.out.println("Tổng khối lượng cua 5 tựa sách là : " + sum2 + " kg");
        System.out.println("Mời bạn nhập sách muốn tìm : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].getName().equals(name)) {
                System.out.println("Tên sách : " + listBook[i].getName());
                System.out.println("Tác giả : " + listBook[i].getAuthor());
                System.out.println("Giá sách :" + listBook[i].getPrice() + " nghìn");
                check = true;
                break;
            }
        }
        if(check==false)
            System.out.println(" Sách bạn tìm không có ");
        }
        public static int getSumQuantity (Book[]books){
            int sum = 0;
            for (int i = 0; i < books.length; i++) {
                sum += books[i].getQuantity();
            }
            return sum;
        }

    public static double getTotalPrice(Book[] books) {
        int sum1 = 0;
        for (int i = 0; i < books.length; i++) {
            sum1 += books[i].getTotalPrice();
        }
        return sum1;
    }

    public static double getTotalWeight(Book[] books) {
        double sum2 = 0;
        for (int i = 0; i < books.length; i++) {
            sum2 += books[i].getTotalWeight();
        }
        return sum2;
    }
}

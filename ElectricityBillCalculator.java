import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện tiêu thụ trong tháng (kWh): ");
        int consumedUnits = scanner.nextInt();

        double billAmount = calculateElectricityBill(consumedUnits);

        System.out.println("Số tiền điện phải trả là: " + billAmount + " đồng");

        scanner.close();
    }

    public static double calculateElectricityBill(int consumedUnits) {
        double billAmount = 0.0;

        if (consumedUnits <= 50) {
            billAmount = consumedUnits * 1000; // Giá điện: 1000 đồng/kWh
        } else if (consumedUnits <= 100) {
            billAmount = 50 * 1000 + (consumedUnits - 50) * 1500; // 50 kWh đầu: 1000 đồng/kWh, từ kWh 51 đến kWh 100: 1500 đồng/kWh
        } else if (consumedUnits <= 200) {
            billAmount = 50 * 1000 + 50 * 1500 + (consumedUnits - 100) * 2000; // 50 kWh đầu: 1000 đồng/kWh, từ kWh 51 đến kWh 100: 1500 đồng/kWh, từ kWh 101 đến kWh 200: 2000 đồng/kWh
        } else {
            billAmount = 50 * 1000 + 50 * 1500 + 100 * 2000 + (consumedUnits - 200) * 2500; // 50 kWh đầu: 1000 đồng/kWh, từ kWh 51 đến kWh 100: 1500 đồng/kWh, từ kWh 101 đến kWh 200: 2000 đồng/kWh, từ kWh 201 trở đi: 2500 đồng/kWh
        }

        return billAmount;
    }
}
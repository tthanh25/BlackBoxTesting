# Testing
Bài toán tính tiền điện, trong đó có những quy định sau:
- Giá điện theo mức sử dụng: Hầu hết các hệ thống tính tiền điện sẽ có giá điện được chia thành các mức sử dụng khác nhau. Ví dụ: mức 1 cho 50 kWh đầu tiên, mức 2 cho 51-100 kWh, mức 3 cho 101-200 kWh, và mức 4 cho 201 kWh trở lên. Mỗi mức sẽ có giá điện khác nhau.

## Trong bài toán này, giá điện được định nghĩa như sau:
-	50 kWh đầu: 1000 đồng/kWh
-	Từ kWh 51 đến kWh 100: 1500 đồng/kWh
-	Từ kWh 101 đến kWh 200: 2000 đồng/kWh
-	Từ kWh 201 trở đi: 2500 đồng/kWh

### Giải bài toán:
- Xác định số lượng kWh tiêu thụ: Đầu tiên, bạn cần xác định số lượng kWh mà khách hàng đã tiêu thụ trong một kỳ tính giá. Hãy gọi số lượng kWh này là kwh.

- Tính toán tiền điện dựa trên mức giá: Dựa vào các mức giá đã cho, bạn có thể tính toán số tiền điện cho từng khoảng tiêu thụ bằng cách sử dụng các công thức tương ứng. Hãy gọi số tiền điện cho từng khoảng tiêu thụ là money.

- Đối với khoảng tiêu thụ từ kWh 1 đến kWh 50: total_money = sodienX * 1000.
- Đối với khoảng tiêu thụ từ kWh 51 đến kWh 100: total_money = 50 * 1000 + (sodienX - 50) * 1500.
- Đối với khoảng tiêu thụ từ kWh 101 đến kWh 200: total_money = 50 * 1000 + 50 * 1500 + (sodienX - 100) * 2000. 
- Đối với khoảng tiêu thụ từ kWh 201 trở đi: total_money = 50 * 1000 + 50 * 1500 + 100 * 2000 + (sodienX - 200) * 2500.
- Với công thức trên, bạn có thể tính toán tiền điện dựa trên số lượng kWh tiêu thụ và các mức giá tương ứng cho từng khoảng tiêu thụ.

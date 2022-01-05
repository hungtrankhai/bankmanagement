package trankhaihung.pakage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    String fullName, accNumber, phoneNumber, address;
    int money;

    Scanner sc = new Scanner(System.in);

    // danh sach chua lich su nap tien & nhan tien
    List<Receiver> receiverList = new ArrayList<>();
    List<Transfer> transferList = new ArrayList<>();

    public Account() {
    }

    public Account(String fullName, String accNumber, String phoneNumber, String address, int money){
        this.fullName = fullName;
        this.accNumber = accNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.money = money;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // lich su nhan tien
    public void displayReceiverHistory(){
        System.out.println("Lịch sử nhận tiền: ");
        for(Receiver rec : receiverList){
            rec.display();
        }
    }

    // lich su chuyen tien
    public void displayTransferHistory(){
        System.out.println("Lịch sử chuyển tiền: ");
        for(Transfer tran : transferList){
            tran.display();
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "fullName='" + fullName + '\'' +
                ", accNumber='" + accNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                '}';
    }

    // nap tien
    public void addReceiver(){
        Receiver receiver = new Receiver();
        receiver.input();

        receiverList.add(receiver);    // them vao lich su nap tien

        //cong tien vao tk
        money += receiver.getMoney();

    }

     // chuyen tien
    public void transferMoney(){
        Transfer transfer = new Transfer();
        transfer.input(money);

        // them vao lich su chuyen tien
        transferList.add(transfer);

        // tru tien trong tk
        money -= transfer.getMoney();

    }

    // viet them phan 6: kiem tra so du tk
    public void displaySoDuTK(){
        System.out.println("Nhập số tài khoản cần kiểm tra: ");
        String str1 = sc.nextLine();

        if(str1.contains(accNumber)){
            System.out.println("___*___SO DU CUA TAI KHOAN "+str1+"CHU TAI KHOAN: "+fullName+ " LA: "+money+" VND___*___");
        }
    }


    public void display(){
        System.out.println(toString());
        displayReceiverHistory();
        displayTransferHistory();
    }

    public void input(){
        System.out.println("Nhập họ tên: ");
        fullName = sc.nextLine();

        System.out.println("Nhập số tài khoản: ");
        accNumber = sc.nextLine();

        System.out.println("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();

        money = 0;

    }

}

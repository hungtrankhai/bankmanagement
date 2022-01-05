package trankhaihung.pakage1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Account account = null;

    public static void main(String[] args) {
        login();

        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                     account = new Account();
                     account.input();
                    break;
                case 2:
                    if (account != null){
                        account.addReceiver();
                    } else {
                        System.err.println("Tài khoản không tồn tại :(");
                    }
                    break;
                case 3:
                    if (account != null){
                        account.input();
                    } else {
                        System.err.println("Tài khoản không tồn tại :(");
                    }
                    break;
                case 4:

                    if (account != null){
                        account.displayReceiverHistory();
                    } else {
                        System.err.println("Tài khoản không tồn tại :(");
                    }
                    break;
                case 5:

                    if (account != null){
                        account.displayTransferHistory();
                    } else {
                        System.err.println("Tài khoản không tồn tại :(");
                    }
                    break;
                case 6:   // viet them: kiem tra so du tai khoan

                    if (account != null){
                        account.displaySoDuTK();
                    } else {
                        System.err.println("Tài khoản không tồn tại :(");
                    }
                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Thoát");
                    break;
                default:
                    System.err.println("Nhập sai !");
                    break;

            }

        } while (choose != 8);



    }


    /* functions ____________________________________________________________________________________________
    ____________________________________________________________________________________________ */

    static void showMenu(){
        System.out.println("1.Tạo tài khoản");
        System.out.println("2.Nạp tiền");
        System.out.println("3.Chuyển tiền");
        System.out.println("4.Xem lịch sử nạp tiền");
        System.out.println("5.Xem lịch sử chuyển tiền");
        System.out.println("6.Kiểm tra số dư tài khoản");
        System.out.println("7.Đọc dữ liệu");
        System.out.println("8. Thoát");
    }


    static void login(){
        System.out.println("______WELCOME______");
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();

        if(username.equalsIgnoreCase("trankhaihung") && password.equals("123456")){
            System.out.println("ĐĂNG NHẬP THÀNH CÔNG ^^ !!!");
        } else {
            System.err.println("Eror - ĐĂNG NHẬP THẤT BẠI :(");
            login();
        }
    }




}

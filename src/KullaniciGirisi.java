import java.util.Scanner;
public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, answer, newPassword;

        Scanner data = new Scanner(System.in);

        System.out.print("Kullanıcı adı :");
        userName = data.nextLine();

        System.out.print("Şifre :");
        password = data.nextLine();

        if (password.equals("java123")){
            System.out.println("Sisteme giriş yaptınız.");
        } else{
            System.out.print("Şifrenizi yanlış girdiniz.");
            System.out.print("Şifreyi sıfırlamak ister misiniz?\nEvet\nHayır\n:");
            answer = data.nextLine();

            switch (answer){
                case "Evet":
                    System.out.print("Yeni şifrenizi giriniz :");
                    newPassword = data.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.print("Şifre oluşturuldu.");
                    }
                    break;

                default:
                    System.out.print("Şifrenizi tekrar giriniz.");
            }
        }
    }
}

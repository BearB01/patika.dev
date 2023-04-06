package Giris;
import java.util.Scanner;
public class kullaniciGirisiOrnegi {
    public static void main(String[] args) {
        String userName,password,answer,newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName= input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password= input.nextLine();

        if(userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş işleminiz başarılı:))");
        }else{
            System.out.println("Kullanıcı adınız veya şifrenizi hatalı girdiniz.Tekrardan deneyiniz.:((");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? Evet veya Hayır yazınız.");
            answer=input.nextLine();
            if(answer.equals("Evet")){
                System.out.println("Şifreyi sıfırlamaya evet");
                System.out.println("Yeni şifrenizi giriniz: ");
                newPassword=input.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz. Şifreniz eski" +
                            " şifreniz ile aynı girilmiş olabilir");
                }else{
                    System.out.println("Şifreniz başarılı bir şekilde değiştirilmiştir.");
                }


            }else{
                System.out.println("Şifreyi sıfırlamaya hayır.Tekrardan şifreyi giriniz.");
            }

        }



    }
}

import java.util.Scanner;

public class sifre {

    public static void main(String[] args) {
        String UserName, Password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Username :") ;
        UserName = inp.nextLine();
        System.out.print("Password :") ;
        Password = inp.nextLine();



        if(UserName.equals("zaferna")&&Password.equals("1234kk")) {
            System.out.print("Giris Yaptiniz...");
        }
            else {

                System.out.println("Hatali Giris Yaptiniz ...");
            System.out.println("Sifrenizi Degistirmek Istermisiniz?\n 1-)Evet\n 2-)Hayir");
            int cevap= inp.nextInt();
            if(cevap==1) {
                Scanner cc = new Scanner(System.in);

                System.out.println("Yeni Sifre Belirle :");

                String YeniSifre = cc.nextLine();
                if (YeniSifre.equals("1234kk")) {
                    System.out.print("Islem Basarisiz Eski Sifrenin Tekrari");
                } else {
                    System.out.print("Islem Basarili Yeni Sifre Atandi");
                }
            }
            else {
                System.out.print("Tekrar Deneyiniz");




            }








    }

    }
}


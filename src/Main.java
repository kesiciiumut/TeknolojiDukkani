import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
Brands marka1 = new Brands(1,"Samsung");
Brands marka2 = new Brands(2,"Lenovo");
Brands marka3 = new Brands(3,"Apple");
Brands marka4 = new Brands(4,"Huawei");
Brands marka5 = new Brands(5,"Casper");
Brands marka6 = new Brands(6,"Asus");
Brands marka7 = new Brands(7,"HP");
Brands marka8 = new Brands(8,"Xiaomi");
Brands marka9 = new Brands(9,"Monster");


List<Brands> markalar = new ArrayList<Brands>();
markalar.add(marka1);
markalar.add(marka2);
markalar.add(marka3);
markalar.add(marka4);
markalar.add(marka5);
markalar.add(marka6);
markalar.add(marka7);
markalar.add(marka8);
markalar.add(marka9);



mobilePhone telefon1 = new mobilePhone(1,"Samsung Galaxy A51",3200,marka1.getName(),0,6,128,6.5,100,4000,"Siyah");
mobilePhone telefon2 = new mobilePhone(2,"İphone 11 64 GB",7379, marka3.getName(),0,6,64,6.1,100,3046,"Mavi");
mobilePhone telefon3 = new mobilePhone(3,"Redmi Note 10 Pro 8 GB",4012,marka8.getName(),0,12,128,6.5,100,4000,"Beyaz");

List<mobilePhone> telefonlar = new ArrayList<>();
telefonlar.add(telefon1);
telefonlar.add(telefon2);
telefonlar.add(telefon3);



notebook pc1 = new notebook(1,"HUAWEİ Matebook 14",7000,marka4.getName(),0,100,16,512,14.0);
notebook pc2 = new notebook(2,"LENOVO V14 IGL",3699, marka2.getName(), 0,100,8,1024,14.0);
notebook pc3 = new notebook(3,"ASUS TUF Gaming",8199,marka6.getName(),0,100,32,2048,15.6);

List<notebook> bilgisayarlar = new ArrayList<>();
bilgisayarlar.add(pc1);
bilgisayarlar.add(pc2);
bilgisayarlar.add(pc3);

Scanner input = new Scanner(System.in);





        boolean devamEdilsinMi= true;

        while (devamEdilsinMi){
            System.out.println("PATİKA STORE");
            System.out.println("1 - NOTEBOOK İŞLEMLERİ");
            System.out.println("2 - CEP TELEFONU İŞLEMLERİ");
            System.out.println("3 - MARKA LİSTELE");
            System.out.println("0 - ÇIKIŞ YAP");
            System.out.print("TERCİHİNİZ : ") ;
            int secim=input.nextInt();

            switch (secim){
                case 1 :
                    System.out.println("NOTEBOOK İŞLEMLERİNE HOŞGELDİNİZ ");
                    System.out.println("1 - VERİ SİLMEK");
                    System.out.println("2 - NOTEBOOKLARI LİSTELEMEK");
                    System.out.println("3 - ANA MENÜ");
                    System.out.println("4 - SİSTEMDEN ÇIKIŞ");
                    int notebookislemsecim =input.nextInt();
                    if (notebookislemsecim>4||notebookislemsecim<1){
                        System.out.println("GEÇERSİZ BİR DEĞER GİRDİNİNİZ");
                    }
                    switch (notebookislemsecim){
                        case 1 :
                            System.out.println("| " + " ID | " + " ÜRÜN ADI          |"+ " FİYAT      |" + " MARKA  | "+ " EKRAN  |"+ " RAM  ");
                            for (notebook pc : bilgisayarlar){
                                System.out.println("|  "+pc.getId()+"  |  " + pc.getName()+"   |   "+pc.getPrice()+"  |  " + pc.getBrand() +"  |  " + pc.getScreenDimension()+"   |   " + pc.getRam()+"   |   ");

                            }
                            System.out.print("LÜTFEN SİLMEK İSTEDİĞİNİZ NOTEBOOK ID TUŞLAYIN :");
                            int idsecim=input.nextInt();
                            for (int i =0; i<idsecim;i++){
                                bilgisayarlar.remove(idsecim-1);



                            }

                        case 2 :
                            System.out.println("| " + " ID | " + " ÜRÜN ADI          |"+ " FİYAT      |" + " MARKA  | "+ " EKRAN  |"+ " RAM  ");
                            for (notebook pc : bilgisayarlar){
                                System.out.println("|  "+pc.getId()+"  |  " + pc.getName()+"   |   "+pc.getPrice()+"  |  " + pc.getBrand() +"  |  " + pc.getScreenDimension()+"   |   " + pc.getRam()+"   |   ");

                            }


                        case 4 :
                            devamEdilsinMi = false;



                    }
                case 2 :
                    System.out.println("CEPTELEFONU İŞLEMLERİNE HOŞGELDİNİZ ");
                    System.out.println("1 - VERİ SİLMEK");
                    System.out.println("2 - TELEFONLARI LİSTELEMEK");
                    System.out.println("3 - ANA MENÜ");
                    System.out.println("4 - SİSTEMDEN ÇIKIŞ");
                    int telefonislemsecim =input.nextInt();
                    if (telefonislemsecim>4||telefonislemsecim<1){
                        System.out.println("GEÇERSİZ BİR DEĞER GİRDİNİNİZ");
                    }
                    switch (telefonislemsecim){
                        case 1 :
                            System.out.println("| " + " ID | " + " ÜRÜN ADI          |"+ " FİYAT      |" + " MARKA  | "+ " EKRAN  |"+ " RAM  ");
                            for (mobilePhone telefon : telefonlar){
                                System.out.println("|  "+telefon.getId()+"  |  " + telefon.getName()+"   |   "+telefon.getPrice()+"  |  " + telefon.getBrand() +"  |  " + telefon.getScreenDimension()+"   |   " + telefon.getRam()+"   |   ");

                            }
                            System.out.print("LÜTFEN SİLMEK İSTEDİĞİNİZ CEPTELEFONU ID TUŞLAYIN :");
                            int idsecim=input.nextInt();
                            for (int i =0; i<idsecim;i++){
                                telefonlar.remove(idsecim-1);



                            }

                        case 2:
                            System.out.println("| " + " ID | " + " ÜRÜN ADI          |"+ " FİYAT      |" + " MARKA  | "+ " EKRAN  |"+ " RAM  ");
                            for (mobilePhone telefon : telefonlar){
                                System.out.println("|  "+telefon.getId()+"  |  " + telefon.getName()+"   |   "+telefon.getPrice()+"  |  " + telefon.getBrand() +"  |  " + telefon.getScreenDimension()+"   |   " + telefon.getRam()+"   |   ");

                            }

                        case 4 :
                            devamEdilsinMi = false ;

                    }


                case 3 :
                    Collections.sort(markalar);
                    for (Brands brands: markalar){
                        System.out.println(brands.getName());

                    }
                case 0 :
                    devamEdilsinMi = false ;


        }







    }
}}
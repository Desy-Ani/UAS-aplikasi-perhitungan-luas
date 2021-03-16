/*
*	Nama	: Desi Nurfitrani
*	NIM		: 202013027
*	Prodi	: TIF 1B
*	Makul	: ALP
*
*/

import java.util.*;
public class AplikasiPerhitunganLuas{
	public static void main (String[]args){

// Tampilan Awal

		System.out.println();
		System.out.println("\t\t\t\t\t\t=======================================");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=        Projek UAS Semester 1        =");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=         Program Perhitungan         =");
		System.out.println("\t\t\t\t\t\t=          Luas Bangun Ruang          =");
		System.out.println("\t\t\t\t\t\t=                                     =");
		System.out.println("\t\t\t\t\t\t=======================================");
		System.out.println();
		login();

	}
// Masukkan Username dan Password

		static void login(){
		String data[]={"Desi","202013027"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nMasukkan Username Anda \t: ");
		username=masuk.nextLine();
		System.out.print("Masukkan Password Anda \t: ");
		password=masuk.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan data 
		 */


		if(username.equals(data[0])&&password.equals(data[1])){

			System.out.println();
			System.out.println("\t\t\t\t\t\t=============================================");
			System.out.println("\t\t\t\t\t\t=                                           =");
			System.out.println("\t\t\t\t\t\t=            Selamat Datang Di              =");
			System.out.println("\t\t\t\t\t\t=         Program Menghitung Luas           =");
			System.out.println("\t\t\t\t\t\t=               Bangun Ruang                =");
			System.out.println("\t\t\t\t\t\t=                                           =");
			System.out.println("\t\t\t\t\t\t=============================================");
			System.out.println();
			menu();
		}else{
			System.out.println();
			System.out.println("Maaf Username atau Password yang Anda Masukkan Salah Silahkan Masukkan Kembali");
			System.out.println();
			login();
		}


	}

// Pemilihan di menu awal

	static void menu(){

		String menu_utama[]={"Menu Program Perhitungan","Biodata Pemrogram","Keluar"};
		System.out.println("\t\t\t\t\t\t1. "+menu_utama[0]);
		System.out.println("\t\t\t\t\t\t2. "+menu_utama[1]);
		System.out.println("\t\t\t\t\t\t3. "+menu_utama[2]);

		Scanner pilih=new Scanner(System.in);
		int menu;

		System.out.println();
		System.out.print("\t\t\t\t\t\tSilahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			mulai();
		}else if(menu==2){
			biodata();
		}else{
			System.out.println();
			System.out.println("Terima Kasih Telah Berhitung");
			System.out.println("Sistem Sekarang Akan keluar");
			System.out.println("Keluar Dari Sistem");
			System.exit(0);
		}
	}

// Pemilihan bangun ruang yang ingin dihitung

	static void mulai(){

		int daftar_bangun;
		String bangun_ruang[]={"Luas Lingkaran","Luas Persegi","Luas Segitiga","Luas Jajar Genjang","Luas Semua Bangun Ruang","Keluar"};

		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t1. "+bangun_ruang[0]);
		System.out.println("\t\t\t\t\t\t2. "+bangun_ruang[1]);
		System.out.println("\t\t\t\t\t\t3. "+bangun_ruang[2]);
		System.out.println("\t\t\t\t\t\t4. "+bangun_ruang[3]);
		System.out.println("\t\t\t\t\t\t5. "+bangun_ruang[4]);
		System.out.println("\t\t\t\t\t\t6. "+bangun_ruang[5]);


		Scanner pilih2=new Scanner(System.in);
		int menu2;

		System.out.println();
		System.out.print("Silahkan Pilih Bangun Yang Akan Dilakukan Perhitungan : ");
		menu2=pilih2.nextInt();

		switch(menu2){

			case 1 :

					System.out.println();
					System.out.println("\t\t\t\t\t\t=======================================");
					System.out.println("\t\t\t\t\t\t=                                     =");
					System.out.println("\t\t\t\t\t\t=       Menghitung Luas Lingkaran     =");
					System.out.println("\t\t\t\t\t\t=                                     =");
					System.out.println("\t\t\t\t\t\t=======================================");
					System.out.println();
					

          Scanner input=new Scanner(System.in);

          double luas, phi=3.14;
          int r;

          System.out.print("\t\t\t\t\t\tMasukan Jari-jari : ");
          r=input.nextInt();

          luas = phi*r*r;
          System.out.println("\t\t\t\t\t\tLuas Lingkaran = "+luas);
					next();
					break;

			case 2:

					System.out.println();
					System.out.println("\t\t\t\t\t\t===================================-===");
					System.out.println("\t\t\t\t\t\t=                                     =");
					System.out.println("\t\t\t\t\t\t=       Menghitung Luas Persegi       =");
					System.out.println("\t\t\t\t\t\t=                                     =");
					System.out.println("\t\t\t\t\t\t=======================================");
					System.out.println();

              double sisipersegi, luaspersegi;
              Scanner scanpersegi = new Scanner(System.in);
              System.out.print("\t\t\t\t\t\tMasukkan panjang sisi persegi: ");
              sisipersegi = scanpersegi.nextInt();
              luaspersegi = sisipersegi * sisipersegi;
              System.out.println("\t\t\t\t\t\tLuas Persegi adalah " + luaspersegi);
					next();
					break;

			case 3 :

					System.out.println();
					System.out.println("\t\t\t\t\t\t=======================================");
					System.out.println("\t\t\t\t\t\t=                                     =");
					System.out.println("\t\t\t\t\t\t=       Menghitung Luas Segitiga      =");
					System.out.println("\t\t\t\t\t\t=                                     =");
					System.out.println("\t\t\t\t\t\t=======================================");
					System.out.println();

         	  double a, t;
              Scanner terimaluassegitiga = new Scanner(System.in);
              System.out.print("\t\t\t\t\t\tMasukkan panjang alas: ");
              a = terimaluassegitiga.nextDouble();
              System.out.print("\t\t\t\t\t\tMasukkan tinggi segitiga: ");
              t = terimaluassegitiga.nextDouble();
              luas = 0.5 * a * t;
              System.out.println("\t\t\t\t\t\tLuas segitiga adalah "+luas);
			  next();
			  break;

			case 4 :

					System.out.println();
					System.out.println("\t\t\t\t\t\t===========================================");
					System.out.println("\t\t\t\t\t\t=                                         =");
					System.out.println("\t\t\t\t\t\t=      Menghitung Luas Jajar Genjang      =");
					System.out.println("\t\t\t\t\t\t=                                         =");
					System.out.println("\t\t\t\t\t\t===========================================");
					System.out.println();

          double alasjjg, tinggijjg;
              Scanner terimaluasjjg = new Scanner(System.in);
              System.out.print("\t\t\t\t\t\tMasukkan Alas Jajar Genjang: ");
              alasjjg = terimaluasjjg.nextDouble();
              System.out.print("\t\t\t\t\t\tMasukkan tinggi Jajar Genjang: ");
              tinggijjg = terimaluasjjg.nextDouble();
              luas = alasjjg * tinggijjg;

              System.out.println("\t\t\t\t\t\tLuas Jajar Genjang adalah "+luas);

					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 5 :
  //Lingkaran
      System.out.println();
      System.out.println("\t\t\t\t\t\t=======================================");
      System.out.println("\t\t\t\t\t\t=                                     =");
      System.out.println("\t\t\t\t\t\t=       Menghitung Luas Lingkaran     =");
      System.out.println("\t\t\t\t\t\t=                                     =");
      System.out.println("\t\t\t\t\t\t=======================================");
      System.out.println();

      Scanner input1=new Scanner(System.in);

      double luasling1, phi1=3.14;
      int r1;

      System.out.print("\t\t\t\t\t\tMasukan Jari-jari : ");
      r1=input1.nextInt();

      luasling1 = phi1*r1*r1;
      System.out.println("\t\t\t\t\t\tLuas Lingkaran = "+luasling1);

//Persegi
      System.out.println();
      System.out.println("\t\t\t\t\t\t=======================================");
      System.out.println("\t\t\t\t\t\t=                                     =");
      System.out.println("\t\t\t\t\t\t=       Menghitung Luas Persegi       =");
      System.out.println("\t\t\t\t\t\t=                                     =");
      System.out.println("\t\t\t\t\t\t=======================================");
      System.out.println();

          double sisipersegi1, luaspersegi1;
          Scanner scanpersegi1 = new Scanner(System.in);
          System.out.print("\t\t\t\t\t\tMasukkan panjang sisi persegi: ");
          sisipersegi1 = scanpersegi1.nextInt();
          luaspersegi1 = sisipersegi1 * sisipersegi1;
          System.out.println("\t\t\t\t\t\tLuas Persegi adalah " + luaspersegi1);

//Segitiga
      System.out.println();
      System.out.println("\t\t\t\t\t\t=======================================");
      System.out.println("\t\t\t\t\t\t=                                     =");
      System.out.println("\t\t\t\t\t\t=       Menghitung Luas Segitiga      =");
      System.out.println("\t\t\t\t\t\t=                                     =");
      System.out.println("\t\t\t\t\t\t=======================================");
      System.out.println();

      double a1, t1, luassegitiga1;
          Scanner luas_segitiga1 = new Scanner(System.in);
          System.out.print("\t\t\t\t\t\tMasukkan panjang alas: ");
          a1 = luas_segitiga1.nextDouble();
          System.out.print("\t\t\t\t\t\tMasukkan tinggi segitiga: ");
          t1 = luas_segitiga1.nextDouble();
          luassegitiga1 = 0.5 * a1 * t1;

          System.out.println("\t\t\t\t\t\tLuas segitiga adalah "+luassegitiga1);

//Jajar genjang
      System.out.println();
      System.out.println("\t\t\t\t\t\t===========================================");
      System.out.println("\t\t\t\t\t\t=                                         =");
      System.out.println("\t\t\t\t\t\t=      Menghitung Luas Jajar Genjang      =");
      System.out.println("\t\t\t\t\t\t=                                         =");
      System.out.println("\t\t\t\t\t\t===========================================");
      System.out.println();

      double alasjjg1, tinggijjg1, luasj1;
          Scanner terimaluasjjg1 = new Scanner(System.in);
          System.out.print("\t\t\t\t\t\tMasukkan Alas Jajar Genjang: ");
          alasjjg1 = terimaluasjjg1.nextDouble();
          System.out.print("\t\t\t\t\t\tMasukkan tinggi Jajar Genjang: ");
          tinggijjg1 = terimaluasjjg1.nextDouble();
          luasj1 = alasjjg1 * tinggijjg1;

          System.out.println("\t\t\t\t\t\tLuas Jajar Genjang adalah "+luasj1);

          double luastotal[]={luasling1,luaspersegi1,luassegitiga1,luasj1};//array
          double penampung=0;


          for(int h=0; h<(luastotal.length); h++){
            for(int i=0; i<(luastotal.length-1); i++){
            if(luastotal[i]>luastotal[i+1]){
            penampung=luastotal[i];
            luastotal[i]=luastotal[i+1];
            luastotal[i+1]=penampung;
          }
         }
            System.out.print(h+1+" = ");
            for(int d=0; d<luastotal.length; d++){
            System.out.print(luastotal[d]+"  ");
          }
            System.out.println();
        }

          System.out.println();
          System.out.print("Data pada array hasil[] setelah di urutkan = {");
          for(int i=0; i<luastotal.length; i++){
          System.out.print(luastotal[i]+" , ");
          }
          System.out.print("}");
          System.out.println();
          next();

          break;

			case 6 :

					System.out.println();
					System.out.println("\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("\t\t\t\t\t\t=                                                     ~");
					System.out.println("\t\t\t\t\t\t=       Terima Kasih Telah Melakukan Perhitungzn      ~");
					System.out.println("\t\t\t\t\t\t=       Sistem Sekarang Akan Diarahkan Keluar         ~");
					System.out.println("\t\t\t\t\t\t=             Keluar Dari Sistem                      ~");
					System.out.println("\t\t\t\t\t\t=                                                     ~");
					System.out.println("\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.exit(0);

			default :

					System.out.println();
					System.out.print("\t\t\t\t\t\tMaaf Pilihan No."+menu2+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("\t\t\t\t\t\tSistem Sekarang Akan Keluar");
					System.exit(0);


		}

		


	}

// Biodata Pemrogram

	static void biodata(){

		System.out.println("\t\t\t\t\t\tBiodata Saya");
		System.out.println();
		System.out.println("\t\t\t\t\t\tNama Saya : Desi Nurfitrani");
		System.out.println("\t\t\t\t\t\tTTL       : Karanganyar, 25 Desember 2001");
		System.out.println("\t\t\t\t\t\tUmur      : 19 Tahun");
		System.out.println("\t\t\t\t\t\tFakultas  : TIF 1B Politeknik Kampar");
		System.out.println("\t\t\t\t\t\tStatus    : Mahasiswi (Aktif)");
		System.out.println();
		System.out.println("\t\t\t\t\t\t Terima Kasih");
	}

	static void next(){

		Scanner lagi=new Scanner(System.in);
		int ulang;
		System.out.println();
		System.out.print("\t\t\t\t\t\tApakah Anda Akan Melakukan Perhitungan Lagi ? ( 1/0 ) = ");
		ulang=lagi.nextInt();
		if(ulang==1){
			mulai();
		}else{
			penutup();
		}

	}
	static void penutup(){

		System.out.println();
		System.out.println("\t\t\t\t\t\tProses Telah Selesai Terimakasih");
		System.out.println("\t\t\t\t\t\tKeluar Dari Sistem");
	}
}

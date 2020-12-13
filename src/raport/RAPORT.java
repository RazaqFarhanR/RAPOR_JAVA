package raport;

import java.util.Scanner;

public class RAPORT {
    
    public String nama;
    public double nilaiTugas = 0;
    public double nilaiUTS = 0;
    public double nilaiUAS = 0;
    public double nilaiSikap = 0;
    public double nilaiRataRata = 0;
    public boolean status = false;
    
    public void input()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama Siswa: ");
        nama = input.next();
        
        System.out.print("Masukan Nilai Tugas: ");
        nilaiTugas = input.nextInt();
        
        System.out.print("Masukan Nilai UTS: ");
        nilaiUTS = input.nextInt();
        
        System.out.print("Masukan Nilai UAS: ");
        nilaiUAS = input.nextInt();
        
        System.out.print("Masukan Nilai Sikap: ");
        nilaiSikap = input.nextInt();
        
    }
    
    public double nilaiRaport(double nT, double UTS, double UAS, double Sikap)
    {
        nilaiTugas = nT*20/100;
        
        nilaiUTS = UTS*30/100;
        
        nilaiUAS = UAS*40/100;
        
        nilaiSikap = Sikap*10/100;
        
        nilaiRataRata = nilaiTugas + nilaiUTS + nilaiUAS + nilaiSikap;
        
        return nilaiRataRata;
        
    }
    
    public boolean stat()
    {
        if(nilaiRataRata >75){
            status = true;
            
        }else if(nilaiRataRata <75){
            status = false;
        }
        
        return status;
        
    }
    
    public void hasilRaport()
    {
        if(status == true){
            
                System.out.println("------------------------------");
                System.out.println("Nama Siswa: "+nama);
                System.out.println("Nilai Raport: "+nilaiRataRata);
                System.out.println("Satus : NAIK KELAS");
                
        }else{
                System.out.println("------------------------------");
                System.out.println("Nama Siswa: "+nama);
                System.out.println("Nilai Raport: "+nilaiRataRata);
                System.out.println("Satus : TIDAK NAIK KELAS");
        }
                   
    }
    
    public void Tambahan()
    {
        boolean running = false;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("");
            System.out.println("Apakah anda ingin memaasukan Nilai Raport Lainnya?");
            System.out.print("Jawab [iya/tidak]> ");
            
            jawab = scan.nextLine();
            
            if( jawab.equalsIgnoreCase("iya")){
                
                System.out.println("_________________________");
                System.out.println("");
                RAPORT raport = new RAPORT();
        
                raport.input();
                raport.nilaiRaport(raport.nilaiTugas, raport.nilaiUTS, raport.nilaiUAS,raport.nilaiSikap);
                raport.stat();
                raport.hasilRaport();
                raport.Tambahan();
                
            }
        } while( running );
            
            
            counter++;
    }
    
    public static void main(String[] args)
    {
        RAPORT raport = new RAPORT();
        
        raport.input();
        raport.nilaiRaport(raport.nilaiTugas, raport.nilaiUTS, raport.nilaiUAS,raport.nilaiSikap);
        raport.stat();
        raport.hasilRaport();
        raport.Tambahan();
        
    }
    
}

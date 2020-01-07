import java.text.DecimalFormat;

public class App{

    public static void main(String[] args) {
        
        double gaji = 4600897;
        double anak = 2;
        double tunSuamiIstri = gaji * 0.1;
        double tunAnak = gaji * (anak * 0.02);
        double bruto = gaji + tunSuamiIstri + tunAnak;
        double pensiun = gaji * 0.04;
        double netto = bruto - pensiun;

        println("Gaji Pokok Per-Bulan   = Rp " + formate(gaji));
        println("Tunjangan Suami/Istri  = Rp " + formate(tunSuamiIstri));
        println("Tunjangan Anak         = Rp " + formate(tunAnak));
        println("Penghasilan Bruto      = Rp " + formate(bruto));
        println("Iuran Pensiun          = Rp " + formate(pensiun));
        println("Penghasilan Netto      = Rp " + formate(netto));

    }

    private static void println(Object obj){
        System.out.println(obj);
    }

    private static String formate(double d){
        DecimalFormat format = new DecimalFormat("#,###");
        return format.format(d);
    }

}
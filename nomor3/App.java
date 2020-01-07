public class App{

    public static void main(String[] args) {
        
        double gaji = 4600897;
        double anak = 2;
        double tunSuamiIstri = gaji * 0.1;
        double tunAnak = gaji * (anak * 0.02);
        double bruto = gaji + tunSuamiIstri + tunAnak;
        double pensiun = gaji * 0.04;
        double netto = bruto - pensiun;

        println("Gaji Pokok Per-Bulan   = " + gaji);
        println("Tunjangan Suami/Istri  = " + tunSuamiIstri);
        println("Tunjangan Anak         = " + tunAnak);
        println("Penghasilan Bruto      = " + bruto);
        println("Iuran Pensiun          = " + pensiun);
        println("Penghasilan Netto      = " + netto);

    }

    private static void println(Object obj){
        System.out.println(obj);
    }
}
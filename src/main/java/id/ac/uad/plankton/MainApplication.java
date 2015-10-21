package id.ac.uad.plankton;

/**
 * Created by an on 21/10/15.
 */
public class MainApplication {
    public static void main(String[] args) {
        MahasiswaImpl intMhs = new MahasiswaImpl("1300018083","Achmad N","Boyolali");
        System.out.println();
        System.out.println("Data Mahasiswa");
        System.out.println("-------------------");
        System.out.println("NIM    : " +  intMhs.getNim());
        System.out.println("Nama   : " +  intMhs.getNama());
        System.out.println("Alamat : " + intMhs.getAlamat());
        System.out.println();

        MataKuliahImpl inMk = new MataKuliahImpl("001", "APBO",3,"3");
        System.out.println();
        System.out.println("Data Mata Kuliah");
        System.out.println("----------------------------");
        System.out.println("Kode Mata Kuliah    : " +  inMk.getKode());
        System.out.println("Nama Mata Kuliah    : " +  inMk.getNama());
        System.out.println("SKS                 : " + inMk.getSks());
        System.out.println("Semester            : " + inMk.getSemester());
    }
}

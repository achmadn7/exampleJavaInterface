package id.ac.uad.plankton;

/**
 * Created by an on 21/10/15.
 */
public class MataKuliahImpl implements MataKuliah {

    String kode,nama,semester;
    Integer sks;

    MataKuliahImpl(String kodeBaru, String namaBaru, Integer sksBaru, String semesterBaru){
        kode =kodeBaru;
        nama = namaBaru;
        sks = sksBaru;
        semester = semesterBaru;
    }

    @Override
    public void setKode(String kodeBaru) {kode = kodeBaru;}

    @Override
    public void setNama(String namaBaru) {nama = namaBaru;}

    @Override
    public void setSKS(Integer sksBaru) {sks = sksBaru;}

    @Override
    public void setSemester(String semesterBaru) {semester = semesterBaru;}

    public String getKode() {return kode;}

    public String getNama() {return nama;}

    public Integer getSks() {return sks;}

    public String getSemester() {return semester;}
}

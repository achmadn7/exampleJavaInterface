package id.ac.uad.plankton;

/**
 * Created by an on 21/10/15.
 */
public class MahasiswaImpl implements Mahasiswa {

    String nim,nama,alamat;

    MahasiswaImpl(String nimBaru, String namaBaru, String alamatBaru){

        nim = nimBaru;
        nama = namaBaru;
        alamat = alamatBaru;
    }

    @Override
    public void setNIM(String nimBaru) {
        nim = nimBaru;
    }

    @Override
    public void setNama(String namaBaru) {
        nama = namaBaru;
    }

    @Override
    public void setAlamat(String alamatBaru) {
        alamat = alamatBaru;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

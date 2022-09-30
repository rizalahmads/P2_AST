package P2_AST;

public class ListBarang {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;

    public ListBarang(String namaBarang, int hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public void insertionSort(ListBarang[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            ListBarang key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getHargaBarang() < key.getHargaBarang()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

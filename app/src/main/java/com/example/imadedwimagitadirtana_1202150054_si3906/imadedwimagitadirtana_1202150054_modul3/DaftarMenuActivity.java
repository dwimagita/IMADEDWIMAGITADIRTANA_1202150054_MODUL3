package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AirAdapter mAdapter;
    //mendeklarasikan arraylist menjadi DATAS
    public static ArrayList<DataMinuman> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //untuk menampilkan layout daftarmenu
        setContentView(R.layout.row_item_list);
        //mendeklarasi DATAS sebagai method isi()
        DATAS = isi();
        //melakukan pemanggilan layout recyclerview.
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);

        mAdapter = new AirAdapter(DATAS);
        //menset adapter untuk recyclerview
        recyclerView.setAdapter(mAdapter);
        //jumlah coloumn yang akan muncul pada aplikasi saat keadaan default orientation
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        //mengeset recycle view agar sesuai dengan jumlah grid yang di buat.
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }
//array atau kumpulan data dari setiap merk yang akan ditampilkan pada detail menu
    public ArrayList<DataMinuman> isi(){
        ArrayList<DataMinuman> data = new ArrayList<>();
        data.add(new DataMinuman("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new DataMinuman("Amidis","Ini adalah AMDK merk AMIDIS","AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.",R.drawable.amidis));
        data.add(new DataMinuman("Cleo","Ini adalah AMDK merk CLEAO","Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.",R.drawable.cleo));
        data.add(new DataMinuman("Club","Ini adalah AMDK merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new DataMinuman("Equil","Ini adalah AMDK merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. ",R.drawable.equil));
        data.add(new DataMinuman("Evian","Ini adalah AMDK merk EVIAN","Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.",R.drawable.evian));
        data.add(new DataMinuman("Le Minerale","Ini adalah AMDK merk LE MINERALE","Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis. Kesegaran khas ini berasal dari seimbangnya jumlah kandungan mineral alami dalam Le Minerale.\n" + R.drawable.leminerale));
        data.add(new DataMinuman("Nestle","Ini adalah AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. ",R.drawable.nestle));
        data.add(new DataMinuman("Pristine","Ini adalah AMDK merk PRISTINE","Pristine dengan kandungan Alkaline Water yang berisi air basa yang ber Ph 8+, dapat berfungsi untuk mengecilkan pori-pori sehingga kulit wajah akan menjadi lebih kencang. Jika kamu bermasalah dengan flek hitam, tidak perlu khawatir. Air Alkali juga bisa membantu untuk menghilangkannya. Sehingga wajah terlihat segar, tidak kusam, serta dapat juga digunakan untuk menghilangkan jerawat-jerawat dan bekas luka.",R.drawable.pristine));
        data.add(new DataMinuman("Vit","Ini adalah AMDK merk VIT","VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta",R.drawable.vit));
        return data;
    }
}

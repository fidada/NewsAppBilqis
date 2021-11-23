package com.bilqismufida.newsapp.data

import com.bilqismufida.newsapp.R
import com.bilqismufida.newsapp.model.NewsModel
import java.util.ArrayList

object NewsData {

    private val newsImage = intArrayOf(
        R.drawable.img_apple,
        R.drawable.img_basketball,
        R.drawable.img_bus,
        R.drawable.img_gojek,
        R.drawable.img_google,
        R.drawable.img_mulung,
        R.drawable.img_obat,
        R.drawable.img_tokped,
        R.drawable.img_ular,
        R.drawable.img_writing
    )

    private val newsTitle = arrayOf(
        "Bangunan Tua Terbengkalai Jadi Keren dengan Sentuhan 3D",
        "Tingkatkan Pendapatan Mitra, Gojek Lakukan Penyesuaian Ongkir Jarak Dekat",
        "UMKM Rasakan Manfaat dari Progam Tokopedia Bersama",
        "Studi Ungkap Risiko Obat Pereda Nyeri Terkenal, Apa Dampaknya?",
        "Hujan Duit di Jalan Tol Bikin Macet Total, Ratusan Juta Berserakan",
        "Peringkat Tiga Asia Cup, Timnas Basket Putri Jaga Asa Juara buat SEA Games",
        "Beredar Rumor Mobil Listrik Besutan Apple Akan Dirilis 2025",
        "Tips Search Google Biar Kayak Expert",
        "12 Cara Menulis Daftar Pustaka yang Benar Menurut Sumbernya, Catat Ya!",
        "Jelang Nataru Diterapkan PPKM Level 3, Masyarakat Diimbau Tidak Mudik"
    )

    private val newsDescription = arrayOf(
        "Jakarta - Bangunan tua yang terbengkalai identik dengan tembok kusam dan menyeramkan. Namun seniman ini sukses menyulapnya dengan sentuhan seni lukis grafiti dan 3D.Seniman ini dikenal dengan julukan scat atau scaf oner asal Prancis.",
        "Jakarta - Gojek Indonesia menyatakan akan selalu terbuka terhadap setiap aspirasi dari mitranya melalui wadah seperti kopdar dan berbagai platform komunikasi lain untuk para mitra dan komunitas driver. Untuk itu, Gojek bakal melakukan penyesuaian ongkos kirim (ongkir) jarak dekat hingga 2 Km saja.",
        "Jakarta - Tokopedia baru-baru ini meluncurukan program Beraksi untuk Sesama atau Tokopedia Bersama. Lewat inisiatif ini Tokopedia mengajak masyarakat lebih peduli isu sosial serta membantu meningkatkan kesejahteraan masyarakat yang membutuhkan guna mendorong pemulihan ekonomi.",
        "Jakarta - Studi mengungkap efek dari pereda nyeri yang terkenal di dunia. Apa dampaknya dan obat mana yang dimaksud? Studi yang diterbitkan di Social Cognitive and Affective Neuroscience menjabarkannya.",
        "Jakarta - Seperti kejadian di film-film atau cerita khayalan, hujan duit terjadi di ruas jalan tol di Amerika Serikat ini. Orang-orang langsung menghentikan kendaraan dan memungut ribuan dollar yang berserakan dan berterbangan di udara.",
        "Jakarta - Timnas basket putri memetik banyak pelajaran di FIBA Womens Asia Cup 2021 Yordania. Bekal itu diharapkan berguna untuk SEA Games Mei 2022. Timnas basket putri meraih peringkat ketiga di FIBA Women's Asia Cup 2021 Divisi B di Amman, Yordania, yang berakhir 13 Februari lalu.",
        "Amerika - Apple terus mengembangkan mobil listriknya. Dikutip dari Reuters, kemungkinan misi besar tersebut akan dirilis tahun 2025. Konon katanya mobil listrik milik Apple tanpa setir dan pedal.",
        "Jakarta - Tips pencarian di Google ini akan memudahkan pengguna. Coba saja sendiri dan mungkin kamu bakal merasa seperti expert saat menggunakannya. Melansir Life Hack, coba beberapa trik ini yuk. Atau ada yang sudah terbiasa menggunakannya dan punya trik lain?",
        "Jakarta - Daftar pustaka adalah kumpulan sumber yang digunakan dalam menyusun sebuah karya seperti buku ataupun tulisan ilmiah. Teknik penulisannya sangat penting diketahui agar penulis terhindar dari tuduhan plagiarisme, dapat menghargai penulis sebelumnya, menginformasikan pada pembaca soal sumbernya, dan sebagai bahan pertimbangan bagi pembaca.",
        "Jakarta - Pemberlakuan Pembatasan Kegiatan Masyarakat atau PPKM Level 3 di seluruh Indonesia diterapkan pada 24 Desember 2021 hingga 2 Januari 2022. Masyarakat diimbau tidak mudik."
    )

    val listNewsData : ArrayList<NewsModel>

    get() {
        val list = arrayListOf<NewsModel>()
        for (position in newsTitle.indices){
            val news = NewsModel()
            news.NewsImageModel = newsImage[position]
            news.NewsTitleModel = newsTitle[position]
            news.NewsDescModel = newsDescription[position]
        }
        return list
    }

}
// Membuat class Produk
class Produk(
    val nama: String,
    var harga: Double,
    var stok: Int,
    val kategori: String,
    val berat: Double, // berat dalam kg
    val deskripsi: String
) {
    // Fungsi untuk menampilkan informasi detail produk
    fun tampilkanInfo() {
        println("=== Detail Produk ===")
        println("Nama Produk   : $nama")
        println("Kategori      : $kategori")
        println("Harga         : Rp $harga")
        println("Stok Tersedia : $stok")
        println("Berat         : $berat kg")
        println("Deskripsi     : $deskripsi")
        println("=====================")
    }

    // Fungsi untuk membeli produk dan mengurangi stok
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("Anda membeli $jumlah unit $nama.")
            println("Sisa stok sekarang: $stok unit.")
        } else {
            println("Maaf, stok tidak cukup. Stok yang tersedia: $stok unit.")
        }
    }
}

fun main() {
    // Membuat objek dari class Produk
    val produk1 = Produk(
        nama = "Laptop Gaming",
        harga = 15000000.0,
        stok = 10,
        kategori = "Elektronik",
        berat = 2.5,
        deskripsi = "Laptop dengan spesifikasi tinggi untuk gaming dan multitasking."
    )

    // Menampilkan informasi produk
    produk1.tampilkanInfo()

    // Simulasi pembelian produk
    println("=== Simulasi Pembelian ===")
    produk1.beliProduk(3)  // Membeli 3 unit produk
    produk1.tampilkanInfo() // Menampilkan kembali informasi setelah pembelian

    produk1.beliProduk(8)  // Mencoba membeli 8 unit produk (stok tidak cukup)
}

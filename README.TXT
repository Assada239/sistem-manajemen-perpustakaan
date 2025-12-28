📚 Sistem Informasi Perpustakaan

Aplikasi Desktop berbasis Java Swing dan SQLite

📌 Deskripsi Aplikasi

Sistem Informasi Perpustakaan adalah aplikasi desktop yang dibuat menggunakan Java (Swing GUI) dan database SQLite untuk membantu proses pengelolaan data perpustakaan secara terkomputerisasi.

Aplikasi ini mencakup pengelolaan data buku, anggota, peminjaman, pengembalian, serta laporan, sehingga memudahkan petugas perpustakaan dalam administrasi harian.

🛠️ Teknologi yang Digunakan

* Java SE
* Java Swing (GUI)
* SQLite
* JDBC (SQLite Driver)
* Apache NetBeans IDE

📂 Fitur Aplikasi

🔹 Manajemen Data

✅ CRUD Data Buku
✅ CRUD Data Anggota

🔹 Transaksi

✅ Peminjaman Buku
✅ Pengembalian Buku
✅ Perhitungan Denda Otomatis (jika terlambat)

🔹 Laporan

✅ Laporan Peminjaman
✅ Laporan Pengembalian
✅ Tombol Refresh Data

🔹 Antarmuka

✅ Menu Utama
✅ Multi Form (tidak menutup menu utama)
✅ Icon pada Button & Frame

🗂️ Struktur Folder Project

SistemPerpustakaan/
├── src/                 # Source code Java
├── nbproject/           # Konfigurasi NetBeans
├── database/            # File database SQLite (.db)
├── dist/                # File .jar hasil build
├── README.md            # Dokumentasi project

⚙️ Cara Menjalankan Aplikasi

🔸 Melalui NetBeans

1. Clone / download repository ini
2. Buka NetBeans
3. Pilih Open Project
4. Arahkan ke folder project
5. Pastikan file database berada di folder `database`
6. Jalankan project (`Run`)

🔸 Melalui File `.jar`

1. Masuk ke folder `dist/`
2. Pastikan folder `database` ada di lokasi yang benar
3. Jalankan: java -jar SistemPerpustakaan.jar

🗄️ Database

Database menggunakan SQLite
File database: database/perpustakaan.db
Database otomatis dibuat jika belum ada

👤 Pengembang

* Nama : Khalik Alpian
* NIM : 221011450539
* Program Studi : Teknik Informatika
* Institusi : Universitas Pamulang

📄 Lisensi

Project ini dibuat untuk keperluan pembelajaran dan tugas akademik.

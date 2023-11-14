-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 14 Nov 2023 pada 03.28
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uts_22090119_B`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_22090119_B`
--

CREATE TABLE `tabel_22090119_B` (
  `no` int(11) NOT NULL,
  `nama_umkm` varchar(50) NOT NULL,
  `bidang` enum('Kuliner','Fashion','Agrobisnis','Otomotif') NOT NULL,
  `tahun_pendirian` int(11) NOT NULL,
  `kategori` enum('Usaha Mikro','Usaha Kecil','Usaha Menengah') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tabel_22090119_B`
--

INSERT INTO `tabel_22090119_B` (`no`, `nama_umkm`, `bidang`, `tahun_pendirian`, `kategori`) VALUES
(1, 'Lamongan', 'Kuliner', 2019, 'Usaha Kecil'),
(2, 'dodi sport', 'Fashion', 2016, 'Usaha Menengah');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tabel_22090119_B`
--
ALTER TABLE `tabel_22090119_B`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tabel_22090119_B`
--
ALTER TABLE `tabel_22090119_B`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

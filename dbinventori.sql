-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 06, 2021 at 04:51 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbinventori`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_barang`
--

CREATE TABLE `data_barang` (
  `kode_barang` varchar(15) NOT NULL,
  `nama_barang` varchar(25) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `jumlah` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `data_lokasi`
--

CREATE TABLE `data_lokasi` (
  `kode_lokasi` varchar(10) NOT NULL,
  `lokasi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `data_pegawai`
--

CREATE TABLE `data_pegawai` (
  `nip` varchar(10) NOT NULL,
  `nama_pegawai` varchar(25) NOT NULL,
  `alamat` varchar(40) NOT NULL,
  `telpon` varchar(12) NOT NULL,
  `Bagian` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inventaris_keluar`
--

CREATE TABLE `inventaris_keluar` (
  `id_user` varchar(10) NOT NULL,
  `id_inventaris_keluar` text NOT NULL,
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `jenis` varchar(30) NOT NULL,
  `kode_lokasi` varchar(10) NOT NULL,
  `jumlah` varchar(10) NOT NULL,
  `keterangan` varchar(30) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `tanggal_keluar` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `invetaris_masuk`
--

CREATE TABLE `invetaris_masuk` (
  `id_user` varchar(10) NOT NULL,
  `id_inventaris_masuk` varchar(12) NOT NULL,
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `kode_lokasi` varchar(10) NOT NULL,
  `jumlah` varchar(10) NOT NULL,
  `nilai` varchar(12) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `tanggal_masuk` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_barang`
--
ALTER TABLE `data_barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `data_lokasi`
--
ALTER TABLE `data_lokasi`
  ADD PRIMARY KEY (`kode_lokasi`);

--
-- Indexes for table `data_pegawai`
--
ALTER TABLE `data_pegawai`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `invetaris_masuk`
--
ALTER TABLE `invetaris_masuk`
  ADD PRIMARY KEY (`id_inventaris_masuk`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

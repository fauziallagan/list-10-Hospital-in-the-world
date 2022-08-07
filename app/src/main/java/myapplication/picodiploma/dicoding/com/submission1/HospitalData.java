package myapplication.picodiploma.dicoding.com.submission1;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class HospitalData {
    private static String[][] data = new String[][]{
            {"Mayo Clinic",
                    "Mayo Clinic yang berpusat di Rochester, Minnesota, layak meraih status terbaik lantaran mampu memberikan perawatan medis yang komprehensif selama lebih dari 150 tahun. Kini Mayo Clinic memiliki sejumlah cabang di pusat Arizona, Florida, dan Minnesota. Serta lebih dari 19 rumah sakit di lima negara bagian Amerika Serikat Sistem kesehatannya melayani lebih dari 1,3 juta orang setiap tahun. Inovasi penting yang berguna bagi seluruh komunitas medis, adalah berhasil membuat lebih dari 7.200 publikasi jurnal peer-review sampai saat ini, dilansir laman Newsweek pada Kamis, 21 Maret 2019.Tak heran jika Mayo Clinic menduduki posisi teratas sebagai rumah sakit terbaik.",
                    "https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/04/23/16/35/minnesota2x.jpg",
                    "https://cdn.prod-carehubs.net/n1/802899ec472ea3d8/uploads/2019/02/Biobank-REVISED-1.jpg",
                    "http://newcomb.newcombboyd.netdna-cdn.com/wp-content/uploads/2016/08/Mayo-Patient-Room-1024x576.jpg?x30697",
                    "https://mayoclinichealthsystem.org/-/media/local-files/eau-claire/images/buildings/ed_entrance_web.JPG?la=en&hash=DDF4D138B61BAEE90C0C9F1E5504BAF8"},

            {"Cleveland Clinic",
                    "Cleveland Clinic merupakan rumah sakit yang melakukan transplantasi wajah total pertama di dunia.Tercatat, lebih dari 7,6 kunjungan pada 2017 di rumah sakit yang tersebar di AS, Kanada, dan Uni Emirat Arab. Rencananya, akan ada lokasi baru di London, Inggris, pada 2021.Penilaian lain yang membuat rumah sakit ini menduduki peringkat nomor dua, tak lain karena program bedah jantung dan penyakit jantung di Miller Family Heart & Vascular Institute milik Cleveland Clinic yang selalu mendapat peringkat terbaik di Amerika setiap tahunnya, sejak 1995.Institut itu adalah pusat medis utama pertama yang berorganisasi dengan lembaga pusat pasien untuk menggabungkan layanan klinis penyakit jantung.",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1a/Cleveland_Clinic_Miller_Family_Pavilion.jpg",
                    "http://www.eseoulpost.com/news/photo/201701/8295_9224_4129.jpg",
                    "https://www.chd-inc.com/wp-content/uploads/2016/12/9_E6E939_BariatricPatientRm.jpg",
                    "https://my.clevelandclinic.org/-/scassets/images/org/locations/wayfinding/akron-general-health-and-wellness-center-green?mw=430&hash=16D19CEA335203EDFA67E83BEA51272BD372738B"},

            {"Singapore General Hospital",
                    "Rumah sakit tertua di Singapura ini didirikan pada tahun 1821, yang bermula dari kantonisasi pasukan kerajaan Inggris di dekat tepi Singapura River kemudian bertransfomasi menjadi sistem kesehatan terbesar di negara tersebut.Singapore General Hospital melayani lebih dari 1 juta pasien setiap tahun. Sebagai rumah sakit rujukan tersier dengan pusat spesialis tambahan di kampus, SGH menyediakan perawatan yang terjangkau bagi pasien.Berbagai penelitian klinis yang digerakkan oleh pasien dan menyediakan pelatihan pendidikan sarjana hingga pascasarjana untuk mahasiswa dan profesional medis.Ini adalah rumah sakit pertama di Asia yang dijuli \"Magnet destination\", destinasi tujuan utama pasien pada 2010.Julukan itu dilihat dari keunggulan keperawatan yang didapuk oleh American Nurses Credentialing Center.",
                    "https://upload.wikimedia.org/wikipedia/commons/0/00/Singapore_General_Hospital%2C_Nov_05.JPG",
                    "http://m.sgh.com.sg/subsites/research/about-us/Department-of-Clinical-Research/PublishingImages/collage-2015-01-16.jpg",
                    "http://indizium.com/wp-content/uploads/2015/02/DSC_0005-1024x576.jpg",
                    "https://scontent.fcgk18-2.fna.fbcdn.net/v/t1.0-9/26220228_145810766137992_3128915561646157787_n.jpg?_nc_cat=106&_nc_oc=AQlKZCvolKnZbGnWY7zT_nSGvXRRSA6fYlGNLazO8KuXInJKzbCaJZTKwp_7khkXxY0&_nc_ht=scontent.fcgk18-2.fna&oh=8533d41126be5d379a383b466ac1a474&oe=5DF2509F"},

            {"Johns Hopkins Hospital",
                    "John Hopkins Hospital yang berpusat di Baltimore ini didirikan pada akhir 1800-an oleh bankir, filantropis, dan abolisionis.Rumah sakit ini bagian dari Fakultas Kedokteran Universitas Johns Hopkins, sekolah kedokteran dengan peringkat tertinggi kedua di Amerika (setelah Harvard Medical School), yang menawarkan penelitian klinis paling maju di dunia.Sistem kesehatan rumah sakit, termasuk enam rumah sakit akademik dan komersial, empat pusat perawatan dan bedah kesehatan serta lebih dari 40 lokasi perawatan pasien yang menerima hingga 3 juta pasien setiap tahun.Pusat bedah saraf dan psikiatri anak, Hopkins Gender Identity Clinic juga merupakan yang pertama di Amerika Serikat yang melakukan operasi penggantian jenis kelamin dari laki-laki jadi perempuan.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/97/Johnshopkins.jpg",
                    "http://www.ballinger.com/wp-content/uploads/2015/11/09024_00_N48_web.jpg",
                    "https://www.hopkinsmedicine.org/sebin/p/s/nelson_harvey_room.jpg",
                    "https://api.hub.jhu.edu/factory/sites/default/files/styles/hub_thumbnail/public/emergency.jpg?itok=-M6LTikW"},

            {"   Charite",
                    "Rumah Sakit Universitas berbasis penelitian di Berlin ini terkait dengan Humboldt University dan Freie Universität Berlin yang memiliki 13.700 staf.Lebih dari separuh staf merupakan penerima Hadiah Nobel Jerman dalam bidang fisiologi atau kedokteran.Mereka bekerja pada lebih dari 1.000 proyek yang ditujukan untuk penelitian berorientasi pasien melalui kolaborasi lintas disiplin ilmu.Sebagai rumah sakit, Charite, yang merayakan ulang tahunnya yang ke-100 pada 2010 berada di ujung tombak inovasi biomedis.Laboratorium startup biotek, konsultan, dan inisiatif bisnis yang difokuskan pada konvergensi teknologi dan obat-obatan menjadi keunggulan Charite.",
                    "https://www.exberliner.com/downloads/17773/download/2016_Charite_Hospital.jpg?cb=9a4f148da78a438da3234ea7caccbfe8",
                    "https://expneuro.charite.de/fileadmin/user_upload/microsites/ohne_AZ/m_cc15/expneuro/Bilder/B%C3%BChne_460x337/Research_Service_labdivisions_Biochemistry_buehne_460x337.jpg",
                    "https://bookinghealth.info/uploads/clinics/gallery/m/4564-Patientenzimmer.JPG","https://notfallmedizin-nord.charite.de/fileadmin/user_upload/microsites/m_cc13/notfallmedizin/Bilder_allgemein/ZNA_Nord/CCM/Eingang.jpg"},

            {"Massachusetts General Hospital",
                    "Selain menjadi rumah sakit tertua ketiga di Amerika Serikat, MGH yang terletak di Boston juga merupakan rumah sakit pendidikan di Harvard Medical School (HMS).HMS adalah sekolah kedokteran terkemuka di AS dengan hampir semua lulusan dokternya berkiprah di fakultas Harvard Med.Rumah sakit ini juga memiliki anggaran penelitian tahunan yang mencapai lebih dari $912 juta, serta program penelitian berbasis rumah sakit terbesar.Lebih dari 1.200 uji klinis dilakukan di Mass General pada waktu tertentu. Pada 2016 sampai 2017, MGH menduduki puncak daftar Nature Index yang menerbitkan lebih banyak artikel di jurnal daripada rumah sakit lain di Amerika.Proyek saat ini yang tengah dikerjakan, termasuk memerangi epidemi opioid dan mempelajari dampak status sosial dan ekonomi pada kesehatan.",
                    "https://media.glassdoor.com/l/8b/ea/d1/6e/main-entrance.jpg",
                    "http://nfcr.org/wp-content/uploads/2016/10/CTC.Lab_.researcher-300x200.jpg",
                    "https://www.modularservices.com/sites/default/files/resize/files/images/Mass%20General%20Stratus-800x544.jpg",
                    "https://www.southcoast.org/wp-content/uploads/2018/04/Southcoast-CMH-ED-5x7-855x570.jpg"},

            {"Toronto General Hospital",
                    "TGH salah satu dari delapan rumah sakit yang tergabung dalam United Health Network Kanada. Sebuah organisasi penelitian terbesar dan paling baik di Kanada dan pusat transplantasi terbesar di Amerika Utara.Sebagai rumah sakit pendidikan Universitas Toronto, TGH unggul dalam penelitian dan inovasi transplantasi. Sebut saja transplantasi organ rangkap (paru-paru, hati, dan pankreas) pada 2015.TGH adalah rumah bagi Peter Munk Cardiac Center, dinamai dari nama pendiri Barrick Gold, yang menyumbangkan $ 100 juta. Rumah sakit ini memimpin dunia dalam bedah jantung terbuka dan kesehatan jantung",
                    "https://shawglobalnews.files.wordpress.com/2014/10/toronto-general-hospital-2.jpg?quality=70&strip=all",
                    "http://www.newgenconstruction.ca/wp-content/uploads/2017/05/TGH-Core-Lab-1.jpg",
                    "https://callidus.ca/wp-content/uploads/2017/02/Callidus-Toronto-General-Hospital%E2%80%93Trigor-A.jpg",
                    "https://ak1.picdn.net/shutterstock/videos/7604821/thumb/1.jpg"},

            {"University of Tokyo Hospital",
                    "Pusat medis vital Jepang ini memajukan penelitian dan praktik medis sambil mendidik para dokter dan peneliti top di negara itu. Fokus pelayanan rumah sakit, baik di Jepang dan d seluruh dunia demi kesejahteraan pasien.Pada 2017, departemen klinis khusus melakukan 35 percobaan, selain merawat lebih dari 1 juta pasien. Pada 2012, rumah sakit ini membuka Department of Disaster Medical Management.",
                    "https://cdn2-img.pressreader.com/pressdisplay/docserver/getimage.aspx?regionKey=J0yfSiFD7Z0FkRQLUdlj0A%3D%3D",
                    "https://cdn.japantimes.2xx.jp/wp-content/uploads/2014/07/b-dna-a-20140710.jpg",
                    "https://www.h.u-tokyo.ac.jp/english/shared/room/room-main-c.jpg",
                    "https://photos.wikimapia.org/p/00/04/17/32/61_big.jpg"},

            {"Lausanne University Hospital",
                    "Terletak di Lausanne, Swiss di bawah puncak berselimut salju yang mengelilingi Danau Jenewa, rumah sakit kelas dunia ini berfungsi sebagai rumah sakit pendidikan untuk warga negara berbahasa Prancis di negara itu.Rumah sakit ini salah satu dari hanya dua rumah sakit di Swiss, yang merupakan rumah bagi hampir 1.000 perusahaan bioteknologi dan teknologi medis) yang dipilih oleh Organisasi Kesehatan Dunia (WHO) untuk melakukan uji coba vaksin Ebola.Uji coba vaksin ebola terjadi pada Oktober 2014. Lausanne University Hospital berkomitmen untuk berbagi informasi praktik medis melalui majalah gratisnya bernama In Vivo, yang diterbitkan dalam bahasa Prancis dan Inggris.",
                    "https://www.rts.ch/2016/06/10/08/38/7788393.image?w=800&h=449",
                    "https://static.mycity.travel/manage/uploads/6/30/33495/346009db29de28efd034d66a584ce337d6265893_2000.JPEG",
                    "https://editorial01.shutterstock.com/wm-preview-1500/10244678br/d442dc08/switzerland-lausanne-university-hospital-shutterstock-editorial-10244678br.jpg",
                    "https://www.rega.ch/img/einsatz/Basen/EBLS_Abs4_zoom.jpg"},

            {"Sheba Medical Center",
                    "Sheba Medical Center di Tel HaShomer, Tel Aviv adalah rumah sakit terbaik dalam ilmu kedokteran dan inovasi bioteknis, baik di Timur Tengah maupun di seluruh dunia.Kolaborasi inovasi dengan pihak internasional telah meningkatkan praktik medis inovatif, sistem rumah sakit, dan bioteknologi. Sebagai rumah sakit rujukan tersier, yang berafiliasi dengan Universitas Tel Aviv merupakan pusat hampir semua divisi medis dan spesialisasi.Rumah sakit ini melayani lebih dari 1 juta pasien per tahun. Lebih dari 25 persen dari semua penelitian klinis medis Israel dilakukan di fasilitas mutakhirnya.",
                    "https://s3.eu-central-1.amazonaws.com/bookimed/clinic/5ab24c86c0abf.jpeg",
                    "https://static.timesofisrael.com/www/uploads/2018/10/BabyMusa-2-1024x640.jpg",
                    "http://www.gefenltd.co.il/image.axd?src=~/uploaded_files/images/3_U5255.jpg&w=1052&h=604&q=99",
                    "https://www.israelhayom.com/wp-content/uploads/2019/03/1553162755a_mo1.jpg"}
    };






    static ArrayList<Hospital> getListData(){
        ArrayList<Hospital> list = new ArrayList<>();
        for (String[] aData:data) {
            Hospital hospital = new Hospital();
            hospital.setName(aData[0]);
            hospital.setDetail(aData[1]);
            hospital.setPhoto(aData[2]);
            hospital.setLab(aData[3]);
            hospital.setRoom(aData[4]);
            hospital.setEmergency(aData[5]);
            list.add(hospital);

        }
        return list;
    }

    public static String[] getHospital(int idx){
        return data[idx];
    }

}

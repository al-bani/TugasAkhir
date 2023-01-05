/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import Controller.ProdukController;
import Interface.ProdukInterface;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.List;
import Pojo.Produk;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import net.coobird.thumbnailator.Thumbnails;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author alzildan
 */

public class ProdukSwing extends javax.swing.JFrame {
    ProdukInterface produkInterface;
    Color colorRollover = new Color(31,31,31);
    Color colorNormal = new Color(51,51,51);
    /**
     * Creates new form Product
     */
    public ProdukSwing() {
        initComponents();
        tabbed_pane.setSelectedIndex(0);
        this.setLocationRelativeTo(null);
        loadData();
        txt_image_path_update.setEditable(false);
        txt_image_path.setEditable(false);
    }
    
    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    public void loadData(){
        produkInterface = new ProdukController();
        List<Produk> listProduk;
        listProduk = produkInterface.findAll();
        Object[][] objectProduk = new Object[listProduk.size()][9];
        
        int i = 0;
        for (Produk produk : listProduk) {
            objectProduk[i][0] = produk.getKode();
            objectProduk[i][1] = produk.getNama();
            objectProduk[i][2] = "Rp."+produk.getHarga();
            objectProduk[i][3] = produk.getDeskripsi();
            objectProduk[i][4] = produk.getStok();
            objectProduk[i][5] = produk.getPengiriman();
            objectProduk[i][6] = produk.getPembayaran();
            objectProduk[i][7] = produk.getKategori();
            objectProduk[i][8] = produk.getBerat()+" g";
            i++;
        } 
        
        table_produk.setModel(new javax.swing.table.DefaultTableModel(
            objectProduk,
            new String [] {
                "kode produk", "nama produk", "harga produk", "Deskripsi Produk", "stok tersedia", "pengiriman", "metode pembayaran", "kategori produk", "berat produk"
            }
        ));     
    }
    
    public void loadDataSort(String query){
        produkInterface = new ProdukController();
        List<Produk> listProduk;
        listProduk = produkInterface.findAll(query);
        Object[][] objectProduk = new Object[listProduk.size()][9];
        
        int i = 0;
        for (Produk produk : listProduk) {
            objectProduk[i][0] = produk.getKode();
            objectProduk[i][1] = produk.getNama();
            objectProduk[i][2] = "Rp."+produk.getHarga();
            objectProduk[i][3] = produk.getDeskripsi();
            objectProduk[i][4] = produk.getStok();
            objectProduk[i][5] = produk.getPengiriman();
            objectProduk[i][6] = produk.getPembayaran();
            objectProduk[i][7] = produk.getKategori();
            objectProduk[i][8] = produk.getBerat()+" g";
            i++;
        } 
        
        table_produk.setModel(new javax.swing.table.DefaultTableModel(
            objectProduk,
            new String [] {
                "kode produk", "nama produk", "harga produk", "Deskripsi Produk", "stok tersedia", "pengiriman", "metode pembayaran", "kategori produk", "berat produk"
            }
        ));     
    }
    
    public void emptyFields(){
        txt_stok.setText("");
        txt_nama_produk.setText("");
        txt_berat_produk.setText("");
        txt_kode_produk.setText("");
        txt_deskripsi_produk.setText("");
        txt_harga_produk.setText("");
        txt_stok.setText("");
        txt_image_path.setText("");
        
    
    }
    
    private Produk findProduk(String kodeProduk){
        Produk prod = new Produk();
        produkInterface = new ProdukController();
        prod = produkInterface.findById(kodeProduk);
        
        return prod;
    }
    
   private void searchProduk(Produk prod){
        Object[][] objProd = new Object[1][9];
        
        objProd[0][0] = prod.getKode();
        objProd[0][1] = prod.getNama();
        objProd[0][2] = "Rp."+prod.getHarga();
        objProd[0][3] = prod.getDeskripsi();
        objProd[0][4] = prod.getStok();
        objProd[0][5] = prod.getPengiriman();
        objProd[0][6] = prod.getPembayaran();
        objProd[0][7] = prod.getKategori();
        objProd[0][8] = prod.getBerat()+" g";
        
        table_produk.setModel(new javax.swing.table.DefaultTableModel(
            objProd,
            new String [] {
                "kode produk", "nama produk", "harga produk", "Deskripsi Produk", "stok tersedia", "pengiriman", "metode pembayaran", "kategori produk", "berat produk"
            }
        ));   
   }
   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_create = new javax.swing.JButton();
        btn_read = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        tabbed_pane = new javax.swing.JTabbedPane();
        read_delete = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_produk = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        combobox_sorting = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        btn_lihat_produk = new javax.swing.JButton();
        create = new javax.swing.JPanel();
        txt_stok = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama_produk = new javax.swing.JTextField();
        txt_berat_produk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_kode_produk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_deskripsi_produk = new javax.swing.JTextArea();
        txt_harga_produk = new javax.swing.JTextField();
        combobox_jenis_pengiriman = new javax.swing.JComboBox<>();
        txt_image_path = new javax.swing.JTextField();
        btn_image = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        combobox_pembayaran = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        combobox_ekspedisi_pengiriman = new javax.swing.JComboBox<>();
        btn_upload = new javax.swing.JButton();
        image_pane = new javax.swing.JDesktopPane();
        lbl_image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combobox_kategori = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        layer_update = new javax.swing.JPanel();
        txt_stok_update = new javax.swing.JTextField();
        txt_nama_produk_update = new javax.swing.JTextField();
        txt_berat_produk_update = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_deskripsi_produk_update = new javax.swing.JTextArea();
        txt_harga_produk_update = new javax.swing.JTextField();
        combobox_jenis_pengiriman_update = new javax.swing.JComboBox<>();
        txt_image_path_update = new javax.swing.JTextField();
        btn_image_update = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        combobox_pembayaran_update = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        combobox_ekspedisi_pengiriman_update = new javax.swing.JComboBox<>();
        btn_upload_update = new javax.swing.JButton();
        image_pane_update = new javax.swing.JDesktopPane();
        lbl_image_update = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        combobox_kategori_update = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        layer_up_by_id = new javax.swing.JPanel();
        btn_update_produk = new javax.swing.JButton();
        txt_kode_produk_update = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        showProduk = new javax.swing.JPanel();
        img_pane = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txt_show_kategori = new javax.swing.JTextField();
        txt_show_nama = new javax.swing.JTextField();
        txt_show_harga = new javax.swing.JTextField();
        txt_show_stok = new javax.swing.JTextField();
        txt_show_kode = new javax.swing.JTextField();
        txt_show_pengiriman = new javax.swing.JTextField();
        txt_show_berat = new javax.swing.JTextField();
        txt_show_pembayaran = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_show_deskripsi = new javax.swing.JTextArea();
        btn_show_edit = new javax.swing.JButton();
        btn_kembali_show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btn_create.setBackground(new java.awt.Color(51, 51, 51));
        btn_create.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_create.setForeground(new java.awt.Color(255, 255, 255));
        btn_create.setText("Buat Produk");
        btn_create.setBorder(null);
        btn_create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_create.setRequestFocusEnabled(false);
        btn_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_createMouseExited(evt);
            }
        });
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_read.setBackground(new java.awt.Color(51, 51, 51));
        btn_read.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_read.setForeground(new java.awt.Color(255, 255, 255));
        btn_read.setText("Lihat dan hapus Produk");
        btn_read.setBorder(null);
        btn_read.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_read.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_readMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_readMouseExited(evt);
            }
        });
        btn_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(51, 51, 51));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Perbarui Produk");
        btn_update.setBorder(null);
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_updateMouseExited(evt);
            }
        });
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(51, 51, 51));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("kembali");
        btn_back.setBorder(null);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_read, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_read, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 540));

        read_delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "kode produk", "nama produk", "harga produk", "Deskripsi Produk", "stok tersedia", "pengiriman", "metode pembayaran", "kategori produk", "berat produk"
            }
        ));
        table_produk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_produkMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_produk);

        read_delete.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 193, 871, 345));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Informasi Data Produk");
        read_delete.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 16, -1, -1));

        combobox_sorting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Harga Terendah", "Harga Tertinggi", "Stok Paling Sedikit", "Stok Paling Banyak" }));
        combobox_sorting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combobox_sorting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_sortingActionPerformed(evt);
            }
        });
        read_delete.add(combobox_sorting, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 101, 197, -1));

        jLabel14.setText("Sorting Berdasarkan");
        read_delete.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 79, -1, -1));

        jLabel15.setText("Cari Data Produk Berdasarkan Kode ");
        read_delete.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        read_delete.add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 101, 192, -1));

        btn_cari.setText("Cari");
        btn_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        read_delete.add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 101, -1, -1));

        jLabel16.setText("Hapus Produk dengan memilih data");
        read_delete.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        btn_hapus.setText("Hapus Produk");
        btn_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        read_delete.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        refresh.setText("Refresh");
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        read_delete.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel33.setText("Lihat Detail Produk dengan Memilih data");
        read_delete.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btn_lihat_produk.setText("Lihat dan Edit Produk");
        btn_lihat_produk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_lihat_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lihat_produkActionPerformed(evt);
            }
        });
        read_delete.add(btn_lihat_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        tabbed_pane.addTab("read", read_delete);

        create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_stok.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_stok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stokKeyTyped(evt);
            }
        });
        create.add(txt_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 270, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Create New Product");
        create.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 16, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Kode Produk");
        create.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 247, -1, -1));
        create.add(txt_nama_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 211, 375, -1));

        txt_berat_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_berat_produkActionPerformed(evt);
            }
        });
        txt_berat_produk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_berat_produkKeyTyped(evt);
            }
        });
        create.add(txt_berat_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 290, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Harga Produk");
        create.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Deskripsi Produk");
        create.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 313, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Stok Produk");
        create.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nama Produk");
        create.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 185, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Pengiriman");
        create.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Berat Produk");
        create.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Metode Pembayaran");
        create.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        txt_kode_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kode_produkActionPerformed(evt);
            }
        });
        create.add(txt_kode_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 273, 375, -1));

        txt_deskripsi_produk.setColumns(20);
        txt_deskripsi_produk.setRows(5);
        jScrollPane1.setViewportView(txt_deskripsi_produk);

        create.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 341, 375, 110));

        txt_harga_produk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_harga_produkKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_harga_produkKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_harga_produkKeyTyped(evt);
            }
        });
        create.add(txt_harga_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 310, -1));

        combobox_jenis_pengiriman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Instan", "Hemat", "Regular", "Kargo" }));
        combobox_jenis_pengiriman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combobox_jenis_pengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_jenis_pengirimanActionPerformed(evt);
            }
        });
        create.add(combobox_jenis_pengiriman, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 201, -1));

        txt_image_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_image_pathActionPerformed(evt);
            }
        });
        create.add(txt_image_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 116, 246, -1));

        btn_image.setText("choose image");
        btn_image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });
        create.add(btn_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 145, 110, -1));

        jLabel11.setText("Upload Image");
        create.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 94, -1, -1));

        combobox_pembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transfer bank", "QRIS", "Cryptocurency", "COD" }));
        combobox_pembayaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.add(combobox_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 200, -1));

        jLabel12.setText("gram");
        create.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, -1, -1));

        combobox_ekspedisi_pengiriman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gojek : Rp 10K/km", "Grab : Rp 11K/km" }));
        combobox_ekspedisi_pengiriman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.add(combobox_ekspedisi_pengiriman, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 200, -1));

        btn_upload.setText("Upload Produk");
        btn_upload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });
        create.add(btn_upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 110, 30));

        lbl_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        image_pane.setLayer(lbl_image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout image_paneLayout = new javax.swing.GroupLayout(image_pane);
        image_pane.setLayout(image_paneLayout);
        image_paneLayout.setHorizontalGroup(
            image_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        image_paneLayout.setVerticalGroup(
            image_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        create.add(image_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Kategori");
        create.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        combobox_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motherboard", "Processor (CPU)", "Heatsink", "RAM", "Hard Disk", "VGA Card (GPU)", "Flashdisk", "Monitor", "Keyboard", "Mouse", "Optical Drive", "SSD", "Power Supply", "LAN Card", "WLAN Card", "Sound Card", "Printer", "Scanner", "Speaker", "Webcam" }));
        combobox_kategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.add(combobox_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 240, -1));

        jLabel17.setText("Rp");
        create.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        tabbed_pane.addTab("create", create);

        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layer_update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_stok_update.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_stok_update.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stok_updateKeyTyped(evt);
            }
        });
        layer_update.add(txt_stok_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 270, -1));
        layer_update.add(txt_nama_produk_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 375, -1));

        txt_berat_produk_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_berat_produk_updateActionPerformed(evt);
            }
        });
        txt_berat_produk_update.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_berat_produk_updateKeyTyped(evt);
            }
        });
        layer_update.add(txt_berat_produk_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 290, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Harga Produk");
        layer_update.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Deskripsi Produk");
        layer_update.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Stok Produk");
        layer_update.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Nama Produk");
        layer_update.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Pengiriman");
        layer_update.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Berat Produk");
        layer_update.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Metode Pembayaran");
        layer_update.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        txt_deskripsi_produk_update.setColumns(20);
        txt_deskripsi_produk_update.setRows(5);
        jScrollPane3.setViewportView(txt_deskripsi_produk_update);

        layer_update.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 375, 110));

        txt_harga_produk_update.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_harga_produk_updateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_harga_produk_updateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_harga_produk_updateKeyTyped(evt);
            }
        });
        layer_update.add(txt_harga_produk_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 310, -1));

        combobox_jenis_pengiriman_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Instan", "Hemat", "Regular", "Kargo" }));
        combobox_jenis_pengiriman_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combobox_jenis_pengiriman_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_jenis_pengiriman_updateActionPerformed(evt);
            }
        });
        layer_update.add(combobox_jenis_pengiriman_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 201, -1));

        txt_image_path_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_image_path_updateActionPerformed(evt);
            }
        });
        layer_update.add(txt_image_path_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 246, -1));

        btn_image_update.setText("choose image");
        btn_image_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_image_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_image_updateActionPerformed(evt);
            }
        });
        layer_update.add(btn_image_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, -1));

        jLabel27.setText("Upload Image");
        layer_update.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        combobox_pembayaran_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transfer bank", "QRIS", "Cryptocurency", "COD" }));
        combobox_pembayaran_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        layer_update.add(combobox_pembayaran_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 200, -1));

        jLabel28.setText("gram");
        layer_update.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        combobox_ekspedisi_pengiriman_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gojek : Rp 10K/km", "Grab : Rp 11K/km" }));
        combobox_ekspedisi_pengiriman_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        layer_update.add(combobox_ekspedisi_pengiriman_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 200, -1));

        btn_upload_update.setText("Update Produk");
        btn_upload_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_upload_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upload_updateActionPerformed(evt);
            }
        });
        layer_update.add(btn_upload_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 110, 30));

        lbl_image_update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        image_pane_update.setLayer(lbl_image_update, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout image_pane_updateLayout = new javax.swing.GroupLayout(image_pane_update);
        image_pane_update.setLayout(image_pane_updateLayout);
        image_pane_updateLayout.setHorizontalGroup(
            image_pane_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image_pane_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image_update, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        image_pane_updateLayout.setVerticalGroup(
            image_pane_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image_pane_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layer_update.add(image_pane_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 110));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Kategori");
        layer_update.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        combobox_kategori_update.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motherboard", "Processor (CPU)", "Heatsink", "RAM", "Hard Disk", "VGA Card (GPU)", "Flashdisk", "Monitor", "Keyboard", "Mouse", "Optical Drive", "SSD", "Power Supply", "LAN Card", "WLAN Card", "Sound Card", "Printer", "Scanner", "Speaker", "Webcam" }));
        combobox_kategori_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        layer_update.add(combobox_kategori_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 240, -1));

        jLabel30.setText("Rp");
        layer_update.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("UPDATE PRODUK");
        layer_update.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        update.add(layer_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 78, -1, 474));

        btn_update_produk.setText("Cari Produk");
        btn_update_produk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_produkActionPerformed(evt);
            }
        });

        txt_kode_produk_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kode_produk_updateActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Cari Kode Produk");

        jLabel31.setText("Form Update akan ditampilkan");

        jLabel32.setText("Jika Produk ditemukan");

        javax.swing.GroupLayout layer_up_by_idLayout = new javax.swing.GroupLayout(layer_up_by_id);
        layer_up_by_id.setLayout(layer_up_by_idLayout);
        layer_up_by_idLayout.setHorizontalGroup(
            layer_up_by_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layer_up_by_idLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layer_up_by_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layer_up_by_idLayout.createSequentialGroup()
                        .addComponent(txt_kode_produk_update, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update_produk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                        .addComponent(jLabel32))
                    .addGroup(layer_up_by_idLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)))
                .addGap(16, 16, 16))
        );
        layer_up_by_idLayout.setVerticalGroup(
            layer_up_by_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layer_up_by_idLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layer_up_by_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layer_up_by_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kode_produk_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_produk)
                    .addComponent(jLabel32))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        update.add(layer_up_by_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 750, 60));

        tabbed_pane.addTab("update", update);

        showProduk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_pane.setBackground(new java.awt.Color(153, 153, 153));

        jLabel34.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout img_paneLayout = new javax.swing.GroupLayout(img_pane);
        img_pane.setLayout(img_paneLayout);
        img_paneLayout.setHorizontalGroup(
            img_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        img_paneLayout.setVerticalGroup(
            img_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(img_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        showProduk.add(img_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 190));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText("Harga Produk :");
        showProduk.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("Nama Produk : ");
        showProduk.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("Kode Produk :");
        showProduk.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setText("Stok Produk :");
        showProduk.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setText("Deskripsi :");
        showProduk.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setText("Berat Produk :");
        showProduk.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setText("Pengiriman : ");
        showProduk.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setText("Kategori Produk :");
        showProduk.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setText("Metode Pembayaran : ");
        showProduk.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        txt_show_kategori.setEditable(false);
        showProduk.add(txt_show_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 240, -1));

        txt_show_nama.setEditable(false);
        showProduk.add(txt_show_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 480, -1));

        txt_show_harga.setEditable(false);
        showProduk.add(txt_show_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 480, -1));

        txt_show_stok.setEditable(false);
        txt_show_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_show_stokActionPerformed(evt);
            }
        });
        showProduk.add(txt_show_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 480, -1));

        txt_show_kode.setEditable(false);
        showProduk.add(txt_show_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 480, -1));

        txt_show_pengiriman.setEditable(false);
        showProduk.add(txt_show_pengiriman, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 240, -1));

        txt_show_berat.setEditable(false);
        showProduk.add(txt_show_berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 240, -1));

        txt_show_pembayaran.setEditable(false);
        showProduk.add(txt_show_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 240, -1));

        txt_show_deskripsi.setEditable(false);
        txt_show_deskripsi.setColumns(20);
        txt_show_deskripsi.setRows(5);
        jScrollPane4.setViewportView(txt_show_deskripsi);

        showProduk.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 690, 130));

        btn_show_edit.setText("Edit");
        btn_show_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_show_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_show_editActionPerformed(evt);
            }
        });
        showProduk.add(btn_show_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, -1, -1));

        btn_kembali_show.setText("Kembali");
        btn_kembali_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kembali_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembali_showActionPerformed(evt);
            }
        });
        showProduk.add(btn_kembali_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        tabbed_pane.addTab("show", showProduk);

        getContentPane().add(tabbed_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 910, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       btn_create.setBackground(colorNormal);
        btn_read.setBackground(colorNormal);
        
        btn_update.setBackground(colorRollover);
        
        tabbed_pane.setSelectedIndex(2);
       layer_update.setVisible(false);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        btn_update.setBackground(colorNormal);
         btn_read.setBackground(colorNormal);
         
        btn_create.setBackground(colorRollover);
        
        tabbed_pane.setSelectedIndex(1);
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readActionPerformed
        
        btn_update.setBackground(colorNormal);
        btn_create.setBackground(colorNormal);
        
        btn_read.setBackground(colorRollover);
        tabbed_pane.setSelectedIndex(0);
    }//GEN-LAST:event_btn_readActionPerformed

    private void txt_image_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_image_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_image_pathActionPerformed

    private void txt_berat_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_berat_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_berat_produkActionPerformed

    private void txt_kode_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kode_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kode_produkActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
        close();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        String namaFileImage = file.getAbsolutePath();
        txt_image_path.setText(namaFileImage);

        try {
            File image = new File(namaFileImage);  
            BufferedImage thumbnail = Thumbnails.of(image).size(170, 170).asBufferedImage();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(thumbnail, "jpeg", os);
            InputStream is = new  ByteArrayInputStream(os.toByteArray());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
     
            for (int readNum; (readNum = is.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            
            produkIcon = new ImageIcon(thumbnail);
            lbl_image.setIcon(produkIcon);       
            produkImage = bos.toByteArray();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_imageActionPerformed

    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed
            String kodeProduk, namaProduk,deskripsiProduk,
                   jenisPengiriman, ekspedisiPengiriman, pembayaran, kategori, pengiriman;
            int stok;
            double berat, harga;
            
        

            if (txt_stok.getText().isEmpty() || txt_nama_produk.getText().isEmpty() 
                || txt_berat_produk.getText().isEmpty() || txt_kode_produk.getText().isEmpty() 
                    || txt_deskripsi_produk.getText().isEmpty() || txt_harga_produk.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "harap isi data produk");
            } else {
                
                if (rootPaneCheckingEnabled) {
                    
                }
                namaProduk = txt_nama_produk.getText();
                berat = Double.parseDouble(txt_berat_produk.getText());
                kodeProduk = txt_kode_produk.getText();
                deskripsiProduk = txt_deskripsi_produk.getText();
                harga = Double.parseDouble(txt_harga_produk.getText());
                stok = Integer.parseInt(txt_stok.getText());
                jenisPengiriman = combobox_jenis_pengiriman.getSelectedItem().toString();
                ekspedisiPengiriman = combobox_ekspedisi_pengiriman.getSelectedItem().toString();
                pembayaran = combobox_pembayaran.getSelectedItem().toString();
                pengiriman = jenisPengiriman + " Ekspedisi : " + ekspedisiPengiriman;
                kategori = combobox_kategori.getSelectedItem().toString();
            
                try {
                    Produk produk = new Produk();
                    produk.setNama(namaProduk);
                    produk.setKode(kodeProduk);
                    produk.setDeskripsi(deskripsiProduk);
                    produk.setHarga(harga);
                    produk.setBerat(berat);
                    produk.setPembayaran(pembayaran);
                    produk.setStok(stok);
                    produk.setPengiriman(pengiriman);
                    produk.setKategori(kategori);
                    produk.setImage(produkImage);

                    produkInterface = new ProdukController();
                    produkInterface.create(produk);

                    JOptionPane.showMessageDialog(null, "Produk telah di upload");
                    loadData();
                    emptyFields();
                } catch (Exception e) {
                     System.out.println(e.toString());
                }
            }
           
         
            
            
    }//GEN-LAST:event_btn_uploadActionPerformed

    private void txt_harga_produkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_harga_produkKeyPressed
       
    }//GEN-LAST:event_txt_harga_produkKeyPressed

    private void txt_harga_produkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_harga_produkKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_harga_produkKeyTyped

    private void txt_harga_produkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_harga_produkKeyReleased
        
    }//GEN-LAST:event_txt_harga_produkKeyReleased

    private void txt_stokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stokKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_stokKeyTyped

    private void txt_berat_produkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_berat_produkKeyTyped
       char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_berat_produkKeyTyped

    private void combobox_jenis_pengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_jenis_pengirimanActionPerformed
        String selectedItem = combobox_jenis_pengiriman.getSelectedItem().toString();
        
        if ("Instan".equals(selectedItem)) {
            combobox_ekspedisi_pengiriman.removeAllItems();
            combobox_ekspedisi_pengiriman.addItem("Gojek : Rp 10K/km");
            combobox_ekspedisi_pengiriman.addItem("Grab : Rp 11K/km");
        } else if ("Hemat".equals(selectedItem)) {
             combobox_ekspedisi_pengiriman.removeAllItems();
             combobox_ekspedisi_pengiriman.addItem("JNE : Rp 4K/10km");
             combobox_ekspedisi_pengiriman.addItem("POS Indonesia : Rp 4,5K/10km");
             combobox_ekspedisi_pengiriman.addItem("Sicepat : Rp 5K/10km");
        } else if ("Reguler".equals(selectedItem)) {
             combobox_ekspedisi_pengiriman.removeAllItems();
             combobox_ekspedisi_pengiriman.addItem("JNT : Rp 8K/10km");
        } else if ("Kargo".equals(selectedItem)) {
             combobox_ekspedisi_pengiriman.removeAllItems();
             combobox_ekspedisi_pengiriman.addItem("Parcel : Rp 10,5K/10km");
        }
    }//GEN-LAST:event_combobox_jenis_pengirimanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int row = table_produk.getSelectedRow();
        
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "pilih data di tabel dahulu !");
            return;
        }
        
        String Kode_produk = table_produk.getValueAt(row, 0).toString();

            int dialogButton = JOptionPane.YES_NO_OPTION;

            produkInterface = new ProdukController();

            try {
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to delete it?", "Warning", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    produkInterface.delete(Kode_produk);
                    loadData();
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        
        
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void table_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_produkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_produkMouseClicked

    private void combobox_sortingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_sortingActionPerformed
        int selectedItem = combobox_sorting.getSelectedIndex();
        
        if (selectedItem == 0) {
            String query = "SELECT * FROM tb_produk ORDER BY harga_produk ASC";
            loadDataSort(query);
        } else if (selectedItem == 1) {
            String query = "SELECT * FROM tb_produk ORDER BY harga_produk DESC";
            loadDataSort(query);
        } else if (selectedItem == 2) {
            String query = "SELECT * FROM tb_produk ORDER BY stok_produk ASC";
            loadDataSort(query);
        } else if (selectedItem == 3) {
            String query = "SELECT * FROM tb_produk ORDER BY stok_produk DESC";
            loadDataSort(query);
        }
    }//GEN-LAST:event_combobox_sortingActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String kodeProduk = txt_cari.getText();
        
        Produk searchedProduk = new Produk();
        searchedProduk = findProduk(kodeProduk);
        
        if (searchedProduk != null) {
            searchProduk(searchedProduk);
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
        
    }//GEN-LAST:event_btn_cariActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        loadData();
    }//GEN-LAST:event_refreshActionPerformed

    private void txt_stok_updateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stok_updateKeyTyped
       char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_stok_updateKeyTyped

    private void txt_berat_produk_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_berat_produk_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_berat_produk_updateActionPerformed

    private void txt_berat_produk_updateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_berat_produk_updateKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_berat_produk_updateKeyTyped

    private void txt_kode_produk_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kode_produk_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kode_produk_updateActionPerformed

    private void txt_harga_produk_updateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_harga_produk_updateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_harga_produk_updateKeyPressed

    private void txt_harga_produk_updateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_harga_produk_updateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_harga_produk_updateKeyReleased

    private void txt_harga_produk_updateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_harga_produk_updateKeyTyped
        char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_harga_produk_updateKeyTyped

    private void combobox_jenis_pengiriman_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_jenis_pengiriman_updateActionPerformed
        String selectedItem = combobox_jenis_pengiriman_update.getSelectedItem().toString();
        
        if ("Instan".equals(selectedItem)) {
            combobox_ekspedisi_pengiriman_update.removeAllItems();
            combobox_ekspedisi_pengiriman_update.addItem("Gojek : Rp 10K/km");
            combobox_ekspedisi_pengiriman_update.addItem("Grab : Rp 11K/km");
        } else if ("Hemat".equals(selectedItem)) {
             combobox_ekspedisi_pengiriman_update.removeAllItems();
             combobox_ekspedisi_pengiriman_update.addItem("JNE : Rp 4K/10km");
             combobox_ekspedisi_pengiriman_update.addItem("POS Indonesia : Rp 4,5K/10km");
             combobox_ekspedisi_pengiriman_update.addItem("Sicepat : Rp 5K/10km");
        } else if ("Reguler".equals(selectedItem)) {
             combobox_ekspedisi_pengiriman_update.removeAllItems();
             combobox_ekspedisi_pengiriman_update.addItem("JNT : Rp 8K/10km");
        } else if ("Kargo".equals(selectedItem)) {
             combobox_ekspedisi_pengiriman_update.removeAllItems();
             combobox_ekspedisi_pengiriman_update.addItem("Parcel : Rp 10,5K/10km");
        }
    }//GEN-LAST:event_combobox_jenis_pengiriman_updateActionPerformed

    private void txt_image_path_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_image_path_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_image_path_updateActionPerformed

    private void btn_image_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_image_updateActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        String namaFileImage = file.getAbsolutePath();
        txt_image_path_update.setText(namaFileImage);

        try {
            File image = new File(namaFileImage);  
            BufferedImage thumbnail = Thumbnails.of(image).size(170, 170).asBufferedImage();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(thumbnail, "jpeg", os);
            InputStream is = new  ByteArrayInputStream(os.toByteArray());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
     
            for (int readNum; (readNum = is.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            
            produkIcon = new ImageIcon(thumbnail);
            lbl_image_update.setIcon(produkIcon);       
            produkImage = bos.toByteArray();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_image_updateActionPerformed

    private void btn_upload_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upload_updateActionPerformed
        
            String namaProduk,deskripsiProduk,
                   jenisPengiriman, ekspedisiPengiriman, pembayaran, kategori, pengiriman;
            int stok;
            double berat, harga;

            if (txt_stok_update.getText().isEmpty() || txt_nama_produk_update.getText().isEmpty() 
                || txt_berat_produk_update.getText().isEmpty() || txt_kode_produk_update.getText().isEmpty() 
                    || txt_deskripsi_produk_update.getText().isEmpty() || txt_harga_produk_update.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "harap isi data produk");
            } else {
                namaProduk = txt_nama_produk_update.getText();
                stok = Integer.parseInt(txt_stok_update.getText());
                berat = Double.parseDouble(txt_berat_produk_update.getText());
                deskripsiProduk = txt_deskripsi_produk_update.getText();
                harga = Double.parseDouble(txt_harga_produk_update.getText());
                jenisPengiriman = combobox_jenis_pengiriman_update.getSelectedItem().toString();
                ekspedisiPengiriman = combobox_ekspedisi_pengiriman_update.getSelectedItem().toString();
                pembayaran = combobox_pembayaran_update.getSelectedItem().toString();
                pengiriman = jenisPengiriman + " Ekspedisi : " + ekspedisiPengiriman;
                kategori = combobox_kategori_update.getSelectedItem().toString();
            
                try {
                    Produk produk = new Produk();
                    produk.setNama(namaProduk);
                    produk.setDeskripsi(deskripsiProduk);
                    produk.setHarga(harga);
                    produk.setBerat(berat);
                    produk.setPembayaran(pembayaran);
                    produk.setStok(stok);
                    produk.setPengiriman(pengiriman);
                    produk.setKategori(kategori);
                    produk.setImage(produkImage);
                    produk.setKode(txt_kode_produk_update.getText());

                    produkInterface = new ProdukController();
                    produkInterface.update(produk);

                    JOptionPane.showMessageDialog(null, "Produk telah di update");
                    loadData();
                    layer_update.setVisible(false);
                } catch (Exception e) {
                     System.out.println(e.toString());
                     
                }
            }
     
    }//GEN-LAST:event_btn_upload_updateActionPerformed

    private void btn_update_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_produkActionPerformed
        String kodeProduk = txt_kode_produk_update.getText();
        
        Produk searchedProduk = new Produk();
        searchedProduk = findProduk(kodeProduk);
        
        if (searchedProduk == null) {
            JOptionPane.showMessageDialog(null, "maaf data tidak ditemukan");
            layer_update.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "data ditemukan");
            layer_update.setVisible(true);
            loadData();
        }
    }//GEN-LAST:event_btn_update_produkActionPerformed

    private void btn_lihat_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lihat_produkActionPerformed
        int row = table_produk.getSelectedRow();
       
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "pilih data di tabel dahulu !");
            return;
        }
            String Kode_produk = table_produk.getValueAt(row, 0).toString();
            Produk prod = new Produk();
            produkInterface = new ProdukController();
            prod = produkInterface.findById(Kode_produk);

            String a = Double.toString(prod.getBerat());
            txt_show_nama.setText(prod.getNama());
            txt_show_harga.setText(Double.toString(prod.getHarga()));
            txt_show_stok.setText(Integer.toString(prod.getStok()));
            txt_show_kode.setText(prod.getKode());
            txt_show_pengiriman.setText(prod.getPengiriman());
            txt_show_berat.setText(Double.toString(prod.getBerat()));
            txt_show_pembayaran.setText(prod.getPembayaran());
            txt_show_deskripsi.setText(prod.getDeskripsi());
            txt_show_kategori.setText(prod.getKategori());
            
 

            tabbed_pane.setSelectedIndex(3);
       
    }//GEN-LAST:event_btn_lihat_produkActionPerformed

    private void txt_show_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_show_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_show_stokActionPerformed

    private void btn_kembali_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembali_showActionPerformed
        tabbed_pane.setSelectedIndex(0);
    }//GEN-LAST:event_btn_kembali_showActionPerformed

    private void btn_show_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_show_editActionPerformed
        layer_update.setVisible(true);
        layer_up_by_id.setVisible(false);
        tabbed_pane.setSelectedIndex(2);
        int row = table_produk.getSelectedRow();
        
        String Kode_produk = table_produk.getValueAt(row, 0).toString();
            Produk prod = new Produk();
            produkInterface = new ProdukController();
            prod = produkInterface.findById(Kode_produk);

            String a = Double.toString(prod.getBerat());
            txt_nama_produk_update.setText(prod.getNama());
            txt_harga_produk_update.setText(Double.toString(prod.getHarga()));
            txt_stok_update.setText(Integer.toString(prod.getStok()));
            txt_kode_produk_update.setText(prod.getKode());
            txt_berat_produk_update.setText(Double.toString(prod.getBerat()));
            txt_deskripsi_produk_update.setText(prod.getDeskripsi());
            
 
    }//GEN-LAST:event_btn_show_editActionPerformed

    private void btn_createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createMouseEntered
        btn_create.setBackground(colorRollover);
    }//GEN-LAST:event_btn_createMouseEntered

    private void btn_createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createMouseExited
        btn_create.setBackground(colorNormal);
    }//GEN-LAST:event_btn_createMouseExited

    private void btn_readMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_readMouseEntered
        btn_read.setBackground(colorRollover);
    }//GEN-LAST:event_btn_readMouseEntered

    private void btn_readMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_readMouseExited
        btn_read.setBackground(colorNormal);
    }//GEN-LAST:event_btn_readMouseExited

    private void btn_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseEntered
       btn_update.setBackground(colorRollover);
    }//GEN-LAST:event_btn_updateMouseEntered

    private void btn_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseExited
        btn_update.setBackground(colorNormal);
    }//GEN-LAST:event_btn_updateMouseExited

    private void btn_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createMouseClicked
        btn_create.setBackground(colorRollover);
    }//GEN-LAST:event_btn_createMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdukSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdukSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdukSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdukSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdukSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_image;
    private javax.swing.JButton btn_image_update;
    private javax.swing.JButton btn_kembali_show;
    private javax.swing.JButton btn_lihat_produk;
    private javax.swing.JButton btn_read;
    private javax.swing.JButton btn_show_edit;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update_produk;
    private javax.swing.JButton btn_upload;
    private javax.swing.JButton btn_upload_update;
    private javax.swing.JComboBox<String> combobox_ekspedisi_pengiriman;
    private javax.swing.JComboBox<String> combobox_ekspedisi_pengiriman_update;
    private javax.swing.JComboBox<String> combobox_jenis_pengiriman;
    private javax.swing.JComboBox<String> combobox_jenis_pengiriman_update;
    private javax.swing.JComboBox<String> combobox_kategori;
    private javax.swing.JComboBox<String> combobox_kategori_update;
    private javax.swing.JComboBox<String> combobox_pembayaran;
    private javax.swing.JComboBox<String> combobox_pembayaran_update;
    private javax.swing.JComboBox<String> combobox_sorting;
    private javax.swing.JPanel create;
    private javax.swing.JDesktopPane image_pane;
    private javax.swing.JDesktopPane image_pane_update;
    private javax.swing.JPanel img_pane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel layer_up_by_id;
    private javax.swing.JPanel layer_update;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_image_update;
    private javax.swing.JPanel read_delete;
    private javax.swing.JButton refresh;
    private javax.swing.JPanel showProduk;
    private javax.swing.JTabbedPane tabbed_pane;
    private javax.swing.JTable table_produk;
    private javax.swing.JTextField txt_berat_produk;
    private javax.swing.JTextField txt_berat_produk_update;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextArea txt_deskripsi_produk;
    private javax.swing.JTextArea txt_deskripsi_produk_update;
    private javax.swing.JTextField txt_harga_produk;
    private javax.swing.JTextField txt_harga_produk_update;
    private javax.swing.JTextField txt_image_path;
    private javax.swing.JTextField txt_image_path_update;
    private javax.swing.JTextField txt_kode_produk;
    private javax.swing.JTextField txt_kode_produk_update;
    private javax.swing.JTextField txt_nama_produk;
    private javax.swing.JTextField txt_nama_produk_update;
    private javax.swing.JTextField txt_show_berat;
    private javax.swing.JTextArea txt_show_deskripsi;
    private javax.swing.JTextField txt_show_harga;
    private javax.swing.JTextField txt_show_kategori;
    private javax.swing.JTextField txt_show_kode;
    private javax.swing.JTextField txt_show_nama;
    private javax.swing.JTextField txt_show_pembayaran;
    private javax.swing.JTextField txt_show_pengiriman;
    private javax.swing.JTextField txt_show_stok;
    private javax.swing.JTextField txt_stok;
    private javax.swing.JTextField txt_stok_update;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
    private ImageIcon produkIcon = null;
    byte[] produkImage = null;

}

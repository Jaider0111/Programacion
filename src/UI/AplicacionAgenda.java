package UI;

import Data.Cliente;
import Data.Registro;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class AplicacionAgenda extends javax.swing.JFrame {
    Registro registro;
    String select;
    String name;
    String pass;
    TreeMap<String, Cliente> clientes;
    TreeMap<String, Registro> registros;
    
    public AplicacionAgenda(ArrayList<String> perfs) {
        initComponents();
        principio.setEnabled(false);
        principio.setVisible(false);
        actua.setEnabled(false);
        historia.setEnabled(false);
        actua.setVisible(false);
        historia.setVisible(false);
        pass = perfs.get(0);
        perfs.remove(0);
        perfs.add(0, "Administrador");
        String[] arr = new String[perfs.size()];
        arr = perfs.toArray(arr);
        perfiles.setModel(new DefaultComboBoxModel<>(arr));
        registros = new TreeMap<>();
        for(int i = 1; i < perfs.size(); i++){
            registros.put(perfs.get(i), UI.cargarRegistro(perfs.get(i)+".csv"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraBusqueda = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        guardarAgenda = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        gestion = new javax.swing.JButton();
        historiacli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteslist = new javax.swing.JList<>();
        cartera = new javax.swing.JSpinner();
        prestado = new javax.swing.JSpinner();
        recibido = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        prestadototal = new javax.swing.JSpinner();
        cargar = new javax.swing.JButton();
        actua = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        valor = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cuotas = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        vacuo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cuopa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        pago = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        reein = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fechapre = new javax.swing.JTextField();
        fechapa = new javax.swing.JTextField();
        historia = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        atras = new javax.swing.JButton();
        inicio = new javax.swing.JPanel();
        perfiles = new javax.swing.JComboBox<>();
        entrar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("Obreros de la finca ");
        setForeground(new java.awt.Color(68, 216, 247));
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Lista de Clientes");

        barraBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBusquedaActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        guardarAgenda.setText("Guardar Registro");
        guardarAgenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAgendaActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        gestion.setText("Gestionar Credito");
        gestion.setEnabled(false);
        gestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionActionPerformed(evt);
            }
        });

        historiacli.setText("Ver historial de Prestamos");
        historiacli.setEnabled(false);
        historiacli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiacliActionPerformed(evt);
            }
        });

        jLabel2.setText("Dinero en cartera:");

        jLabel3.setText("Dinero prestado por fecha:");

        jLabel4.setText("Dinero recibido por fecha:");

        jButton3.setText("Ver historial de registros");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo Cliente");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        clienteslist.setMinimumSize(new java.awt.Dimension(246, 356));
        clienteslist.setName(""); // NOI18N
        clienteslist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                clienteslistValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(clienteslist);

        cartera.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10000));

        prestado.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10000));

        recibido.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10000));

        jLabel13.setText("Dinero prestado total:");

        prestadototal.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10000));

        cargar.setText("Cargar Datos");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principioLayout = new javax.swing.GroupLayout(principio);
        principio.setLayout(principioLayout);
        principioLayout.setHorizontalGroup(
            principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principioLayout.createSequentialGroup()
                        .addComponent(barraBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principioLayout.createSequentialGroup()
                        .addComponent(gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(historiacli, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89)
                        .addComponent(cartera))
                    .addGroup(principioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(prestado))
                    .addGroup(principioLayout.createSequentialGroup()
                        .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(principioLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(principioLayout.createSequentialGroup()
                        .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(guardarAgenda, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principioLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prestadototal)
                                    .addComponent(recibido)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))))
                .addContainerGap())
            .addGroup(principioLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principioLayout.setVerticalGroup(
            principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiar)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historiacli)
                    .addComponent(gestion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cartera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(recibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(prestadototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Nombre del cliente:");

        jLabel6.setText("Valor de prestamo:");

        valor.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10000));

        jLabel7.setText("Fecha de prestamo:");

        jLabel9.setText("Numero de cuotas:");

        cuotas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel8.setText("Valor Cuota:");

        vacuo.setEditable(false);
        vacuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacuoActionPerformed(evt);
            }
        });

        jLabel10.setText("Cuota a pagar:");

        cuopa.setEditable(false);
        cuopa.setText("0");

        jLabel11.setText("Fecha de pago:");

        jLabel12.setText("Saldo:");

        saldo.setEditable(false);

        pago.setText("Realizar pago de cuota");
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });

        iniciar.setText("Iniciar prestamo");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        reein.setText("Registrar cliente e iniciar prestamo");
        reein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reeinActionPerformed(evt);
            }
        });

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actuaLayout = new javax.swing.GroupLayout(actua);
        actua.setLayout(actuaLayout);
        actuaLayout.setHorizontalGroup(
            actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actuaLayout.createSequentialGroup()
                        .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(valor)))
                    .addGroup(actuaLayout.createSequentialGroup()
                        .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saldo)
                            .addComponent(fechapa)))
                    .addGroup(actuaLayout.createSequentialGroup()
                        .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actuaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cuotas)
                                    .addComponent(vacuo)
                                    .addComponent(cuopa)))
                            .addGroup(actuaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(fechapre))))
                    .addGroup(actuaLayout.createSequentialGroup()
                        .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actuaLayout.createSequentialGroup()
                        .addComponent(reein, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        actuaLayout.setVerticalGroup(
            actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(fechapre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(vacuo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cuopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fechapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pago)
                    .addComponent(iniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reein)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titulo.setFont(new java.awt.Font("Jamrul", 1, 18)); // NOI18N
        titulo.setText("jLabel13");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historiaLayout = new javax.swing.GroupLayout(historia);
        historia.setLayout(historiaLayout);
        historiaLayout.setHorizontalGroup(
            historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historiaLayout.createSequentialGroup()
                .addGroup(historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(historiaLayout.createSequentialGroup()
                        .addGroup(historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(historiaLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(historiaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titulo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        historiaLayout.setVerticalGroup(
            historiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        entrar.setText("Iniciar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        agregar.setText("Agregar Perfil");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(perfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(perfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrar)
                .addGap(18, 18, 18)
                .addComponent(agregar)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(actua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(historia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(196, Short.MAX_VALUE)
                    .addComponent(actua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(109, 109, 109)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addComponent(historia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(152, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrada(){
        inicio.setVisible(false);
        inicio.setEnabled(false);
        principio.setVisible(true);
        principio.setEnabled(true);
        select = null;
        clientes = UI.mapaClientes(registro.getClientes());
        cartera.setEnabled(false);
        recibido.setEnabled(false);
        prestado.setEnabled(false);
        prestadototal.setEnabled(false);
        cartera.setValue(registro.getCartera());
        recibido.setValue(registro.getRecibido());
        prestado.setValue(registro.getPrestado());
        prestadototal.setValue(UI.prestotal(registro));
        clienteslist.setListData(UI.nombreClientes(UI.mapaClientes(registro.getClientes())));
    }
    
    private void guardarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAgendaActionPerformed
        Date n = new Date(System.currentTimeMillis());
        String date = String.valueOf(n.getDate()) +'/' + String.valueOf(n.getMonth()+1) +'/' + String.valueOf(n.getYear()+1900);
        registro.addRegant(date, (int) cartera.getValue(), (int) prestado.getValue(), (int) recibido.getValue());
        recibido.setValue(0);
        prestado.setValue(0);
        prestadototal.setValue(UI.prestotal(registro));
        guardado();
        JOptionPane.showMessageDialog(this, select);
        select = null;
    }//GEN-LAST:event_guardarAgendaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String busqueda = barraBusqueda.getText();
        String[] nombres = UI.nombreClientes(UI.mapaClientes(registro.getClientes()));
        ArrayList<String> coincidencias = new ArrayList<>();
        for (String nombre1 : nombres) {
            if (nombre1.contains(busqueda)) {
                coincidencias.add(nombre1);
            }
        }
        String[] resultados = new String[coincidencias.size()];
        resultados = coincidencias.toArray(resultados);
        clienteslist.setListData(resultados);
    }//GEN-LAST:event_BuscarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        barraBusqueda.setText("");
        clienteslist.setListData(UI.nombreClientes(UI.mapaClientes(registro.getClientes())));
    }//GEN-LAST:event_LimpiarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void barraBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBusquedaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        select = clienteslist.getSelectedValue();
        DefaultTableModel modelo = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                            return false;
                    }
            };
        modelo.addColumn("Fecha");
        modelo.addColumn("Valor en cartera");
        modelo.addColumn("Dinero prestado");
        modelo.addColumn("Dinero recibido");
        for (AbstractMap.SimpleEntry i : registro.getRegant()){
            Object[] a = new Object[4];
            String b = (String) i.getKey();
            a[0] = String.valueOf(b);
            a[1] = ((int[]) i.getValue())[0];
            a[2] = ((int[]) i.getValue())[1];
            a[3] = ((int[]) i.getValue())[2];
            modelo.addRow(a);
        }
        tabla.setModel(modelo);
        tabla.setVisible(true);
        principio.setEnabled(false);
        principio.setVisible(false);
        historia.setEnabled(true);
        historia.setVisible(true);
        titulo.setText("Historial de registros".toUpperCase());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void vacuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacuoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacuoActionPerformed

    private void clienteslistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_clienteslistValueChanged
        if(!clienteslist.isSelectionEmpty()){
            if(!clienteslist.getSelectedValue().equals("No hay Clientes")){
                gestion.setEnabled(true);
                historiacli.setEnabled(true);
                
            }
        }
    }//GEN-LAST:event_clienteslistValueChanged

    private void gestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionActionPerformed
        principio.setEnabled(false);
        principio.setVisible(false);
        actua.setEnabled(true);
        actua.setVisible(true);
        select = clienteslist.getSelectedValue();
        nombre.setText(clientes.get(select).getNombre());
        reein.setEnabled(false);
        valor.setValue(clientes.get(select).getValor());
        cuotas.setValue(clientes.get(select).getCuotas());
        Date n = new Date(System.currentTimeMillis());
        String date = String.valueOf(n.getDate()) +'/' + String.valueOf(n.getMonth()+1) +'/' + String.valueOf(n.getYear()+1900);
        fechapa.setText(date);
        if(clientes.get(select).isEstado()){
            iniciar.setEnabled(false);
            pago.setEnabled(true);
            fechapre.setText(clientes.get(select).getFecha());
            vacuo.setText(String.valueOf((int) (clientes.get(select).getValor()*1.20)/clientes.get(select).getCuotas()));
            cuopa.setText(String.valueOf(clientes.get(select).getNumpago()));
            saldo.setText(String.valueOf((int) (clientes.get(select).getValor()*1.20)-((clientes.get(select).getNumpago()-1)*Integer.valueOf(vacuo.getText()))));
        }else{
            pago.setEnabled(false);
            iniciar.setEnabled(true);
            vacuo.setText("");
            cuopa.setText("");
            saldo.setText("");
            fechapre.setText(date);
        }
    }//GEN-LAST:event_gestionActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        principio.setEnabled(false);
        principio.setVisible(false);
        actua.setEnabled(true);
        actua.setVisible(true);
        pago.setEnabled(false);
        iniciar.setEnabled(false);
        reein.setEnabled(true);
        nombre.setText("");
        valor.setValue(0);
        cuotas.setValue(1);
        Date n = new Date(System.currentTimeMillis());
        String date = String.valueOf(n.getDate()) +'/' + String.valueOf(n.getMonth()+1) +'/' + String.valueOf(n.getYear()+1900);
        fechapa.setText(date);
        fechapre.setText(date);
        vacuo.setText("");
        cuopa.setText("");
        saldo.setText("");
    }//GEN-LAST:event_nuevoActionPerformed

    private void reeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reeinActionPerformed
        if(!nombre.getText().equals("")){
            if((int) valor.getValue() != 0){
                Cliente n = new Cliente(nombre.getText(), clientes.size(), true, (int) valor.getValue(), fechapre.getText(), (int) cuotas.getValue(), 1, new ArrayList<>());
                System.out.println(n);
                clientes.put(n.getNombre(), n);
                principio.setEnabled(true);
                principio.setVisible(true);
                actua.setEnabled(false);
                actua.setVisible(false);
                gestion.setEnabled(false);
                historiacli.setEnabled(false);
                cartera.setValue((int) cartera.getValue() + (int) (((int) valor.getValue())*1.2));
                prestado.setValue((int) prestado.getValue() + (int) valor.getValue());
                prestadototal.setValue((int) prestadototal.getValue() + (int) valor.getValue());
                guardado();   
            }else{
                JOptionPane.showMessageDialog(this, "Ingrese un valor para el prestamo");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un nombre al cliente");
        }
    }//GEN-LAST:event_reeinActionPerformed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        clientes.get(select).setNumpago(clientes.get(select).getNumpago()+1);
        principio.setEnabled(true);
        principio.setVisible(true);
        actua.setEnabled(false);
        actua.setVisible(false);
        clienteslist.setListData(UI.nombreClientes(clientes));
        gestion.setEnabled(false);
        historiacli.setEnabled(false);
        cartera.setValue((int) cartera.getValue() - Integer.parseInt(vacuo.getText()));
        recibido.setValue((int) recibido.getValue() + Integer.parseInt(vacuo.getText()));
        if(clientes.get(select).getCuotas() == clientes.get(select).getNumpago()-1){
            clientes.get(select).reset();
        }
        
        guardado();
    }//GEN-LAST:event_pagoActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        if((int) valor.getValue() != 0){
            clientes.get(select).setNumpago(1);
            clientes.get(select).setCuotas((int) cuotas.getValue());
            clientes.get(select).setValor((int) valor.getValue());
            clientes.get(select).setFecha(fechapre.getText());
            clientes.get(select).setEstado(true);
            principio.setEnabled(true);
            principio.setVisible(true);
            actua.setEnabled(false);
            actua.setVisible(false);
            clienteslist.setListData(UI.nombreClientes(clientes));
            gestion.setEnabled(false);
            historiacli.setEnabled(false);
            cartera.setValue((int) cartera.getValue() + (int) (((int) valor.getValue())*1.2));
            prestado.setValue((int) prestado.getValue() + (int) valor.getValue());
            prestadototal.setValue((int) prestadototal.getValue() + (int) valor.getValue());
            guardado();
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un valor para el prestamo");
        }
    }//GEN-LAST:event_iniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        principio.setEnabled(true);
        principio.setVisible(true);
        actua.setEnabled(false);
        actua.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void historiacliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiacliActionPerformed
        select = clienteslist.getSelectedValue();
        DefaultTableModel modelo = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                            return false;
                    }
            };
        modelo.addColumn("Valor");
        modelo.addColumn("Fecha");
        for (AbstractMap.SimpleEntry i : clientes.get(select).getHistorial()){
            Object[] a = new Object[2];
            a[0] = i.getKey();
            String b = (String) i.getValue();
            a[1] = String.valueOf(b);
            modelo.addRow(a);
        }
        tabla.setModel(modelo);
        tabla.setVisible(true);
        principio.setEnabled(false);
        principio.setVisible(false);
        historia.setEnabled(true);
        historia.setVisible(true);
        titulo.setText(select.toUpperCase());
    }//GEN-LAST:event_historiacliActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        principio.setEnabled(true);
        principio.setVisible(true);
        historia.setEnabled(false);
        historia.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        JFileChooser seleccionador = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Registros", "csv");
        seleccionador.setFileFilter(filtro);
        seleccionador.setDialogTitle("Abrir Registro");
        seleccionador.showOpenDialog(seleccionador);
        String archivo = seleccionador.getSelectedFile().getAbsolutePath();
        String nombreR = seleccionador.getSelectedFile().getName();
        try {
            Registro r = UI.cargarRegistro(archivo);
            File fichero = new File(archivo);
            fichero.delete();
            UI.guardarRegistro(r, name+".csv");
            registro = UI.cargarRegistro(name+".csv");
            registros.replace(name, registro);
            entrada();
            guardado();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        name = JOptionPane.showInputDialog("Asigne un nombre");
        while("".equals(name)){
            name = JOptionPane.showInputDialog("Asigne un nombre");
        }
        ArrayList<String> datos = new ArrayList<>();
        datos.add(pass);
        if(!registros.isEmpty()){
            datos.addAll(registros.keySet());
        }
        datos.add(name);
        UI.guardarDatos(datos);
        registro = UI.cargarRegistro(name+".csv");
        entrada();
    }//GEN-LAST:event_agregarActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        name = (String) perfiles.getSelectedItem();
        if(!name.equals("Administrador")){
            registro = registros.get(name);
        }else{
            registro = new Registro(new ArrayList<>(registros.values()));
            cargar.setEnabled(false);
            cargar.setVisible(false);
        }
        entrada();
    }//GEN-LAST:event_entrarActionPerformed

    private void guardado(){
        registro.setClientes(new ArrayList<>(clientes.values()));
        registro.setCartera((int) cartera.getValue());
        registro.setPrestado((int) prestado.getValue());
        registro.setRecibido((int) recibido.getValue());
        select = UI.guardarRegistro(registro, name+".csv");
        clienteslist.setListData(UI.nombreClientes(clientes));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JPanel actua;
    private javax.swing.JButton agregar;
    private javax.swing.JButton atras;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JButton cargar;
    private javax.swing.JSpinner cartera;
    private javax.swing.JList<String> clienteslist;
    private javax.swing.JTextField cuopa;
    private javax.swing.JSpinner cuotas;
    private javax.swing.JButton entrar;
    private javax.swing.JTextField fechapa;
    private javax.swing.JTextField fechapre;
    private javax.swing.JButton gestion;
    private javax.swing.JButton guardarAgenda;
    private javax.swing.JPanel historia;
    private javax.swing.JButton historiacli;
    private javax.swing.JButton iniciar;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton pago;
    private javax.swing.JComboBox<String> perfiles;
    private javax.swing.JSpinner prestado;
    private javax.swing.JSpinner prestadototal;
    private javax.swing.JPanel principio;
    private javax.swing.JSpinner recibido;
    private javax.swing.JButton reein;
    private javax.swing.JTextField saldo;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField vacuo;
    private javax.swing.JSpinner valor;
    // End of variables declaration//GEN-END:variables
}

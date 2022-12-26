/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author End_You
 */
public class VentanaPrincipal extends javax.swing.JFrame{

    /**
     * Creates new form VistaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);//Centramos el formulario
        setResizable(false);
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }
   
    
    public JPanel getPanelFinJuego() {
        return panelFinJuego;
    }

    public JLabel getLblAverageE1() {
        return lblAverageE1;
    }

    public JLabel getLblAverageE2() {
        return lblAverageE2;
    }

    public JLabel getLblCarrerasTotalesE1() {
        return lblCarrerasTotalesE1;
    }

    public JLabel getLblCarrerasTotalesE2() {
        return lblCarrerasTotalesE2;
    }

    public JLabel getLblDobleE2() {
        return lblDobleE2;
    }

    public JLabel getLblDoblesE1() {
        return lblDoblesE1;
    }

    public JLabel getLblErroresE1() {
        return lblErroresE1;
    }

    public JLabel getLblErroresE2() {
        return lblErroresE2;
    }

    public JLabel getLblHitsE1() {
        return lblHitsE1;
    }

    public JLabel getLblHitsE2() {
        return lblHitsE2;
    }

    public JLabel getLblHomerunE1() {
        return lblHomerunE1;
    }

    public JLabel getLblHomerunE2() {
        return lblHomerunE2;
    }

    public JLabel getLblTripleE2() {
        return lblTripleE2;
    }

    public JLabel getLblTriplesE1() {
        return lblTriplesE1;
    }

    
    
    public JButton getAlineacion() {
        return alineacion;
    }

    public JLabel getImagenPrincipal() {
        return imagenPrincipal;
    }

    public JLabel getjLabel3() {
        return menu;
    }

    public JPanel getjPanel1() {
        return panelPrincipal;
    }

    public JLabel getLblAverage() {
        return lblAverage;
    }

    public JLabel getLblBateador() {
        return lblBateador;
    }

    public JLabel getLblBolas() {
        return lblBolas;
    }

    public JLabel getLblCarreraE1() {
        return lblCarreraE1;
    }

    public JLabel getLblCarreraE2() {
        return lblCarreraE2;
    }

    public JLabel getLblFuerza() {
        return lblFuerza;
    }

    public JLabel getLblIning() {
        return lblIning;
    }

    public JLabel getLblOuts() {
        return lblOuts;
    }

    public JLabel getLblPosicion() {
        return lblPosicion;
    }

    public JLabel getLblStrikes() {
        return lblStrikes;
    }

    public JLabel getLblplantillaBateador() {
        return lblplantillaBateador;
    }

    public JLabel getLblplantillaMarcador() {
        return lblplantillaMarcador;
    }

    public JLabel getPitcherE1() {
        return pitcherE1;
    }

    public JLabel getPitcherE2() {
        return pitcherE2;
    }

    public JLabel getPrimeraBE1() {
        return primeraBE1;
    }

    public JLabel getPrimeraBE2() {
        return primeraBE2;
    }

    public JButton getRealizarJugada() {
        return realizarJugada;
    }

    public JButton getSalir() {
        return salir;
    }

    public JLabel getSegundaBE1() {
        return segundaBE1;
    }

    public JLabel getSegundaBE2() {
        return segundaBE2;
    }

    public JLabel getTerceraBE1() {
        return terceraBE1;
    }

    public JLabel getTerceraBE2() {
        return terceraBE2;
    }

    public JTextField getTxtPizarra() {
        return txtPizarra;
    }

    public void setTxtPizarra(JTextField txtPizarra) {
        this.txtPizarra = txtPizarra;
    }

    public JLabel getFinalIning() {
        return FinalIning;
    }

    public JLabel getPrincipioIning() {
        return PrincipioIning;
    }

    public JLabel getLblLanzamientosPitcher() {
        return lblLanzamientosPitcher;
    }

    public JLabel getLblNombrePitcher() {
        return lblNombrePitcher;
    }

   

    



    


    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFinJuego = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblCarrerasTotalesE1 = new javax.swing.JLabel();
        lblCarrerasTotalesE2 = new javax.swing.JLabel();
        lblHitsE2 = new javax.swing.JLabel();
        lblHitsE1 = new javax.swing.JLabel();
        lblDoblesE1 = new javax.swing.JLabel();
        lblDobleE2 = new javax.swing.JLabel();
        lblTripleE2 = new javax.swing.JLabel();
        lblTriplesE1 = new javax.swing.JLabel();
        lblHomerunE1 = new javax.swing.JLabel();
        lblHomerunE2 = new javax.swing.JLabel();
        lblErroresE2 = new javax.swing.JLabel();
        lblErroresE1 = new javax.swing.JLabel();
        lblAverageE1 = new javax.swing.JLabel();
        lblAverageE2 = new javax.swing.JLabel();
        fondoAlineacion1 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        FinalIning = new javax.swing.JLabel();
        PrincipioIning = new javax.swing.JLabel();
        realizarJugada = new javax.swing.JButton();
        alineacion = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        txtPizarra = new javax.swing.JTextField();
        primeraBE1 = new javax.swing.JLabel();
        segundaBE1 = new javax.swing.JLabel();
        terceraBE1 = new javax.swing.JLabel();
        pitcherE1 = new javax.swing.JLabel();
        primeraBE2 = new javax.swing.JLabel();
        segundaBE2 = new javax.swing.JLabel();
        terceraBE2 = new javax.swing.JLabel();
        pitcherE2 = new javax.swing.JLabel();
        lblCarreraE1 = new javax.swing.JLabel();
        lblCarreraE2 = new javax.swing.JLabel();
        lblBolas = new javax.swing.JLabel();
        lblStrikes = new javax.swing.JLabel();
        lblOuts = new javax.swing.JLabel();
        lblIning = new javax.swing.JLabel();
        lblBateador = new javax.swing.JLabel();
        lblAverage = new javax.swing.JLabel();
        lblPosicion = new javax.swing.JLabel();
        lblFuerza = new javax.swing.JLabel();
        lblplantillaBateador = new javax.swing.JLabel();
        lblplantillaMarcador = new javax.swing.JLabel();
        lblLanzamientosPitcher = new javax.swing.JLabel();
        lblNombrePitcher = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagenPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));

        panelFinJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(226, 156, 0));
        jButton1.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar");
        jButton1.setBorder(null);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelFinJuego.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 130, 40));

        lblCarrerasTotalesE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblCarrerasTotalesE1.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrerasTotalesE1.setText("0");
        panelFinJuego.add(lblCarrerasTotalesE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 40, 30));

        lblCarrerasTotalesE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblCarrerasTotalesE2.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrerasTotalesE2.setText("0");
        panelFinJuego.add(lblCarrerasTotalesE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 40, 30));

        lblHitsE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblHitsE2.setForeground(new java.awt.Color(255, 255, 255));
        lblHitsE2.setText("0");
        panelFinJuego.add(lblHitsE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 30, 30));

        lblHitsE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblHitsE1.setForeground(new java.awt.Color(255, 255, 255));
        lblHitsE1.setText("0");
        panelFinJuego.add(lblHitsE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 30));

        lblDoblesE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblDoblesE1.setForeground(new java.awt.Color(255, 255, 255));
        lblDoblesE1.setText("0");
        panelFinJuego.add(lblDoblesE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 30, 30));

        lblDobleE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblDobleE2.setForeground(new java.awt.Color(255, 255, 255));
        lblDobleE2.setText("0");
        panelFinJuego.add(lblDobleE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 30, 30));

        lblTripleE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblTripleE2.setForeground(new java.awt.Color(255, 255, 255));
        lblTripleE2.setText("0");
        panelFinJuego.add(lblTripleE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 30, 30));

        lblTriplesE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblTriplesE1.setForeground(new java.awt.Color(255, 255, 255));
        lblTriplesE1.setText("0");
        panelFinJuego.add(lblTriplesE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 30, 30));

        lblHomerunE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblHomerunE1.setForeground(new java.awt.Color(255, 255, 255));
        lblHomerunE1.setText("0");
        panelFinJuego.add(lblHomerunE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 40, 30));

        lblHomerunE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblHomerunE2.setForeground(new java.awt.Color(255, 255, 255));
        lblHomerunE2.setText("0");
        panelFinJuego.add(lblHomerunE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 30, 30));

        lblErroresE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblErroresE2.setForeground(new java.awt.Color(255, 255, 255));
        lblErroresE2.setText("0");
        panelFinJuego.add(lblErroresE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 30, 30));

        lblErroresE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblErroresE1.setForeground(new java.awt.Color(255, 255, 255));
        lblErroresE1.setText("0");
        panelFinJuego.add(lblErroresE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 30, 30));

        lblAverageE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblAverageE1.setForeground(new java.awt.Color(255, 255, 255));
        lblAverageE1.setText("0");
        panelFinJuego.add(lblAverageE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 30, 30));

        lblAverageE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblAverageE2.setForeground(new java.awt.Color(255, 255, 255));
        lblAverageE2.setText("0");
        panelFinJuego.add(lblAverageE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 40, 30));

        fondoAlineacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plantillaFinJuego.png"))); // NOI18N
        panelFinJuego.add(fondoAlineacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("Menu");
        panelPrincipal.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 40));

        FinalIning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IFinal.png"))); // NOI18N
        panelPrincipal.add(FinalIning, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 60, 50));

        PrincipioIning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IPrincipio.png"))); // NOI18N
        panelPrincipal.add(PrincipioIning, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 50, 40));

        realizarJugada.setBackground(new java.awt.Color(226, 156, 0));
        realizarJugada.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        realizarJugada.setForeground(new java.awt.Color(255, 255, 255));
        realizarJugada.setText("Realizar Jugada");
        realizarJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarJugadaActionPerformed(evt);
            }
        });
        panelPrincipal.add(realizarJugada, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 240, 50));

        alineacion.setBackground(new java.awt.Color(226, 156, 0));
        alineacion.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        alineacion.setForeground(new java.awt.Color(255, 255, 255));
        alineacion.setText("Alineacion");
        alineacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        alineacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alineacionActionPerformed(evt);
            }
        });
        panelPrincipal.add(alineacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 50));

        salir.setBackground(new java.awt.Color(226, 156, 0));
        salir.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        panelPrincipal.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 50));

        txtPizarra.setEditable(false);
        txtPizarra.setBackground(new java.awt.Color(5, 38, 43));
        txtPizarra.setFont(new java.awt.Font("Machine BT", 0, 48)); // NOI18N
        txtPizarra.setForeground(new java.awt.Color(255, 0, 0));
        txtPizarra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPizarra.setBorder(null);
        txtPizarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPizarraActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtPizarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 310, 80));

        primeraBE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cascoE1.png"))); // NOI18N
        panelPrincipal.add(primeraBE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 90, 80));

        segundaBE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cascoE1.png"))); // NOI18N
        panelPrincipal.add(segundaBE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 90, 80));

        terceraBE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cascoE1.png"))); // NOI18N
        panelPrincipal.add(terceraBE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 90, 80));

        pitcherE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gorraE1.png"))); // NOI18N
        panelPrincipal.add(pitcherE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 110, 90));

        primeraBE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cascoE2.png"))); // NOI18N
        panelPrincipal.add(primeraBE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 100, 90));

        segundaBE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cascoE2.png"))); // NOI18N
        panelPrincipal.add(segundaBE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 100, 90));

        terceraBE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cascoE2.png"))); // NOI18N
        panelPrincipal.add(terceraBE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 100, 90));

        pitcherE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gorraE2.png"))); // NOI18N
        panelPrincipal.add(pitcherE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 110, 90));

        lblCarreraE1.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblCarreraE1.setForeground(new java.awt.Color(255, 255, 255));
        lblCarreraE1.setText("0");
        panelPrincipal.add(lblCarreraE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 30, 20));

        lblCarreraE2.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblCarreraE2.setForeground(new java.awt.Color(255, 255, 255));
        lblCarreraE2.setText("0");
        panelPrincipal.add(lblCarreraE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 30, 20));

        lblBolas.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblBolas.setForeground(new java.awt.Color(255, 255, 255));
        lblBolas.setText("0");
        panelPrincipal.add(lblBolas, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, -1, 20));

        lblStrikes.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblStrikes.setForeground(new java.awt.Color(255, 255, 255));
        lblStrikes.setText("0");
        panelPrincipal.add(lblStrikes, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 142, -1, 30));

        lblOuts.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblOuts.setForeground(new java.awt.Color(255, 255, 255));
        lblOuts.setText("0");
        panelPrincipal.add(lblOuts, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 176, -1, 20));

        lblIning.setFont(new java.awt.Font("Machine BT", 0, 18)); // NOI18N
        lblIning.setForeground(new java.awt.Color(255, 255, 255));
        lblIning.setText("1");
        panelPrincipal.add(lblIning, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

        lblBateador.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        lblBateador.setForeground(new java.awt.Color(255, 255, 255));
        lblBateador.setText("Juan");
        panelPrincipal.add(lblBateador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 90, 30));

        lblAverage.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        lblAverage.setForeground(new java.awt.Color(255, 255, 255));
        lblAverage.setText("2.19");
        panelPrincipal.add(lblAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 90, 30));

        lblPosicion.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        lblPosicion.setForeground(new java.awt.Color(255, 255, 255));
        lblPosicion.setText("2B");
        panelPrincipal.add(lblPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 90, 20));

        lblFuerza.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        lblFuerza.setForeground(new java.awt.Color(255, 255, 255));
        lblFuerza.setText("4-5");
        panelPrincipal.add(lblFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 90, 30));

        lblplantillaBateador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plantillaPrincipalBateador.png"))); // NOI18N
        lblplantillaBateador.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelPrincipal.add(lblplantillaBateador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 120));

        lblplantillaMarcador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plantillaPrincipal Marcador.png"))); // NOI18N
        lblplantillaMarcador.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelPrincipal.add(lblplantillaMarcador, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 200, 200));

        lblLanzamientosPitcher.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        lblLanzamientosPitcher.setForeground(new java.awt.Color(255, 255, 255));
        lblLanzamientosPitcher.setText("0");
        panelPrincipal.add(lblLanzamientosPitcher, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 633, 60, 30));

        lblNombrePitcher.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        lblNombrePitcher.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePitcher.setText("El purito");
        panelPrincipal.add(lblNombrePitcher, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 603, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plantillaPrincipalPitcher.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 200, 60));

        imagenPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imagePrincipal.png"))); // NOI18N
        imagenPrincipal.setMaximumSize(new java.awt.Dimension(1100, 700));
        imagenPrincipal.setMinimumSize(new java.awt.Dimension(1100, 700));
        imagenPrincipal.setPreferredSize(new java.awt.Dimension(1100, 700));
        panelPrincipal.add(imagenPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1100, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelFinJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelFinJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alineacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alineacionActionPerformed
        Controller.PrincipalController.eventoBotonAlineacion();
    }//GEN-LAST:event_alineacionActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Controller.PrincipalController.eventoBotonSalirPartido();
        //getTxtPizarra().setText("ok");
    }//GEN-LAST:event_salirActionPerformed

    private void realizarJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarJugadaActionPerformed
        Controller.PrincipalController.eventoBotonEmpezarPartida();
    }//GEN-LAST:event_realizarJugadaActionPerformed

    private void txtPizarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPizarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPizarraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controller.PrincipalController.eventoBotonContinuar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FinalIning;
    private javax.swing.JLabel PrincipioIning;
    private javax.swing.JButton alineacion;
    private javax.swing.JLabel fondoAlineacion1;
    private javax.swing.JLabel imagenPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAverage;
    private javax.swing.JLabel lblAverageE1;
    private javax.swing.JLabel lblAverageE2;
    private javax.swing.JLabel lblBateador;
    private javax.swing.JLabel lblBolas;
    private javax.swing.JLabel lblCarreraE1;
    private javax.swing.JLabel lblCarreraE2;
    private javax.swing.JLabel lblCarrerasTotalesE1;
    private javax.swing.JLabel lblCarrerasTotalesE2;
    private javax.swing.JLabel lblDobleE2;
    private javax.swing.JLabel lblDoblesE1;
    private javax.swing.JLabel lblErroresE1;
    private javax.swing.JLabel lblErroresE2;
    private javax.swing.JLabel lblFuerza;
    private javax.swing.JLabel lblHitsE1;
    private javax.swing.JLabel lblHitsE2;
    private javax.swing.JLabel lblHomerunE1;
    private javax.swing.JLabel lblHomerunE2;
    private javax.swing.JLabel lblIning;
    private javax.swing.JLabel lblLanzamientosPitcher;
    private javax.swing.JLabel lblNombrePitcher;
    private javax.swing.JLabel lblOuts;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblStrikes;
    private javax.swing.JLabel lblTripleE2;
    private javax.swing.JLabel lblTriplesE1;
    private javax.swing.JLabel lblplantillaBateador;
    private javax.swing.JLabel lblplantillaMarcador;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel panelFinJuego;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel pitcherE1;
    private javax.swing.JLabel pitcherE2;
    private javax.swing.JLabel primeraBE1;
    private javax.swing.JLabel primeraBE2;
    private javax.swing.JButton realizarJugada;
    private javax.swing.JButton salir;
    private javax.swing.JLabel segundaBE1;
    private javax.swing.JLabel segundaBE2;
    private javax.swing.JLabel terceraBE1;
    private javax.swing.JLabel terceraBE2;
    private javax.swing.JTextField txtPizarra;
    // End of variables declaration//GEN-END:variables

   
   
}
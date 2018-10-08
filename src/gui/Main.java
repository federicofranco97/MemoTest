
package gui;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        agregarTodosBotones();
        bloquearTodos();
        crearVariables();
        agregarLabels();
        asignarVariables();
        clicks=0;
        setLocationRelativeTo(null);
        puntos=0;
        vidas=10;
        
    }

    //VARIABLES
    JButton [] botones = new JButton[16]; //lista de botones para poder manipularlos a todos juntos
    ArrayList <JLabel> labels = new ArrayList <JLabel> ();//array de labels para poder manipularlos todos juntos
    String [] variables = new String [8];
    static int clicks;
    static int puntos;
    ArrayList<JButton>comparar = new ArrayList<JButton> ();
    static int vidas;
    //VARIABLES
    
    //FUNCIONES
    //++++++++BOTONES+++++++++++++
    public void agregarTodosBotones(){
        botones[0]=btn1;
        botones[1]=btn2;
        botones[2]=btn3;
        botones[3]=btn4;
        botones[4]=btn5;
        botones[5]=btn6;
        botones[6]=btn7;
        botones[7]=btn8;
        botones[8]=btn9;
        botones[9]=btn10;
        botones[10]=btn11;
        botones[11]=btn12;
        botones[12]=btn13;
        botones[13]=btn14;
        botones[14]=btn15;
        botones[15]=btn16;
    }//Fin agregar todos los botones
    
    public void bloquearTodos(){
        for(int i=0 ; i< botones.length;i++){
            botones[i].setEnabled(false);
        }
    }//fin bloqueo todos
    
    public void habilitarTodos(){
        for(int i = 0; i<botones.length;i++){
            botones[i].setEnabled(true);
        }
    }
    
    
    public void delay(){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> checkClicks();
        service.schedule(task1, 500 ,  TimeUnit.MILLISECONDS);
    }
    
   
    
    public void checkGanar(){
        if(puntos==8){
            this.setVisible(false);
            Ganaste ganaste = new Ganaste();
            ganaste.setVisible(true);
        }
    }
    
    public void checkVidas(){
        if(vidas==0){
            this.setVisible(false);
            Perdiste perdiste = new Perdiste();
            perdiste.setVisible(true);
        }
    }
    
    public void checkClicks(){
        
        if(clicks==2){
            //tiro un delay para que el usuario pueda ver los valores que eligio
            
            //si clikeo dos veces significa que selecciono un par de botones
            //entonces comparo los contenidos de los botones para ver si son iguales
            //si son iguales, permanecen bloqueados e incrementa los puntos en 1
            String valor1 = comparar.get(0).getText();
            String valor2 = comparar.get(1).getText();
            
            if (valor1.equals(valor2)){
                puntos++;
                jTextField1.setText(String.valueOf(puntos));
                System.out.println("entra");
            }else{
                
                //si son distintos, habilita los 2 botones de nuevo y setea
                //el texto vacio para volver a ser usados      
                comparar.get(0).setEnabled(true);
                comparar.get(0).setText("");
                comparar.get(1).setEnabled(true);
                comparar.get(1).setText("");
                vidas--;
                jTextField2.setText(String.valueOf(vidas));
            }
          
            comparar.remove(1);
            comparar.remove(0);
            clicks=0;
        }
        checkGanar();
        checkVidas();
        
        
    }//fin check clicks
    //++++++++BOTONES+++++++++++++
    
    //-------------LABELS------------------
    public void agregarLabels(){
        labels.add(lbl1);
        labels.add(lbl2);
        labels.add(lbl3);
        labels.add(lbl4);
        labels.add(lbl5);
        labels.add(lbl6);
        labels.add(lbl7);
        labels.add(lbl8);
        labels.add(lbl9);
        labels.add(lbl10);
        labels.add(lbl11);
        labels.add(lbl12);
        labels.add(lbl13);
        labels.add(lbl14);
        labels.add(lbl15);
        labels.add(lbl16);
    }
    
    public void crearVariables(){
        variables[0]="PATO";
        variables[1]="RATA";
        variables[2]="PERRO";
        variables[3]="PALOMA";
        variables[4]="PEZ";
        variables[5]="RATON";
        variables[6]="GATO";
        variables[7]="TUCAN";
        
    }
    
    public void asignarVariables(){
        for(int i = 0 ; i<variables.length;i++){
            int num1 = (int) (Math.random()* labels.size());
            labels.get(num1).setText(variables[i]);
            labels.remove(num1);
            int num2 = (int) (Math.random()* labels.size());
            labels.get(num2).setText(variables[i]);
            labels.remove(num2);
            
        }
    }
    
    
    //-------------LABELS------------------
    //FUNCIONES
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        lbl1.setText("jLabel2");

        lbl2.setText("jLabel3");

        lbl3.setText("jLabel4");

        lbl4.setText("jLabel5");

        lbl5.setText("jLabel2");

        lbl6.setText("jLabel3");

        lbl7.setText("jLabel4");

        lbl8.setText("jLabel5");

        lbl9.setText("jLabel2");

        lbl10.setText("jLabel3");

        lbl11.setText("jLabel4");

        lbl12.setText("jLabel5");

        lbl13.setText("jLabel2");

        lbl14.setText("jLabel3");

        lbl15.setText("jLabel4");

        lbl16.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(487, 446));
        getContentPane().setLayout(null);

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(80, 130, 77, 32);
        btn1.getAccessibleContext().setAccessibleName("");

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(160, 130, 77, 32);

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(240, 130, 77, 32);

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(320, 130, 77, 32);

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(80, 170, 77, 32);

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(160, 170, 77, 32);

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(240, 170, 77, 32);

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(320, 170, 77, 32);

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(80, 210, 77, 32);

        btn10.setBackground(new java.awt.Color(255, 255, 255));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10);
        btn10.setBounds(160, 210, 77, 32);

        btn11.setBackground(new java.awt.Color(255, 255, 255));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11);
        btn11.setBounds(240, 210, 77, 32);

        btn12.setBackground(new java.awt.Color(255, 255, 255));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12);
        btn12.setBounds(320, 210, 77, 32);

        btn13.setBackground(new java.awt.Color(255, 255, 255));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13);
        btn13.setBounds(80, 250, 77, 32);

        btn14.setBackground(new java.awt.Color(255, 255, 255));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14);
        btn14.setBounds(160, 250, 77, 32);

        btn15.setBackground(new java.awt.Color(255, 255, 255));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15);
        btn15.setBounds(240, 250, 77, 32);

        btn16.setBackground(new java.awt.Color(255, 255, 255));
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16);
        btn16.setBounds(320, 250, 77, 32);

        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 340, 77, 32);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 340, 56, 32);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Puntaje :");
        jButton3.setEnabled(false);
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 30, 110, 40);

        jTextField1.setText("0");
        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 30, 50, 40);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setEnabled(false);
        jButton4.setText("Vidas:");
        jButton3.setEnabled(false);
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 30, 110, 40);

        jTextField2.setText("10");
        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(340, 30, 50, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondinho.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 490, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       btn1.setText(lbl1.getText());
       clicks++;
       btn1.setEnabled(false);
       comparar.add(btn1);
       delay();
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Instrucciones:\n Clickea dos fichas\n Si son iguales sumas puntos\n Si son distintas perdes una vida.");
        habilitarTodos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(lbl2.getText());
        clicks++;
        btn2.setEnabled(false);
        comparar.add(btn2);
        delay();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(lbl3.getText());
        clicks++;
        btn3.setEnabled(false);
        comparar.add(btn3);
        delay();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(lbl4.getText());
        clicks++;
        btn4.setEnabled(false);
        comparar.add(btn4);
        delay();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(lbl5.getText());
        clicks++;
        btn5.setEnabled(false);
        comparar.add(btn5);
        delay();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(lbl6.getText());
        clicks++;
        btn6.setEnabled(false);
        comparar.add(btn6);
        delay();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(lbl7.getText());
        clicks++;
        btn7.setEnabled(false);
        comparar.add(btn7);
        delay();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(lbl8.getText());
        clicks++;
        btn8.setEnabled(false);
        comparar.add(btn8);
        delay();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(lbl9.getText());
        clicks++;
        btn9.setEnabled(false);
        comparar.add(btn9);
        delay();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        btn10.setText(lbl10.getText());
        clicks++;
        btn10.setEnabled(false);
        comparar.add(btn10);
        delay();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        btn11.setText(lbl11.getText());
        clicks++;
        btn11.setEnabled(false);
        comparar.add(btn11);
        delay();
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        btn12.setText(lbl12.getText());
        clicks++;
        btn12.setEnabled(false);
        comparar.add(btn12);
        delay();
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        btn13.setText(lbl13.getText());
        clicks++;
        btn13.setEnabled(false);
        comparar.add(btn13);
        delay();
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        btn14.setText(lbl14.getText());
        clicks++;
        btn14.setEnabled(false);
        comparar.add(btn14);
        delay();
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        btn15.setText(lbl15.getText());
        clicks++;
        btn15.setEnabled(false);
        comparar.add(btn15);
        delay();
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        btn16.setText(lbl16.getText());
        clicks++;
        btn16.setEnabled(false);
        comparar.add(btn16);
        delay();
    }//GEN-LAST:event_btn16ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    // End of variables declaration//GEN-END:variables
}

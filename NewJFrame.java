package Main;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    // Tạo Frame
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        soThuNhat = new javax.swing.JTextField();
        soThuHai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cong = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        ketQua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        darkMode = new javax.swing.JButton();

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("🙂");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Two Numbers Calculator");
        setResizable(false);

        soThuNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soThuNhatActionPerformed(evt);
            }
        });

        soThuHai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soThuHaiActionPerformed(evt);
            }
        });

        jLabel1.setText("a =");

        jLabel2.setText("b =");

        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });

        nhan.setText("x");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });

        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });

        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });

        ketQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketQuaActionPerformed(evt);
            }
        });

        jLabel3.setText("Kết quả =");

        darkMode.setText("Dark Mode");
        darkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ketQua, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(soThuHai, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(soThuNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(cong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tru, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(darkMode)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soThuNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soThuHai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ketQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cong)
                    .addComponent(tru)
                    .addComponent(nhan)
                    .addComponent(chia))
                .addGap(40, 40, 40)
                .addComponent(darkMode)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    // Xử lý khi nhấn nút
    private void soThuNhatActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void soThuHaiActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        

    private void congActionPerformed(java.awt.event.ActionEvent evt) {                                     
        calculate('+');
    }                                    

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {                                     
        calculate('*');
    }                                    

    private void truActionPerformed(java.awt.event.ActionEvent evt) {                                    
        calculate('-');
    }                                   

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        calculate('/');
    }                                    

    private void ketQuaActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    // Nút đổi màu background
    private void darkModeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Color darkBackground = new Color(45, 45, 45);
        Color darkForeground = new Color(200, 200, 200);
        Color lightBackground = new Color(255, 255, 255);
        Color lightForeground = new Color(0, 0, 0);

        // Check current mode and toggle
        if (jPanel1.getBackground().equals(darkBackground)) {
            // Switch to Light Mode
            jPanel1.setBackground(lightBackground);
            soThuNhat.setBackground(lightBackground);
            soThuNhat.setForeground(lightForeground);
            soThuHai.setBackground(lightBackground);
            soThuHai.setForeground(lightForeground);
            ketQua.setBackground(lightBackground);
            ketQua.setForeground(lightForeground);

            jLabel1.setForeground(lightForeground);
            jLabel2.setForeground(lightForeground);
            jLabel3.setForeground(lightForeground);

            cong.setBackground(lightBackground);
            cong.setForeground(lightForeground);
            nhan.setBackground(lightBackground);
            nhan.setForeground(lightForeground);
            tru.setBackground(lightBackground);
            tru.setForeground(lightForeground);
            chia.setBackground(lightBackground);
            chia.setForeground(lightForeground);

            // Change button text
            ((JButton) evt.getSource()).setText("Dark Mode");
        } else {
            // Switch to Dark Mode
            jPanel1.setBackground(darkBackground);
            soThuNhat.setBackground(darkBackground);
            soThuNhat.setForeground(darkForeground);
            soThuHai.setBackground(darkBackground);
            soThuHai.setForeground(darkForeground);
            ketQua.setBackground(darkBackground);
            ketQua.setForeground(darkForeground);

            jLabel1.setForeground(darkForeground);
            jLabel2.setForeground(darkForeground);
            jLabel3.setForeground(darkForeground);

            cong.setBackground(darkBackground);
            cong.setForeground(darkForeground);
            nhan.setBackground(darkBackground);
            nhan.setForeground(darkForeground);
            tru.setBackground(darkBackground);
            tru.setForeground(darkForeground);
            chia.setBackground(darkBackground);
            chia.setForeground(darkForeground);

            // Change button text
            ((JButton) evt.getSource()).setText("Light Mode");
        }

    }                                        

    // Hàm xử lý phép tính
    private void calculate(char operation) {
        
    }

    // Hàm Main để chạy code
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton chia;
    private javax.swing.JButton cong;
    private javax.swing.JButton darkMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ketQua;
    private javax.swing.JButton nhan;
    private javax.swing.JTextField soThuHai;
    private javax.swing.JTextField soThuNhat;
    private javax.swing.JButton tru;
    // End of variables declaration                   
}
package Main;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    // Tạo Frame
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        soThuNhat = new javax.swing.JTextField();
        soThuHai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cong = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        ketQua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        darkMode = new javax.swing.JButton();

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText(":)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Two Numbers Calculator");
        setResizable(false);

        soThuNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soThuNhatActionPerformed(evt);
            }
        });

        soThuHai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soThuHaiActionPerformed(evt);
            }
        });

        jLabel1.setText("a =");

        jLabel2.setText("b =");

        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });

        nhan.setText("x");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });

        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });

        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });

        ketQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketQuaActionPerformed(evt);
            }
        });

        jLabel3.setText("Kết quả =");

        darkMode.setText("Dark Mode");
        darkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ketQua, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(soThuHai, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(soThuNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(cong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tru, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(darkMode)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soThuNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soThuHai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ketQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cong)
                    .addComponent(tru)
                    .addComponent(nhan)
                    .addComponent(chia))
                .addGap(40, 40, 40)
                .addComponent(darkMode)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    // Xử lý khi nhấn nút
    private void soThuNhatActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void soThuHaiActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        

    private void congActionPerformed(java.awt.event.ActionEvent evt) {                                     
        calculate('+');
    }                                    

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {                                     
        calculate('*');
    }                                    

    private void truActionPerformed(java.awt.event.ActionEvent evt) {                                    
        calculate('-');
    }                                   

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        calculate('/');
    }                                    

    private void ketQuaActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    // Nút đổi màu background
    private void darkModeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
    }                                        

    // Hàm xử lý phép tính
    private void calculate(char operation) {
        try {
            double a = Double.parseDouble(soThuNhat.getText());
            double b = Double.parseDouble(soThuHai.getText());
            double result = 0;

            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        JOptionPane.showMessageDialog(this, "Error", "Cannot devide by 0", JOptionPane.ERROR_MESSAGE); // Thông báo lỗi không thể chia cho 0
                        return;
                    }
                    result = a / b;
                    break;
            }

            ketQua.setText(String.valueOf(result)); // In kết quả ra trường KetQua
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error", "Please enter numbers only", JOptionPane.ERROR_MESSAGE); // Thông báo lỗi khi nhập ký tự không phải số
        }
    }

    // Hàm Main để chạy code
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton chia;
    private javax.swing.JButton cong;
    private javax.swing.JButton darkMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ketQua;
    private javax.swing.JButton nhan;
    private javax.swing.JTextField soThuHai;
    private javax.swing.JTextField soThuNhat;
    private javax.swing.JButton tru;
    // End of variables declaration                   
}


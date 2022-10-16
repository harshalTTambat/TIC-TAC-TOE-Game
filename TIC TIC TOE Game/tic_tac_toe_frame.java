
import static java.awt.Color.blue;
import static java.awt.Color.gray;
import static java.awt.Color.orange;
import static java.awt.Color.pink;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.color.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Harshal
 */
public class tic_tac_toe_frame extends javax.swing.JFrame {

    /**
     * Creates new form tic_tac_toe_frame
     */
    private String turn = "X";
    private static int xCount=0;
    private static int oCount=0;
    
    public tic_tac_toe_frame() {
        initComponents();
    }
    
    public void choosePlayer()
    {
        if (turn.equalsIgnoreCase("X"))
        {
            turn = "O";
        }
        else
        {
            turn = "X";
        }
    }
    public void setScores()
    {
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
    }
    
    public void chooseWinner()
    {
        String b1 = textB1.getText();
        String b2 = textB2.getText();
        String b3 = textB3.getText();
        
        String b4 = textB4.getText();
        String b5 = textB5.getText();
        String b6 = textB6.getText();
        
        String b7 = textB7.getText();
        String b8 = textB8.getText();
        String b9 = textB9.getText();
        
        // X win occorance
        
        if (b1 == "X" && b2 == "X" && b3 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB1.setBackground(red);
            textB2.setBackground(red);
            textB3.setBackground(red);
        }
        
        else if (b4 == "X" && b5 == "X" && b6 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB4.setBackground(red);
            textB5.setBackground(red);
            textB6.setBackground(red);
        }
        
        else if (b7 == "X" && b8 == "X" && b9 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB7.setBackground(red);
            textB8.setBackground(red);
            textB9.setBackground(red);
        }
        
        else if (b1 == "X" && b4 == "X" && b7 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB1.setBackground(red);
            textB4.setBackground(red);
            textB7.setBackground(red);
        }
        
        else if (b2 == "X" && b5 == "X" && b8 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB2.setBackground(red);
            textB5.setBackground(red);
            textB8.setBackground(red);
        }
        else if (b3 == "X" && b6 == "X" && b9 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB3.setBackground(red);
            textB6.setBackground(red);
            textB9.setBackground(red);
        }
        else if (b1 == "X" && b5 == "X" && b9 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB1.setBackground(red);
            textB5.setBackground(red);
            textB9.setBackground(red);
        }
        else if (b3 == "X" && b5 == "X" && b7 == "X")
        {
            JOptionPane.showMessageDialog(this, "player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScores();
        
            textB3.setBackground(red);
            textB5.setBackground(red);
            textB7.setBackground(red);
        }
        
        // O occurance win 
        
        else if (b1 == "O" && b2 == "O" && b3 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB1.setBackground(red);
            textB2.setBackground(red);
            textB3.setBackground(red);
        }
        
        else if (b4 == "O" && b5 == "O" && b6 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB4.setBackground(red);
            textB5.setBackground(red);
            textB6.setBackground(red);
        }
        
        else if (b7 == "O" && b8 == "O" && b9 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB7.setBackground(red);
            textB8.setBackground(red);
            textB9.setBackground(red);
        }
        
        else if (b1 == "O" && b4 == "O" && b7 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB1.setBackground(red);
            textB4.setBackground(red);
            textB7.setBackground(red);
        }
        
        else if (b2 == "O" && b5 == "O" && b8 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB2.setBackground(red);
            textB5.setBackground(red);
            textB8.setBackground(red);
        }
        else if (b3 == "O" && b6 == "O" && b9 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB3.setBackground(red);
            textB6.setBackground(red);
            textB9.setBackground(red);
        }
        else if (b1 == "O" && b5 == "O" && b9 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB1.setBackground(red);
            textB5.setBackground(red);
            textB9.setBackground(red);
        }
        else if (b3 == "O" && b5 == "O" && b7 == "O")
        {
            JOptionPane.showMessageDialog(this, "player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScores();
        
            textB3.setBackground(red);
            textB5.setBackground(red);
            textB7.setBackground(red);
        }
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textB2 = new javax.swing.JButton();
        textB1 = new javax.swing.JButton();
        textB4 = new javax.swing.JButton();
        textB3 = new javax.swing.JButton();
        textB6 = new javax.swing.JButton();
        textB5 = new javax.swing.JButton();
        textB7 = new javax.swing.JButton();
        textB9 = new javax.swing.JButton();
        textBExit = new javax.swing.JButton();
        textB8 = new javax.swing.JButton();
        textBReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(51, 0, 51));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 2, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 51));
        jPanel2.setToolTipText("");
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Tic Tac Toe");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("By...Harshal Tambat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );

        textB2.setBackground(new java.awt.Color(102, 102, 102));
        textB2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB2ActionPerformed(evt);
            }
        });

        textB1.setBackground(new java.awt.Color(102, 102, 102));
        textB1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB1ActionPerformed(evt);
            }
        });

        textB4.setBackground(new java.awt.Color(102, 102, 102));
        textB4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB4ActionPerformed(evt);
            }
        });

        textB3.setBackground(new java.awt.Color(102, 102, 102));
        textB3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB3ActionPerformed(evt);
            }
        });

        textB6.setBackground(new java.awt.Color(102, 102, 102));
        textB6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB6ActionPerformed(evt);
            }
        });

        textB5.setBackground(new java.awt.Color(102, 102, 102));
        textB5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB5ActionPerformed(evt);
            }
        });

        textB7.setBackground(new java.awt.Color(102, 102, 102));
        textB7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB7ActionPerformed(evt);
            }
        });

        textB9.setBackground(new java.awt.Color(102, 102, 102));
        textB9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB9ActionPerformed(evt);
            }
        });

        textBExit.setBackground(new java.awt.Color(255, 102, 102));
        textBExit.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        textBExit.setText("EXIT");
        textBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBExitActionPerformed(evt);
            }
        });

        textB8.setBackground(new java.awt.Color(102, 102, 102));
        textB8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textB8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 0)));
        textB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textB8ActionPerformed(evt);
            }
        });

        textBReset.setBackground(new java.awt.Color(0, 204, 255));
        textBReset.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        textBReset.setText("RESET");
        textBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBResetActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10), new java.awt.Color(0, 255, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Player X :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Player O :");

        xScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xScore.setForeground(new java.awt.Color(204, 255, 255));
        xScore.setText("_ _ _");

        oScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        oScore.setForeground(new java.awt.Color(255, 153, 0));
        oScore.setText("_ _ _");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oScore)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textB7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textB8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textB9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textB1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textB2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textB3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textB4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textB5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textB6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textBReset)
                            .addComponent(textBExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textB3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textB2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textB1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textB6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textB5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textB4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textB9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textB8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textB7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(textBReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBExit)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB3ActionPerformed
        // TODO add your handling code here:
         textB3.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB3.setForeground(blue);
        }
        else
        {
            textB3.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB3ActionPerformed

    private void textB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB7ActionPerformed
        // TODO add your handling code here:
         textB7.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB7.setForeground(blue);
        }
        else
        {
            textB7.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB7ActionPerformed

    private void textB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB1ActionPerformed
        // TODO add your handling code here:
        textB1.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB1.setForeground(blue);
        }
        else
        {
            textB1.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB1ActionPerformed

    private void textBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBExitActionPerformed
        JFrame frame = new JFrame("EXIT");
        
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit ?",
                "tic tac toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION )
        {
            System.exit(0);
        }
    }//GEN-LAST:event_textBExitActionPerformed

    private void textB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB5ActionPerformed
        // TODO add your handling code here:
         textB5.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB5.setForeground(blue);
        }
        else
        {
            textB5.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB5ActionPerformed

    private void textB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB4ActionPerformed
        // TODO add your handling code here:
         textB4.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB4.setForeground(blue);
        }
        else
        {
            textB4.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB4ActionPerformed

    private void textB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB9ActionPerformed
        // TODO add your handling code here:
         textB9.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB9.setForeground(blue);
        }
        else
        {
            textB9.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB9ActionPerformed

    private void textB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB2ActionPerformed
        // TODO add your handling code here:
         textB2.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB2.setForeground(blue);
        }
        else
        {
            textB2.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
        
    }//GEN-LAST:event_textB2ActionPerformed

    private void textB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB6ActionPerformed
        // TODO add your handling code here:
         textB6.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB6.setForeground(blue);
        }
        else
        {
            textB6.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB6ActionPerformed

    private void textB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textB8ActionPerformed
        // TODO add your handling code here:
         textB8.setText(turn);
        
        if (turn.equalsIgnoreCase("X"))
        {
            textB8.setForeground(blue);
        }
        else
        {
            textB8.setForeground(orange);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_textB8ActionPerformed

    private void textBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBResetActionPerformed
        // TODO add your handling code here:
        textB1.setText(null);
        textB2.setText(null);
        textB3.setText(null);
        
        textB4.setText(null);
        textB5.setText(null);
        textB6.setText(null);
        
        textB7.setText(null);
        textB8.setText(null);
        textB9.setText(null);
        
        textB1.setBackground(gray);
        textB2.setBackground(gray);
        textB3.setBackground(gray);
        textB4.setBackground(gray);
        textB5.setBackground(gray);
        textB6.setBackground(gray);
        textB7.setBackground(gray);
        textB8.setBackground(gray);
        textB9.setBackground(gray);
            
        
  
    }//GEN-LAST:event_textBResetActionPerformed

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
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oScore;
    private javax.swing.JButton textB1;
    private javax.swing.JButton textB2;
    private javax.swing.JButton textB3;
    private javax.swing.JButton textB4;
    private javax.swing.JButton textB5;
    private javax.swing.JButton textB6;
    private javax.swing.JButton textB7;
    private javax.swing.JButton textB8;
    private javax.swing.JButton textB9;
    private javax.swing.JButton textBExit;
    private javax.swing.JButton textBReset;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables

    private void setScore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

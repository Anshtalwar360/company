import static java.awt.image.ImageObserver.WIDTH;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class frmRWFiles extends javax.swing.JFrame {

    File file;
    /**
     * Creates new form frmRWFiles
     * 
     */
    
    //Program 1: Student Average/Max
    /*Write a program Students Data that reads the data from the file studentsdata.txt. 
    finds and prints the average for each student
    then finds the students who got the highest average and prints her/his name and his average.*/
    
    private void stdAvgMax()
    {
    String[] arrFile;
    int sum, avg, total,max=0;
    String stdName=" ";
    
    txtFileContent.setText(" ");
    try
    {
       BufferedReader br = new BufferedReader(new FileReader("studentsdata.csv"));
      //BufferedReader br = new BufferedReader(new FileReader(file));
      
      String line;
      br.readLine();
      while((line = br.readLine())!= null)
      {
          arrFile = line.split(",");
          sum   = 0;
          avg   = 0;
          total = 0;
          for (int i=2; i<arrFile.length; i++)
          {
              sum = sum + Integer.parseInt(arrFile[i].trim());
              total = total + 1;
          }
          avg = sum/total; 
              if (avg >= max){
                 max = avg;
                 stdName = arrFile[1];
             }
          txtFileContent.append(arrFile[1] + " scored: " + avg + "/7 \n");
          
          }
         txtFileContent.append("The Highest score " + max + " is secured by " + stdName);
       
       br.close();
      
      
    }
        catch(Exception e){
        System.out.println ("Something went worng!");
    }
            
    }
    
    //Program 2: Student Age and height
    /*Write a program that reads data from a file that has students names, their age and their heights 
    (separated by a comma ). The program will print the names of the students who are older than 13 and 
    their height is more than 160*/
    
    private void stdAgeHt()
    {
    String[] arrFile;
    int age, height;
    
    txtFileContent.setText(" ");
    try
    {
       BufferedReader br = new BufferedReader(new FileReader("Studentage.csv"));
      //BufferedReader br = new BufferedReader(new FileReader(file));
      
      String line;
      br.readLine();
      txtFileContent.append("Students who are older than 13 and their height is more than 160 are as follows: \n");
      while((line = br.readLine())!= null)
      {
          arrFile = line.split(",");
          age = Integer.parseInt(arrFile[1]);
          height = Integer.parseInt(arrFile[2]);
          if (age > 13 && height > 150) {
             
             txtFileContent.append("Name: " + arrFile[0] + " Age: " + arrFile[1] + " Height: " + arrFile[2] +"\n" ); 
          }
          }
       br.close();
     }  catch(Exception e){
        System.out.println ("Something went worng!");
    }  
    }
    

    private void readscanFile() {
    txtFileContent.setText(" ");
    try {
           
            Scanner inputFile = new Scanner(file);
           // inputFile.hasNext();
                     
            while (inputFile.hasNext()) {
               String data = inputFile.next();
              txtFileContent.append(data + "\n");
	                             
            }
       
        } catch (IOException e) {
            e.printStackTrace();
        }  
  }
  /*  private void stdGrades() {
     
     String[] res;
     int[] intArrValue;
     txtFileContent.setText(" ");
    try {         
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            
          
            int sum   = 0;
            int avg   = 0;
            int total = 0;
            int index = 0;
           //while loop to print all the file contents  
            br.readLine();
            String line = br.readLine();
            
            while (line != null) {  
                //if (index != 0){                 
                res = line.split(",");
                // calculating average
                sum   = 0;
                avg   = 0;
                total = 0;
                for(int i = 2; i < res.length; i++)
                {
                    if (res[i] != null){
                        if (!(res[i].trim().isEmpty())){
                            sum = sum + Integer.parseInt(res[i].trim());
                            total = total + 1;
                        }
                    }
                }
                avg = sum/total;
                txtFileContent.append(res[1] + " scored: " + avg + "/7 \n");
                line = br.readLine();
             // }
              index++;
            }
           
           reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }  
  }*/
 
 

  
 private void writeFile() {
     
 }
    public frmRWFiles() {
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReset = new javax.swing.JButton();
        txtFilePath = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFilewrite = new javax.swing.JTextArea();
        btnRead = new javax.swing.JButton();
        btnWrite = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFileContent = new javax.swing.JTextArea();
        btnBrowse = new javax.swing.JButton();
        btnScanRead = new javax.swing.JButton();
        btnStudentAge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtFilePath.setText("Selected File Path");

        txtFilewrite.setColumns(20);
        txtFilewrite.setRows(5);
        txtFilewrite.setText("Text to be written");
        jScrollPane1.setViewportView(txtFilewrite);

        btnRead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRead.setText("Program 1 Student Average/Max");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnWrite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnWrite.setText("Write to File");
        btnWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteActionPerformed(evt);
            }
        });

        txtFileContent.setColumns(20);
        txtFileContent.setRows(5);
        txtFileContent.setText("Text from the selected file will be displayed here");
        jScrollPane2.setViewportView(txtFileContent);

        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnScanRead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnScanRead.setText("Read from File using Scanner");
        btnScanRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScanReadActionPerformed(evt);
            }
        });

        btnStudentAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStudentAge.setText("Program 2 Student Age/Height");
        btnStudentAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentAgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRead)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnScanRead))
                            .addComponent(btnStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBrowse)
                        .addComponent(btnReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRead)
                    .addComponent(btnWrite)
                    .addComponent(btnScanRead))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudentAge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
      stdAvgMax();
   
       
    
        
         
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteActionPerformed
        // TODO add your handling code here:
        writeFile();
        
    }//GEN-LAST:event_btnWriteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtFilePath.setText("Selected File Path");
        txtFileContent.setText("Text from the selected file will be displayed here");
        txtFilewrite.setText("Text to be written");
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
       
       int response;
       
       JFileChooser chooser = new JFileChooser(".");
       
       chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
       response = chooser.showOpenDialog(null);
       
       if (response == JFileChooser.APPROVE_OPTION)
       {
          file = chooser.getSelectedFile();
         txtFilePath.setText(chooser.getSelectedFile().getAbsolutePath());
        
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnStudentAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentAgeActionPerformed
        // TODO add your handling code here:
        stdAgeHt();
    }//GEN-LAST:event_btnStudentAgeActionPerformed

    private void btnScanReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScanReadActionPerformed
        // TODO add your handling code here:
        readscanFile();
    }//GEN-LAST:event_btnScanReadActionPerformed

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
            java.util.logging.Logger.getLogger(frmRWFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRWFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRWFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRWFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRWFiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnScanRead;
    private javax.swing.JButton btnStudentAge;
    private javax.swing.JButton btnWrite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtFileContent;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextArea txtFilewrite;
    // End of variables declaration//GEN-END:variables
}

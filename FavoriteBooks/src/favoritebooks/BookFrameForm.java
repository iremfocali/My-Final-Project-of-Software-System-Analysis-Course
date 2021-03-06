/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooks;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class BookFrameForm extends javax.swing.JFrame {

    public BookFrameForm() {
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

        AddBookButton = new javax.swing.JButton();
        DeleteBookButton = new javax.swing.JButton();
        searchinformationbutton = new javax.swing.JButton();
        listbooks_authorname = new javax.swing.JButton();
        listthebookswithcategory = new javax.swing.JButton();
        listthebookswithrating = new javax.swing.JButton();
        bookswithyearbutton = new javax.swing.JButton();
        displaytheimagebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddBookButton.setText("Add Book");
        AddBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookButtonActionPerformed(evt);
            }
        });

        DeleteBookButton.setText("Delete Book");
        DeleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBookButtonActionPerformed(evt);
            }
        });

        searchinformationbutton.setText("Search Information Of A Book");
        searchinformationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchinformationbuttonActionPerformed(evt);
            }
        });

        listbooks_authorname.setText("List The Books With Author Name");
        listbooks_authorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbooks_authornameActionPerformed(evt);
            }
        });

        listthebookswithcategory.setText("List The Books With Category ");
        listthebookswithcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listthebookswithcategoryActionPerformed(evt);
            }
        });

        listthebookswithrating.setText("List The Books With Rating");
        listthebookswithrating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listthebookswithratingActionPerformed(evt);
            }
        });

        bookswithyearbutton.setText(" Display The Books Read In Entered Year");
        bookswithyearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookswithyearbuttonActionPerformed(evt);
            }
        });

        displaytheimagebutton.setText("Display The Image Of A Book");
        displaytheimagebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaytheimagebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listthebookswithcategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listbooks_authorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listthebookswithrating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookswithyearbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displaytheimagebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(searchinformationbutton)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(AddBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchinformationbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displaytheimagebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listbooks_authorname, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listthebookswithcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listthebookswithrating, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookswithyearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookButtonActionPerformed
              AddBookFrame addbookframe = new AddBookFrame();
             // addbookframe.setSize(600,600);
              this.setVisible(false);
              addbookframe.setVisible(true);
              addbookframe.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
              
    }//GEN-LAST:event_AddBookButtonActionPerformed

    private void DeleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBookButtonActionPerformed
            DeleteBookFrame deletebookframe = new DeleteBookFrame();
            //deletebookframe.setSize(600,600);
            this.setVisible(false);
            deletebookframe.setVisible(true);
            deletebookframe.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_DeleteBookButtonActionPerformed

    private void searchinformationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchinformationbuttonActionPerformed
     
            SearchInfoBookFrame searchinfobookframe = new  SearchInfoBookFrame();
            //searchinfobookframe.setSize(600,600);
            this.setVisible(false);
            searchinfobookframe.setVisible(true);
            searchinfobookframe.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_searchinformationbuttonActionPerformed

    private void listbooks_authornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbooks_authornameActionPerformed
            
            ListTheBooksWithAuthorNameFrame listthebooks_authorname = new  ListTheBooksWithAuthorNameFrame();
            //listthebooks_authorname.setSize(600,600);
            this.setVisible(false);
            listthebooks_authorname.setVisible(true);
            listthebooks_authorname.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_listbooks_authornameActionPerformed

    private void listthebookswithcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listthebookswithcategoryActionPerformed
            ListTheBooksWithCategoryFrame listthebooks_category = new ListTheBooksWithCategoryFrame();
            //listthebooks_category.setSize(600,600);
            this.setVisible(false);
            listthebooks_category.setVisible(true);
            listthebooks_category.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_listthebookswithcategoryActionPerformed

    private void listthebookswithratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listthebookswithratingActionPerformed
            ListTheBooksWithRatingFrame listthebooks_rating = new ListTheBooksWithRatingFrame();
            //listthebooks_rating.setSize(600,600);
            this.setVisible(false);
            listthebooks_rating.setVisible(true);
            listthebooks_rating.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_listthebookswithratingActionPerformed

    private void bookswithyearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookswithyearbuttonActionPerformed
        Displaythenumbersofbook_year book_year = new Displaythenumbersofbook_year();
         // book_year.setSize(600,600);
          this.setVisible(false);
          book_year.setVisible(true);
          book_year.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_bookswithyearbuttonActionPerformed

    private void displaytheimagebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaytheimagebuttonActionPerformed
        DisplayImageFrame displayimage = new DisplayImageFrame();
        // displayimage.setSize(600,600);
          this.setVisible(false);
         displayimage.setVisible(true);
         displayimage.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE); 
    }//GEN-LAST:event_displaytheimagebuttonActionPerformed
  
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
            java.util.logging.Logger.getLogger(BookFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFrameForm().setVisible(true);
            }
        });

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookButton;
    private javax.swing.JButton DeleteBookButton;
    private javax.swing.JButton bookswithyearbutton;
    private javax.swing.JButton displaytheimagebutton;
    private javax.swing.JButton listbooks_authorname;
    private javax.swing.JButton listthebookswithcategory;
    private javax.swing.JButton listthebookswithrating;
    private javax.swing.JButton searchinformationbutton;
    // End of variables declaration//GEN-END:variables
}

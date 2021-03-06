package com.raven.main;
import com.raven.component.Header;
import com.raven.component.Menu;
import com.raven.event.EventMenuSelected;
import com.raven.event.EventShowPopupMenu;
import com.raven.form.Form1;
import com.raven.form.Form_Home;
import com.raven.form.MainForm;
import com.raven.swing.MenuItem;
import com.raven.swing.PopupMenu;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import employee_management.Create_Cus;
import employee_management.Create_Emp;
import employee_management.Cus_LIst;
import employee_management.Delete_Cus;
import employee_management.Delete_Emp;
import employee_management.Email_Verification;
import employee_management.Emp_LIst;
import employee_management.Login;
import employee_management.OTP_Validation;
import employee_management.Reset_Password;
import employee_management.Search_Cus;
import employee_management.Search_Emp;
import employee_management.Update_Cus;
import employee_management.Update_Emp;
import employee_management.Working_list;
import employee_management.cp_email_valid;


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;


public class Main extends javax.swing.JFrame {
    String eml= "";
    String name= "";
    String eid = "";
    String Ph = "";
public void hello(String emp_id, String emp_name,String e_ph, String email){
    eid=emp_id;
    name=emp_name;
    Ph =e_ph;
    eml=email;
}
    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;

    public Main() {
        initComponents();
        init();
    }

    private void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new Menu();
        header = new Header();
        main = new MainForm();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
                if (menuIndex == 0) {
                    if (subMenuIndex == -1) {
                        main.showForm(new Form_Home());
                    } else if (subMenuIndex == 1) {
                        main.showForm(new Form1());
                    } 
                }else  if (menuIndex == 1) {
                    if (subMenuIndex == 0) {
                        main.showForm(new Cus_LIst());
                    } else if (subMenuIndex == 1) {
                        main.showForm(new Create_Cus());
                    } else if (subMenuIndex == 2) {
                        main.showForm(new Search_Cus());
                    }else if (subMenuIndex == 3) {
                        main.showForm(new Update_Cus());
                    } else if (subMenuIndex == 4) {
                        main.showForm(new Delete_Cus());
                    } else if (subMenuIndex == 5) {
                        main.showForm(new Form1());
                    }  else if (subMenuIndex == 6) {
                        main.showForm(new Working_list());
                    }   
                    
                } else  if (menuIndex == 2) {
                    if (subMenuIndex == 0) {
                        main.showForm(new Emp_LIst());
                    } else if (subMenuIndex == 1) {
                        main.showForm(new Create_Emp());
                    } else if (subMenuIndex == 2) {
                        main.showForm(new Search_Emp());
                    }else if (subMenuIndex == 3) {
                        main.showForm(new Update_Emp());
                    } else if (subMenuIndex == 4) {
                        main.showForm(new Delete_Emp());
                    }  
               } else  if (menuIndex == 3) {
                    if (subMenuIndex == 0) {
                    //    main.showForm(new test());
                    } else if (subMenuIndex == 1) {
                        main.showForm(new MainForm());
                    } else if (subMenuIndex == 2) {
                        main.showForm(new MainForm());
                    } 
                      } else  if (menuIndex == 4) {
                    if (subMenuIndex == 0) {
                       // main.showForm(new test());
                    } else if (subMenuIndex == 1) {
                        main.showForm(new MainForm());
                    } else if (subMenuIndex == 2) {
                        main.showForm(new MainForm());
                    } 
                   
                     
                } else if (menuIndex == 5) {
                   
                    
                    main.showForm(new cp_email_valid());
                    
            
        }else  if (menuIndex == 6) {
                   
                      int Yes = JOptionPane.showConfirmDialog(null, "Are Your Sure Want to Log Out ?");
        if(Yes == 0){
           com.raven.main.Main sa = new com.raven.main.Main();
//        sa.setVisible(true);
                    //   mainWindowInstance.jFrame.dispose();
        }else{
             int No=0;
                if (No == 0){
                }
               }
                }
            }

//            private void dispose() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        menu.addEventShowPopup(new EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                MenuItem item = (MenuItem) com;
                PopupMenu popup = new PopupMenu(Main.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = Main.this.getX() + 52;
                int y = Main.this.getY() + com.getY() + 86;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        menu.initMenuItem();
        bg.add(menu, "w 230!, spany 2");    // Span Y 2cell
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 60 + (170 * (1f - fraction));
                } else {
                    width = 60 + (170 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
                menu.setEnableMenu(false);
                if (menu.isShowMenu()) {
                    menu.hideallMenu();
                }
            }
        });
        //  Init google icon font
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        //  Start with this form
        main.showForm(new Form_Home());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}

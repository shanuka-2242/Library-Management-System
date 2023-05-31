package My_Forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.border.Border;

public class DashboardForm extends javax.swing.JFrame {

    My_Classes.funcClass func = new My_Classes.funcClass();

    //the button border
    Border buttonBorder1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    Border buttonBorder2 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 153, 255));

    public DashboardForm() {
        initComponents();

        //center the form
        this.setLocationRelativeTo(null);

        //show date and time
        showDate();
        showTime();

        //display Image
        displayImage();

        //add a border to the panel header
        Border panelHederBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        jPanel_Header.setBorder(panelHederBorder);

        //add more borders
        Border panelHederBorder1 = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        jPanel_1_header.setBorder(panelHederBorder1);

        jPanel_2_header.setBorder(panelHederBorder1);

        jPanel_3_header.setBorder(panelHederBorder1);

        //add border to form
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

    }

    //create a function to display the login image
    public void displayImage() {

        //dashboard logo
        ImageIcon imageicon1 = new ImageIcon(getClass().getResource("/My_Images/books.png"));
        Image image1 = imageicon1.getImage().getScaledInstance(dashboard_logo.getWidth(), dashboard_logo.getHeight(), Image.SCALE_SMOOTH);
        dashboard_logo.setIcon(new ImageIcon(image1));

        //dashboard books
        ImageIcon imageicon2 = new ImageIcon(getClass().getResource("/My_Images/book-bookmark.png"));
        Image image2 = imageicon2.getImage().getScaledInstance(DashboardBooks_logo.getWidth(), DashboardBooks_logo.getHeight(), Image.SCALE_SMOOTH);
        DashboardBooks_logo.setIcon(new ImageIcon(image2));

        //dashboard members
        ImageIcon imageicon3 = new ImageIcon(getClass().getResource("/My_Images/users.png"));
        Image image3 = imageicon3.getImage().getScaledInstance(DashboardMembers_logo.getWidth(), DashboardMembers_logo.getHeight(), Image.SCALE_SMOOTH);
        DashboardMembers_logo.setIcon(new ImageIcon(image3));

        //dashboard authors
        ImageIcon imageicon4 = new ImageIcon(getClass().getResource("/My_Images/edit.png"));
        Image image4 = imageicon4.getImage().getScaledInstance(DashboardAuthors_logo.getWidth(), DashboardAuthors_logo.getHeight(), Image.SCALE_SMOOTH);
        DashboardAuthors_logo.setIcon(new ImageIcon(image4));

        //close
        ImageIcon imageicon5 = new ImageIcon(getClass().getResource("/My_Images/close.png"));
        Image image5 = imageicon5.getImage().getScaledInstance(Close.getWidth(), Close.getHeight(), Image.SCALE_SMOOTH);
        Close.setIcon(new ImageIcon(image5));

        //add borders to buttons
        addBorder();

        //the hover effect
        buttonsHoverEffect();

        //display counts on dashboard
        displayCount();
    }

    //create a function to add border to all the buttons in the menu bar
    public void addBorder() {

        //gett all the components in the menuebar
        Component[] comps = jPanel_Menu.getComponents();

        for (Component comp : comps) {

            //check if the component is a button
            if (comp instanceof JButton button) {

                //add borders to buttons
                button.setBorder(buttonBorder2);
            }
        }
    }

    //create function to add a hover effect to buttons on menu bar 
    public void buttonsHoverEffect() {

        //gett all the components in the menuebar
        Component[] comps = jPanel_Menu.getComponents();

        for (Component comp : comps) {

            //check if the component is a button
            if (comp instanceof JButton button) {

                //add the action we want to the button
                button.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseEntered(MouseEvent event) {

                        button.setBorder(buttonBorder1);
                    }

                    @Override
                    public void mouseExited(MouseEvent event) {

                        button.setBorder(buttonBorder2);
                    }
                });

            }
        }
    }

    public void displayCount() {

        lbl_BookCount.setText(String.valueOf(func.countData("books")));
        lbl_MembersCount.setText(String.valueOf(func.countData("members")));
        lbl_AuthorsCount.setText(String.valueOf(func.countData("authors")));

    }

    //function show date
    public void showDate() {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        lbl_date.setText(simpleDateFormat.format(date));

    }

    //function show time
    public void showTime() {

        
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
                lbl_time.setText(simpleDateFormat.format(date));
            }
        }).start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        dashboard_logo = new javax.swing.JLabel();
        lable1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddMember_BTN = new javax.swing.JButton();
        EditMember_BTN = new javax.swing.JButton();
        DeleteMember_BTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ManageGenres_BTN = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ManageAuthors_BTN = new javax.swing.JButton();
        MembersList_BTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        AddBook_BTN = new javax.swing.JButton();
        EditBook_BTN = new javax.swing.JButton();
        DeleteBook_BTN = new javax.swing.JButton();
        BookList_BTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        IssueBook_BTN = new javax.swing.JButton();
        ReturnBook_BTN = new javax.swing.JButton();
        ManageUsers_BTN = new javax.swing.JButton();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DashboardBooks_logo = new javax.swing.JLabel();
        lbl_BookCount = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        DashboardMembers_logo = new javax.swing.JLabel();
        lbl_MembersCount = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        DashboardAuthors_logo = new javax.swing.JLabel();
        lbl_AuthorsCount = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        lable2 = new javax.swing.JLabel();
        Username_lbl = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dashboard");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Dashboard"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel_Menu.setBackground(new java.awt.Color(153, 153, 255));

        jPanel_Header.setBackground(new java.awt.Color(102, 102, 255));

        lable1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lable1.setForeground(new java.awt.Color(255, 255, 255));
        lable1.setText("Library");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dashboard_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lable1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel6.setText("Members");

        AddMember_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        AddMember_BTN.setForeground(new java.awt.Color(255, 255, 255));
        AddMember_BTN.setText("Add Member");
        AddMember_BTN.setBorder(null);
        AddMember_BTN.setContentAreaFilled(false);
        AddMember_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddMember_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMember_BTNActionPerformed(evt);
            }
        });

        EditMember_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        EditMember_BTN.setForeground(new java.awt.Color(255, 255, 255));
        EditMember_BTN.setText("Edit Member");
        EditMember_BTN.setBorder(null);
        EditMember_BTN.setContentAreaFilled(false);
        EditMember_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditMember_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMember_BTNActionPerformed(evt);
            }
        });

        DeleteMember_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        DeleteMember_BTN.setForeground(new java.awt.Color(255, 255, 255));
        DeleteMember_BTN.setText("Delete Member");
        DeleteMember_BTN.setBorder(null);
        DeleteMember_BTN.setContentAreaFilled(false);
        DeleteMember_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteMember_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMember_BTNActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel7.setText("Genres");

        ManageGenres_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        ManageGenres_BTN.setForeground(new java.awt.Color(255, 255, 255));
        ManageGenres_BTN.setText("Manage Genres");
        ManageGenres_BTN.setBorder(null);
        ManageGenres_BTN.setContentAreaFilled(false);
        ManageGenres_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageGenres_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGenres_BTNActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel10.setText("Authors");

        ManageAuthors_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        ManageAuthors_BTN.setForeground(new java.awt.Color(255, 255, 255));
        ManageAuthors_BTN.setText("Manage Authors");
        ManageAuthors_BTN.setBorder(null);
        ManageAuthors_BTN.setContentAreaFilled(false);
        ManageAuthors_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageAuthors_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAuthors_BTNActionPerformed(evt);
            }
        });

        MembersList_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        MembersList_BTN.setForeground(new java.awt.Color(255, 255, 255));
        MembersList_BTN.setText("Members List");
        MembersList_BTN.setBorder(null);
        MembersList_BTN.setContentAreaFilled(false);
        MembersList_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MembersList_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembersList_BTNActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel8.setText("Books");

        AddBook_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        AddBook_BTN.setForeground(new java.awt.Color(255, 255, 255));
        AddBook_BTN.setText("Add Book");
        AddBook_BTN.setBorder(null);
        AddBook_BTN.setContentAreaFilled(false);
        AddBook_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBook_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBook_BTNActionPerformed(evt);
            }
        });

        EditBook_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        EditBook_BTN.setForeground(new java.awt.Color(255, 255, 255));
        EditBook_BTN.setText("Edit Book");
        EditBook_BTN.setBorder(null);
        EditBook_BTN.setContentAreaFilled(false);
        EditBook_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBook_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBook_BTNActionPerformed(evt);
            }
        });

        DeleteBook_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        DeleteBook_BTN.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBook_BTN.setText("Delete Book");
        DeleteBook_BTN.setBorder(null);
        DeleteBook_BTN.setContentAreaFilled(false);
        DeleteBook_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBook_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBook_BTNActionPerformed(evt);
            }
        });

        BookList_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        BookList_BTN.setForeground(new java.awt.Color(255, 255, 255));
        BookList_BTN.setText("Book List");
        BookList_BTN.setBorder(null);
        BookList_BTN.setContentAreaFilled(false);
        BookList_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookList_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookList_BTNActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        jLabel11.setText("Circulation");

        IssueBook_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        IssueBook_BTN.setForeground(new java.awt.Color(255, 255, 255));
        IssueBook_BTN.setText("Issue Book");
        IssueBook_BTN.setBorder(null);
        IssueBook_BTN.setContentAreaFilled(false);
        IssueBook_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IssueBook_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBook_BTNActionPerformed(evt);
            }
        });

        ReturnBook_BTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        ReturnBook_BTN.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBook_BTN.setText("Return Book");
        ReturnBook_BTN.setBorder(null);
        ReturnBook_BTN.setContentAreaFilled(false);
        ReturnBook_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReturnBook_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBook_BTNActionPerformed(evt);
            }
        });

        ManageUsers_BTN.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ManageUsers_BTN.setForeground(new java.awt.Color(51, 51, 51));
        ManageUsers_BTN.setText("Manage Users");
        ManageUsers_BTN.setBorder(null);
        ManageUsers_BTN.setContentAreaFilled(false);
        ManageUsers_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageUsers_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageUsers_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageGenres_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageAuthors_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddMember_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditMember_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteMember_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(MembersList_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(AddBook_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditBook_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBook_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(BookList_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManageUsers_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IssueBook_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReturnBook_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageGenres_BTN)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageAuthors_BTN)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddMember_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditMember_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteMember_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MembersList_BTN)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBook_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditBook_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteBook_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BookList_BTN)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IssueBook_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReturnBook_BTN)
                .addGap(18, 18, 18)
                .addComponent(ManageUsers_BTN)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel_1.setPreferredSize(new java.awt.Dimension(170, 170));

        jPanel_1_header.setBackground(new java.awt.Color(255, 51, 153));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Books");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(DashboardBooks_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DashboardBooks_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbl_BookCount.setBackground(new java.awt.Color(255, 255, 255));
        lbl_BookCount.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_BookCount.setForeground(new java.awt.Color(51, 51, 51));
        lbl_BookCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_BookCount.setText("0");

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_BookCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbl_BookCount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        jPanel_2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel_2.setPreferredSize(new java.awt.Dimension(170, 170));

        jPanel_2_header.setBackground(new java.awt.Color(51, 153, 255));
        jPanel_2_header.setPreferredSize(new java.awt.Dimension(170, 47));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Members");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(DashboardMembers_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DashboardMembers_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbl_MembersCount.setBackground(new java.awt.Color(255, 255, 255));
        lbl_MembersCount.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_MembersCount.setForeground(new java.awt.Color(51, 51, 51));
        lbl_MembersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_MembersCount.setText("0");

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_MembersCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbl_MembersCount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel_3.setPreferredSize(new java.awt.Dimension(170, 170));

        jPanel_3_header.setBackground(new java.awt.Color(0, 204, 51));
        jPanel_3_header.setPreferredSize(new java.awt.Dimension(170, 47));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Authors");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(DashboardAuthors_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DashboardAuthors_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbl_AuthorsCount.setBackground(new java.awt.Color(255, 255, 255));
        lbl_AuthorsCount.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_AuthorsCount.setForeground(new java.awt.Color(51, 51, 51));
        lbl_AuthorsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AuthorsCount.setText("0");

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_AuthorsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lbl_AuthorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        Close.setBackground(new java.awt.Color(255, 255, 255));
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
        });

        lable2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lable2.setForeground(new java.awt.Color(51, 51, 255));
        lable2.setText("Welcome Back");

        Username_lbl.setBackground(new java.awt.Color(255, 255, 255));
        Username_lbl.setFont(new java.awt.Font("Century Gothic", 3, 16)); // NOI18N
        Username_lbl.setText("Username");

        lbl_time.setBackground(new java.awt.Color(255, 255, 255));
        lbl_time.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_time.setText("Time");

        lbl_date.setBackground(new java.awt.Color(255, 255, 255));
        lbl_date.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbl_date.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lable2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Username_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_date)
                            .addComponent(lbl_time))
                        .addGap(38, 38, 38)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lable2)
                            .addComponent(Username_lbl)))
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_date)))
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageGenres_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGenres_BTNActionPerformed

        //show the manage genres form
        ManageGenreForm manageGenreForm = new ManageGenreForm();
        manageGenreForm.setVisible(true);

    }//GEN-LAST:event_ManageGenres_BTNActionPerformed

    private void ManageAuthors_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAuthors_BTNActionPerformed

        //show the manage authors form
        ManageAuthorForm manageAuthorForm = new ManageAuthorForm();
        manageAuthorForm.setVisible(true);
    }//GEN-LAST:event_ManageAuthors_BTNActionPerformed

    private void AddMember_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMember_BTNActionPerformed

        //show add member form
        AddMemberForm addMemberForm = new AddMemberForm();
        addMemberForm.setVisible(true);
    }//GEN-LAST:event_AddMember_BTNActionPerformed

    private void EditMember_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMember_BTNActionPerformed

        //show edit member form
        EditMember editMember = new EditMember();
        editMember.setVisible(true);
    }//GEN-LAST:event_EditMember_BTNActionPerformed

    private void DeleteMember_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMember_BTNActionPerformed

        //show delete member form
        DeleteMember deleteMember = new DeleteMember();
        deleteMember.setVisible(true);
    }//GEN-LAST:event_DeleteMember_BTNActionPerformed

    private void MembersList_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembersList_BTNActionPerformed
        //show delete member form
        MembersListForm membersListForm = new MembersListForm();
        membersListForm.setVisible(true);
    }//GEN-LAST:event_MembersList_BTNActionPerformed

    private void AddBook_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBook_BTNActionPerformed
        //show add book form
        AddBookForm addBookForm = new AddBookForm();
        addBookForm.setVisible(true);
    }//GEN-LAST:event_AddBook_BTNActionPerformed

    private void EditBook_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBook_BTNActionPerformed
        //show edit book form
        EditBookForm editBookForm = new EditBookForm();
        editBookForm.setVisible(true);
    }//GEN-LAST:event_EditBook_BTNActionPerformed

    private void DeleteBook_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBook_BTNActionPerformed
        //show delete book form
        DeleteBookForm deleteBookForm = new DeleteBookForm();
        deleteBookForm.setVisible(true);
    }//GEN-LAST:event_DeleteBook_BTNActionPerformed

    private void BookList_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookList_BTNActionPerformed
        //show delete member form
        BooksListForm booksListForm = new BooksListForm();
        booksListForm.setVisible(true);
    }//GEN-LAST:event_BookList_BTNActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

        this.dispose();

        //view login form again
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);

    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

    }//GEN-LAST:event_CloseMouseEntered

    private void IssueBook_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBook_BTNActionPerformed
        //show issue book form
        IssueBookForm issueBookForm = new IssueBookForm();
        issueBookForm.setVisible(true);
    }//GEN-LAST:event_IssueBook_BTNActionPerformed

    private void ReturnBook_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBook_BTNActionPerformed
        //show return book form
        ReturnBookForm returnBookForm = new ReturnBookForm();
        returnBookForm.setVisible(true);
    }//GEN-LAST:event_ReturnBook_BTNActionPerformed

    private void ManageUsers_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageUsers_BTNActionPerformed

        //show manage users form
        ManageUsersForm manageUsersForm = new ManageUsersForm();
        manageUsersForm.setVisible(true);
    }//GEN-LAST:event_ManageUsers_BTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBook_BTN;
    private javax.swing.JButton AddMember_BTN;
    private javax.swing.JButton BookList_BTN;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel DashboardAuthors_logo;
    private javax.swing.JLabel DashboardBooks_logo;
    private javax.swing.JLabel DashboardMembers_logo;
    private javax.swing.JButton DeleteBook_BTN;
    private javax.swing.JButton DeleteMember_BTN;
    private javax.swing.JButton EditBook_BTN;
    private javax.swing.JButton EditMember_BTN;
    public javax.swing.JButton IssueBook_BTN;
    private javax.swing.JButton ManageAuthors_BTN;
    private javax.swing.JButton ManageGenres_BTN;
    public javax.swing.JButton ManageUsers_BTN;
    private javax.swing.JButton MembersList_BTN;
    public javax.swing.JButton ReturnBook_BTN;
    public javax.swing.JLabel Username_lbl;
    private javax.swing.JLabel dashboard_logo;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel lable2;
    private javax.swing.JLabel lbl_AuthorsCount;
    private javax.swing.JLabel lbl_BookCount;
    private javax.swing.JLabel lbl_MembersCount;
    public javax.swing.JLabel lbl_date;
    public javax.swing.JLabel lbl_time;
    // End of variables declaration//GEN-END:variables
}

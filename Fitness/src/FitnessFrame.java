
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static net.proteanit.sql.DbUtils.resultSetToTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */
public class FitnessFrame extends javax.swing.JFrame {

    /**
     * Creates new form FitnessFrame
     */
        Connection con =null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    public FitnessFrame() {
        initComponents();
         con= DatabaseConnector.connectDB();
         User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
    }
          
         
        
        //Table for Users
        private void User_Table(){
        try{
        String sql ="SELECT * FROM USERS";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        UserTBL.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
    }
        
        
        //Table for Report
        
         private void Report_Table(){
        try{
        String sql ="SELECT * FROM REPORT";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        ReportTBL.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
    }
        
          
         //Table For Diet
         
            private void Diet_Table(){
        try{
        String sql ="SELECT * FROM DIET";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        DietTBL.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
    }
        
            //Table For Meal 
            
                   private void Meal_Table(){
        try{
        String sql ="SELECT * FROM MEAL";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        MealTBL.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
    }
         
                   //Table for Work Out 
                   
                          private void WorkOut_Table(){
        try{
        String sql ="SELECT * FROM WORKOUT";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        WorkOutTBL.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
    }
         
        //Combo Box Fill UserID
        private void FillCombo(){
          try{
            con.setAutoCommit(true); 
            String sql="SELECT USERID FROM USERS"; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            while(rs.next()){
                String ID = rs.getString("USERID");
                WorkOutDD.addItem(ID);
                ReportDD.addItem(ID);
                DietUserDD.addItem(ID);
            }
            
            con.commit();
            rs.close();
            ps.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
        }
    }
        
        //ComboBox Fill Report ID
        private void FillCombo2(){
          try{
            con.setAutoCommit(true); 
            String sql="SELECT REPORTID FROM REPORT"; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            while(rs.next()){
                String ID = rs.getString("REPORTID");
                ReportDietDD.addItem(ID);
                ReportMealDD.addItem(ID);
                WorkOutReportDD.addItem(ID);
            }
            
            con.commit();
            rs.close();
            ps.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
        }
    }
        
        //ComboBox Fill Diet ID 
         private void FillCombo3(){
          try{
            con.setAutoCommit(true); 
            String sql="SELECT DIETID FROM DIET"; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            while(rs.next()){
                String ID = rs.getString("DIETID");
                MealDietDD.addItem(ID);
                
            }
            
            con.commit();
            rs.close();
            ps.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FNameTF = new javax.swing.JTextField();
        LNameTF = new javax.swing.JTextField();
        AddressTF = new javax.swing.JTextField();
        WeightTF = new javax.swing.JTextField();
        PhoneTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        AgeTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTBL = new javax.swing.JTable();
        CreateUser = new javax.swing.JButton();
        UpdateUser = new javax.swing.JButton();
        DelUser = new javax.swing.JButton();
        ClearUser = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        UserIDTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DietTypeTF = new javax.swing.JTextField();
        CaloriesTF = new javax.swing.JTextField();
        DietUserDD = new javax.swing.JComboBox<>();
        ReportDietDD = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        DietTBL = new javax.swing.JTable();
        CreateDiet = new javax.swing.JButton();
        UpdateDiet = new javax.swing.JButton();
        DelDiet = new javax.swing.JButton();
        ClearDiet = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        DietIDTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        MealTF = new javax.swing.JTextField();
        MealPlanTF = new javax.swing.JTextField();
        MealDietDD = new javax.swing.JComboBox<>();
        ReportMealDD = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        MealTBL = new javax.swing.JTable();
        CreateMeal = new javax.swing.JButton();
        UpdateMeal = new javax.swing.JButton();
        DelMeal = new javax.swing.JButton();
        ClearMeal = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        MealIDTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        WorkOutTF = new javax.swing.JTextField();
        WorkOutCaloriesTF = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        WorkOutTBL = new javax.swing.JTable();
        CreateWorkOut = new javax.swing.JButton();
        UpdateWorkOut = new javax.swing.JButton();
        DelWorkOut = new javax.swing.JButton();
        ClearWorkOut = new javax.swing.JButton();
        WorkOutDD = new javax.swing.JComboBox<>();
        WorkOutReportDD = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        WorkOutIDTF = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        DietReportTF = new javax.swing.JTextField();
        WorkOutReportTF = new javax.swing.JTextField();
        ReportDD = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        ReportTBL = new javax.swing.JTable();
        CreateReport = new javax.swing.JButton();
        UpdateReport = new javax.swing.JButton();
        DelReport = new javax.swing.JButton();
        ClearReport = new javax.swing.JButton();
        ReportDC = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        ReportIDTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel11.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Users Info");

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jLabel8.setText("Address");

        jLabel9.setText("Weight");

        jLabel10.setText("Phone");

        jLabel11.setText("Email");

        jLabel12.setText("Age");

        UserTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        UserTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserTBL);

        CreateUser.setText("Create");
        CreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateUserMouseClicked(evt);
            }
        });
        CreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserActionPerformed(evt);
            }
        });

        UpdateUser.setText("Update");
        UpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserActionPerformed(evt);
            }
        });

        DelUser.setText("Delete");
        DelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelUserActionPerformed(evt);
            }
        });

        ClearUser.setText("Clear");
        ClearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearUserActionPerformed(evt);
            }
        });

        jLabel30.setText("User Id");

        UserIDTF.setEditable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LNameTF))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addComponent(AddressTF))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel30))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailTF)
                            .addComponent(PhoneTF)
                            .addComponent(WeightTF)
                            .addComponent(AgeTF)
                            .addComponent(UserIDTF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(CreateUser)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateUser)
                        .addGap(18, 18, 18)
                        .addComponent(DelUser)
                        .addGap(18, 18, 18)
                        .addComponent(ClearUser)))
                .addGap(33, 33, 33))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(AddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(WeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(PhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(UserIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateUser)
                    .addComponent(UpdateUser)
                    .addComponent(DelUser)
                    .addComponent(ClearUser))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Manage Users", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Users", jPanel1);

        jPanel12.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Diets Info");

        jLabel13.setText("Diet Type");

        jLabel14.setText("Calories");

        jLabel15.setText("Diet For");

        jLabel16.setText("From Report");

        DietTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        DietTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DietTBLMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DietTBL);

        CreateDiet.setText("Create");
        CreateDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDietActionPerformed(evt);
            }
        });

        UpdateDiet.setText("Update");
        UpdateDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDietActionPerformed(evt);
            }
        });

        DelDiet.setText("Delete");
        DelDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelDietActionPerformed(evt);
            }
        });

        ClearDiet.setText("Clear");

        jLabel31.setText("Diet Id");

        DietIDTF.setEditable(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaloriesTF)
                            .addComponent(DietUserDD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReportDietDD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(DietTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(DietIDTF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(CreateDiet)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateDiet)
                        .addGap(18, 18, 18)
                        .addComponent(DelDiet)
                        .addGap(18, 18, 18)
                        .addComponent(ClearDiet))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(DietTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(CaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(DietUserDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(ReportDietDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(DietIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateDiet)
                    .addComponent(UpdateDiet)
                    .addComponent(DelDiet)
                    .addComponent(ClearDiet))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Manage Diets", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Diets", jPanel2);

        jPanel13.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Meals Info");

        jLabel17.setText("Meal Name");

        jLabel18.setText("Meal Plan");

        jLabel19.setText("In Diet");

        jLabel20.setText("For Report");

        MealTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        MealTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MealTBLMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(MealTBL);

        CreateMeal.setText("Create");
        CreateMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateMealActionPerformed(evt);
            }
        });

        UpdateMeal.setText("Update");
        UpdateMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMealActionPerformed(evt);
            }
        });

        DelMeal.setText("Delate");
        DelMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelMealActionPerformed(evt);
            }
        });

        ClearMeal.setText("Clear");

        jLabel32.setText("Meal Id");

        MealIDTF.setEditable(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MealTF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(25, 25, 25)
                        .addComponent(MealPlanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MealDietDD, 0, 105, Short.MAX_VALUE)
                            .addComponent(ReportMealDD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MealIDTF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(CreateMeal)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateMeal)
                        .addGap(18, 18, 18)
                        .addComponent(DelMeal)
                        .addGap(18, 18, 18)
                        .addComponent(ClearMeal))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(MealTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(MealPlanTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(MealDietDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(ReportMealDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(MealIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateMeal)
                    .addComponent(UpdateMeal)
                    .addComponent(DelMeal)
                    .addComponent(ClearMeal))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Manage Meals", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("Meals", jPanel3);

        jTabbedPane5.setBackground(new java.awt.Color(102, 102, 255));

        jPanel14.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Work Outs  Info");

        jLabel21.setText("WorkOut Name");

        jLabel22.setText("Calories Burned");

        jLabel24.setText("WorkOut By");

        jLabel25.setText("For Report");

        WorkOutTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        WorkOutTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkOutTBLMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(WorkOutTBL);

        CreateWorkOut.setText("Create");
        CreateWorkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateWorkOutActionPerformed(evt);
            }
        });

        UpdateWorkOut.setText("Update");

        DelWorkOut.setText("Delete");
        DelWorkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelWorkOutActionPerformed(evt);
            }
        });

        ClearWorkOut.setText("Clear");
        ClearWorkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearWorkOutActionPerformed(evt);
            }
        });

        jLabel33.setText("Work Out Id");

        WorkOutIDTF.setEditable(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(23, 23, 23)
                        .addComponent(WorkOutTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel25)
                                .addComponent(jLabel24))
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WorkOutCaloriesTF)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WorkOutDD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WorkOutReportDD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WorkOutIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(CreateWorkOut)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateWorkOut)
                        .addGap(18, 18, 18)
                        .addComponent(DelWorkOut)
                        .addGap(18, 18, 18)
                        .addComponent(ClearWorkOut))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(WorkOutTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(WorkOutCaloriesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WorkOutDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WorkOutReportDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WorkOutIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateWorkOut)
                    .addComponent(UpdateWorkOut)
                    .addComponent(DelWorkOut)
                    .addComponent(ClearWorkOut))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane5.addTab("Manage Work Outs", jPanel9);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        jTabbedPane1.addTab("Work Outs", jPanel4);

        jPanel15.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Report Info");

        jLabel26.setText("Report Date");

        jLabel27.setText("Diet Report");

        jLabel28.setText("WorkOut Report");

        jLabel29.setText("Report For");

        ReportDD.setName(""); // NOI18N
        ReportDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportDDActionPerformed(evt);
            }
        });

        ReportTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ReportTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportTBLMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ReportTBL);

        CreateReport.setText("Create");
        CreateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateReportActionPerformed(evt);
            }
        });

        UpdateReport.setText("Update");
        UpdateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateReportActionPerformed(evt);
            }
        });

        DelReport.setText("Delete");
        DelReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelReportActionPerformed(evt);
            }
        });

        ClearReport.setText("Clear");
        ClearReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearReportActionPerformed(evt);
            }
        });

        ReportDC.setDateFormatString("yyyy-MM-dd");

        jLabel34.setText("Report Id");

        ReportIDTF.setEditable(false);
        ReportIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportIDTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DietReportTF, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(ReportDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WorkOutReportTF)
                                    .addComponent(ReportDD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ReportIDTF))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(CreateReport)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateReport)
                                .addGap(18, 18, 18)
                                .addComponent(DelReport)
                                .addGap(18, 18, 18)
                                .addComponent(ClearReport))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateReport)
                            .addComponent(UpdateReport)
                            .addComponent(DelReport)
                            .addComponent(ClearReport)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(ReportDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(DietReportTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(WorkOutReportTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(ReportDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(ReportIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane6.addTab("Manage Report", jPanel10);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        jTabbedPane1.addTab("Report", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserActionPerformed
        // TODO add your handling code here:
        if(FNameTF.getText()!= null){
        try{ 
        String CreateUsers = "INSERT INTO USERS(FNAME,LNAME,ADDRESS,EMAILL,WEIGHT,AGE,PHONE)VALUES(?,?,?,?,?,?,?)";
                    ps = con.prepareStatement(CreateUsers); 
                    ps.setString(1, FNameTF.getText());
                    ps.setString(2, LNameTF.getText());
                    ps.setString(3, AddressTF.getText());
                    ps.setString(4, EmailTF.getText());
                    ps.setString(5, WeightTF.getText());
                    ps.setString(6, AgeTF.getText());
                    ps.setString(7, PhoneTF.getText());                 
                                        
                    ps.execute();
                    
                    JOptionPane.showMessageDialog(null, "User Created successfully");
                       User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
                    
        }
        catch(SQLException e){
             Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
        }else if(FNameTF.getText()== null){
            JOptionPane.showMessageDialog(null, "Please Fill Out Correctly");
        }

    }//GEN-LAST:event_CreateUserActionPerformed

    private void DelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelUserActionPerformed
        // TODO add your handling code here:
        
       try{
String sql = "DELETE FROM USERS WHERE USERID=?";
ps = con.prepareStatement(sql);
ps.setString(1, UserIDTF.getText());
ps.execute();
JOptionPane.showMessageDialog(null, "User Record deleted!!");
User_Table();
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Exception Warning: "+e);
   User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();

}
        
    }//GEN-LAST:event_DelUserActionPerformed

    private void DelDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelDietActionPerformed
        // TODO add your handling code here:
               try{
String sql = "DELETE FROM DIET WHERE DIETID=?";
ps = con.prepareStatement(sql);
ps.setString(1, DietIDTF.getText());
ps.execute();
JOptionPane.showMessageDialog(null, "Diet Record deleted!!");
   User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Exception Warning: "+e);

}
    }//GEN-LAST:event_DelDietActionPerformed

    private void CreateWorkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateWorkOutActionPerformed
        // TODO add your handling code here:
            try{ 
            String CreateWorkOut = "INSERT INTO WORKOUT(WORKOUT_NAME,WORKOUT_BURNED,USERID,REPORTID) VALUES(?,?,?,?)";
                    ps = con.prepareStatement(CreateWorkOut); 
                    ps.setString(1, WorkOutTF.getText());
                    ps.setString(2, WorkOutCaloriesTF.getText());
                    ps.setString(3,WorkOutDD.getSelectedItem().toString());
                    ps.setString(4,WorkOutReportDD.getSelectedItem().toString());
                    
                    
                    
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Work Out inserted successfully");
                       User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
        }
        catch(SQLException e){
             Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_CreateWorkOutActionPerformed

    private void ReportDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportDDActionPerformed

    private void CreateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateUserMouseClicked

    private void UserTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTBLMouseClicked
        // TODO add your handling code here:
        int row = UserTBL.getSelectedRow(); 
            String tableClick = (UserTBL.getModel().getValueAt(row, 0).toString());
            try{
            con.setAutoCommit(true); 
            int num = Integer.parseInt( tableClick );
            String sql="SELECT USERID, FNAME, LNAME, ADDRESS,EMAILL, WEIGHT,AGE,PHONE FROM USERS WHERE USERID= "+tableClick+" "; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            if(rs.next()){
               
                String s2 = rs.getString("FNAME");
                FNameTF.setText(s2);
                 String s3 = rs.getString("LNAME");
                LNameTF.setText(s3);
                String s4 = rs.getString("ADDRESS");
                AddressTF.setText(s4);
                int sb = rs.getInt("PHONE");
                String s5 = Integer.toString(sb);
                PhoneTF.setText(s5); 
                String s6 = rs.getString("EMAILL");
                EmailTF.setText(s6);
                int sc = rs.getInt("WEIGHT");
                String s7 = Integer.toString(sc);
                WeightTF.setText(s7);
                  int sd = rs.getInt("AGE");
                String s8 = Integer.toString(sd);
                AgeTF.setText(s8);
                    int se = rs.getInt("USERID");
                String s9 = Integer.toString(se);
                UserIDTF.setText(s9);
            }
         
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
        }
        
        
    }//GEN-LAST:event_UserTBLMouseClicked

    private void ClearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearUserActionPerformed
        // TODO add your handling code here:
        FNameTF.setText("");
        LNameTF.setText("");
        EmailTF.setText("");
        AddressTF.setText("");
        AgeTF.setText("");
        PhoneTF.setText("");
        WeightTF.setText("");
    }//GEN-LAST:event_ClearUserActionPerformed

    private void CreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateReportActionPerformed
        // TODO add your handling code here:
        try{ 
        String CreateReport = "INSERT INTO REPORT(REPORT_DATE,DIET_REP,WORKOUT_REP,USERID) VALUES(?,?,?,?)";
                    ps = con.prepareStatement(CreateReport); 
                    ps.setString(1, ((JTextField)ReportDC.getDateEditor().getUiComponent()).getText());
                    ps.setString(2, DietReportTF.getText());
                    ps.setString(3, WorkOutReportTF.getText());
                     ps.setString(4, ReportDD.getSelectedItem().toString());
                    
                    
                    
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Report inserted successfully");
                       User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
        }
        catch(SQLException e){
             Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
        
    }//GEN-LAST:event_CreateReportActionPerformed

    private void ReportTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportTBLMouseClicked
        // TODO add your handling code here:
              int row = ReportTBL.getSelectedRow(); 
            String tableClick = (ReportTBL.getModel().getValueAt(row, 0).toString());
            try{
            con.setAutoCommit(true); 
            int num = Integer.parseInt( tableClick );
            String sql="SELECT REPORTID,REPORT_DATE,DIET_REP,WORKOUT_REP,USERID FROM REPORT WHERE REPORTID= "+num+" "; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            if(rs.next()){
                
                Date s1= rs.getDate("REPORT_DATE");
                ReportDC.setDate(s1);                
                String s2 = rs.getString("DIET_REP");
                DietReportTF.setText(s2);
                 String s3 = rs.getString("WORKOUT_REP");
                WorkOutReportTF.setText(s3);
                int sa = rs.getInt("USERID");
                String s4 = Integer.toString(sa);
                ReportDD.setSelectedItem(s4);
                int sb = rs.getInt("REPORTID");
                String s5 = Integer.toString(sb);
                ReportIDTF.setText(s5);
                
            }
         
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
        }
    }//GEN-LAST:event_ReportTBLMouseClicked

    private void UpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserActionPerformed
        // TODO add your handling code here:
         try{
String a1 = FNameTF.getText();
String a2 = UserIDTF.getText();
String v1 = LNameTF.getText();
String v2 = AddressTF.getText();
String v3 = WeightTF.getText();
String v4 = PhoneTF.getText();
String v5 = EmailTF.getText();
String v6 = AgeTF.getText();

String sql = "UPDATE USERS SET FNAME=?,LNAME=?,ADDRESS=?,PHONE=?,EMAILL=?,WEIGHT=?,AGE=? WHERE USERID=?";
ps = con.prepareStatement(sql);
ps.setString(1, a1);
ps.setString(2, v1);
ps.setString(3, v2);
ps.setString(4, v4);
ps.setString(5, v5);
ps.setString(6, v3);
ps.setString(7, v6);
ps.setString(8,a2);
ps.executeUpdate();
JOptionPane.showMessageDialog(null, "Staff Record Updated!!\n\nCongrats!!");

   User_Table();
        
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Exception Warning: "+e);
}
    }//GEN-LAST:event_UpdateUserActionPerformed

    private void DelReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelReportActionPerformed
        // TODO add your handling code here:
        try{
String sql = "DELETE FROM REPORT WHERE REPORID=?";
ps = con.prepareStatement(sql);
ps.setString(1,  ReportIDTF.getText());
ps.execute();
JOptionPane.showMessageDialog(null, "Report deleted!!");
   User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Exception Warning: "+e);
}
    }//GEN-LAST:event_DelReportActionPerformed

    private void ClearReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearReportActionPerformed
        // TODO add your handling code here:
        DietReportTF.setText("");
        WorkOutReportTF.setText("");
        ReportDC.setCalendar(null);
        ReportDD.setSelectedItem(null);
    }//GEN-LAST:event_ClearReportActionPerformed

    private void CreateDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDietActionPerformed
        // TODO add your handling code here:
        try{ 
        String CreateDiet = "INSERT INTO DIET(DIET_TYPE,CALORIES,USERID,REPORTID) VALUES(?,?,?,?)";
                    ps = con.prepareStatement(CreateDiet); 
                    ps.setString(1, DietTypeTF.getText());
                    ps.setString(2, CaloriesTF.getText());
                    ps.setString(3,DietUserDD.getSelectedItem().toString());
                    ps.setString(4,ReportDietDD.getSelectedItem().toString());
                    
                    
                    
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Diet inserted successfully");
                       User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
        }
        catch(SQLException e){
             Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
        
    }//GEN-LAST:event_CreateDietActionPerformed

    private void CreateMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateMealActionPerformed
        // TODO add your handling code here:
         try{ 
        String CreateMeal = "INSERT INTO Meal(MEALNAME,MEALPLAN,DIETID,REPORTID) VALUES(?,?,?,?)";
                    ps = con.prepareStatement(CreateMeal); 
                    ps.setString(1, MealTF.getText());
                    ps.setString(2, MealPlanTF.getText());
                    ps.setString(3,MealDietDD.getSelectedItem().toString());
                    ps.setString(4,ReportMealDD.getSelectedItem().toString());
                    
                    
                    
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Meal inserted successfully");
                
         Meal_Table();
     
        }
        catch(SQLException e){
             Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_CreateMealActionPerformed

    private void UpdateDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDietActionPerformed
        // TODO add your handling code here:
                 try{
String a1 = DietTypeTF.getText();
String a2 = DietIDTF.getText();
String v1 = CaloriesTF.getText();
String v2 = DietUserDD.getSelectedItem().toString();
String v3 = ReportDietDD.getSelectedItem().toString();


String sql = "UPDATE DIET SET DIET_TYPE=?,CALORIES=?,USERID=?,REPORTID=? WHERE DIETID=?";
ps = con.prepareStatement(sql);
ps.setString(1, a1);
ps.setString(2, v1);
ps.setString(3, v2);
ps.setString(4, v3);
ps.setString(5, a2);

ps.executeUpdate();
JOptionPane.showMessageDialog(null, "Diet Record Updated!!\n\nCongrats!!");

   User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Exception Warning: "+e);
}
    }//GEN-LAST:event_UpdateDietActionPerformed

    private void ReportIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportIDTFActionPerformed

    private void UpdateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateReportActionPerformed

    private void DelWorkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelWorkOutActionPerformed
        // TODO add your handling code here:
        try{
String sql = "DELETE FROM WORKOUT WHERE WORKOUT_ID=?";
ps = con.prepareStatement(sql);
ps.setString(1, WorkOutIDTF.getText());
ps.execute();
JOptionPane.showMessageDialog(null, "WorkOut Record deleted!!");
   User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();

}catch(Exception e){
JOptionPane.showMessageDialog(null, "Exception Warning: "+e);

}
    }//GEN-LAST:event_DelWorkOutActionPerformed

    private void ClearWorkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearWorkOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearWorkOutActionPerformed

    private void DietTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DietTBLMouseClicked
        // TODO add your handling code here:
                int row = DietTBL.getSelectedRow(); 
            String tableClick = (DietTBL.getModel().getValueAt(row, 0).toString());
            try{
            con.setAutoCommit(true); 
            int num = Integer.parseInt( tableClick );
            String sql="SELECT * FROM DIET WHERE DIETID= "+tableClick+" "; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            if(rs.next()){
               
                String s2 = rs.getString("DIET_TYPE");
                DietTypeTF.setText(s2);
                int sb = rs.getInt("CALORIES");
                String s5 = Integer.toString(sb);
                CaloriesTF.setText(s5); 
                 int sa = rs.getInt("USERID");
                String s4 = Integer.toString(sa);
                DietUserDD.setSelectedItem(s4);
                int sc = rs.getInt("REPORTID");
                String s7 = Integer.toString(sc);
                ReportDietDD.setSelectedItem(s7);
                int sd = rs.getInt("DIETID");
                String s8 = Integer.toString(sd);
                DietIDTF.setText(s8);
             
            }
         
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
        }
        
    }//GEN-LAST:event_DietTBLMouseClicked

    private void MealTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealTBLMouseClicked
        // TODO add your handling code here:
        int row = MealTBL.getSelectedRow(); 
            String tableClick = (MealTBL.getModel().getValueAt(row, 0).toString());
            try{
            con.setAutoCommit(true); 
            int num = Integer.parseInt( tableClick );
            String sql="SELECT * FROM MEAL WHERE MEALID= "+tableClick+" "; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            if(rs.next()){
               
                String s2 = rs.getString("MEALNAME");
                MealTF.setText(s2);
               String s3 = rs.getString("MEALPLAN");
               MealPlanTF.setText(s3); 
                 int sa = rs.getInt("DIETID");
                String s4 = Integer.toString(sa);
                MealDietDD.setSelectedItem(s4);
                int sc = rs.getInt("REPORTID");
                String s7 = Integer.toString(sc);
                ReportMealDD.setSelectedItem(s7);
                int sd = rs.getInt("MEALID");
                String s8 = Integer.toString(sd);
                MealIDTF.setText(s8);
             
            }
         
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
        }
    }//GEN-LAST:event_MealTBLMouseClicked

    private void WorkOutTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkOutTBLMouseClicked
        // TODO add your handling code here:
          // TODO add your handling code here:
        int row = WorkOutTBL.getSelectedRow(); 
            String tableClick = (WorkOutTBL.getModel().getValueAt(row, 0).toString());
            try{
            con.setAutoCommit(true); 
            int num = Integer.parseInt( tableClick );
            String sql="SELECT * FROM WORKOUT WHERE WORKOUT_ID= "+tableClick+" "; 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            
            if(rs.next()){
               
                String s2 = rs.getString("WORKOUT_NAME");
                WorkOutTF.setText(s2);
                int sa = rs.getInt("USERID");
                String s4 = Integer.toString(sa);
                WorkOutDD.setSelectedItem(s4);
                int sc = rs.getInt("REPORTID");
                String s7 = Integer.toString(sc);
                WorkOutReportDD.setSelectedItem(s7);
                int sd = rs.getInt("WORKOUT_ID");
                String s8 = Integer.toString(sd);
                WorkOutIDTF.setText(s8);
                int se = rs.getInt("WORKOUT_BURNED");
                String s1 = Integer.toString(se);
                WorkOutCaloriesTF.setText(s1);
                 
            }
         
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exception WARNING: "+e.getMessage()); 
        }
    }//GEN-LAST:event_WorkOutTBLMouseClicked

    private void DelMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelMealActionPerformed
        // TODO add your handling code here:
        try{
String sql = "DELETE FROM MEAL WHERE MEALID=?";
ps = con.prepareStatement(sql);
ps.setString(1, MealIDTF.getText());
ps.execute();
JOptionPane.showMessageDialog(null, "Meal Record deleted!!");
   User_Table();
         Report_Table();
         Diet_Table();
         WorkOut_Table();
         Meal_Table();
         FillCombo();
         FillCombo2();
         FillCombo3();
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Exception Warning: "+e);

}
    }//GEN-LAST:event_DelMealActionPerformed

    private void UpdateMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateMealActionPerformed

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
            java.util.logging.Logger.getLogger(FitnessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FitnessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FitnessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FitnessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FitnessFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTF;
    private javax.swing.JTextField AgeTF;
    private javax.swing.JTextField CaloriesTF;
    private javax.swing.JButton ClearDiet;
    private javax.swing.JButton ClearMeal;
    private javax.swing.JButton ClearReport;
    private javax.swing.JButton ClearUser;
    private javax.swing.JButton ClearWorkOut;
    private javax.swing.JButton CreateDiet;
    private javax.swing.JButton CreateMeal;
    private javax.swing.JButton CreateReport;
    private javax.swing.JButton CreateUser;
    private javax.swing.JButton CreateWorkOut;
    private javax.swing.JButton DelDiet;
    private javax.swing.JButton DelMeal;
    private javax.swing.JButton DelReport;
    private javax.swing.JButton DelUser;
    private javax.swing.JButton DelWorkOut;
    private javax.swing.JTextField DietIDTF;
    private javax.swing.JTextField DietReportTF;
    private javax.swing.JTable DietTBL;
    private javax.swing.JTextField DietTypeTF;
    private javax.swing.JComboBox<String> DietUserDD;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JTextField FNameTF;
    private javax.swing.JTextField LNameTF;
    private javax.swing.JComboBox<String> MealDietDD;
    private javax.swing.JTextField MealIDTF;
    private javax.swing.JTextField MealPlanTF;
    private javax.swing.JTable MealTBL;
    private javax.swing.JTextField MealTF;
    private javax.swing.JTextField PhoneTF;
    private com.toedter.calendar.JDateChooser ReportDC;
    private javax.swing.JComboBox<String> ReportDD;
    private javax.swing.JComboBox<String> ReportDietDD;
    private javax.swing.JTextField ReportIDTF;
    private javax.swing.JComboBox<String> ReportMealDD;
    private javax.swing.JTable ReportTBL;
    private javax.swing.JButton UpdateDiet;
    private javax.swing.JButton UpdateMeal;
    private javax.swing.JButton UpdateReport;
    private javax.swing.JButton UpdateUser;
    private javax.swing.JButton UpdateWorkOut;
    private javax.swing.JTextField UserIDTF;
    private javax.swing.JTable UserTBL;
    private javax.swing.JTextField WeightTF;
    private javax.swing.JTextField WorkOutCaloriesTF;
    private javax.swing.JComboBox<String> WorkOutDD;
    private javax.swing.JTextField WorkOutIDTF;
    private javax.swing.JComboBox<String> WorkOutReportDD;
    private javax.swing.JTextField WorkOutReportTF;
    private javax.swing.JTable WorkOutTBL;
    private javax.swing.JTextField WorkOutTF;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    // End of variables declaration//GEN-END:variables
}

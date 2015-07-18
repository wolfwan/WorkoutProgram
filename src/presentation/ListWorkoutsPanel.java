/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ListWorkoutsPanel.java
 *
 * Created on Apr 13, 2015, 10:43:00 AM
 */
package presentation;

import javax.swing.table.*;
import business.*;
import domain.*;
import java.util.*;

/**
 *
 * @author wwanless
 */
public class ListWorkoutsPanel extends javax.swing.JPanel {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }
    private WorkoutTableModel model;

    /** Creates new form ListWorkoutsPanel */
    public ListWorkoutsPanel() {

        initComponents();
        setVisible(true);
        //assosiate table with model

        try {
            WorkoutMgr mgr = new WorkoutMgr();
            List<Workout> list = mgr.retrieveAll();
            System.out.println("size " + list.size());
            model = new WorkoutTableModel(list);
            workoutTable.setModel(model);

        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workoutTable = new javax.swing.JTable();

        workoutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(workoutTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workoutTable;
    // End of variables declaration//GEN-END:variables

    private class WorkoutTableModel extends AbstractTableModel {
        
       

        private List<Workout> list;
        //private List<Workout> workouts = new ArrayList();
        private final String[] COLUMN_HEADINGS = {"Date", "Length", "Pushups", "Squats", "Situps", "Minutes Ran"};

         public WorkoutTableModel(List<Workout> list) {
            this.list = list;
        }
        
        @Override
        public int getColumnCount() {
            return COLUMN_HEADINGS.length;
        }

        @Override
        public int getRowCount() {
            return list.size();
        }

        @Override
        public String getColumnName(int column) {
            if (column < 0 || column > 5) {
                return "";
            }
            return COLUMN_HEADINGS[column];
        }

        @Override
        public Object getValueAt(int row, int column) {
            
            Workout w = list.get(row);
            
            if (column == 0) {
                System.out.println("date " + w.getDate());
                return w.getDate();
                
            } else if (column == 1) {
                System.out.println("length " + w.getLength());
                return w.getLength();
                
            }
            
            return "";
        }

    }
}
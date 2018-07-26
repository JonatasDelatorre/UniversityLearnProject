/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Cadastros;

import java.util.ArrayList;
import menu.MenuSecretaria;
import trabalho2.Curso;
import trabalho2.Departamento;
import trabalho2.Materia;
import java.lang.NullPointerException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author delatorre
 */
public class CadastroMateria extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarMateria
     */
    private int mes;
    private int dia;
    private String nivel;
    private Departamento depPrincipal;
    private Curso cursoPrincipal;
    
    public CadastroMateria() {
        initComponents();
        ArrayList<Departamento> depList = MenuSecretaria.getUniversidade().getDepList();
        for(int i = 0; i < depList.size(); i++){
                comboBoxDep.addItem(depList.get(i).getCodDep());
        }
    }
    
    private void alterDia(){
        comboBoxDia.removeAllItems();
        if(this.mes == 1){
            for(int i = 1; i < 29; i++){
                comboBoxDia.addItem(i);
            }
        }
        else if((this.mes == 3 ||this.mes == 5 || this.mes == 8 ||this.mes == 10)){
            for(int i = 1; i < 31; i++){
                comboBoxDia.addItem(i);
            }
        }
        else{
            for(int i = 1; i < 32; i++){
                comboBoxDia.addItem(i);
            }
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

        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bConfirmar = new javax.swing.JButton();
        textCodigo = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textPresenca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxDia = new javax.swing.JComboBox<>();
        textMaxAlunos = new javax.swing.JTextField();
        comboBoxDep = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelDepShow = new javax.swing.JLabel();
        comboBoxMes = new javax.swing.JComboBox<>();
        comboBoxCurso = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        labelCursoShow = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textObservacoes = new javax.swing.JTextPane();

        setClosable(true);
        setIconifiable(true);

        jLabel3.setText("Nome:");

        jLabel9.setText("Ano:");

        jLabel4.setText("Codigo:");

        bConfirmar.setText("Confirmar");
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Presença:");

        jLabel6.setText("Max Alunos:");

        comboBoxDia.setToolTipText("");
        comboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDiaActionPerformed(evt);
            }
        });

        comboBoxDep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamento" }));
        comboBoxDep.setToolTipText("");
        comboBoxDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDepActionPerformed(evt);
            }
        });

        jLabel7.setText("Dia:");

        jLabel1.setText("Departamento:");

        jLabel8.setText("Mes:");

        labelDepShow.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        labelDepShow.setText("Nome");
        labelDepShow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        comboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        comboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMesActionPerformed(evt);
            }
        });

        comboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso" }));
        comboBoxCurso.setToolTipText("");
        comboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCursoActionPerformed(evt);
            }
        });

        jLabel2.setText("Curso:");

        labelCursoShow.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        labelCursoShow.setText("Nome");
        labelCursoShow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setText("Observações:");

        jScrollPane1.setViewportView(textObservacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textNome, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(textCodigo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(textPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMaxAlunos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAno))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bConfirmar)
                                        .addGap(64, 64, 64)
                                        .addComponent(bCancelar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCursoShow, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelDepShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxDep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDepShow, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCursoShow, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textMaxAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConfirmar)
                    .addComponent(bCancelar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        new Materia(textNome.getText(), textCodigo.getText(), Integer.parseInt(textPresenca.getText()), Integer.parseInt(textMaxAlunos.getText()), textObservacoes.getText(), cursoPrincipal);
        this.dispose();
    }//GEN-LAST:event_bConfirmarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        textNome.setText("");
        textCodigo.setText("");
        textPresenca.setText("");
        textMaxAlunos.setText("");
        textAno.setText("");
        comboBoxMes.setSelectedIndex(0);
        comboBoxDia.setSelectedIndex(0);
        comboBoxDep.setSelectedIndex(0);
        comboBoxCurso.setSelectedIndex(0);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void comboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDiaActionPerformed
        this.dia = comboBoxDia.getSelectedIndex();
    }//GEN-LAST:event_comboBoxDiaActionPerformed

    private void comboBoxDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDepActionPerformed
        try{
            String cod = String.valueOf(comboBoxDep.getSelectedItem());
            labelDepShow.setText(MenuSecretaria.getUniversidade().getDepartamento(cod).getNome());
            this.depPrincipal = MenuSecretaria.getUniversidade().getDepartamento(cod);
            
            comboBoxCurso.removeAllItems();
            comboBoxCurso.addItem("Curso");

            
            ArrayList<Curso> cursoList = this.depPrincipal.getCursoList();
            for(int i = 0; i < cursoList.size(); i++){
                    comboBoxCurso.addItem(cursoList.get(i).getCodCurso());
            }
        }
        catch(NullPointerException nullPointerException){
            labelDepShow.setText("Nome");
            this.depPrincipal = null;
            comboBoxCurso.removeAllItems();
            comboBoxCurso.addItem("Curso");
        }
    }//GEN-LAST:event_comboBoxDepActionPerformed

    private void comboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMesActionPerformed
        this.mes = comboBoxMes.getSelectedIndex();
        alterDia();
    }//GEN-LAST:event_comboBoxMesActionPerformed

    private void comboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCursoActionPerformed
       try{     
        String cod = String.valueOf(comboBoxCurso.getSelectedItem());
            labelCursoShow.setText(depPrincipal.getCurso(cod).getNome());
            this.cursoPrincipal = depPrincipal.getCurso(cod);
       }
       catch(NullPointerException nullPointerException){
            labelCursoShow.setText("Nome");
            this.cursoPrincipal = null;
       }
            
    }//GEN-LAST:event_comboBoxCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JComboBox<String> comboBoxCurso;
    private javax.swing.JComboBox<String> comboBoxDep;
    private javax.swing.JComboBox<Integer> comboBoxDia;
    private javax.swing.JComboBox<String> comboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCursoShow;
    private javax.swing.JLabel labelDepShow;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textMaxAlunos;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextPane textObservacoes;
    private javax.swing.JTextField textPresenca;
    // End of variables declaration//GEN-END:variables
}
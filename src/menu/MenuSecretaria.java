/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import Dados.EntradaDados;
import auxiliar.Senhas;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import trabalho2.Universidade;
import view.AlteraInfo;
import view.Cadastros.CadastroProfessor;
import view.Cadastros.CadastroSecretaria;
import view.BurcaString;
import view.MateriaInfo;
import view.Cadastros.CadastroAluno;
import view.Cadastros.CadastroCurso;
import view.Cadastros.CadastroDepartamento;
import view.Cadastros.CadastroMateria;
import view.Cadastros.DadosUniversidade;
import view.CursoInfo;
import view.DepInfo;
import view.LidarMatricula;
import view.RemoveString;
import view.SetProfessorMateria;

/**
 *
 * @author delatorre
 */
public class MenuSecretaria extends javax.swing.JFrame {

    /**
     * Creates new form MenuSecretaria
     */
    private static Universidade uniPrincipal;
    private static Senhas infoLogin;
    private static String self;
    
    public MenuSecretaria() {
        initComponents();
    }
    
    public static void setClasses(Universidade uniPrincipalS, Senhas infoLoginS, String selfS){
        uniPrincipal = uniPrincipalS;
        infoLogin = infoLoginS;
        self = selfS;
    }
    
    public static Universidade getUniversidade(){
        return uniPrincipal;
    }
    
    public static Senhas getSenhas(){
        return infoLogin;
    }
    
    public void removeMembro(int nivel){
        RemoveString remove = new RemoveString(uniPrincipal, infoLogin, nivel);
        desktop1.add(remove);
        remove.setVisible(true);
    }
    
    public void buscaString(int id){
        BurcaString busca = new BurcaString(uniPrincipal, id);
        desktop1.add(busca);
        busca.setVisible(true);
    }
    
    public void buscaString(int id, String self){
        if(!self.equals("adm")){
            BurcaString busca = new BurcaString(uniPrincipal, id, self);
            desktop1.add(busca);
            busca.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Loguin como Administrador", "ERRO", ERROR_MESSAGE);
        }
    }
    
    public void alteraInfo(String label, String self){
        AlteraInfo alterar = new AlteraInfo(uniPrincipal, infoLogin, label, self, 1);
        desktop1.add(alterar);
        alterar.setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        desktop1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuMembros = new javax.swing.JMenu();
        subMenuSecretario = new javax.swing.JMenu();
        cadastrarSecretario = new javax.swing.JMenuItem();
        buscarSecretario = new javax.swing.JMenuItem();
        removerSecretario = new javax.swing.JMenuItem();
        subMenuProfessor = new javax.swing.JMenu();
        cadastrarProfessor = new javax.swing.JMenuItem();
        buscarProfessor = new javax.swing.JMenuItem();
        removerProfessor = new javax.swing.JMenuItem();
        subMenuAluno = new javax.swing.JMenu();
        cadastrarAluno = new javax.swing.JMenuItem();
        buscarAluno = new javax.swing.JMenuItem();
        removerAluno = new javax.swing.JMenuItem();
        menuDepartamento = new javax.swing.JMenu();
        opNovoDep = new javax.swing.JMenuItem();
        opInfoDep = new javax.swing.JMenuItem();
        opRemoverDep = new javax.swing.JMenuItem();
        menuCursos = new javax.swing.JMenu();
        opNovoCurso = new javax.swing.JMenuItem();
        opBuscaCurso = new javax.swing.JMenuItem();
        opRemoveCurso = new javax.swing.JMenuItem();
        menuMaterias = new javax.swing.JMenu();
        opNovaMateria = new javax.swing.JMenuItem();
        opBuscaMateria = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        opMateriaProfessor = new javax.swing.JMenuItem();
        opRemoveMateria = new javax.swing.JMenuItem();
        menuConfig = new javax.swing.JMenu();
        opMinhasInfo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        alterarEmail = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        opSair = new javax.swing.JMenuItem();
        opSalvar = new javax.swing.JMenuItem();
        opSalvarSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktop1Layout = new javax.swing.GroupLayout(desktop1);
        desktop1.setLayout(desktop1Layout);
        desktop1Layout.setHorizontalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        desktop1Layout.setVerticalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenu2.setText("Universidade");

        jMenuItem6.setText("Dados da Universidade");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        menuMembros.setText("Membros");

        subMenuSecretario.setText("Secretario(a)");

        cadastrarSecretario.setText("Cadastrar");
        cadastrarSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarSecretarioActionPerformed(evt);
            }
        });
        subMenuSecretario.add(cadastrarSecretario);

        buscarSecretario.setText("Buscar");
        buscarSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSecretarioActionPerformed(evt);
            }
        });
        subMenuSecretario.add(buscarSecretario);

        removerSecretario.setText("Remover");
        removerSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerSecretarioActionPerformed(evt);
            }
        });
        subMenuSecretario.add(removerSecretario);

        menuMembros.add(subMenuSecretario);

        subMenuProfessor.setText("Professor(a)");

        cadastrarProfessor.setText("Cadastrar");
        cadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProfessorActionPerformed(evt);
            }
        });
        subMenuProfessor.add(cadastrarProfessor);

        buscarProfessor.setText("Buscar");
        buscarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProfessorActionPerformed(evt);
            }
        });
        subMenuProfessor.add(buscarProfessor);

        removerProfessor.setText("Remover");
        removerProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProfessorActionPerformed(evt);
            }
        });
        subMenuProfessor.add(removerProfessor);

        menuMembros.add(subMenuProfessor);

        subMenuAluno.setText("Aluno(a)");

        cadastrarAluno.setText("Cadastrar");
        cadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoActionPerformed(evt);
            }
        });
        subMenuAluno.add(cadastrarAluno);

        buscarAluno.setText("Buscar");
        buscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAlunoActionPerformed(evt);
            }
        });
        subMenuAluno.add(buscarAluno);

        removerAluno.setText("Remover");
        removerAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAlunoActionPerformed(evt);
            }
        });
        subMenuAluno.add(removerAluno);

        menuMembros.add(subMenuAluno);

        jMenuBar1.add(menuMembros);

        menuDepartamento.setText("Departamentos");

        opNovoDep.setText("Novo");
        opNovoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNovoDepActionPerformed(evt);
            }
        });
        menuDepartamento.add(opNovoDep);

        opInfoDep.setText("Buscar");
        opInfoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInfoDepActionPerformed(evt);
            }
        });
        menuDepartamento.add(opInfoDep);

        opRemoverDep.setText("Remover");
        menuDepartamento.add(opRemoverDep);

        jMenuBar1.add(menuDepartamento);

        menuCursos.setText("Cursos");

        opNovoCurso.setText("Novo");
        opNovoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNovoCursoActionPerformed(evt);
            }
        });
        menuCursos.add(opNovoCurso);

        opBuscaCurso.setText("Buscar");
        opBuscaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBuscaCursoActionPerformed(evt);
            }
        });
        menuCursos.add(opBuscaCurso);

        opRemoveCurso.setText("Remover");
        menuCursos.add(opRemoveCurso);

        jMenuBar1.add(menuCursos);

        menuMaterias.setText("Materias");

        opNovaMateria.setText("Novo");
        opNovaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNovaMateriaActionPerformed(evt);
            }
        });
        menuMaterias.add(opNovaMateria);

        opBuscaMateria.setText("Buscar");
        opBuscaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBuscaMateriaActionPerformed(evt);
            }
        });
        menuMaterias.add(opBuscaMateria);

        jMenuItem2.setText("Solicitações de Matricula");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuMaterias.add(jMenuItem2);

        opMateriaProfessor.setText("Escolher Professor");
        opMateriaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMateriaProfessorActionPerformed(evt);
            }
        });
        menuMaterias.add(opMateriaProfessor);

        opRemoveMateria.setText("Remover");
        menuMaterias.add(opRemoveMateria);

        jMenuBar1.add(menuMaterias);

        menuConfig.setText("Configurações");

        opMinhasInfo.setText("Minhas Informações");
        opMinhasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMinhasInfoActionPerformed(evt);
            }
        });
        menuConfig.add(opMinhasInfo);

        jMenu1.setText("Alterar Minhas Informações");

        alterarEmail.setText("Alterar Email");
        alterarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarEmailActionPerformed(evt);
            }
        });
        jMenu1.add(alterarEmail);

        jMenuItem3.setText("Alterar Numero");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Alterar Senha");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        menuConfig.add(jMenu1);

        jMenuBar1.add(menuConfig);

        menuSair.setText("Sair");

        opSair.setText("Sair");
        opSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSairActionPerformed(evt);
            }
        });
        menuSair.add(opSair);

        opSalvar.setText("Salvar");
        opSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSalvarActionPerformed(evt);
            }
        });
        menuSair.add(opSalvar);

        opSalvarSair.setText("Salvar e sair");
        opSalvarSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSalvarSairActionPerformed(evt);
            }
        });
        menuSair.add(opSalvarSair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarSecretarioActionPerformed
        CadastroSecretaria cadastroSecretaria = new CadastroSecretaria();
        desktop1.add(cadastroSecretaria);
        cadastroSecretaria.setVisible(true);
    }//GEN-LAST:event_cadastrarSecretarioActionPerformed

    private void buscarSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSecretarioActionPerformed
        buscaString(1);
    }//GEN-LAST:event_buscarSecretarioActionPerformed

    private void cadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProfessorActionPerformed
        CadastroProfessor cadastroProfessor = new CadastroProfessor();
        desktop1.add(cadastroProfessor);
        cadastroProfessor.setVisible(true);
    }//GEN-LAST:event_cadastrarProfessorActionPerformed

    private void buscarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProfessorActionPerformed
        buscaString(2);
    }//GEN-LAST:event_buscarProfessorActionPerformed

    private void opNovoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNovoDepActionPerformed
        CadastroDepartamento cadastroDepartamento = new CadastroDepartamento();
        desktop1.add(cadastroDepartamento);
        cadastroDepartamento.setVisible(true);
    }//GEN-LAST:event_opNovoDepActionPerformed

    private void opNovoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNovoCursoActionPerformed
        CadastroCurso cadastroCurso = new CadastroCurso();
        desktop1.add(cadastroCurso);
        cadastroCurso.setVisible(true);
    }//GEN-LAST:event_opNovoCursoActionPerformed

    private void opBuscaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBuscaCursoActionPerformed
        CursoInfo cursoInfo = new CursoInfo(uniPrincipal);
        desktop1.add(cursoInfo);
        cursoInfo.setVisible(true);
    }//GEN-LAST:event_opBuscaCursoActionPerformed

    private void opNovaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNovaMateriaActionPerformed
        CadastroMateria cadastroMateria = new CadastroMateria();
        desktop1.add(cadastroMateria);
        cadastroMateria.setVisible(true);
    }//GEN-LAST:event_opNovaMateriaActionPerformed

    private void opBuscaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBuscaMateriaActionPerformed
        MateriaInfo busca = new MateriaInfo(uniPrincipal);
        desktop1.add(busca);
        busca.setVisible(true);
    }//GEN-LAST:event_opBuscaMateriaActionPerformed

    private void opSalvarSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSalvarSairActionPerformed
        EntradaDados.escreveDados(uniPrincipal);
        System.exit(0);
    }//GEN-LAST:event_opSalvarSairActionPerformed

    private void opSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSairActionPerformed

    private void opSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSalvarActionPerformed
        EntradaDados.escreveDados(uniPrincipal);
        EntradaDados.closeOutputFile();
    }//GEN-LAST:event_opSalvarActionPerformed

    private void cadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoActionPerformed
        CadastroAluno cadastroAluno = new CadastroAluno(uniPrincipal);
        desktop1.add(cadastroAluno);
        cadastroAluno.setVisible(true);
    }//GEN-LAST:event_cadastrarAlunoActionPerformed

    private void buscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlunoActionPerformed
        buscaString(3);
    }//GEN-LAST:event_buscarAlunoActionPerformed

    private void removerAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAlunoActionPerformed
        removeMembro(3);
    }//GEN-LAST:event_removerAlunoActionPerformed

    private void removerSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerSecretarioActionPerformed
        removeMembro(1);
    }//GEN-LAST:event_removerSecretarioActionPerformed

    private void removerProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerProfessorActionPerformed
        removeMembro(2);
    }//GEN-LAST:event_removerProfessorActionPerformed

    private void opMateriaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMateriaProfessorActionPerformed
        SetProfessorMateria matProfessor = new SetProfessorMateria();
        desktop1.add(matProfessor);
        matProfessor.setVisible(true);
    }//GEN-LAST:event_opMateriaProfessorActionPerformed

    private void opInfoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInfoDepActionPerformed
        DepInfo depInfo = new DepInfo(uniPrincipal);
        desktop1.add(depInfo);
        depInfo.setVisible(true);
    }//GEN-LAST:event_opInfoDepActionPerformed

    private void opMinhasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMinhasInfoActionPerformed
        buscaString(1, self);
    }//GEN-LAST:event_opMinhasInfoActionPerformed

    private void alterarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarEmailActionPerformed
        alteraInfo("Email", self);
    }//GEN-LAST:event_alterarEmailActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        alteraInfo("Numero", self);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        alteraInfo("Nova Senha", self);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LidarMatricula lidarMatricula = new LidarMatricula();
        desktop1.add(lidarMatricula);
        lidarMatricula.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DadosUniversidade dadosUniversidade = new DadosUniversidade(uniPrincipal);
        desktop1.add(dadosUniversidade);
        dadosUniversidade.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarEmail;
    private javax.swing.JMenuItem buscarAluno;
    private javax.swing.JMenuItem buscarProfessor;
    private javax.swing.JMenuItem buscarSecretario;
    private javax.swing.JMenuItem cadastrarAluno;
    private javax.swing.JMenuItem cadastrarProfessor;
    private javax.swing.JMenuItem cadastrarSecretario;
    private javax.swing.JDesktopPane desktop1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JMenu menuCursos;
    private javax.swing.JMenu menuDepartamento;
    private javax.swing.JMenu menuMaterias;
    private javax.swing.JMenu menuMembros;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem opBuscaCurso;
    private javax.swing.JMenuItem opBuscaMateria;
    private javax.swing.JMenuItem opInfoDep;
    private javax.swing.JMenuItem opMateriaProfessor;
    private javax.swing.JMenuItem opMinhasInfo;
    private javax.swing.JMenuItem opNovaMateria;
    private javax.swing.JMenuItem opNovoCurso;
    private javax.swing.JMenuItem opNovoDep;
    private javax.swing.JMenuItem opRemoveCurso;
    private javax.swing.JMenuItem opRemoveMateria;
    private javax.swing.JMenuItem opRemoverDep;
    private javax.swing.JMenuItem opSair;
    private javax.swing.JMenuItem opSalvar;
    private javax.swing.JMenuItem opSalvarSair;
    private javax.swing.JMenuItem removerAluno;
    private javax.swing.JMenuItem removerProfessor;
    private javax.swing.JMenuItem removerSecretario;
    private javax.swing.JMenu subMenuAluno;
    private javax.swing.JMenu subMenuProfessor;
    private javax.swing.JMenu subMenuSecretario;
    // End of variables declaration//GEN-END:variables
}

package conexão;

import javax.swing.*;

public class Tela_de_acesso extends JFrame {
    private JPanel TelaDeAcesso;
    private JButton button1;

    private void createUIComponents() {
        // TODO: place custom component creation code here


        JButton btn Salvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener(){
            public void actionPerformed(ActioEvent arg0){

               try{

                   Connection con = Conexao.faz_conexao();
                   String sql = "insert into dados_senha(usuario. senha). values (?, ?) ";

                   preparetStatement stmt = con.prepareStatement(sql);

                   stmt.setString(1,tfUsuario.getText());
                   stmt.setString(2,tfSenha.getText());

                   stmt.execute();

                   stmt.close();
                   con.close();
                   JOptionPane.showConfirmDialog(null,"cadastrado");

                   tfUsuario.setText("");
                   tfSenha.setext("");

               }catch (){
                e.printStackTrace();
               }

            }
        });
        btnSalvar.setBounds(10,21,89,23);
        panel.add(btnSalvar);
    }
}

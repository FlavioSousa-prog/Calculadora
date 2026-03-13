import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

private class trataEventosAcao implements ActionListener{
    public void actionPerformed (ActionEvent event) {
        if (event.getSource() == botaoC) teclouC ();
        else if (event.getSource() == botaoCE) teclouCE();
        else if (event.getSource() == botaoPerc) teclouP();
        else if (event.getSource() == botaoVirgula) teclouVirgula();
        else if (event.getSource() == botaoBackspace) teclouBackspace;
        else if (event.getSource() == botao1) teclouNumeros("1");
        else if (event.getSource()) {
            
        }
        {
            
        }
        {
            
        }
        {
            
        }
        {
            
        }
        {
            
        }
    }
}

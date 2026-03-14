package projetocalculadora;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import static sun.tools.jconsole.inspector.XDataViewer.dispose;

public class ProjetoCalculadora extends JFrame implements KeyListener {
    private JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botao0, botaoC, botaoCE, botaoDiv, botaoMultip, botaoMenos, botaoMais, botaoVirgula, botaoTotal, botaoPerc, botaoBackspace;
    private JTextArea roloPapel;
    private JLabel visor, keyCodigo;
    private JScrollPane scroll;
    private double soma = 0;
    private String valor = "", operador = "", valorAnterior = "";
    private Container container;
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JRadioButton botao2dig, botao4dig, botao6dig;
    private ButtonGroup botaoDecimais;
    private int casaDecimais = 2;


    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()  == e.VK_ESCAPE) {
            int selectedOption = JOptionPane.showConfirmDialog(this,"Deseja Sair.mene???");
            if(selectedOption == JOptionPane.YES_NO_OPTION) {
                dispose();
                System.exit (0);
            }
        }
        if (e.getKeyCode() == 67) teclouC();
        if (e.getKeyCode() == 69) teclouCE();
        if (e.getKeyCode() == 8) teclouBackspace();
        if (e.getKeyCode() == 110) teclouVirgula();
        if (((e.getKeyCode() >= e.VK_0) && (e.getKeyCode() <- e.VK_9)) ||
        e.getKeyCode() >= e.VK_NUMPADO) && (e.getKeyCode() <= e.VK_NUMPAD9))) teclouCE(""
                e.getKeyChar());
        if ((e.getKeyCode() == 61 || (e.getKeyCode() == 107)) teclouMais();
        if ((e.getKeyCode() == 45)|| (e.getKeyCode() == 109)) teclouMenos();
        if ((e.getKeyCode() == 59 || (e.getKeyCode() == 111)) teclouDiv();
        if (e.getKeyCode() == 106) teclouMultip();
        if (e.getKeyCode() == 80) teclouP();
        if (e.getKeyCode() == 10) teclouEnter();
    }
    public void keyReleased(KeyEvent e) {

    }
    public void keyTyped(KeyEvent e) {

    }
    public void teclouC() {
        valor = "0";
        visor.setText(formatStrNumerica(valor, casaDecimais));
    }
}
public void teclouCE(){
    valor = "0";
    soma = 0;
    visor.setText(formatStrNumerica(valor, casasDecimais));
    roloPapel.append(alinhaStringDir("---------------------" + ""));
    roloPapel.append(alinhaStringDir("" + "\n"));
}


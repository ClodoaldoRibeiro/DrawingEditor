/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingeditor;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
class Texto {

    public Container CriaPainel()
    {
        // Cria conteudo da area de texto
        String conteudo =  "Escreva um texto dentro da caixa de texto \n" +
                           "Você também pode adicionar novas linhas nesta caixa" +
                            "Escrevendo no editor e clicando no botão";
         
        // Cria componentes
        JLabel rotulo = new JLabel("Insira um texto na caixa:");
        JTextArea area = new JTextArea(conteudo);
        JTextField texto = new JTextField();
        JButton botao = new JButton("Ok");
         
        // Cria evento do botão
        botao.addActionListener((ActionListener)botao.getAction()); // Deveria ser botao.addActionListener(this); mas não aceita
             
        // Adiciona valores as propriedades da area de texto
        area.setFont(new Font("Serif", Font.ITALIC, 15)); 
        area.setLineWrap(true);
        
        area.setWrapStyleWord(true);
         
        // Cria barra de rolagem e adiciona a area de texto
        JScrollPane scrooll = new JScrollPane(area);
         
        // Adiciona valores as propriedades da barra de rolagem
         
        // Barra vertical
        scrooll.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        // Tamanho da barra
        scrooll.setPreferredSize(new Dimension(470, 270));
         
        // Borda com titulo
        scrooll.setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createCompoundBorder(
                                BorderFactory.createTitledBorder("Caixa de Texto"),
                                BorderFactory.createEmptyBorder(10,10,10,10)),
                                scrooll.getBorder()));
         
         
        // Cria o painel
        JPanel painel = new  JPanel();
         
        // Cria um layout para os componentes
        painel.setLayout(new BoxLayout(painel,BoxLayout.PAGE_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
         
        // Alinha componentes
        rotulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        area.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
         
        // Adiciona componentes no painel
        painel.add(rotulo);
        painel.add(Box.createVerticalStrut(10));
         
        // Adiciona a barra de rolagem pois a area de texto
        // está já foi adiciona dentro dela logo acima.
        painel.add(scrooll);
        painel.add(Box.createVerticalStrut(5));
        painel.add(texto);
        painel.add(Box.createVerticalStrut(5));
        painel.add(botao);
                     
        // Retorna o painel
        return painel;
    }
}

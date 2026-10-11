package view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    
    public TelaPrincipal() {
        setTitle("BrasaGest - Sistema de Gestão");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela no ecrã
        
        // Layout principal da janela
        setLayout(new BorderLayout());
        
        // Topo: Título do Sistema
        JLabel lblTitulo = new JLabel("BrasaGest - Painel Principal", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(lblTitulo, BorderLayout.NORTH);
        
        // Centro: Botões de navegação dos módulos
        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new GridLayout(2, 2, 15, 15));
        panelBotoes.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        
        JButton btnPedidos = new JButton("Gerenciar Pedidos");
        JButton btnProdutos = new JButton("Cardápio / Produtos");
        JButton btnEstoque = new JButton("Controle de Insumos");
        JButton btnFuncionarios = new JButton("Funcionários");
        
        // Estilizando os botões
        Font fontBotao = new Font("Arial", Font.PLAIN, 14);
        btnPedidos.setFont(fontBotao);
        btnProdutos.setFont(fontBotao);
        btnEstoque.setFont(fontBotao);
        btnFuncionarios.setFont(fontBotao);
        
        JFrame instanciaAtual = this;
        
        // Ação do botão de Funcionários
        btnFuncionarios.addActionListener(e -> {
            new TelaFuncionarios(instanciaAtual).setVisible(true);
            instanciaAtual.setVisible(false);
        });
        
        // Ação do botão de Cardápio / Produtos
        btnProdutos.addActionListener(e -> {
            new TelaCardapio(instanciaAtual).setVisible(true);
            instanciaAtual.setVisible(false);
        });
        
        // Ação do botão de Controle de Insumos
        btnEstoque.addActionListener(e -> {
            new TelaInsumos(instanciaAtual).setVisible(true);
            instanciaAtual.setVisible(false);
        });
        
     // Ação do botão de Controle de Pedidos
        btnPedidos.addActionListener(e -> {
            new TelaPedidos(instanciaAtual).setVisible(true);
            instanciaAtual.setVisible(false);
        });
        
        panelBotoes.add(btnPedidos);
        panelBotoes.add(btnProdutos);
        panelBotoes.add(btnEstoque);
        panelBotoes.add(btnFuncionarios);
        
        add(panelBotoes, BorderLayout.CENTER);
        
        // Rodapé: Informações
        JLabel lblRodape = new JLabel("Status: Sistema pronto para uso", SwingConstants.CENTER);
        lblRodape.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(lblRodape, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
}
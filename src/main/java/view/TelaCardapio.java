package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaCardapio extends JFrame {

    public TelaCardapio(JFrame telaPrincipal) {
        setTitle("BrasaGest - Cardápio");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Título
        JLabel lblTitulo = new JLabel("Cardápio - Churrasquinho do TonhãO", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        add(lblTitulo, BorderLayout.NORTH);

        // Sistema de Abas (JTabbedPane)
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Arial", Font.PLAIN, 14));

        tabbedPane.addTab("Espetinhos", criarPainelEspetinhos());
        tabbedPane.addTab("Jantinha e Porções", criarPainelJantinhas());
        tabbedPane.addTab("Bebidas", criarPainelBebidas());

        add(tabbedPane, BorderLayout.CENTER);

        // Rodapé com botão de retorno
        JPanel panelSul = new JPanel();
        panelSul.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 10));
        JButton btnVoltar = new JButton("Retornar à Tela Principal");
        btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));

        btnVoltar.addActionListener(e -> {
            dispose();
            if (telaPrincipal != null) {
                telaPrincipal.setVisible(true);
            }
        });

        panelSul.add(btnVoltar);
        add(panelSul, BorderLayout.SOUTH);
    }

    private JPanel criarPainelEspetinhos() {
        JPanel painel = new JPanel(new BorderLayout());
        String[] colunas = {"Categoria", "Item", "Preço (R$)"};
        Object[][] dados = {
            {"Bovinos", "Carne De Sol", "25,00"},
            {"Bovinos", "Contra File", "15,00"},
            {"Bovinos", "Contra File Especial", "25,00"},
            {"Bovinos", "Cupim", "29,00"},
            {"Bovinos", "Filé Mignon", "29,00"},
            {"Bovinos", "Picanha", "29,00"},
            {"Bovinos", "Kafta C/ Queijo", "12,00"},
            {"Aves", "Asa De Frango", "14,00"},
            {"Aves", "Coração", "13,00"},
            {"Aves", "Filé De Frango", "12,00"},
            {"Aves", "Medalhão de Frango", "13,00"},
            {"Suíno", "Lombo Suíno", "12,00"},
            {"Suíno", "Linguiça Suína", "13,00"},
            {"Suíno", "Linguiça Suína Apimentada", "13,00"},
            {"Outros", "Pão de Alho", "10,00"},
            {"Outros", "Queijo Provolone", "13,00"},
            {"Outros", "Queijo Provolone C/ Mel", "15,00"},
            {"Outros", "Queijo Coalho", "13,00"},
            {"Outros", "Queijo Coalho C/ Mel", "15,00"}
        };
        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));
        painel.add(new JScrollPane(tabela), BorderLayout.CENTER);
        return painel;
    }

    private JPanel criarPainelJantinhas() {
        JPanel painel = new JPanel(new BorderLayout());
        String[] colunas = {"Categoria", "Item", "Preço (R$)"};
        Object[][] dados = {
            {"Jantinhas", "Para mesa (arroz, tropeiro/caldo, mandioca, vinagrete)", "14,50"},
            {"Jantinhas", "Para levar (arroz, tropeiro/caldo, mandioca, vinagrete)", "15,50"},
            {"Porções Individuais", "Arroz Branco", "9,00"},
            {"Porções Individuais", "Arroz Frito", "10,00"},
            {"Porções Individuais", "Batata Frita (G)", "22,00"},
            {"Porções Individuais", "Batata Frita (P)", "17,00"},
            {"Porções Individuais", "Couve Refogada", "8,00"},
            {"Porções Individuais", "Feijão de Caldo", "8,00"},
            {"Porções Individuais", "Feijão Tropeiro", "9,50"},
            {"Porções Individuais", "Mandioca Cozida", "7,00"},
            {"Porções Individuais", "Mandioca Frita (G)", "18,00"},
            {"Porções Individuais", "Mandioca Frita (P)", "12,00"},
            {"Porções Individuais", "Vinagrete", "7,00"},
            {"Porções Individuais", "Torresmo", "20,00"},
            {"Porções Mistas", "Arroz Branco/Feijão Tropeiro", "12,00"},
            {"Porções Mistas", "Arroz Branco/Mandioca Cozida", "10,00"},
            {"Porções Mistas", "Arroz frito/Feijão Tropeiro", "13,00"}
        };
        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));
        painel.add(new JScrollPane(tabela), BorderLayout.CENTER);
        return painel;
    }

    private JPanel criarPainelBebidas() {
        JPanel painel = new JPanel(new BorderLayout());
        String[] colunas = {"Categoria", "Item", "Preço (R$)"};
        Object[][] dados = {
            {"Sucos", "Laranja - 300ml", "12,00"},
            {"Sucos", "Laranja - 300ml (só o caldo)", "15,00"},
            {"Sucos", "Laranja - 500ml", "15,00"},
            {"Sucos", "Laranja - 750ml (Jarra)", "18,00"},
            {"Refrigerantes", "Refrigerante (2 Litros)", "16,00"},
            {"Refrigerantes", "Refrigerante (1 Litro)", "12,00"},
            {"Refrigerantes", "Refrigerante (600 ml)", "9,00"},
            {"Refrigerantes", "Refrigerante Lata (350 ml)", "7,00"},
            {"Outros", "Água S/ Gás", "3,50"},
            {"Outros", "Água C/ Gás", "4,50"},
            {"Outros", "Água Tônica", "7,00"},
            {"Outros", "Energético RedBull", "12,00"},
            {"Outros", "H2OH!", "8,00"},
            {"Outros", "Suco Lata", "7,00"}
        };
        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));
        painel.add(new JScrollPane(tabela), BorderLayout.CENTER);
        return painel;
    }
}
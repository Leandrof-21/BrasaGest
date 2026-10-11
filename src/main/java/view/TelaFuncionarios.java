package view;

import model.Cargo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaFuncionarios extends JFrame {

    public TelaFuncionarios(JFrame telaPrincipal) {
        setTitle("BrasaGest - Gestão de Funcionários");
        setSize(550, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Título
        JLabel lblTitulo = new JLabel(" Lista de Funcionários", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        add(lblTitulo, BorderLayout.NORTH);

        // Tabela com o funcionário solicitado
        String[] colunas = {"ID", "Nome", "Cargo", "Login"};
        Object[][] dados = {
            {1, "Wellington B. de Sousa", Cargo.CHURRASQUEIRO, "wellington"}
        };

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        JTable tabela = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        add(scrollPane, BorderLayout.CENTER);

        // Painel inferior com botão de voltar
        JPanel panelSul = new JPanel();
        panelSul.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 10));
        JButton btnVoltar = new JButton("Retornar à Tela Principal");
        btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Ação do botão para voltar
        btnVoltar.addActionListener(e -> {
            dispose(); // Fecha a janela atual de funcionários
            if (telaPrincipal != null) {
                telaPrincipal.setVisible(true); // Reabre a tela principal
            }
        });

        panelSul.add(btnVoltar);
        add(panelSul, BorderLayout.SOUTH);
    }
}
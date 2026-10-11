package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TelaPedidos extends JFrame {

    private JTable tabelaPedidos;
    private DefaultTableModel tableModel;

    public TelaPedidos(JFrame telaPrincipal) {
        setTitle("BrasaGest - Gerenciamento de Pedidos");
        setSize(950, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Título
        JLabel lblTitulo = new JLabel("Painel de Gestão de Pedidos", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        add(lblTitulo, BorderLayout.NORTH);

        // Colunas essenciais solicitadas
        String[] colunas = {
            "ID", "Local", "Mesa / Cliente", "Status", 
            "Data e Horário", "Forma de Pagamento", "Pagamento"
        };

        tableModel = new DefaultTableModel(colunas, 0);
        carregarPedidosExemplo();

        tabelaPedidos = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tabelaPedidos);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        add(scrollPane, BorderLayout.CENTER);

        // Painel inferior com botões de ação e retorno
        JPanel panelSul = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelSul.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 10));

        JButton btnNovoPedido = new JButton("Novo Pedido");
        JButton btnAtualizarStatus = new JButton("Atualizar Status");
        JButton btnVoltar = new JButton("Retornar à Tela Principal");

        Font fontBotao = new Font("Arial", Font.PLAIN, 14);
        btnNovoPedido.setFont(fontBotao);
        btnAtualizarStatus.setFont(fontBotao);
        btnVoltar.setFont(fontBotao);

        // Ação para atualizar o status do pedido selecionado
        btnAtualizarStatus.addActionListener(e -> {
            int linha = tabelaPedidos.getSelectedRow();
            if (linha >= 0) {
                String[] opcoes = {"Pendente", "Em Preparo", "Pronto", "Entregue", "Cancelado"};
                String novoStatus = (String) JOptionPane.showInputDialog(
                    this, "Selecione o novo status:", "Atualizar Status",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
                );
                if (novoStatus != null) {
                    tabelaPedidos.setValueAt(novoStatus, linha, 3); // Coluna do Status
                    JOptionPane.showMessageDialog(this, "Status atualizado com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um pedido na tabela.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Ação do botão de novo pedido
        btnNovoPedido.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Módulo de lançamento de novo pedido.");
        });

        // Ação para retornar à tela principal
        btnVoltar.addActionListener(e -> {
            dispose();
            if (telaPrincipal != null) {
                telaPrincipal.setVisible(true);
            }
        });

        panelSul.add(btnNovoPedido);
        panelSul.add(btnAtualizarStatus);
        panelSul.add(btnVoltar);
        add(panelSul, BorderLayout.SOUTH);
    }

    private void carregarPedidosExemplo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataHoraAtual = LocalDateTime.now().format(formatter);

        Object[][] dadosIniciais = {
            {1, "Salão Principal", "Mesa 04 (Carlos)", "Em Preparo", dataHoraAtual, "Cartão de Crédito", "Após a refeição"},
            {2, "Salão Principal", "Mesa 02 (Ana)", "Pronto", dataHoraAtual, "Pix", "Antes da refeição"},
            {3, "Balcão / Viagem", "João", "Pendente", dataHoraAtual, "Dinheiro", "Antes da refeição"}
        };

        for (Object[] linha : dadosIniciais) {
            tableModel.addRow(linha);
        }
    }
}
package view;

import model.Insumo;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TelaInsumos extends JFrame {

    private List<Insumo> listaInsumos;
    private List<TabelaCategoria> tabelasCategorias;

    public TelaInsumos(JFrame telaPrincipal) {
        setTitle("BrasaGest - Controle de Insumos e Estoque");
        setSize(850, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Controle de Estoque e Matérias-Primas", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        add(lblTitulo, BorderLayout.NORTH);

        listaInsumos = new ArrayList<>();
        tabelasCategorias = new ArrayList<>();
        int id = 1;

        // Bovinos (Ordenado Alfabeticamente)
        List<Insumo> bovinos = new ArrayList<>();
        bovinos.add(new Insumo(id++, "Carne De Sol", 15.0, "kg"));
        bovinos.add(new Insumo(id++, "Contra File", 15.0, "kg"));
        bovinos.add(new Insumo(id++, "Cupim", 15.0, "kg"));
        bovinos.add(new Insumo(id++, "Filé Mignon", 15.0, "kg"));
        bovinos.add(new Insumo(id++, "Kafta", 20.0, "unidades"));
        bovinos.add(new Insumo(id++, "Picanha", 15.0, "kg"));
        bovinos.sort(Comparator.comparing(Insumo::getNome));

        // Aves (Ordenado Alfabeticamente)
        List<Insumo> aves = new ArrayList<>();
        aves.add(new Insumo(id++, "Asa De Frango", 15.0, "kg"));
        aves.add(new Insumo(id++, "Coração", 12.0, "kg"));
        aves.add(new Insumo(id++, "Filé De Frango", 15.0, "kg"));
        aves.add(new Insumo(id++, "Medalhão de Frango", 15.0, "kg"));
        aves.sort(Comparator.comparing(Insumo::getNome));

        // Suíno (Ordenado Alfabeticamente)
        List<Insumo> suino = new ArrayList<>();
        suino.add(new Insumo(id++, "Linguiça Suína", 15.0, "kg"));
        suino.add(new Insumo(id++, "Linguiça Suína Apimentada", 15.0, "kg"));
        suino.add(new Insumo(id++, "Lombo Suíno", 12.0, "kg"));
        suino.sort(Comparator.comparing(Insumo::getNome));

        // Outros (Ordenado Alfabeticamente)
        List<Insumo> outros = new ArrayList<>();
        outros.add(new Insumo(id++, "Mel", 5.0, "kg"));
        outros.add(new Insumo(id++, "Pão de Alho", 30.0, "unidades"));
        outros.add(new Insumo(id++, "Queijo", 5.0, "kg"));
        outros.add(new Insumo(id++, "Queijo Coalho", 10.0, "kg"));
        outros.add(new Insumo(id++, "Queijo Provolone", 10.0, "kg"));
        outros.sort(Comparator.comparing(Insumo::getNome));

        // Sucos, Frutas e Polpas (Ordenado Alfabeticamente)
        List<Insumo> frutasPolpas = new ArrayList<>();
        frutasPolpas.add(new Insumo(id++, "Laranja", 50.0, "kg"));
        frutasPolpas.add(new Insumo(id++, "Limão", 20.0, "kg"));
        frutasPolpas.add(new Insumo(id++, "Polpa - Abacaxi", 20.0, "unidades"));
        frutasPolpas.add(new Insumo(id++, "Polpa - Abacaxi c/ Hortelã", 20.0, "unidades"));
        frutasPolpas.add(new Insumo(id++, "Polpa - Acerola", 20.0, "unidades"));
        frutasPolpas.add(new Insumo(id++, "Polpa - Cupuaçu", 20.0, "unidades"));
        frutasPolpas.add(new Insumo(id++, "Polpa - Maracujá", 20.0, "unidades"));
        frutasPolpas.add(new Insumo(id++, "Polpa - Morango", 20.0, "unidades"));
        frutasPolpas.sort(Comparator.comparing(Insumo::getNome));

        // Bebidas e Refrigerantes (Ordenado Alfabeticamente)
        List<Insumo> bebidas = new ArrayList<>();
        bebidas.add(new Insumo(id++, "Água C/ Gás", 40.0, "unidades"));
        bebidas.add(new Insumo(id++, "Água S/ Gás", 40.0, "unidades"));
        bebidas.add(new Insumo(id++, "Água Tônica", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Energético RedBull", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "H2OH!", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 1L - Coca-Cola", 15.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 2L - Coca-Cola", 15.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 2L - Coca-Cola Zero", 15.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 600ml - Coca-Cola", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 600ml - Coca-Cola Zero", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 600ml - Fanta", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 600ml - Guaraná Antarctica", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 600ml - Guaraná Antarctica Zero", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante 600ml - Soda", 20.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante Lata - Coca-Cola", 30.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante Lata - Coca-Cola Zero", 30.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante Lata - Fanta", 30.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante Lata - Guaraná Antarctica", 30.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante Lata - Guaraná Antarctica Zero", 30.0, "unidades"));
        bebidas.add(new Insumo(id++, "Refrigerante Lata - Soda", 30.0, "unidades"));
        bebidas.add(new Insumo(id++, "Suco Lata", 20.0, "unidades"));
        bebidas.sort(Comparator.comparing(Insumo::getNome));

        // Adiciona tudo à lista geral de controle
        listaInsumos.addAll(bovinos);
        listaInsumos.addAll(aves);
        listaInsumos.addAll(suino);
        listaInsumos.addAll(outros);
        listaInsumos.addAll(frutasPolpas);
        listaInsumos.addAll(bebidas);

        JPanel painelConteudo = new JPanel();
        painelConteudo.setLayout(new BoxLayout(painelConteudo, BoxLayout.Y_AXIS));
        painelConteudo.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        painelConteudo.add(criarSecao("Bovinos", bovinos));
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 15)));

        painelConteudo.add(criarSecao("Aves", aves));
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 15)));

        painelConteudo.add(criarSecao("Suíno", suino));
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 15)));

        painelConteudo.add(criarSecao("Outros", outros));
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 15)));

        painelConteudo.add(criarSecao("Sucos, Frutas e Polpas", frutasPolpas));
        painelConteudo.add(Box.createRigidArea(new Dimension(0, 15)));

        painelConteudo.add(criarSecao("Bebidas e Refrigerantes", bebidas));

        JScrollPane scrollPane = new JScrollPane(painelConteudo);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelSul = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelSul.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 10));

        JButton btnAlterarQtd = new JButton("Alterar Quantidade do Item Selecionado");
        btnAlterarQtd.setFont(new Font("Arial", Font.PLAIN, 14));
        btnAlterarQtd.addActionListener(e -> alterarQuantidadeSelecionada());

        JButton btnVoltar = new JButton("Retornar à Tela Principal");
        btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnVoltar.addActionListener(e -> {
            dispose();
            if (telaPrincipal != null) {
                telaPrincipal.setVisible(true);
            }
        });

        panelSul.add(btnAlterarQtd);
        panelSul.add(btnVoltar);
        add(panelSul, BorderLayout.SOUTH);
    }

    private JPanel criarSecao(String tituloCategoria, List<Insumo> itens) {
        JPanel painelSecao = new JPanel(new BorderLayout());
        painelSecao.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createEtchedBorder(), 
            tituloCategoria, 
            TitledBorder.LEFT, 
            TitledBorder.TOP, 
            new Font("Arial", Font.BOLD, 14), 
            Color.DARK_GRAY
        ));

        String[] colunas = {"ID", "Nome do Insumo / Item", "Qtd Estoque", "Unidade de Medida"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Insumo insumo : itens) {
            model.addRow(new Object[]{
                insumo.getId(),
                insumo.getNome(),
                insumo.getQtdEstoque(),
                insumo.getUnidadeMedida()
            });
        }

        JTable tabela = new JTable(model);
        tabela.setFillsViewportHeight(true);

        int alturaTabela = Math.min(itens.size() * 20 + 35, 150);
        tabela.setPreferredScrollableViewportSize(new Dimension(750, alturaTabela));

        JScrollPane scrollTabela = new JScrollPane(tabela);
        painelSecao.add(scrollTabela, BorderLayout.CENTER);

        tabelasCategorias.add(new TabelaCategoria(tabela, model));
        return painelSecao;
    }

    private void alterarQuantidadeSelecionada() {
        JTable tabelaAtiva = null;
        int linhaSelecionada = -1;

        for (TabelaCategoria tc : tabelasCategorias) {
            if (tc.tabela.getSelectedRow() != -1) {
                tabelaAtiva = tc.tabela;
                linhaSelecionada = tc.tabela.getSelectedRow();
                break;
            }
        }

        if (linhaSelecionada >= 0 && tabelaAtiva != null) {
            int idInsumo = (int) tabelaAtiva.getValueAt(linhaSelecionada, 0);
            Insumo insumoSelecionado = null;
            for (Insumo i : listaInsumos) {
                if (i.getId() == idInsumo) {
                    insumoSelecionado = i;
                    break;
                }
            }

            if (insumoSelecionado != null) {
                String novaQtdStr = JOptionPane.showInputDialog(
                    this, 
                    "Nova quantidade para " + insumoSelecionado.getNome() + " (" + insumoSelecionado.getUnidadeMedida() + "):", 
                    insumoSelecionado.getQtdEstoque()
                );
                if (novaQtdStr != null) {
                    try {
                        double novaQtd = Double.parseDouble(novaQtdStr.replace(",", "."));
                        insumoSelecionado.setQtdEstoque(novaQtd);
                        tabelaAtiva.setValueAt(novaQtd, linhaSelecionada, 2);
                        JOptionPane.showMessageDialog(this, "Estoque atualizado com sucesso!");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item em qualquer uma das categorias para alterar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private static class TabelaCategoria {
        JTable tabela;
        DefaultTableModel modelo;

        public TabelaCategoria(JTable tabela, DefaultTableModel modelo) {
            this.tabela = tabela;
            this.modelo = modelo;
        }
    }
}
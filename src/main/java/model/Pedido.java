package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private String nomeCliente;
    private String telefoneCliente;
    private TipoConsumo tipoConsumo;
    private Integer numeroMesa;
    private String endereco;
    private StatusPedido status;
    private FormaPagamento formaPagamento;
    private MomentoPagamento momentoPagamento;
    private LocalDateTime dataHora;
    private int notaFeedback;
    private String comentarioFeedback;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int id, String nomeCliente, String telefoneCliente, TipoConsumo tipoConsumo,
                   Integer numeroMesa, String endereco, StatusPedido status,
                   FormaPagamento formaPagamento, MomentoPagamento momentoPagamento,
                   LocalDateTime dataHora, int notaFeedback, String comentarioFeedback) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.tipoConsumo = tipoConsumo;
        this.numeroMesa = numeroMesa;
        this.endereco = endereco;
        this.status = status;
        this.formaPagamento = formaPagamento;
        this.momentoPagamento = momentoPagamento;
        this.dataHora = dataHora;
        this.notaFeedback = notaFeedback;
        this.comentarioFeedback = comentarioFeedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public TipoConsumo getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(TipoConsumo tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public MomentoPagamento getMomentoPagamento() {
        return momentoPagamento;
    }

    public void setMomentoPagamento(MomentoPagamento momentoPagamento) {
        this.momentoPagamento = momentoPagamento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public int getNotaFeedback() {
        return notaFeedback;
    }

    public void setNotaFeedback(int notaFeedback) {
        this.notaFeedback = notaFeedback;
    }

    public String getComentarioFeedback() {
        return comentarioFeedback;
    }

    public void setComentarioFeedback(String comentarioFeedback) {
        this.comentarioFeedback = comentarioFeedback;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
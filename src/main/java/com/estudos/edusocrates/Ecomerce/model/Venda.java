package com.estudos.edusocrates.Ecomerce.model;

import java.math.BigDecimal;

public class Venda {

    private Long cd_operacao;
    private Long cd_cliente;
    private Integer qtd_ingressos;
    private BigDecimal vl_total;
    private String status;

    public Long getCd_operacao() {
        return cd_operacao;
    }

    public void setCd_operacao(Long cd_operacao) {
        this.cd_operacao = cd_operacao;
    }

    public Long getCd_cliente() {
        return cd_cliente;
    }

    public void setCd_cliente(Long cd_cliente) {
        this.cd_cliente = cd_cliente;
    }

    public Integer getQtd_ingressos() {
        return qtd_ingressos;
    }

    public void setQtd_ingressos(Integer qtd_ingressos) {
        this.qtd_ingressos = qtd_ingressos;
    }

    public BigDecimal getVl_total() {
        return vl_total;
    }

    public void setVl_total(BigDecimal vl_total) {
        this.vl_total = vl_total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Venda(Long cd_operacao, Long cd_cliente, Integer qtd_ingressos, BigDecimal vl_total) {
        this.cd_operacao = cd_operacao;
        this.cd_cliente = cd_cliente;
        this.qtd_ingressos = qtd_ingressos;
        this.vl_total = vl_total;
    }


    @Override
    public String toString() {
        return "Venda{" +
                "cd_operacao=" + cd_operacao +
                ", cd_cliente=" + cd_cliente +
                ", qtd_ingressos=" + qtd_ingressos +
                ", vl_total=" + vl_total +
                ", status='" + status + '\'' +
                '}';
    }
}

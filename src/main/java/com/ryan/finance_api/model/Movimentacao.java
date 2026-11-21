package com.ryan.finance_api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {
    private UUID id;
    private String descricao;
    private BigDecimal valor;
    private TipoMovimentacao tipo;
    private FormaPagamento formaPagamento;
    private LocalDate data;
}

package com.ryan.finance_api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.ryan.finance_api.model.FormaPagamento;
import com.ryan.finance_api.model.TipoMovimentacao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record MovimentacaoRequestDTO(
    @NotBlank(message = "A descrição é obrigatória")
    String descricao,

    @NotNull(message = "O valor é obrigatório")
    @Positive(message = "O valor deve ser maior que zero")
    BigDecimal valor,

    @NotNull(message = "O tipo de movimentação é obrigatório")
    TipoMovimentacao tipo,

    @NotNull(message = "A forma de pagamento é obrigatória")
    FormaPagamento formaPagamento,

    @NotNull(message = "A data é obrigatória")
    LocalDate data
) {    
}

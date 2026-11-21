package com.ryan.finance_api.dto;

import java.math.BigDecimal;

public record ResumoFinanceiroResponseDTO(
    BigDecimal saldoAtual,
    BigDecimal totalGastoCredito,
    BigDecimal totalGastoDebito,
    BigDecimal totalGuardado
) {
}
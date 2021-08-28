package one.digitalinovattion.collections

import java.math.BigDecimal

//Declaração de função estendida.
fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor
}

//Declaração de função estendida.
fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
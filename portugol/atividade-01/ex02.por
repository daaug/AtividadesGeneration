programa {
	funcao inicio() {
		inteiro ano
		inteiro meses
		inteiro dias
		
		escreva("Digite sua idade em dias: ")
		leia(dias)
		
		ano = dias / 365
		meses = (dias % 365) / 30
		dias = (dias % 365) % 30
		
		escreva("Voce possui: ", ano, " anos, ", meses, " meses e ", dias, " dias")
	}
}

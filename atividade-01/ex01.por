programa {
    
	funcao inicio() {
	    inteiro anos
	    inteiro meses
	    inteiro dias
	    inteiro soma_tudo
	    
		escreva("Insira sua idade em anos: ")
		leia(anos)
		escreva("Quantos meses: ")
		leia(meses)
		escreva("Quantos dias: ")
	    leia(dias)
	    
	    soma_tudo = (anos * 365) + (meses * 30) + dias
	    
	    escreva("Voce ja viveu por: ", soma_tudo)
	    
	}
}

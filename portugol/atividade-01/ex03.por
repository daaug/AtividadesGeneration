programa {
	funcao inicio() {
	
	    inteiro seg, min, horas
		
		escreva("\nTempo de Duração de um Evento em uma Fábrica")
		
		escreva("\nEntre com o Tempo em segundos: ")
		leia(seg)
		horas = seg / 3600
		min = (seg -(horas*3600))/60
		seg = (seg-(horas*3600)-(min*60))
		escreva(horas," Horas,", min," minutos e ", seg, " segundos")
    }
}

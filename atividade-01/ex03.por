programa {
    
	funcao inicio() {
	    real horas = 0.0
	    real minutos = 0.0
	    real segundos = 0.0
	    inteiro soma_tudo
	    
        escreva("Quantos segundos de evento: ")
        //leia(segundos)
        segundos = 3600.0
        
        minutos = segundos / 60
        horas = ((segundos / 60) / 60)
        segundos = segundos - (minutos * 60)
        
        escreva("\nHoras: ", horas, "\nMinutos: ", minutos, "\nSegundos: ", segundos)
        
	    
	}
}

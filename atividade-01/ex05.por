programa {
	funcao inicio() {
        real nota01 = 0
        real nota02 = 0
        real nota03 = 0
        real resultado = 0
        
        escreva("\nNota 01: ", nota01)
        //leia(nota01)
        escreva("\nNota 02: ", nota02)
        //leia(nota02)
        escreva("\nNota 03: ", nota03)
        //leia(nota03)
        
        nota01 = 5
        nota02 = 3.5
        nota03 = 8
        
        resultado = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)) / (2+3+5)
        
        escreva("\nResultado: ", resultado)
        
	}
}

programa {
	funcao inicio() {
		real porcent_distribuidor = 1.28
		real porcent_imposto = 1.45
        real custo_fabrica = 0
        real custo_consumidor = 0
        limpa()
        
        escreva("\nCusto de Fabrica: ")
        //leia(custo_fabrica)
        custo_fabrica = 1000
        custo_consumidor = custo_fabrica * porcent_distribuidor * porcent_imposto
        
        escreva("\nResultado: ", custo_consumidor)
        
	}
}

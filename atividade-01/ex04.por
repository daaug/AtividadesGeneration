programa {
    inclua biblioteca Matematica-->m
	funcao inicio() {
	    
        inteiro a = 0
        inteiro b = 0
        inteiro c = 0
        real d = 0
        real r = 0
        real s = 0
        
        escreva("\nInsira o valor de A: ", a)
        //leia(a)
        escreva("\nInsira o valor de B: ", b)
        //leia(b)
        escreva("\nInsira o valor de C: ", c)
        //leia(c)
        
        a = 10
        b = 20
        c = 30
        
        
        r = (a + b)
        r = m.potencia(r,2)
        s = (b + c)
        s = m.potencia(s,2)
        
        d = (r + s) / 2
        
        escreva("\nResultado: ", d)
        
	}
}

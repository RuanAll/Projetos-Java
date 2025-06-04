package Zteste;

class Lista {                               
	No inicio;                              // Ponteiro para o inicio da Lista
	int tamanho;                            // Tamanho da lista

    public void inserir(Contato info) {     // Metodo para inserir no inicio
       No no = new No();                   	// Cria um No
       no.info = info;                    	// Atribui a informação ao no
       no.proximo = inicio;               	// O ponteiro próximo do no inserido aponta para o inicio
       inicio = no;                        	// O inicio passa a ser esse novo no
       tamanho++;                          	// Incrementa o tamanho
    }

    public void remover(Contato info) {
    	
    }
    
    public Contato buscar(int codigo) {     // Metodo buscar pelo codigo
       No no = inicio;                    	// Vai para o inicio da lista
       while (no != null) {                	// Enquanto o no nao for nulo
           if (no.info.codigo == codigo) { 	// Se o codigo do no for igual ao parametro passado
               return no.info;             	// retorna a informacao do tipo Codigo
           }
           no = no.proximo;                	// Vai para o proximo no
       }
       return null;
    }

    public String toString() {              // Sobrescreve o metodo toString
       String out = "";                    	// Cria uma string vazia para retorno
       No no = inicio;                     	// Vai para o inicio da lista
       while (no != null) {                	// Enquanto o no for diferente de nulo
           out += no.info + " ";           	// Adiciona a string a informacao
           no = no.proximo;                	// Vai para o proximo no
       }
       return out;                         	// Retorna a string
    }
}

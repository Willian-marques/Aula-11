//define um "contrato" para qualquer classe que quiser autenticar 
public interface Autenticavel{

    //metodo que TODA classe que implentar essa interface será OBRIGADA a definir
    void autenticar(String usuario, String senha);

}
 
//Interface: define um contrato, e nao uma classe com logica
//O metodo autenticar nao tem corpo, ele apenas diz o que
// deve existir em quem implementar.
//Toda classe que implementar Autenticabel devera obrigatoriamente
//criar esse metodo.


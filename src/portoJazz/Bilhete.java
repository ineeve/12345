package portoJazz;
import java.util.Random;


public class Bilhete {
	
	private String codigo;
	private float preco;
	private String tipo;
	
	public Bilhete()
	{
		this.codigo = getSaltString();
		this.preco = 0.00f;
		this.tipo = "";
	}
	
//GETTERS
	
	//Gera um codigo aleatório de 7 valores numeros e letras
	private String getSaltString() 
	{
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 7) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
        
    }

	public String getCodigo() 
	{
		return codigo;
	}

	public float getPreco() 
	{
		return preco;
	}
	public String getTipo() 
	{
		return tipo;
	}

//SETTERS
	public void setPreco(float preco) 
	{
		this.preco = preco;
	}
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
//Outros Metodos
	
	public void imprimirPreco()
	{
		System.out.println("O preço do bilhete do Festivel será: "+getPreco());		
	}
	
}

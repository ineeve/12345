package portoJazz;


public class ComboiosP extends Bilhete{

	private String origem;
	private float precoViagem;
	
	public ComboiosP(String origem)
	{
		super();
		super.setPreco(5.00f);
		super.setTipo("Bilhete CP");
		switch (origem)
		{
		case "Porto": 	this.precoViagem = 1.50f;
						break;
		case "Lisboa":  this.precoViagem = 6.30f;
						break;		
		case "Algarve":	this.precoViagem = 15.60f;
						break;
		case "Braga":	this.precoViagem = 3.60f;
		break;		
		}		
	}
	
	
//GETTERS
	
	public String getOrigem() 
	{
		return origem;
	}
	public float getPrecoViagem() 
	{
		return precoViagem;
	}
//SETTERS
	public void setOrigem(String origem) 
	{
		this.origem = origem;
	}
	public void setPrecoViagem(float precoViagem) 
	{
		this.precoViagem = precoViagem;
	}
//Outros Metodos

	public void imprimirPreco()
	{
		System.out.println("O preço do bilhete do Festivel será: "+getPreco());	
		System.out.println("O preço da viagem será: "+getPrecoViagem());
		System.out.println("Total: "+(this.getPrecoViagem()+super.getPreco()));
	}
	

}

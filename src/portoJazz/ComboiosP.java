package portoJazz;


public class ComboiosP extends Bilhete{

	private Origem origem;
	
	public ComboiosP(Origem origem)
	{
		super();
		super.setPreco(5.00f);
		super.setTipo("Bilhete CP");	
	}
	
	
//GETTERS
	
	public String getOrigem() 
	{
		return origem.getLocal();
	}
	public float getPrecoViagem() 
	{
		return origem.getPrecoViagem();
	}
//SETTERS
	public void setOrigem(Origem origem) 
	{
		this.origem = origem;
	}
//Outros Metodos

	public void imprimirPreco()
	{
		System.out.println("O pre�o do bilhete do Festivel ser�: "+getPreco());	
		System.out.println("O pre�o da viagem ser�: "+getPrecoViagem());
		System.out.println("Total: "+(this.getPrecoViagem()+super.getPreco()));
	}
	

}

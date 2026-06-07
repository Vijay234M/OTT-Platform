package entity;

public class Movies {
	private int Id;
	private String MovieName;
	private String Durations;
	private String Price;
	
	public Movies(int Id,String MovieName,String Durations,String Price){
		this.Id = Id;
		this.MovieName = MovieName;
		this.Durations = Durations;
		this.Price = Price;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public int getId() {
		return Id;
	}

	public String getDurations() {
		return Durations;
	}

	public void setDurations(String Durations) {
		this.Durations = Durations;
	}
	
	public void setMovieName(String MovieName) {
		this.MovieName = MovieName;
	}
	
	public String getMovieName() {
		return MovieName;
	}
	
	public void setPrice(String Price) {
		this.Price = Price;
	}
	
	public String getPrice() {
		return Price;
	}
	
	public void displayInfo() {
		System.out.println("ID : " + Id 
				+"\nMoive Name : " + MovieName 
				+"\nDuration : " + Durations
				+"\nPrice : " + Price);
	}
	
}

public class Artwork{
 private String title;
 private int year;
 Artist artist;
 
 Artwork(String title,int year,Artist artist){
  this.title=title;
  this.year=year;
  this.artist=artist;
}

 Artwork(String title,int year){
  this.title=title;
  this.year=year;
}
public void setTitle(String title){
  this.title=title;
}
public void setYear(int year){
 this.year=year;
}
public void setArtist(Artist artist){
 this.artist=artist;
}
public String getTitle(){
return title;
}
public int getYear(){
 return year;
}
public Artist getArtist(){
return artist;
}
public void display(){
System.out.println("Title is "+title);
System.out.println("Year is "+year);
artist.display();

}
}


 
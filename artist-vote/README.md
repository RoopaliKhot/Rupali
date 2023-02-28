step 1: import the project in any IDE(Eclipse/ Intelij)

Step 2: update all DB detials in application.properties  

spring.datasource.url=jdbc:mysql://localhost:3306/artist
spring.datasource.username=root
spring.datasource.password=*****

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

Step 3 : build the project using maven cmd (mvn clean)

Step 4: On server start-up hit below request 
	* Adding vote for artist 
	api :http://localhost:8080/vote
	Request : 
{
        "artist_id": 2
        
}

	* To get all All artists, with vote count for each
	http://localhost:8080/api/artist
	
	* Get a data summary for a specific artist, with vote count for that artist only.
	http://localhost:8080/api/artist/2

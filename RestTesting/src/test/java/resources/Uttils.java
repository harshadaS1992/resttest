package resources;

	import io.restassured.builder.RequestSpecBuilder;
	import io.restassured.specification.RequestSpecification;
	import io.restassured.specification.ResponseSpecification;

	public class Uttils {
         RequestSpecification req; 
		 ResponseSpecification res; 
		
		public RequestSpecification requestSpec()
		{
			req = new RequestSpecBuilder().setBaseUri("https://reqres.in").build();
			return req;
			
		}
		
	}


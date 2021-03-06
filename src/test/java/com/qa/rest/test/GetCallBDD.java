package com.qa.rest.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {

	@Test
	public void test_NumberofCircut_2017()
	{
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			statusCode(200).and().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
			and().
			header("content-length", equalTo("4551"));
	}
	@Test
	public void test_NumberofCircut_20171()
	{
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			statusCode(200).and().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
			and().
			header("content-length", equalTo("4551"));
	}
	@Test
	public void test_NumberofCircut_20172()
	{
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			statusCode(200).and().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
			and().
			header("content-length", equalTo("4551"));
	}
	@Test
	public void test_NumberofCircut_20173()
	{
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			statusCode(200).and().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
			and().
			header("content-length", equalTo("4551"));
	}
}

package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
   
	ParseData file = mock(ParseData.class);

	@Test
	void contextLoads() {
	}

	// @Test
    // public void ParseData() throws IOException{
      

    //     List<String> result = (List<String>) file.ParseData("./data/worldcitiespop.csv");
    //     assertEquals(expected, result);
    // }


	@Test
    public void ParseData() throws IOException{
        List<String> ListsPop = new ArrayList<String>();
        ListsPop.add("344");
        ListsPop.add("4234234");
       
        when(file.ParseData("./data/worldcitiespop.csv")).thenReturn(ListsPop);
        List<String> expected = ListsPop;

        List<String> result = (List<String>) file.ParseData("./data/worldcitiespop.csv");
        assertEquals(expected, result);
    }





	// @Test
    // public void parseoffile() throws IOException{
        
    
    //     List<String> list = new ArrayList<String>();
    //     list.add("ad,aixas,Aix�s,06,,42.4833333,1.4666667");
    //     list.add("ad,aixirivali,Aixirivali,06,,42.4666667,1.5");
    //     list.add("ad,aixirvall,Aixirvall,06,,42.4666667,1.5");
    //     when(file.ParseData("./data/worldcitiespop.csv")).thenReturn(list);
       

       
    //     data.add("565");
    //     data.add("565");

    //     when(file.fileParse(actual)).thenReturn(data);
    //     List<String> result = file.fileParse(actual);
    //     assertEquals(result, data);
    // }

	@Test
    public void parseoffile() throws IOException{
        
    
        List<String> list = new ArrayList<String>();
        list.add("ad,aixas,Aix�s,06,,42.4833333,1.4666667");
        list.add("ad,aixirivali,Aixirivali,06,,42.4666667,1.5");
        list.add("ad,aixirvall,Aixirvall,06,,42.4666667,1.5");
        when(file.ParseData("./data/worldcitiespop.csv")).thenReturn(list);
       

        List<String> actual = (List<String>) file.ParseData("./data/worldcitiespop.csv");

        List<String> data = new ArrayList<String>();
        data.add("4");
        data.add("565");
        data.add("565");

        when(file.fileParse(actual)).thenReturn(data);
        List<String> result = file.fileParse(actual);
        assertEquals(result, data);
    }

	// @Test
    // public void ParseData() throws IOException{
    //     List<String> ListsPop = new ArrayList<String>();
    //     ListsPop.add("344");
    //     ListsPop.add("4234234");
       
       
    //     List<String> result = (List<String>) file.ParseData("./data/worldcitiespop.csv");
    //     assertEquals(expected, result);
    // }




}

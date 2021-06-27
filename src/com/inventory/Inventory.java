package com.inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory {

    List<Item> inventoryList;


    String filePath = ".//Data/Pulse.json";





	public void InventoryManager()
        {


            try
                    (FileReader fr = new FileReader((".//Data/Pulse.json")))
            {

                inventoryList = new ArrayList<>();

                JSONParser jsonParser = new JSONParser();

                // read the whole file into a JSONObject
                JSONObject jsonObject = (JSONObject)jsonParser.parse(fr);

                JSONArray itemsList = (JSONArray)jsonObject.get("Pulse");



                for(int i = 0; i < itemsList.size(); i++)
                {
                    JSONObject item = (JSONObject)itemsList.get(i);
                    String name = (String)item.get("name");
                    double weight = Integer.parseInt((String)item.get("weight"));
                    double price = Integer.parseInt((String)item.get("price"));
                    Item aItem = new Item(name, weight, price);
                    inventoryList.add(aItem);

                }



            } catch (FileNotFoundException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            } catch (ParseException e) {

                e.printStackTrace();
            }


        }

        public void displayInventory()
        {
            System.out.printf("name", "weight", "price");
            for (Item item : inventoryList) {
                System.out.printf(item.getName(), item.getWeight(), item.getPrice());
                System.out.println(item.getValue());


            }

        }

    }
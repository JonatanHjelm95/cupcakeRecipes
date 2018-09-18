/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jonab
 */
public class GetRecipesFromDB {

    DBConnector con;

    public GetRecipesFromDB() throws Exception {
        this.con = new DBConnector();
    }

    public void getRecipe() {
        ResultSet rs = null;

        try {
            Statement stmt = con.getConnection().createStatement();
            String query = "insert into Recipe\n" +
"values ('Farmors flotte kager', 'Kom alle ingredienser i en skål og så smid det i ovnen', 'Tommel op', null),\n" +
"('Bedstemor med slag i', 'Fuld drøn på røremaskinen og så 400 grader i ovnen 20 min', 'Tommel op', null);";

            stmt.executeUpdate(query);
//            System.out.println(rs);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

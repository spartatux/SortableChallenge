package org.sortable.challenge;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class GSonParser<P> implements Parser<P>
{

    private String fileName;
    private Gson gsonParser;

    public GSonParser(String file)
    {
        fileName = file;
        gsonParser = new Gson();
    }

    @Override
    public ArrayList<P> getAll() throws FileNotFoundException, IOException
    {
        Type pType = new TypeToken<P>() {}.getType();
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        ArrayList<P> answer = new ArrayList<P>();
        
        String line;
        while ((line = bf.readLine()) != null)
        {
           P tmpP= gsonParser.fromJson(line, pType);
           answer.add(tmpP);
        }
        return answer;
    }
}

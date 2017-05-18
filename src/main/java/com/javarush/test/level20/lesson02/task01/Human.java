package com.javarush.test.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Human
{
    private String name;
    private List<Asset> assets = new ArrayList<>();

    public Human()
    {
    }

    public Human(String name, Asset... assets)
    {
        this.name = name;
        if (assets != null)
        {
            this.assets.addAll(Arrays.asList(assets));
        }
    }

    public void save(OutputStream outputStream) throws Exception
    {
        PrintWriter printWriter = new PrintWriter(outputStream);
        String hasName = (this.name != null) ? "yes" : "no";
        printWriter.println(hasName);
        if ("yes".equals(hasName))
        {
            printWriter.println(this.name);
            if (this.assets.size() > 0)
            {
                for (Asset current : this.assets)
                {
                    printWriter.println(current.getName());
                }
            }
        }
        printWriter.close();
    }

    public void load(InputStream inputStream) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String hasName = reader.readLine();
        if ("yes".equals(hasName))
        {
            this.name = reader.readLine();
            String assetName;
            while ((assetName = reader.readLine()) != null)
            {
                this.assets.add(new Asset(assetName));
            }
        }
        reader.close();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Asset> getAssets()
    {
        return assets;
    }

    public void setAssets(List<Asset> assets)
    {
        this.assets = assets;
    }
}

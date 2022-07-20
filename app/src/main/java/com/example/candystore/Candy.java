package com.example.candystore;

import java.text.DecimalFormat;

public class Candy {
    private int id;
    private String name;
    private double price;

    public final DecimalFormat MONEY = new DecimalFormat( "$#,##0.00" );

    public Candy( int newId, String newName, double newPrice ) {
        setId( newId );
        setName( newName );
        setPrice( newPrice );
    }

    public void setId( int newId ) {
        id = newId;
    }

    public void setName( String newName ) {
        name = newName;
    }

    public void setPrice( double newPrice ) {
        if( newPrice >= 0.0 )
            price = newPrice;
    }

    public int getId( ) {
        return id;
    }

    public String getName( ) {
        return name;
    }

    public double getPrice( ) {
        return price;
    }

    public String toString( ) {
        return (  name +  ": " + MONEY.format(price) );
    }
}
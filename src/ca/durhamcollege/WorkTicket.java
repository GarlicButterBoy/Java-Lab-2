package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Scanner;

public class WorkTicket
{


    //private instance variables/Attributes
    public int number;
    public String id;
    public LocalDate date;
    public String description;

    //public properties (setters/getters)
    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        if(number < 0)
        {
            throw new IllegalArgumentException("ERROR! only positive numbers");
        }
        else
        {
            this.number = number;
        }
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        if(id.length() <= 0)
        {
            throw new IllegalArgumentException("Please do not keep it empty");
        }
        else
        {
            this.id = id;
        }
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        if(description.length() <= 0)
        {
            throw new IllegalArgumentException("Please do not keep it empty");
        }
        else {
            this.description = description;
        }
    }

    public  boolean SetWorkTicket()
    {

        setNumber(number);
        setId(id);
        setDate(date);
        setDescription(description);

        return true;
    }

    @Override
    public String toString()
    {
        String outputStr = "";
        outputStr += "\n========================================\n";
        outputStr += "Ticket Number: " + (getNumber()) + "\n";
        outputStr += "Ticket Date: " + getDate() + "\n";
        outputStr += "Ticket ID: " + getId() + "\n";
        outputStr += "Ticket Description: " + getDescription() + "\n";
        outputStr += "\n========================================\n";

        return outputStr;
    }

    //ValidateDate Function
    static LocalDate ValidateDate()
    {
        Scanner keyboard = new Scanner(System.in);
        LocalDate date = null;
        int day = 0, month = 0, year = 0;
        System.out.print("Please enter the day");
        day = keyboard.nextInt();


        return date;
    }

    //Default Constructor
    WorkTicket()
    {
        int number = 0;
        LocalDate date = null;
        String description = null;
        String id = null;
    }
    //Object Constructor
    WorkTicket(@NotNull WorkTicket ticket)
    {
        setNumber(number);
        setId(id);
        setDate(date);
        setDescription(description);
    }
    //Full Constructor
    WorkTicket(int number, String id, LocalDate date, String desc)
    {
        this.number = number;
        this.id = id;
        this.date = date;
        this.description = desc;
    }


    //public methods
}

package ca.durhamcollege;

import java.time.LocalDate;

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

        this.number = number;
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
        else {
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

    //constructors
    WorkTicket()
    {
        int number = 0;
        LocalDate date = null;
        String description = null;
        String id = null;
    }




    //public methods
}

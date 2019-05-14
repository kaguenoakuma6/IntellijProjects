package com.intellij.Polymorphism;

class Movie
{
    private String name;

    public Movie(String name)
    {
        this.name = name;
    }

    public String plot()
    {
        return "No plot";
    }

    public String getName()
    {
        return name;
    }
}

class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }

    public String plot()
    {
        return "A shark eats a lots of people";
    }
}

class IndependenceDay extends Movie
{
    public IndependenceDay()
    {
        super("Independence Day");
    }

    @Override
    public String plot()
    {
        return "Aliens Attemp to take over planet earth";
    }
}

class MazeRunner extends Movie
{
    public MazeRunner()
    {
        super("Maze Runner");
    }

    @Override
    public String plot()
    {
        return "Kids try an escape a maze";
    }
}

class StarWars extends Movie
{
    public StarWars()
    {
        super("Star Wars");
    }

    @Override
    public String plot()
    {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie
{
    public Forgetable()
    {
        super("Forgetable");
    }
}

public class Main
{
    public static void main( String [] Args)
    {
        for (int a  = 1; a < 11; a++)
        {
            Movie movie = randomMovie();

            System.out.println("movie # " + a + " : " + movie.getName() +"\n" + "Plot: " + movie.plot() + "\n");
        }
    }
/**/
    public static Movie randomMovie()
    {
        int randomNumber = ( int ) ( Math.random() * 5 ) + 1;

        System.out.println("Number generated: " + randomNumber);

        switch (randomNumber)
        {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }
        return null;
    }
}

package com.intellij.CodingExercises;

public class FlourPacker
{
    public static void main(String[] args)
    {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(1,0,6));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        boolean packed = false;

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0)
        {
            int bCount = bigCount * 5, sCount = smallCount;

            if (bCount > goal && sCount == 0 )
            {
                packed = false;
            }
            else
            {
                if( (goal > bCount && bCount > 0 && goal % bCount != 0) )
                packed = true;
            }
            return packed;
        }
        else
        {
            return false;
        }
    }
}

package com.example.magicball.model;

import android.media.Image;

public class Custom extends MagicObj
{

   public void fillGood( String input)
    {
            good.add(input);
    }

    public void fillNeutral( String input)
    {
        neutral.add(input);
    }

    public void fillBad( String input)
    {
        bad.add(input);
    }

 }
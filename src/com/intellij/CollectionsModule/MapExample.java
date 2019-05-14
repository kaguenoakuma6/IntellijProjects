package com.intellij.CollectionsModule;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args)
    {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high level programing language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lines madness" );

        System.out.println(languages.get("Java"));

    }
}

package com.syntax.class04;

public class CSSLocaterNotes {
    public static void main(String[] args) {

        //tagname[attribute='attribute value'}
        //example: button[type='submit']

        //CSS does not allow locating by text

        //shortcuts:

        //Shortcut for classname-->"."
        //Syntax: tagname.ClassNameValue
        //Example: input.button -- smartbearsoftware.com

        //Shortcut for ID--> "#"
        //Syntax: tagname#IDValue
        //Example: input#twotabsearchtextbox -- amazon.com

        //Contains() method in CSS:
        //* Symbol represents contains method
        //tagname[attribute *= 'attribute value']
        //Example: input[placeholder *='Email'] -- facebook.com

        //Starts-with method in css:
        //^(circumflex)
        //tagname[attribute ^='attribute value']
        //Example: input[type ^='pass'] -- smartbearsoftware.com

        //Ends-with method in css:
        //$ Symbol represents ends-with method
        //tagname[attribute $='attribute value']
        //Example: img[src $='syntax.png'] -- hrm.syntaxtechs.net


    }
}

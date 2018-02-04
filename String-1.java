    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    //
    //
    //helloName("Bob") → "Hello Bob!"
    //helloName("Alice") → "Hello Alice!"
    //helloName("X") → "Hello X!"

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    //Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    //
    //
    //makeAbba("Hi", "Bye") → "HiByeByeHi"
    //makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    //makeAbba("What", "Up") → "WhatUpUpWhat"

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    //
    //
    //makeTags("i", "Yay") → "<i>Yay</i>"
    //makeTags("i", "Hello") → "<i>Hello</i>"
    //makeTags("cite", "Yay") → "<cite>Yay</cite>"

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    //
    //
    //makeOutWord("<<>>", "Yay") → "<<Yay>>"
    //makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    //makeOutWord("[[]]", "word") → "[[word]]"

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(out.length() - 2);
    }

    //Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    //
    //
    //extraEnd("Hello") → "lololo"
    //extraEnd("ab") → "ababab"
    //extraEnd("Hi") → "HiHiHi"

    public String extraEnd(String str) {
        int length = str.length();
        String lastChar = "";
        if (length > 1) {
            lastChar = str.substring(length - 2);
            return lastChar + lastChar + lastChar;
        } else return str;
    }

    //Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
    //
    //
    //firstTwo("Hello") → "He"
    //firstTwo("abcdefg") → "ab"
    //firstTwo("ab") → "ab"

    public String firstTwo(String str) {
        int length = str.length();
        if (length > 1) {
            return str.substring(0, 2);
        } else return str;
    }

    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    //
    //
    //firstHalf("WooHoo") → "Woo"
    //firstHalf("HelloThere") → "Hello"
    //firstHalf("abcdef") → "abc"

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    //Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
    //
    //
    //withoutEnd("Hello") → "ell"
    //withoutEnd("java") → "av"
    //withoutEnd("coding") → "odin"

    public String withoutEnd(String str) {
        int length = str.length();
        if (length > 2) {
            return str.substring(1, length - 1);
        }
        return "";
    }

    //Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
    //
    //
    //comboString("Hello", "hi") → "hiHellohi"
    //comboString("hi", "Hello") → "hiHellohi"
    //comboString("aaa", "b") → "baaab"

    public String comboString(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        if (lengthA <= lengthB) {
            return a + b + a;
        } else return b + a + b;
    }

    //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
    //
    //
    //nonStart("Hello", "There") → "ellohere"
    //nonStart("java", "code") → "avaode"
    //nonStart("shotl", "java") → "hotlava"

    public String nonStart(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > 1 || bLength > 1) {
            return a.substring(1) + b.substring(1);
        }
        return "";
    }

    //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
    //
    //
    //left2("Hello") → "lloHe"
    //left2("java") → "vaja"
    //left2("Hi") → "Hi"

    public String left2(String str) {
        int length = str.length();
        if (length > 2) {
            return str.substring(2) + str.substring(0, 2);
        }
        return str;
    }

    //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
    //
    //
    //right2("Hello") → "loHel"
    //right2("java") → "vaja"
    //right2("Hi") → "Hi"

    public String right2(String str) {
        int length = str.length();
        if (length > 2) {
            return str.substring(length - 2) + str.substring(0, length - 2);
        }
        return str;
    }

    //Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
    //
    //
    //theEnd("Hello", true) → "H"
    //theEnd("Hello", false) → "o"
    //theEnd("oh", true) → "o"

    public String theEnd(String str, boolean front) {
        int length = str.length();
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(length - 1);
    }

    //Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
    //
    //
    //withouEnd2("Hello") → "ell"
    //withouEnd2("abc") → "b"
    //withouEnd2("ab") → ""

    public String withouEnd2(String str) {
        int length = str.length();
        if (length > 2) {
            for (int i = 1; i < length - 1; i++)
                return str.substring(i, length - 1);
        }
        return "";
    }

    //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
    //
    //
    //middleTwo("string") → "ri"
    //middleTwo("code") → "od"
    //middleTwo("Practice") → "ct"
    public String middleTwo(String str) {
        int length = str.length();
        int start = length / 2 - 1;
        if (length > 2) {
            return str.substring(start, start + 2);
        }
        return str;
    }

    //Given a string, return true if it ends in "ly".
    //
    //
    //endsLy("oddly") → true
    //endsLy("y") → false
    //endsLy("oddy") → false
    public boolean endsLy(String str) {
        int length = str.length();
        if (length >= 2) {
            return (str.substring(length - 2, length).equals("ly"));
        }
        return false;
    }

    //Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
    //
    //
    //nTwice("Hello", 2) → "Helo"
    //nTwice("Chocolate", 3) → "Choate"
    //nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String str, int n) {
        int length = str.length();
        if (length >= n) {
            return str.substring(0, n) + str.substring(length - n);
        }
        return str;
    }

    //Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
    //
    //
    //twoChar("java", 0) → "ja"
    //twoChar("java", 2) → "va"
    //twoChar("java", 3) → "ja"

    public String twoChar(String str, int index) {
        int length = str.length();
        if (length < 2 || index < 0) return str.substring(0, 2);
        else if ((index + 2) > length) return str.substring(0, 2);
        else return str.substring(index, index + 2);
    }

    //Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
    //
    //
    //middleThree("Candy") → "and"
    //middleThree("and") → "and"
    //middleThree("solving") → "lvi"

    public String middleThree(String str) {
        int length = str.length();
        int start = length / 2 - 1;
        if (length <= 3) return str;
        else return str.substring(start, start + 3);
    }

    //Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
    //
    //
    //hasBad("badxx") → true
    //hasBad("xbadxx") → true
    //hasBad("xxbadxx") → false

    public boolean hasBad(String str) {
        int length = str.length();
        if (length < 3) return false;
        else if (length == 3 && str == "bad") return true;
        else if (length == 3 && str != "bad") return false;
        else return (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"));
    }

    //Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
    //
    //
    //atFirst("hello") → "he"
    //atFirst("hi") → "hi"
    //atFirst("h") → "h@"

    public String atFirst(String str) {
        int length = str.length();
        if (length == 0) return "@@";
        else if (length == 1) return str + "@";
        else return str.substring(0, 2);
    }

    //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    //
    //
    //lastChars("last", "chars") → "ls"
    //lastChars("yo", "java") → "ya"
    //lastChars("hi", "") → "h@"

    public String lastChars(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        String first = "";
        String end = "";
        if (lengthA > 0) first = a.substring(0, 1);
        else first = "@";
        if (lengthB > 0) end = b.substring(lengthB - 1);
        else end = "@";
        return first + end;
    }

    //Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    //
    //
    //conCat("abc", "cat") → "abcat"
    //conCat("dog", "cat") → "dogcat"
    //conCat("abc", "") → "abc"

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) return a + b;
        else if (a.substring(a.length() - 1).equals(b.substring(0, 1))) return a.substring(0, a.length() - 1) + b;
        else return a + b;
    }

    //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
    //
    //
    //lastTwo("coding") → "codign"
    //lastTwo("cat") → "cta"
    //lastTwo("ab") → "ba"
    public String lastTwo(String str) {
        int length = str.length();
        if (length < 2) return str;
        else return str.substring(0, length - 2) + str.substring(length - 1) + str.substring(length - 2, length - 1);
    }

    //Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
    //
    //
    //seeColor("redxx") → "red"
    //seeColor("xxred") → ""
    //seeColor("blueTimes") → "blue"

    public String seeColor(String str) {
        int length = str.length();
        if (length < 3) return "";
        else if (str.substring(0, 3).equals("red")) return "red";
        else if (length > 3 && str.substring(0, 4).equals("blue")) return "blue";
        else return "";
    }

    //Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
    //
    //
    //frontAgain("edited") → true
    //frontAgain("edit") → false
    //frontAgain("ed") → true

    public boolean frontAgain(String str) {
        int length = str.length();
        if (length < 2) return false;
        else return (str.substring(0, 2).equals(str.substring(length - 2)));
    }

    //Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
    //
    //
    //minCat("Hello", "Hi") → "loHi"
    //minCat("Hello", "java") → "ellojava"
    //minCat("java", "Hello") → "javaello"

    public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength >= bLength) {
            return (a.substring(aLength - bLength) + b);
        } else return (a + b.substring(bLength - aLength));
    }

    //Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
    //
    //
    //extraFront("Hello") → "HeHeHe"
    //extraFront("ab") → "ababab"
    //extraFront("H") → "HHH"

    public String extraFront(String str) {
        int length = str.length();
        if (length == 0) return "";
        else if (length == 1) return str + str + str;
        else return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    //Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
    //
    //
    //without2("HelloHe") → "lloHe"
    //without2("HelloHi") → "HelloHi"
    //without2("Hi") → ""

    public String without2(String str) {
        int length = str.length();
        if (length > 1 && str.substring(0, 2).equals(str.substring(length - 2))) return str.substring(2);
        else return str;
    }

    //Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    //
    //
    //deFront("Hello") → "llo"
    //deFront("java") → "va"
    //deFront("away") → "aay"

    public String deFront(String str) {
        int length = str.length();
        String first = "";
        String second = "";
        if (length == 0 || length == 1 && str == "a") return str;
        else if (length > 1 && str.substring(0, 1).equals("a")) first = "a";
        if (length > 1 && str.substring(1, 2).equals("b")) second = "b";
        return first + second + str.substring(2);
    }

    //Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
    //
    //
    //startWord("hippo", "hi") → "hi"
    //startWord("hippo", "xip") → "hip"
    //startWord("hippo", "i") → "h"
    public String startWord(String str, String word) {
        int wLength = word.length();
        if (wLength > str.length()) return "";
        else if (str.substring(1, wLength).equals(word.substring(1, wLength))) return str.substring(0, wLength);
        else return "";
    }

    //Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
    //
    //
    //withoutX("xHix") → "Hi"
    //withoutX("xHi") → "Hi"
    //withoutX("Hxix") → "Hxi"

    public String withoutX(String str) {
        int length = str.length();
        int start = 0;
        int finish = length;
        if (length > 0 && str.substring(0, 1).equals("x")) start++;
        if (length > 1 && str.substring(length - 1).equals("x")) finish--;
        return str.substring(start, finish);
    }

    //Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
    //
    //
    //withoutX2("xHi") → "Hi"
    //withoutX2("Hxi") → "Hi"
    //withoutX2("Hi") → "Hi"

    public String withoutX2(String str) {
        int length = str.length();
        String first = "";
        String second = "";
        if (length <= 1) return "";
        if (length > 0 && !str.substring(0, 1).equals("x")) first = str.substring(0, 1);
        if (length > 1 && !str.substring(1, 2).equals("x")) second = str.substring(1, 2);
        if (length == 2) return first + second;
        else return first + second + str.substring(2);
    }

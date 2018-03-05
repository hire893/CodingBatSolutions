    //Given a string, return a string where for every char in the original, there are two chars.
    //
    //
    //doubleChar("The") → "TThhee"
    //doubleChar("AAbb") → "AAAAbbbb"
    //doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {
        int length = str.length();
        String result = "";
        if (length == 0) return str;
        else {
            for (int i = 0; i < length; i++) {
                result = result + str.substring(i, i + 1) + str.substring(i, i + 1);
            }
            return result;
        }
    }

    //
    //Return the number of times that the string "hi" appears anywhere in the given string.
    //
    //
    //countHi("abc hi ho") → 1
    //countHi("ABChi hi") → 2
    //countHi("hihi") → 2

    public int countHi(String str) {
        int length = str.length();
        int counter = 0;
        for (int i = 0; i < length - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) counter++;
        }
        return counter;
    }

    //
    //Return true if the string "cat" and "dog" appear the same number of times in the given string.
    //
    //
    //catDog("catdog") → true
    //catDog("catcat") → false
    //catDog("1cat1cadodog") → true

    public boolean catDog(String str) {
        int length = str.length();
        int counterCat = 0;
        int counterDog = 0;
        for (int i = 0; i < length - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) counterCat++;
            if (str.substring(i, i + 3).equals("dog")) counterDog++;
        }
        return (counterCat == counterDog);
    }

    //
    //Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    //
    //
    //countCode("aaacodebbb") → 1
    //countCode("codexxcode") → 2
    //countCode("cozexxcope") → 2

    public int countCode(String str) {
        int length = str.length();
        int counter = 0;
        for (int i = 0; i < length - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) counter++;
        }
        return counter;
    }

    //
    //Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
    //
    //
    //endOther("Hiabc", "abc") → true
    //endOther("AbC", "HiaBc") → true
    //endOther("abc", "abXabc") → true

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int lengthA = a.length();
        int lengthB = b.length();
        if (lengthA >= lengthB) {
            return (a.substring(lengthA - lengthB, lengthA).equals(b));
        } else return (b.substring(lengthB - lengthA, lengthB).equals(a));
    }

    //
    //Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
    //
    //
    //xyzThere("abcxyz") → true
    //xyzThere("abc.xyz") → false
    //xyzThere("xyz.abc") → true

    public boolean xyzThere(String str) {
        int length = str.length();
        if (length >= 3 && str.substring(0, 3).equals("xyz")) return true;
        for (int i = 1; i < length - 2; i++) {
            if ((str.charAt(i - 1) != '.') && str.substring(i, i + 3).equals("xyz")) return true;
        }
        return false;
    }

    //
    //Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    //
    //
    //bobThere("abcbob") → true
    //bobThere("b9b") → true
    //bobThere("bac") → false

    public boolean bobThere(String str) {
        int length = str.length();
        if (length < 3) return false;
        for (int i = 0; i < length - 2; i++) {
            if (str.substring(i, i + 1).equals("b") && (str.substring(i + 2, i + 3).equals("b"))) return true;
        }
        return false;
    }


    //
    //We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
    //
    //
    //xyBalance("aaxbby") → true
    //xyBalance("aaxbb") → false
    //xyBalance("yaaxbb") → false

    public boolean xyBalance(String str) {
        int length = str.length();
        if (length < 2 && !str.substring(0).equals("x")) return true;
        if (str.substring(length - 1, length).equals("x")) return false;
        for (int i = 0; i < length - 1; i++) {
            if (str.substring(i, i + 1).equals("x") && (str.substring(i + 1, length).contains("y")) || (!str.contains("x") && !str.contains("x")))
                return true;
        }
        return false;
    }


    //
    //Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
    //
    //
    //mixString("abc", "xyz") → "axbycz"
    //mixString("Hi", "There") → "HTihere"
    //mixString("xxxx", "There") → "xTxhxexre"

    public String mixString(String a, String b) {
        String result = "";
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length(); i++) {
                result += a.substring(i, i + 1) + b.substring(i, i + 1);
            }
            result = result + b.substring(a.length());
        } else {
            for (int i = 0; i < b.length(); i++) {
                result += a.substring(i, i + 1) + b.substring(i, i + 1);
            }
            result = result + a.substring(b.length());
        }
        return result;
    }

    //
    //Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
    //
    //
    //repeatEnd("Hello", 3) → "llollollo"
    //repeatEnd("Hello", 2) → "lolo"
    //repeatEnd("Hello", 1) → "o"

    public String repeatEnd(String str, int n) {
        int length = str.length();
        String result = "";
        for (int i = length - n; i < length; i++) {
            result = result + str.substring(length - n, length);
        }
        return result;
    }


    //
    //Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
    //
    //
    //repeatFront("Chocolate", 4) → "ChocChoChC"
    //repeatFront("Chocolate", 3) → "ChoChC"
    //repeatFront("Ice Cream", 2) → "IcI"

    public String repeatFront(String str, int n) {
        int length = str.length();
        String result = "";
        if (n <= length) {
            for (int i = n; i > 0; i--) {
                result += str.substring(0, i);
            }
        }
        return result;
    }


    //
    //Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
    //
    //
    //repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    //repeatSeparator("This", "And", 2) → "ThisAndThis"
    //repeatSeparator("This", "And", 1) → "This"

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count >= 1) {
            for (int i = 0; i < count - 1; i++) {
                result += word + sep;
            }
            result += word;
        }

        return result;
    }


    //
    //Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
    //
    //
    //prefixAgain("abXYabc", 1) → true
    //prefixAgain("abXYabc", 2) → true
    //prefixAgain("abXYabc", 3) → false

    public boolean prefixAgain(String str, int n) {
        int length = str.length();
        if (n < length) {
            for (int i = n; i <= length - n; i++) {
                if (str.substring(0, n).equals(str.substring(i, i + n))) return true;
            }
        }
        return false;
    }

    //
    //Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
    //
    //
    //xyzMiddle("AAxyzBB") → true
    //xyzMiddle("AxyzBB") → true
    //xyzMiddle("AxyzBBB") → false

    public boolean xyzMiddle(String str) {
        int length = str.length();
        if (length < 3) return false;
        int start1 = length / 2 - 1;
        int start2 = length / 2 - 2;
        if (length % 2 == 0) {
            if (str.substring(start1, start1 + 3).equals("xyz")) return true;
            if (str.substring(start2, start2 + 3).equals("xyz")) return true;
        } else if (str.substring(start1, start1 + 3).equals("xyz")) return true;
        return false;
    }

    //A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
    //
    //
    //getSandwich("breadjambread") → "jam"
    //getSandwich("xxbreadjambreadyy") → "jam"
    //getSandwich("xxbreadyy") → ""

    public String getSandwich(String str) {
        int index1 = str.indexOf("bread");
        int index2 = str.lastIndexOf("bread");
        if (index1 != index2 && index1 != -1 && index1 != -1) return str.substring(index1 + 5, index2);
        return "";
    }


    //
    //Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
    //
    //
    //sameStarChar("xy*yzz") → true
    //sameStarChar("xy*zzz") → false
    //sameStarChar("*xa*az") → true

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) return false;
            }
        }
        return true;
    }


    //
    //Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
    //
    //
    //oneTwo("abc") → "bca"
    //oneTwo("tca") → "cat"
    //oneTwo("tcagdo") → "catdog"

    public String oneTwo(String str) {
        int length = str.length();
        int tail = length % 3;
        String result = "";
        if (length < 3) return "";
        for (int i = 0; i < length - tail; i += 3) {
            result += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
        }
        return result;
    }


    //
    //Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
    //
    //
    //zipZap("zipXzap") → "zpXzp"
    //zipZap("zopzop") → "zpzp"
    //zipZap("zzzopzop") → "zzzpzp"

    public String zipZap(String str) {
        String result = "";
        if (str.length() < 3) return str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += "zp";
                i = i + 2;
            } else result += str.charAt(i);
        }
        return result;
    }

    //
    //Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
    //
    //
    //starOut("ab*cd") → "ad"
    //starOut("ab**cd") → "ad"
    //starOut("sm*eilly") → "silly"

    public String starOut(String str) {
        int length = str.length();
        String result = "";
        if (!str.contains("*")) return str;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '*') continue;
            if (i != length - 1 && str.charAt(i + 1) == '*' || i != 0 && str.charAt(i - 1) == '*') continue;
            result += str.substring(i, i + 1);
        }
        return result;
    }

    //Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
    //
    //
    //plusOut("12xy34", "xy") → "++xy++"
    //plusOut("12xy34", "1") → "1+++++"
    //plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

    public String plusOut(String str, String word) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                result += word;
                i += word.length() - 1;
            } else result += "+";
        }
        return result;
    }


    //
    //Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
    //
    //
    //wordEnds("abcXY123XYijk", "XY") → "c13i"
    //wordEnds("XY123XY", "XY") → "13"
    //wordEnds("XY1XY", "XY") → "11"

    public String wordEnds(String str, String word) {
        int slen = str.length();
        int wlen = word.length();
        String result = "";
        for (int i = 0; i < slen - wlen + 1; i++) {
            if (i > 0 && str.substring(i, i + wlen).equals(word)) result += str.charAt(i - 1);
            if (i < slen - wlen && str.substring(i, i + wlen).equals(word)) result += str.charAt(i + wlen);
        }
        return result;

    }

    
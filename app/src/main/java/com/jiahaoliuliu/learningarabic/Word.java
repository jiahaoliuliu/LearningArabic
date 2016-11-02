package com.jiahaoliuliu.learningarabic;

/**
 * Created by jiahaoliuliu on 31/10/16.
 */

public class Word {

    String english;

    String arabic;

    public Word() {

    }

    public Word(String newEnglish, String newArabic) {
        english = newEnglish;
        arabic = newArabic;
    }

    public void setEnglish(String newEnglish) {
        english = newEnglish;
    }

    public void setArabic(String newArabic) {
        arabic = newArabic;
    }

    public String getEnglish() {
        return english;
    }

    public String getArabic() {
        return arabic;
    }
}

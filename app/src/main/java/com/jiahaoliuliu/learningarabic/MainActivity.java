package com.jiahaoliuliu.learningarabic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] words = {"Sugar", "Algebra", "Cotton"};
        ListView listView = (ListView) findViewById(R.id.listView);

//        ArrayAdapter<String> wordsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
//        listView.setAdapter(wordsAdapter);

        ArrayList<Word> wordArrayList = new ArrayList<>();

        Word word = new Word();
        word.setEnglish("Sugar");
        word.setArabic("SuKKar");
        wordArrayList.add(word);

        Word word2 = new Word();
        word2.setEnglish("Algebra");
        word2.setArabic("al-jabr");
        wordArrayList.add(word2);

        Word word3 = new Word();
        word3.setEnglish("Cotton");
        word3.setArabic("KuTn");
        wordArrayList.add(word3);

        Word word4 = new Word();
        word4.setEnglish("Gazelle");
        word4.setArabic("ghazaal");
        wordArrayList.add(word4);

        Word word5 = new Word();
        word5.setEnglish("Sahara");
        word5.setArabic("SaHraa");
        wordArrayList.add(word5);

        Word word6 = new Word();
        word6.setEnglish("Chemistry");
        word6.setArabic("al-kimiyaa");
        wordArrayList.add(word6);

        Word word7 = new Word();
        word7.setEnglish("Hello");
        word7.setArabic("marHabaa");
        wordArrayList.add(word7);

        Word word8 = new Word();
        word8.setEnglish("Peace be upon you");
        word8.setArabic("as-salaam alaykum");
        wordArrayList.add(word8);

        Word word9 = new Word();
        word9.setEnglish("Upon you be peace");
        word9.setArabic("wa :alaykum as-salam");
        wordArrayList.add(word9);

        WordsAdapter wordsAdapter = new WordsAdapter(this, android.R.layout.simple_list_item_1,  wordArrayList);
        listView.setAdapter(wordsAdapter);
    }
}

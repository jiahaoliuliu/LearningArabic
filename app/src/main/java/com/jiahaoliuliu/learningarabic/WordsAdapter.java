package com.jiahaoliuliu.learningarabic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jiahaoliuliu on 31/10/16.
 */

public class WordsAdapter extends ArrayAdapter<Word> {

    private ArrayList<Word> wordsList;

    public WordsAdapter(Context context, int resource, ArrayList<Word> newWordsList) {
        super(context, resource);
        wordsList = newWordsList;
    }

    @Override
    public int getCount() {
        return wordsList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Create a view from R.layout.item_layout
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.item_layout, null);
        }

        Word word = wordsList.get(position);

        TextView english = (TextView) v.findViewById(R.id.english);
        english.setText(word.getEnglish());

        TextView arabic = (TextView) v.findViewById(R.id.arabic);
        arabic.setText(word.getArabic());

        return v;
    }
}

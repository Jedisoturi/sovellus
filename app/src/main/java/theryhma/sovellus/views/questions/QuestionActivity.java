package theryhma.sovellus.views.questions;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import theryhma.sovellus.GlobalModel;
import theryhma.sovellus.R;
import theryhma.sovellus.question.Questionnaire;

public class QuestionActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private QuestionFragmentCollectionAdapter adapter;
    private Questionnaire ques;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        ques = new Questionnaire();

        viewPager = findViewById(R.id.pager);
        adapter = new QuestionFragmentCollectionAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


    }

    public Questionnaire getQuestionnaire() {
        return this.ques;
    }



    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences pref = getSharedPreferences("Data", Context.MODE_PRIVATE);
        SharedPreferences.Editor  editor = pref.edit();
        Gson gson = new Gson();
        String json = gson.toJson(GlobalModel.getInstance().getStates());
        editor.putString("statuses", json);
        editor.apply();
    }
}
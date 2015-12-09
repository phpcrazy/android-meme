package net.myanmarlinks.memegenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.activeandroid.query.Select;

import net.myanmarlinks.memegenerator.model.Student;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student = new Student("Thiha", "Pazuntaung");
        student.save();

        List<Student> students = getAll();

        Log.d("TEST", "TEST");

    }

    public static List<Student> getAll() {
        return new Select()
                .from(Student.class)
                .execute();
    }


}

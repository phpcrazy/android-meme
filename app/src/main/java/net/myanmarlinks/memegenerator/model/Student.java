package net.myanmarlinks.memegenerator.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by soethihanaung on 12/8/15.
 */
@Table(name = "Students")
public class Student extends Model {
    @Column(name = "Name")
    public String name;

    @Column(name = "Address")
    public String address;


    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

package com.thelavender.abiturium_utils.classes;

import java.util.ArrayList;

public class Faculty {

    public University university = null;

    public String shortname = "";
    public String name = "";
    public String info = "";
    public ArrayList<String> links = new ArrayList<>();

    public ArrayList<EduProgram> eduPrograms = new ArrayList<>();

    public Faculty() {}

    public Faculty(String name, String shortname, String info, ArrayList<EduProgram> eduPrograms, ArrayList<String> links) {
        this.name = name;
        this.shortname = shortname;
        this.info = info;
        this.eduPrograms = eduPrograms;
        this.links = links;
    }

    public Faculty(String name, String shortname, ArrayList<EduProgram> eduPrograms, ArrayList<String> links) {
        this.name = name;
        this.shortname = shortname;
        //this.info = info;
        this.eduPrograms = eduPrograms;
        this.links = links;
    }

    public Faculty(String name, String shortname, String info, ArrayList<EduProgram> eduPrograms) {
        this.name = name;
        this.shortname = shortname;
        this.info = info;
        this.eduPrograms = eduPrograms;
        //this.links = links;
    }

    public Faculty(String name, String shortname, ArrayList<EduProgram> eduPrograms) {
        this.name = name;
        this.shortname = shortname;
        //this.info = info;
        this.eduPrograms = eduPrograms;
        //this.links = links;
    }
}

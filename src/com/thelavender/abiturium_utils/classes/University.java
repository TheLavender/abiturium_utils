package com.thelavender.abiturium_utils.classes;

import java.util.ArrayList;

public class University {
    public String name = "";
    public String shortname = "";
    public String info = "";
    public ArrayList<Faculty> faculties = new ArrayList<>();
    public ArrayList<String> links = new ArrayList<>();

    public University() {}

    public University(String name, String shortname, String info, ArrayList<Faculty> faculties, ArrayList<String> links) {
        this.name = name;
        this.shortname = shortname;
        this.info = info;
        this.faculties = faculties;
        this.links = links;
    }

    public University(String name, String shortname, String info, ArrayList<Faculty> faculties) {
        this.name = name;
        this.shortname = shortname;
        this.info = info;
        this.faculties = faculties;
        //this.links = links;
    }

    public University(String name, String shortname, ArrayList<Faculty> faculties, ArrayList<String> links) {
        this.name = name;
        this.shortname = shortname;
        //this.info = info;
        this.faculties = faculties;
        this.links = links;
    }

    public University(String name, String shortname, ArrayList<Faculty> faculties) {
        this.name = name;
        this.shortname = shortname;
        //this.info = info;
        this.faculties = faculties;
        //this.links = links;
    }
}

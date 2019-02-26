package de.othr.cc.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    // Attribute
    @XmlAttribute
    private int matrikelNr;
    private String name;
    private Adresse anschrift;
    private int ects;
    private String studiengang;


    // Getter- und Setter-Methoden (automatisch erzeugen lassen)
    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrikelNr == student.matrikelNr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrikelNr);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelNr=" + matrikelNr +
                ", name='" + name + '\'' +
                ", anschrift=" + anschrift +
                ", ects=" + ects +
                ", studiengang='" + studiengang + '\'' +
                '}';
    }
}

package ru.my3tahk.spring.hibernateManyToMany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
@NoArgsConstructor
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Setter
    @Getter
    @Column(name = "name")
    private String firstName;

    public Child(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Setter
    @Getter
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "child_section"
            , joinColumns = @JoinColumn(name = "child_id")
            , inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    @Column(name = "age")
    @Setter
    @Getter
    private int age;

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public void addSectionToChild(Section section) {
        if (sections == null) {
            sections = new ArrayList<>();
        }
        sections.add(section);
    }
}

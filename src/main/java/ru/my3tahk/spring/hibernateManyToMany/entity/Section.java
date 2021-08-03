package ru.my3tahk.spring.hibernateManyToMany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
@NoArgsConstructor
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    @Setter
    @Getter
    private String name;

    public Section(String name) {
        this.name = name;
    }

    public void addChildToSection(Child child){
        if(children==null){
            children=new ArrayList<>();
        }
        children.add(child);
    }


    @Setter
    @Getter
    @ManyToMany(cascade = {CascadeType.PERSIST
            , CascadeType.PERSIST
            , CascadeType.MERGE
            , CascadeType.REFRESH
            , CascadeType.DETACH})
    @JoinTable(name = "child_section"
            , joinColumns = @JoinColumn(name = "section_id")
            , inverseJoinColumns = @JoinColumn(name = "child_id"))
    private List<Child> children;

    @Override
    public String toString() {
        return "Section{" +
                "name='" + name + '\'' +
                '}';
    }
}

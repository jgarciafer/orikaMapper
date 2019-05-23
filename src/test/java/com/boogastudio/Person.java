package com.boogastudio;

import java.util.Date;
import java.util.List;

public class Person {
    private Name name;
    private List<Name> knownAliases;
    private Date birthDate;
    private Long married;
    private Date dateOfWedding;

    public Person() {
        }

    public Person(Name name, List<Name> knownAliases, Date birthDate, Long married, Date dateOfWedding) {
        this.name = name;
        this.knownAliases = knownAliases;
        this.birthDate = birthDate;
        this.married = married;
        this.dateOfWedding = dateOfWedding;
    }

    public Name getName() {
            return name;
        }

        public void setName(Name name) {
            this.name = name;
        }

        public List<Name> getKnownAliases() {
            return knownAliases;
        }

        public void setKnownAliases(List<Name> knownAliases) {
            this.knownAliases = knownAliases;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

    public Long getMarried() {
        return married;
    }

    public void setMarried(Long married) {
        this.married = married;
    }

    public Date getDateOfWedding() {
        return dateOfWedding;
    }

    public void setDateOfWedding(Date dateOfWedding) {
        this.dateOfWedding = dateOfWedding;
    }
}

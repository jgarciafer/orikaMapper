package com.boogastudio;

import java.util.Date;
import java.util.List;

public class Person {
        private Name name;
        private List<Name> knownAliases;
        private Date birthDate;

        public Person() {
        }

        public Person(Name name, List<Name> knownAliases, Date birthDate) {
            this.name = name;
            this.knownAliases = knownAliases;
            this.birthDate = birthDate;
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
    }

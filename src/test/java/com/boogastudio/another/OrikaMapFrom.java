package com.boogastudio.another;

import java.util.Date;

public class OrikaMapFrom {

        private String source;
        private String destination;
        private Date dateOfDeparture;
        private Date dateOfArrival;

    public OrikaMapFrom() {
    }

    public OrikaMapFrom(String source, String destination, Date dateOfDeparture, Date dateOfArrival) {
        this.source = source;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
    }

    public void setSource(String source) {
            this.source = source;
        }

        public String getSource() {
            return source;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDestination() {
            return destination;
        }

        public void setDateOfDeparture(Date dateOfDeparture) {
            this.dateOfDeparture = dateOfDeparture;
        }

        public Date getDateOfDeparture() {
            return dateOfDeparture;
        }

        public void setDateOfArrival(Date dateOfArrival) {
            this.dateOfArrival = dateOfArrival;
        }

        public Date getDateOfArrival() {
            return dateOfArrival;
        }
}

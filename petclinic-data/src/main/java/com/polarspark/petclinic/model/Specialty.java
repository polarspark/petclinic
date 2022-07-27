package com.polarspark.petclinic.model;

/**
 * Description:
 *
 * @author paulh
 **/
public class Specialty extends BaseEntity {

        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
}

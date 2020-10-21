package com.example.hospitalapp.DoctorSpecial;

public class Doctor {




        String workat,specilazation,name,/*phone_no,*/gender;

        public Doctor()
        {

        }

        public Doctor(String workat, String specilazation, String name, String gender)
        {
            this.workat = workat;
            this.specilazation = specilazation;
            this.name = name;
            this.gender = gender;

        }

        public String getWorkat() {
            return workat;
        }

        public void setWorkat(String workat) {
            this.workat = workat;
        }

        public String getSpecilazation() {
            return specilazation;
        }

        public void setSpecilazation(String specilazation) {
            this.specilazation = specilazation;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

  /*  public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }*/

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }



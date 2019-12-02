package com.example.aluno.likbook_app;


import java.util.List;


    public class ListarDisciplinas extends SugarRecord implements Parcelable {


        public String myString;
        @Ignore //Sugar will ignore this field.
        private List<String> myStringList;  //Change to private (accessed via getter/setter method)
        private String myStringListStore; //to store the list in JSON format.

        public ListarDisciplinas() { }

        private ListarDisciplinas (Parcel in) {
            this.myString= in.readString();
            this.myStringList= new ArrayList<>();
            in.readList(myStringList, String.class.getClassLoader());
        }

        public static final Creator<ListarDisciplinas> CREATOR = new Creator<ListarDisciplinas>(){
            public ListarDisciplinasFromParcel(Parcel in) { return new ListarDisciplinas(in); }
            public ListarDisciplinas[] newArray(int size) { return new ListarDisciplinas[size]; }
        };

        public List<String> getMyStringList(){
            //Convert from JSON string to List
            myStringList =  new Gson().fromJson(this.myStringListStore,new TypeToken<List<String>>(){}.getType());
            return myStringList;
        }

        public setMyStringList(List<String> stringList){
            this.myStringList = stringList;
        }


        @Override
        public int describeContents() { return 0; }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(myString);
            dest.writeList(getMyStringList());
        }
    }

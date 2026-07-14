class visitor{

    String name;

    visitor(String name){
        this.name = name;
    }


    public String toString(){
        return "VISITOR NAME: " + name;
    }
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(!(obj instanceof visitor)){
            return false;
        }

        visitor others = (visitor) obj;
        return this.name.equals(others.name);
    }

    public int hashCode(){
        return name.hashCode();
    }

}
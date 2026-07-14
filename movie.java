class movie {
    int id;
    String name;
    double rating;

    movie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public String toString(){

        return "Movie ID :" + id + "|Movie Name :" + name + "|Movie Rating:" + rating;

    }
}
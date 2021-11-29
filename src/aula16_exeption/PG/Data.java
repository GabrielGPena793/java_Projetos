package aula16_exeption.PG;

public class Data {

    int day;
    int month;
    int year;

    public Data(int d, int m, int y) throws  DataExeption
    {
        if (d<1||d>31)
            throw new DataExeption("Error no día");
        day=d;
        if (m<1||m>31)
            throw new DataExeption("Error no mês");
        month=m;
        year=y;
    }

}

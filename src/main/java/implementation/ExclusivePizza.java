package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Ta")
public class ExclusivePizza implements IPizza
{
    private String nazwa;
    private int cena;

    @Override
    public int getPrice()
    {
        return cena;
    }

    @Override
    public String getName()
    {
        return nazwa;
    }

    public ExclusivePizza(@Value("Specjalna") String nazwa,  @Value("20") int cena)
    {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void setNazwa(String nazwa)
    {
        this.nazwa = nazwa;
    }

    public void setCena(int cena)
    {
        this.cena = cena;
    }
}

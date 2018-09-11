public class PizzaBigodao extends PizzaBuilder {
    @Override
    public void buildPreco() {
        pizza.preco = 12.50;
    }

    @Override
    public void buildSabor() {
        pizza.sabor = 'Acavalada';
    }

}
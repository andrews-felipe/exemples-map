public abstract class PizzaBuilder {
	protected PizzaProduct pizza = new PizzaProduct();
	public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

	public PizzaProduct getPizza(){
		return pizza;
	};

}
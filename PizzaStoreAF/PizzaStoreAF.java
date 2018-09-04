package software_design.abstractFactory;


class PizzaStoreAF {

  public interface PizzaIngredientFactory {

  	public Dough createDough();
  	public Sauce createSauce();
  	public Cheese createCheese();
  	public Veggies[] createVeggies();
  	public Pepperoni createPepperoni();
  	public Clams createClam();

    /*@author Andrews
    */ 03-09-2018

    

  }

  // Concrete Factory
  public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    	public Dough createDough() {
    		return new ThinCrustDough();
    	}

    	public Sauce createSauce() {
    		return new MarinaraSauce();
    	}

    	public Cheese createCheese() {
    		return new ReggianoCheese();
    	}

    	public Veggies[] createVeggies() {
    		Veggies veggies[] = { new BlackOlives(),
    		                      new Spinach(),
    		                      new Eggplant() };
    		return veggies;
    	}

    	public Pepperoni createPepperoni() {
    		return new SlicedPepperoni();
    	}

    	public Clams createClam() {
    		return new FreshClams();
    	}
  }



  public class BigodaoPizzaIngredientFactory implements PizzaIngredientFactory {

    	public Dough createDough() {
    		return new Acavalada();
    	}

    	public Sauce createSauce() {
    		return new PicadinDePimentao();
    	}

    	public Cheese createCheese() {
    		return new QueijoDeMentega();
    	}

    	public Veggies[] createVeggies() {
    		Veggies veggies[] = { new tutano(),
    		                      new couroDeSapo(),
    		                      new ovoDeAvestruz() };
    		return veggies;
    	}

    	public Pepperoni createPepperoni() {
    		return new LanguiçaDelPoico();
    	}

    	public Clams createClam() {
    		return new PimentaParaibana();
    	}
  }



  // Parts of Pizza
  public interface Clams {
	   public String toString();
  }

  public interface Cheese {
	   public String toString();
  }

  public interface Sauce {
	    public String toString();
  }

  public interface Dough {
  	public String toString();
  }

  public interface Pepperoni {
  	public String toString();
  }

  public class FreshClams implements Clams {

  	public String toString() {
  		return "Fresh Clams from Long Island Sound";
  	}
  }

  public class ReggianoCheese implements Cheese {

  	public String toString() {
  		return "Reggiano Cheese";
  	}
  }

  public class MarinaraSauce implements Sauce {
	  public String toString() {
	    return "Marinara Sauce";
	  }
  }

  public class ThinCrustDough implements Dough {
  	public String toString() {
  		return "Thin Crust Dough";
  	}
  }

  public class SlicedPepperoni implements Pepperoni {
    public String toString() {
      return "Sliced Pepperoni";
    }
  }
    
  public class Acavalada implements Dough{
      public String toString(){
          return "Massa Acavalada de Grossa"
      }
  }

  public class PicadinDePimentao implements Sauce{
      public String toString(){
          return "Picadin de Pimentao"
      }
  }

  public class QueijoDeMentega implements Chesse{
      public String toString(){
          return "Queijo de Mantega"
      }
  }
  public class PimentaParaibana implements Clams{
      public String toString(){
          return "Pimenta Paraibana"
      }
  }

  public class LanguiçaDelPoico implements Pepperoni{
      public String toString(){
          return "Languiça Del Poico"
      }
  }

}

public static void main(String args[]){

    new 

}
package maven-github-jenkins;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.matchers.JUnitMatchers.containsString;


import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestGreeter 
{
    /**
     * Rigorous Test :-)
     */
   @Before
   public void setup() {
       greeter = new Greeter();
   }

    @Test
    public void greetShouldIncludeTheOneBeingGreeted(){

        String someone = "World";
        assertThat(greeter.greet(someone), containsString(someone));
    }

}

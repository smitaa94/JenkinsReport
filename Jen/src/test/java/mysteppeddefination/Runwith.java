package mysteppeddefination;

import cucumber.api.junit.Cucumber;

public @interface Runwith {

	Class<Cucumber> value();

}

/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 06:27:45 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.joda.time.TestYearMonth_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics(";Z(3Q");
      TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
      Chronology chronology0 = testYearMonth_Basics_MockYM0.getChronology();
      Period period0 = new Period(seconds0, chronology0);
      // Undeclared exception!
      period0.withYears(6);
  }
}

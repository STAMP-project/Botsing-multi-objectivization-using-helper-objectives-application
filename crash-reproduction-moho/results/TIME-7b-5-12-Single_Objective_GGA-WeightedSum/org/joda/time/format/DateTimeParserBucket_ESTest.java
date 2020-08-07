/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 06:31:47 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), chronology0, (Locale) null, integer0, 0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }
}

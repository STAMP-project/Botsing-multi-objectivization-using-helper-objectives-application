/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 17 23:30:31 UTC 2020
 */

package org.joda.time.chrono;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class BaseChronology_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.chrono.BaseChronology"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseChronology_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.MockZone",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.ReadableInterval",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.Interval",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.LocalDateTime",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.chrono.LimitChronology$LimitException",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.DateMidnight",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.ReadableInstant",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.tz.Provider",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.DurationFieldType",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.LocalTime",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.DurationField",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.Chronology",
      "org.joda.time.DateTime",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.LocalDate",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.field.BaseDurationField"
    );
  } 
}

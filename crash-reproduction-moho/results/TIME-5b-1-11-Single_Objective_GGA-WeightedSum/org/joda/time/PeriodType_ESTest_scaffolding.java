/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jan 18 06:24:49 UTC 2020
 */

package org.joda.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class PeriodType_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.PeriodType"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PeriodType_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.Minutes",
      "org.joda.time.base.AbstractDuration",
      "org.joda.time.Duration",
      "org.joda.time.Hours",
      "org.joda.time.PeriodType",
      "org.joda.time.format.PeriodFormatter",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.Seconds",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.Days",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.Period",
      "org.joda.time.ReadableDuration",
      "org.joda.time.ReadWritablePeriod",
      "org.joda.time.Weeks",
      "org.joda.time.Chronology",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.ReadableInstant",
      "org.joda.time.ReadableInterval",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.MutablePeriod",
      "org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix",
      "org.joda.time.format.PeriodPrinter",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.DurationFieldType",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.ReadablePartial",
      "org.joda.time.format.PeriodParser",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"
    );
  } 
}

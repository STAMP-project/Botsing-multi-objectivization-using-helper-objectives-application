/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 30 20:32:56 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class BaseClass_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.xpn.xwiki.objects.classes.BaseClass"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseClass_ESTest_scaffolding.class.getClassLoader() ,
      "com.xpn.xwiki.XWikiException",
      "org.hibernate.mapping.Property",
      "org.xwiki.model.reference.EntityReference",
      "com.xpn.xwiki.objects.classes.BooleanClass",
      "org.dom4j.tree.DefaultText",
      "org.apache.commons.lang3.StringUtils",
      "com.xpn.xwiki.objects.BaseCollection",
      "org.dom4j.Entity",
      "org.dom4j.tree.NamespaceStack",
      "com.xpn.xwiki.internal.AbstractNotifyOnUpdateList",
      "org.xwiki.component.manager.CompatibilityComponentManager",
      "org.dom4j.tree.AbstractBranch",
      "org.apache.ecs.Element",
      "org.dom4j.ProcessingInstruction",
      "com.xpn.xwiki.objects.classes.ListClass",
      "com.xpn.xwiki.objects.LargeStringProperty",
      "com.xpn.xwiki.objects.FloatProperty",
      "org.dom4j.Namespace",
      "com.xpn.xwiki.objects.classes.PropertyClass",
      "org.apache.ecs.Filter",
      "org.dom4j.tree.AbstractText",
      "org.xwiki.component.util.DefaultParameterizedType",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.tree.NamespaceCache",
      "com.xpn.xwiki.objects.PropertyInterface",
      "org.dom4j.Attribute",
      "com.xpn.xwiki.objects.ElementInterface",
      "com.xpn.xwiki.objects.classes.DBListClass",
      "org.dom4j.Document",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "com.xpn.xwiki.plugin.query.XWikiQuery",
      "org.xwiki.component.manager.ComponentLookupException",
      "org.dom4j.tree.QNameCache",
      "com.xpn.xwiki.objects.LongProperty",
      "com.xpn.xwiki.doc.merge.MergeConfiguration",
      "com.xpn.xwiki.objects.classes.PropertyClassInterface",
      "com.xpn.xwiki.objects.classes.StringClass",
      "com.xpn.xwiki.objects.meta.PropertyMetaClass",
      "org.dom4j.CDATA",
      "org.dom4j.IllegalAddException",
      "org.dom4j.tree.FlyweightText",
      "com.xpn.xwiki.objects.StringProperty",
      "org.dom4j.tree.AbstractNode",
      "org.apache.ecs.ElementRegistry",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "com.xpn.xwiki.objects.ListProperty",
      "org.dom4j.CharacterData",
      "org.dom4j.dom.DOMDocumentFactory",
      "com.xpn.xwiki.objects.NumberProperty",
      "com.xpn.xwiki.objects.DBStringListProperty",
      "org.xwiki.model.reference.ClassPropertyReference",
      "org.dom4j.NodeFilter",
      "org.dom4j.tree.DefaultNamespace",
      "com.xpn.xwiki.objects.BaseProperty",
      "com.xpn.xwiki.objects.meta.ListMetaClass",
      "com.xpn.xwiki.doc.merge.MergeResult",
      "com.xpn.xwiki.objects.classes.NumberClass",
      "com.xpn.xwiki.objects.meta.DBListMetaClass",
      "com.xpn.xwiki.objects.BaseStringProperty",
      "org.apache.commons.collections4.comparators.ComparableComparator",
      "org.xwiki.model.reference.EntityReferenceResolver",
      "org.xwiki.localization.ContextualLocalizationManager",
      "org.xwiki.model.reference.DocumentReference",
      "com.xpn.xwiki.XWikiContext",
      "org.apache.commons.collections4.ComparatorUtils",
      "com.xpn.xwiki.doc.XWikiDocument",
      "org.dom4j.QName",
      "com.xpn.xwiki.internal.objects.meta.PropertyMetaClassInterface",
      "org.xwiki.model.reference.WikiReference",
      "com.xpn.xwiki.objects.classes.BaseClass",
      "org.dom4j.tree.DefaultElement",
      "org.xwiki.bridge.DocumentModelBridge",
      "org.dom4j.Node",
      "org.dom4j.util.SingletonStrategy",
      "com.xpn.xwiki.objects.StringListProperty",
      "com.xpn.xwiki.objects.classes.ClassInterface",
      "com.xpn.xwiki.objects.meta.MetaClass",
      "com.xpn.xwiki.objects.ObjectInterface",
      "com.xpn.xwiki.objects.classes.TextAreaClass",
      "com.xpn.xwiki.web.Utils",
      "org.dom4j.DocumentType",
      "org.dom4j.tree.DefaultDocument",
      "org.xwiki.model.reference.EntityReferenceSerializer",
      "org.dom4j.dom.DOMElement",
      "com.xpn.xwiki.objects.ListProperty$NotifyList",
      "org.hibernate.mapping.MetaAttributable",
      "com.xpn.xwiki.objects.DoubleProperty",
      "org.xwiki.model.reference.ObjectPropertyReference",
      "org.xwiki.component.manager.ComponentManager",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.dom.DOMDocument",
      "com.xpn.xwiki.internal.objects.classes.PropertyClassProvider",
      "org.xwiki.component.annotation.Component",
      "org.dom4j.io.XMLWriter",
      "org.dom4j.io.OutputFormat",
      "com.xpn.xwiki.objects.classes.StaticListClass",
      "org.dom4j.dom.DOMNamespace",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.DocumentFactory",
      "org.dom4j.DocumentException",
      "org.xwiki.model.reference.DocumentReferenceResolver",
      "org.dom4j.rule.Pattern",
      "org.dom4j.Comment",
      "org.apache.commons.collections4.comparators.NullComparator",
      "com.xpn.xwiki.objects.BaseObject",
      "org.dom4j.Branch",
      "org.dom4j.Text",
      "org.dom4j.tree.AbstractCharacterData",
      "com.xpn.xwiki.objects.BaseElement",
      "com.xpn.xwiki.objects.CompatibilityObjectInterface",
      "org.dom4j.XPath",
      "com.xpn.xwiki.objects.IntegerProperty",
      "org.dom4j.Element",
      "com.xpn.xwiki.plugin.query.XWikiCriteria",
      "com.xpn.xwiki.objects.ElementComparator"
    );
  } 
}

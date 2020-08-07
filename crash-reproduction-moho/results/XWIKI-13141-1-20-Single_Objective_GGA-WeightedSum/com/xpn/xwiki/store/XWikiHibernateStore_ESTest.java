/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 05:48:46 UTC 2020
 */

package com.xpn.xwiki.store;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWikiException;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.store.XWikiHibernateBaseStore;
import com.xpn.xwiki.store.XWikiHibernateStore;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.migration.DataMigrationManager;
import java.util.Locale;
import javax.inject.Provider;
import javax.swing.JWindow;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jgroups.util.TimeScheduler3;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.context.Execution;
import org.xwiki.logging.LoggerManager;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.observation.ObservationManager;
import org.xwiki.query.QueryManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiHibernateStore_ESTest extends XWikiHibernateStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiHibernateStore xWikiHibernateStore0 = new XWikiHibernateStore("G59");
      EntityReferenceSerializer<JWindow> entityReferenceSerializer0 = (EntityReferenceSerializer<JWindow>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "compactWikiEntityReferenceSerializer", (Object) entityReferenceSerializer0);
      DocumentReferenceResolver<Long> documentReferenceResolver0 = (DocumentReferenceResolver<Long>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "currentMixedDocumentReferenceResolver", (Object) documentReferenceResolver0);
      DocumentReferenceResolver<TimeScheduler3.Task> documentReferenceResolver1 = (DocumentReferenceResolver<TimeScheduler3.Task>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "defaultDocumentReferenceResolver", (Object) documentReferenceResolver1);
      EntityReferenceSerializer<DocumentReference> entityReferenceSerializer1 = (EntityReferenceSerializer<DocumentReference>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(entityReferenceSerializer1).serialize(any(org.xwiki.model.reference.EntityReference.class) , any(java.lang.Object[].class));
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "defaultEntityReferenceSerializer", (Object) entityReferenceSerializer1);
      EntityReferenceSerializer<DocumentReference> entityReferenceSerializer2 = (EntityReferenceSerializer<DocumentReference>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "localEntityReferenceSerializer", (Object) entityReferenceSerializer2);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "logger", (Object) logger0);
      ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "observationManager", (Object) observationManager0);
      Provider<Double> provider0 = (Provider<Double>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "oldRenderingProvider", (Object) provider0);
      QueryManager queryManager0 = mock(QueryManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "queryManager", (Object) queryManager0);
      DataMigrationManager dataMigrationManager0 = mock(DataMigrationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "dataMigrationManager", (Object) dataMigrationManager0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "execution", (Object) execution0);
      LoggerManager loggerManager0 = mock(LoggerManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "loggerManager", (Object) loggerManager0);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Configuration) null).when(hibernateSessionFactory0).getConfiguration();
      doReturn((SessionFactory) null).when(hibernateSessionFactory0).getSessionFactory();
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class);
      XWikiContext xWikiContext0 = new XWikiContext();
      DocumentReference documentReference0 = new DocumentReference("G59", "G59", "G59");
      Locale locale0 = Locale.US;
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0, locale0);
      try { 
        xWikiHibernateStore0.saveXWikiDoc(xWikiDocument0, xWikiContext0, true);
        fail("Expecting exception: XWikiException");
      
      } catch(XWikiException e) {
         //
         // Error number 3201 in 3: Exception while saving document null
         //
         verifyException("com.xpn.xwiki.store.XWikiHibernateStore", e);
      }
  }
}

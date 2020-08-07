/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 16:47:37 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Session;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.Query;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager0);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      DefaultQuery defaultQuery0 = new DefaultQuery(";1#FK}Gx?l", "The query requires programming right", hqlQueryExecutor0);
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) nOPLogger0);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      Query query0 = defaultQuery0.addFilter(countDocumentFilter0);
      // Undeclared exception!
      hqlQueryExecutor0.createHibernateQuery(session0, query0);
  }
}

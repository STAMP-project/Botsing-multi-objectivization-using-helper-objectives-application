/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 07:55:00 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseProperty;
import com.xpn.xwiki.objects.classes.PropertyClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertyClass propertyClass0 = new PropertyClass();
      BaseProperty<ObjectReference> baseProperty0 = new BaseProperty<ObjectReference>();
      baseProperty0.setObject(propertyClass0);
      // Undeclared exception!
      baseProperty0.equals((Object) null);
  }
}

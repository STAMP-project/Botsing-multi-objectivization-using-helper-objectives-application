/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 21:01:08 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.StaticListMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StaticListMetaClass staticListMetaClass0 = new StaticListMetaClass();
      staticListMetaClass0.addDBListField(">1Qp>\"G@{", ">1Qp>\"G@{", 2727, true, "#:4");
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      staticListMetaClass0.addTextAreaField(">1Qp>\"G@{", (String) null, 2727, 2727, textAreaClass_ContentType0);
  }
}

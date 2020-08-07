/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 17:47:10 UTC 2020
 */

package org.xwiki.rendering.internal.macro.toc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.descriptor.ComponentDescriptor;
import org.xwiki.properties.BeanManager;
import org.xwiki.rendering.block.MacroBlock;
import org.xwiki.rendering.block.MacroMarkerBlock;
import org.xwiki.rendering.block.TableCellBlock;
import org.xwiki.rendering.internal.macro.toc.TocMacro;
import org.xwiki.rendering.macro.AbstractMacro;
import org.xwiki.rendering.macro.toc.TocMacroParameters;
import org.xwiki.rendering.parser.Parser;
import org.xwiki.rendering.renderer.reference.link.LinkLabelGenerator;
import org.xwiki.rendering.transformation.MacroTransformationContext;
import org.xwiki.xml.internal.html.DefaultHTMLCleanerConfiguration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class TocMacro_ESTest extends TocMacro_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkLabelGenerator linkLabelGenerator0 = mock(LinkLabelGenerator.class, new ViolatedAssumptionAnswer());
      Parser parser0 = mock(Parser.class, new ViolatedAssumptionAnswer());
      Provider<MacroMarkerBlock> provider0 = (Provider<MacroMarkerBlock>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      BeanManager beanManager0 = mock(BeanManager.class, new ViolatedAssumptionAnswer());
      ComponentDescriptor<TableCellBlock> componentDescriptor0 = (ComponentDescriptor<TableCellBlock>) mock(ComponentDescriptor.class, new ViolatedAssumptionAnswer());
      TocMacroParameters.Scope tocMacroParameters_Scope0 = TocMacroParameters.Scope.LOCAL;
      TocMacroParameters tocMacroParameters0 = mock(TocMacroParameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tocMacroParameters0).getDepth();
      doReturn((String) null, (String) null).when(tocMacroParameters0).getReference();
      doReturn((TocMacroParameters.Scope) null, tocMacroParameters_Scope0).when(tocMacroParameters0).getScope();
      doReturn(0).when(tocMacroParameters0).getStart();
      doReturn(false).when(tocMacroParameters0).isCustomStart();
      doReturn(false).when(tocMacroParameters0).isNumbered();
      TocMacro tocMacro0 = new TocMacro();
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "linkLabelGenerator", (Object) linkLabelGenerator0);
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "plainTextParser", (Object) parser0);
      Injector.inject(tocMacro0, (Class<?>) TocMacro.class, "wikiModelProvider", (Object) provider0);
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "beanManager", (Object) beanManager0);
      Injector.inject(tocMacro0, (Class<?>) AbstractMacro.class, "componentDescriptor", (Object) componentDescriptor0);
      Injector.validateBean(tocMacro0, (Class<?>) TocMacro.class);
      MacroTransformationContext macroTransformationContext0 = new MacroTransformationContext();
      DefaultHTMLCleanerConfiguration defaultHTMLCleanerConfiguration0 = new DefaultHTMLCleanerConfiguration();
      Map<String, String> map0 = defaultHTMLCleanerConfiguration0.getParameters();
      MacroBlock macroBlock0 = new MacroBlock("", map0, "Unknown OpenAction ", true);
      macroTransformationContext0.setCurrentMacroBlock(macroBlock0);
      // Undeclared exception!
      tocMacro0.execute(tocMacroParameters0, "SE.;Es@:6v", macroTransformationContext0);
  }
}

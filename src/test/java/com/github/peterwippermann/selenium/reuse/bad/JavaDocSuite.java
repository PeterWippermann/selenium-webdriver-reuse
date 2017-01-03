package com.github.peterwippermann.selenium.reuse.bad;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({GoToJavaIOTest.class, GoToJavaLangTest.class})
public class JavaDocSuite {
}

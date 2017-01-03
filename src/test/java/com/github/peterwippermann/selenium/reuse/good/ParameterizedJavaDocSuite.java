package com.github.peterwippermann.selenium.reuse.good;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ParameterizedGoToJavaIOTest.class, ParameterizedGoToJavaLangTest.class})
public class ParameterizedJavaDocSuite {
}

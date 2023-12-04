package com.TestingWithJunitAssistedPractice;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@SelectClasses({ com.TestingWithJunitAssistedPractice.GoogleSearch.class })
//@IncludeTags({"Prod"})
@ExcludeTags("Prod")

public class Runner {

}
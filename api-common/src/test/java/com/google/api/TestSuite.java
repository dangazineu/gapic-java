package com.google.api;

import com.google.api.core.ApiFuturesTest;
import com.google.api.core.ApiServiceTest;
import com.google.api.core.ListenableFutureToApiFutureTest;
import com.google.api.core.SettableApiFutureTest;
import com.google.api.pathtemplate.PathTemplateTest;
import com.google.api.pathtemplate.TemplatedResourceNameTest;
import com.google.api.resourcenames.UntypedResourceNameTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ApiFuturesTest.class,
                ApiServiceTest.class,
                ListenableFutureToApiFutureTest.class,
                SettableApiFutureTest.class,
                PathTemplateTest.class,
                TemplatedResourceNameTest.class,
                UntypedResourceNameTest.class
        }
)
public class TestSuite {
}

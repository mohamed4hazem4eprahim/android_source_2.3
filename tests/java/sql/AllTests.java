/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tests.java.sql;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * This is autogenerated source file. Includes tests for package tests.java.sql;
 */

public class AllTests {
    public static Test suite() {
        TestSuite suite = new TestSuite("All tests for package tests.java.sql;");
        // $JUnit-BEGIN$

        suite.addTestSuite(MultiThreadAccessTest.class);
        suite.addTestSuite(tests.java.sql.StressTest.class);
        suite.addTestSuite(tests.java.sql.UpdateFunctionalityTest.class);
        suite.addTestSuite(tests.java.sql.SelectFunctionalityTest.class);
        suite.addTestSuite(tests.java.sql.UpdateFunctionalityTest2.class);
        suite.addTestSuite(tests.java.sql.DeleteFunctionalityTest.class);
        suite.addTestSuite(tests.java.sql.DatabaseMetaDataTest.class);
        suite.addTestSuite(tests.java.sql.DatabaseMetaDataNotSupportedTest.class);
        suite.addTestSuite(tests.java.sql.InsertFunctionalityTest.class);

        // $JUnit-END$
        return suite;
    }
}

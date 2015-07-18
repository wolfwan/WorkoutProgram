/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author wwanless
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({domain.ExcerciseTest.class, domain.WorkoutTest.class})
public class DomainSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}

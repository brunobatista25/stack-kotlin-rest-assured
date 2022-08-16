package runner

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import tests.RegisterContactTest

@RunWith(Suite::class)
@SuiteClasses(RegisterContactTest::class)
class RunnerTest 
package runner

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import tests.UsersTest

@RunWith(Suite::class)
@SuiteClasses(UsersTest::class)
class RunnerTest 
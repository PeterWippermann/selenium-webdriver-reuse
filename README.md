# selenium-webdriver-reuse
This project showcases how to share the same WebDriver instance between two or more automated GUI tests.

## Problem description
For automated testing of graphical user interfaces a common technology stack in Java consists of Selenium and JUnit. Selenium allows test engineers to create browser instances and control them automatically to simulate user interaction with the web application under test. Test scenarios are written as JUnit tests and executed by JUnit - although GUI tests are actually no unit tests. That way the GUI tests can easily be integrated in existing test infrastructure like a Continuous Integration server.

GUI test scenarios will typically model the customer journey as a series of test cases. In contrary to this the unit test framework will expect its test cases to be small, fast and independent of each other. In theory the succession of the test executions is requested to be interchangable and in practice at least sharing state of any kind between test cases is very hard.

For test automation engineers this regularly poses the problem how to model the customer journey end-to-end: i.e. starting the browser once and execute a series of tests, while building up transient state (either in the application itself or in the browser, e.g. loaded URL or cookies) and keeping that state all over the simulated customer journey.

## Technical challenge
The lifecycle of a browser instance is managed by an instance of a 'WebDriver' object. To share the browser's state between test cases the corresponding `WebDriver` instance has to be made available to all of these tests. The JUnit 4 framework does not support sharing objects between tests out of the box.

**This project showcases how to parameterise test cases and make the WebDriver a parameter for these tests. This way a single WebDriver instance can be maintained and shared between multiple tests.**

## Current state of work
**This showcase is not complete yet!** You currently find two examples, each in a separate package. Further examples will cover (amongst others) the setup and teardown of a Suite-managed WebDriver instance via 'TestRule's.

- Bad example - Tests are grouped by a test suite, but each test runs its own `WebDriver`instance.
- Good example - Tests are parameterized and accept a `WebDriver` instance as parameter. These tests are grouped by a parameterized suite that instantiates one `WebDriver` instance for each known browser (i.e. Firefox and Chrome). These browser instances are reused in both test cases.

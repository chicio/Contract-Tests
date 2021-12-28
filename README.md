# Contract Tests

[![Build Status](https://travis-ci.org/chicio/Contract-Tests.svg?branch=master)](https://travis-ci.org/chicio/Contract-Tests)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/chicio/Contract-Tests/master/LICENSE.md)

An example java project created for my blog post ["A first approach to contract test"](https://www.fabrizioduroni.it/2017/07/25/a-first-approach-to-contract-test/ "A first approach to contract test").

### Description

The app contains and example of how much powerful are contract test and how they can help you to avoid duplication while writing your unit tests.
Below an article quote:

> Sometimes you have to unit test multiple implementations of the same interface. So basically you have the same tests for multiple concrete implementation of the same interface. In a case like this one, contract test could help you save a lot of time. Using contract test you will be able to run the same set of test for different concrete implementations.
How does it work? The main point is to have a template base abstract "ContractTest" test class that incapsulate the logic of the tests using abstract methods that use the base interface of the objects under test. These abstract methods will be implmented in the subclasses of this "ContractTest" class and they will feed the test with a concrete implementation of the interface used in the declaration of the abstract methods.

Click [here](https://www.fabrizioduroni.it/2017/07/25/a-first-approach-to-contract-test.html "A first approach to contract test") to read the post.

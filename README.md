<img src="https://www.rmit.edu.au/content/dam/rmit-ui/logo/rmit-logo@2x.png" alt="RMIT 2019" width="36" height="36"> RMIT 2019 Algorithm Analysis
======================================

Special thanks to [QMZiT](https://qmz.com.au) 

This is a production repo of [RMIT 2019 Algorithm Analysis](http://www1.rmit.edu.au/courses/004302).

It tries to port as many concepts from the original version as possible, but some concepts were adapted for more pleasant and performant integration with cloud environment.

## I came here because I want to ...

###### ... understand

* ⏱ [How to ask question](http://www.catb.org/~esr/faqs/smart-questions.html)
* ✈️ [Where to ask question](https://github.com/pigfly/RMIT_Algorithm_Analysis/issues)
* ⏱ When does each session begin ?
    * The web full-stack session will start at every Friday night starting at 8:00PM A.E.S.T.
* ⏱ When is assignment deadline ? 
    * The current week's assignment will be due on next Thursday 8:00 PM
    * e.g. Alex attended 26th July session, his assignment for that week will be due on 1st August 8:00 PM 
* 👨‍💻👩‍💻 Am I asking stupid question ?
    * There is no stupid question, if you think something is not clear, ask away in [where to ask question](https://github.com/pigfly/RMIT_Algorithm_Analysis/issues)

###### ... lookup

* HTML Standard. [HTML Spec](https://html.spec.whatwg.org/)

###### ... check style guide

* Java Style Guide. [Google Java Guide](https://google.github.io/styleguide/javaguide.html)
* Swift Style Guide. [Google Swift Guide](https://google.github.io/swift/)

###### ... interact

* All of this is great, but it would be nice to talk with other people using RxSwift and exchange experiences. <br />[Join Slack Channel](http://slack.rxswift.org)
* Report a problem using the library. [Open an Issue With Bug Template](.github/ISSUE_TEMPLATE.md)
* Request a new feature. [Open an Issue With Feature Request Template](Documentation/NewFeatureRequestTemplate.md)
* Help out [Check out contribution guide](CONTRIBUTING.md)

###### ... compare

* [with other libraries](Documentation/ComparisonWithOtherLibraries.md).

###### ... understand the structure

RxSwift comprises five separate components depending on eachother in the following way:

```none
┌──────────────┐    ┌──────────────┐
│   RxCocoa    ├────▶   RxRelay    │
└───────┬──────┘    └──────┬───────┘
        │                  │        
┌───────▼──────────────────▼───────┐
│             RxSwift              │
└───────▲──────────────────▲───────┘
        │                  │        
┌───────┴──────┐    ┌──────┴───────┐
│    RxTest    │    │  RxBlocking  │
└──────────────┘    └──────────────┘
```

* **RxSwift**: The core of RxSwift, providing the Rx standard as (mostly) defined by [ReactiveX](https://reactivex.io). It has no other dependencies.
* **RxCocoa**: Provides Cocoa-specific capabilities for general iOS/macOS/watchOS & tvOS app development, such as Binders, Traits, and much more. It depends on both `RxSwift` and `RxRelay`.
* **RxRelay**: Provides `PublishRelay` and `BehaviorRelay`, two [simple wrappers around Subjects](https://github.com/ReactiveX/RxSwift/blob/master/Documentation/Subjects.md#relays). It depends on `RxSwift`. 
* **RxTest** and **RxBlocking**: Provides testing capabilities for Rx-based systems. It depends on `RxSwift`.

###### ... find compatible

* libraries from [RxSwiftCommunity](https://github.com/RxSwiftCommunity).
* [Pods using RxSwift](https://cocoapods.org/?q=uses%3Arxswift).

###### ... see the broader vision

* Does this exist for Android? [RxJava](https://github.com/ReactiveX/RxJava)
* Where is all of this going, what is the future, what about reactive architectures, how do you design entire apps this way? [Cycle.js](https://github.com/cyclejs/cycle-core) - this is javascript, but [RxJS](https://github.com/Reactive-Extensions/RxJS) is javascript version of Rx.





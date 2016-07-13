#Intellij Slowdown Example

This project demonstrates a problematic interaction between intellij and the [FreeK](https://github.com/ProjectSeptemberInc/freek) library.

Intellij appears to have some kind of exponential slowdown when attempting to auto-import any arbitrary dependency in files that make use of the freek library. 
This slowdown appears to be exponential in the number of `DSLs` composed and even with a small number of DSLs, the entire UI thread can be blocked for several minutes, preventing all interaction with Intellij.

It is possible to work around this issue by doing something similar to the following:
  
```scala
//  type PRG =
//    DSL0.DSL :|: DSL1.DSL :|: DSL2.DSL :|: DSL3.DSL :|: DSL4.DSL :|: DSL5.DSL :|: FXNil
	
	type WORKAROUND1 = DSL0.DSL :|: DSL1.DSL :|: DSL2.DSL :|: FXNil
	type WORKAROUND2 = DSL3.DSL :|: DSL4.DSL :|: DSL5.DSL :|: FXNil
	type PRG = WORKAROUND1 :||: WORKAROUND2
```	

#Intellij Slowdown Example

This project demonstrates a problematic interaction between intellij and the [FreeK](https://github.com/ProjectSeptemberInc/freek) library.

Intellij appears to have some kind of exponential slowdown when attempting to auto-import any arbitrary dependency in files that make use of the freek library. 
This slowdown appears to be exponential in the number of `DSLs` composed and even with a small number of DSLs, the entire UI thread can be blocked for several minutes, preventing all interaction with Intellij.  

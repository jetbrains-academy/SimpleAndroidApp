Introduction
-------------

In this course, you will learn to create a simple Android application with
two screens. You will also be able to test your application on a phone emulator.



Main Activity
-------------

Basically, every Android app consists of several screens, each of the screens includes an activity and a layout.
An [**activity**](https://developer.android.com/reference/android/app/Activity) is the entry point for interacting with the user. It is a class defining the user's
interactions with the particular screen of the application through a user interface.
For example, an email app might have one activity that shows a list of new emails, another
activity to compose an email, and another one for reading emails.


Our app includes an element called <a href="psi_element://course.simpleapp.MainActivity">MainActivity</a> - the starting
point of the application. It is contained in the package `course.simpleapp`.
Check out this file, it will be modified further in the course.


You can read more about activities [here](https://developer.android.com/guide/components/activities/intro-activities).

You might want to check out the [Emulator task](course://Configuration/Emulator/src/main/java/course/simpleapp/MainActivity.kt)
before running the app.

onCreate()
---

All of the activities in the app must implement the [`onCreate()`](https://developer.android.com/reference/android/app/Activity#onCreate(android.os.Bundle,%20android.os.PersistableBundle))
method - it is called when creating the object of the activity to setup basic parameters (e.g., choose the layout).
It performs the basic startup logic of the application, which should happen only once for the entire life of the activity.


The method will be addressed in more detail later in the course.

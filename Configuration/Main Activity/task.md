Main Activity
-------------

Our app includes an element called <a href="psi_element://course.simpleapp.MainActivity">MainActivity</a> - starting point of the application. It is contained in package `course.simpleapp`. Check it out, it will be changed further in the course.

Basically, every app consists of several screens, each of the screens includes an activity and a layout. Activity is a class defining the user's interactions with the particular screen of the application.

You can read more about the activities [here](https://developer.android.com/guide/components/activities/intro-activities)

You might need to visit the [Emulator task](course://Configuration/Emulator/src/main/java/course/simpleapp/MainActivity.kt) before running the app.

onCreate()
---

All of the activities in the app must implement the `onCreate()` method - it is called by the android while creating the object of the activity, to setup basic parameters (e.g. choose the layout).

The method will be addressed later in the course.
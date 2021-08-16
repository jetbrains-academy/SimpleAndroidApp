Respond to the Check button

Following [these steps](https://developer.android.com/training/basics/firstapp/starting-activity#RespondToButton) does add a method to the MainActivity class that's called when the Check button is tapped:

In the `MainActivity`, add the following `onClickChangeText()` method:

```
fun onClickChangeText(view: View) {
    val editText = findViewById<TextView>(R.id.text)
    ...
  }
```

Change the text in the TextView to "I am changed now", when the button is pressed.

Return to the activity_main.xml file to call the method from the button:
Select the button in the Layout Editor.
In the Attributes window, locate the onClick property and select sendMessage [MainActivity] from its drop-down list.
Now when the button is tapped, the system calls the sendMessage() method.

Now let's make an app that can respond when someone presses the button.
You already have a TextView and a button in the layout for this exercise.

We also added a method to the `MainActivity` class that will be called when the Check button is tapped:
<p></p>

```
fun onClickChangeText(view: View) {
    val editText = findViewById<TextView>(R.id.text)
    ...
  }
```

In the `MainActivity`, complete the implementation of the `onClickChangeText()` method,
so that the text in the `TextView` changes to to "I am changed now", when the button is pressed.

<div class="hint">You can assign the new string value to <code>editText.text</code></div>

Now go to the `activity_main.xml` file to call the method from the button:
- Select the button in the **Layout Editor**.
- In the Attributes window, locate the **onClick** property and select `onClickChangeText` [MainActivity] from its drop-down list.
- Now when the button is tapped, the system calls the `onClickChangeText()` method.

Do not forget to run the app on your emulator and check out how it works!

You can read more about this topic [here](https://developer.android.com/training/basics/firstapp/starting-activity#RespondToButton).
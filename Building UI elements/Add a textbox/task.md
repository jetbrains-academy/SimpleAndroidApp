
In this lesson, you learn how to create a layout 
that includes a text box and a button. This sets up the next lesson, where you learn 
how to make the app respond when the button is tapped.

Most of your UI is defined in XML files.
However, this lesson shows you how to create a layout using Android Studio's Layout Editor, rather 
than teaching you to write XML. The Layout Editor writes the XML for you as you drag 
and drop views to build your layout. To see the `activity_main.xml` file, select the tab `Code`
in your Editor.

Add a text box
-------------

A text box can be used to enter some text into the app, such as a username or a response to a question.

In the **Select Design Surface** drop-down menu, select **Blueprint**.
<p></p>
<center>
    <img src="blueprint.png" alt="img" width=200 align="center" />
</center>

- Click <img src="img_1.png" alt="" width=15> (View Options) in the Layout Editor toolbar and make sure that **Show All Constraints** is checked.
  Make sure Autoconnect is off. A tooltip in the toolbar displays  (Enable Autoconnection to Parent) when Autoconnect is off. 
  
- Click <img src="img_2.png" alt="" width=20> (Default Margins) in the toolbar and select 16. If needed, you can adjust the margins for each view later.
  
- Click <img src="img_3.png" alt="" width=15> (Device for Preview) in the toolbar and select 5.5, 1440 × 2560, 560 dpi (Pixel XL)

Follow [these steps](https://developer.android.com/training/basics/firstapp/building-ui#textbox) to add a text box:

 - First, you need to remove what's already in the layout. Click **TextView** in the 
   **Component Tree** panel and then press the **Delete** key.
 - In the **Palette** panel, click **Text** to show the available text controls.
 - Drag the **Plain Text** into the design editor and drop it near the top of 
   the layout. This is an **EditText** widget that accepts plain text input.
 - Click the view in the design editor. You can now see the square handles to 
   resize the view on each corner, and the circular constraint anchors on each side. 
   For better control, you might want to zoom in on the editor. To do so, use the **Zoom** 
   buttons in the **Layout Editor** toolbar.
 - Click and hold the anchor on the top side, drag it up until it snaps to the top 
   of the layout, and then release it. That's a constraint: it constrains the view 
   within the default margin that was set. In this case, you set it to 16 dp from the 
   top of the layout.
 - Use the same process to create a constraint from the left side of the view to the 
   left side of the layout.

The result should look as shown in the figure below.
<p></p>
<center>
    <img src="img.png" alt="img" width=400 align="center" />
</center>

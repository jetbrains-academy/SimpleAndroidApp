Add a text box

Follow [these steps](https://developer.android.com/training/basics/firstapp/building-ui#textbox) to add a text box:

 - First, you need to remove what's already in the layout. Click TextView in the Component Tree panel and then press the Delete key.
 - In the Palette panel, click Text to show the available text controls.
 - Drag the Plain Text into the design editor and drop it near the top of the layout. This is an EditText widget that accepts plain text input.
 - Click the view in the design editor. You can now see the square handles to resize the view on each corner, and the circular constraint anchors on each side. For better control, you might want to zoom in on the editor. To do so, use the Zoom buttons in the Layout Editor toolbar.
 - Click and hold the anchor on the top side, drag it up until it snaps to the top of the layout, and then release it. That's a constraint: it constrains the view within the default margin that was set. In this case, you set it to 16 dp from the top of the layout.
 - Use the same process to create a constraint from the left side of the view to the left side of the layout.
Layout
------
The file `activity_main.xml` is an
XML file that defines the layout for the activity's user interface (UI). Check it
out.

A [layout](https://developer.android.com/guide/topics/ui/declaring-layout) defines the structure for a user interface in an activity. 
All elements in the layout are built using a hierarchy of [View](https://developer.android.com/reference/android/view/View) 
and [ViewGroup](https://developer.android.com/reference/android/view/ViewGroup) objects.

A View object usually draws something users can see and interact with.
Such objects are also called "widgets" and there are many subclasses of them, for example
[ImageView](https://developer.android.com/reference/android/widget/ImageView) or [TextView](https://developer.android.com/reference/android/widget/TextView).
Our `activity_main.xml` contains a TextView element with the text "I fight for the users!"

A ViewGroup is an invisible container that defines the layout structure for View and other 
ViewGroup objects.
There are many types of such objects that provide different layout structures, such as 
[LinearLayout](https://developer.android.com/reference/android/widget/LinearLayout) or 
[ConstraintLayout](https://developer.android.com/reference/androidx/constraintlayout/widget/ConstraintLayout).
Our file defines an overall LinearLayout for the activity. 
It aligns all children (other views) in a single direction, either vertically or horizontally. 

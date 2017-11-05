# controlling-phone
###Date : 4th nov,2017

**Thought**  Make your phone silent using do not desturb permission

**Concept** startActivityForResult(), notification manger

**Todo** 
<ol>
    <li> Using firebase send push notification to silent the phone remotely </li>
</ol>


###Date : 5th nov,2017

**Thought**  Make your phone silent using do not desturb permission

**Concept** meta-data, firebase (https://firebase.google.com/docs/cloud-messaging/android/client?authuser=0)

**Learnings**
 <ol>
     <li> It is basically an additional option to store information that can be accessed through the entire project. In this case, <meta-data> is defined outside <b>activity</b> tag and inside <b>application</b> tag. </li>
 </ol>
 
 **Problem**
  <ol>
      <li> onMessageReceive Will only work if app is in foreground so i will be able to control phone functionality when app is in foreground. possible solution : send notification with data <a href="https://stackoverflow.com/questions/37711082/how-to-handle-notification-when-app-in-background-in-firebase">Stackoverflow link</a> <b>(Working solution)</b></li>
  </ol>

              
**Todo** 
<ol>
    <li> write method to save refreshed token to server </li>
    <li> Find a way to comunicate to phone even if phone is in background(possible solution IFTTT) - DONE </li>
</ol>


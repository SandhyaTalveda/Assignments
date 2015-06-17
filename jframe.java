
How To: Center A JFrame On The Screen
To center a JFrame object named frame, use the following code just before the frame.setVisible(true) statement, and after the frame.pack(); or the frame.setSize(...) statement:

    // center the window
    Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension fd = frame.getSize();
    if (fd.height > sd.height)
      fd.height = sd.height;
    if (fd.width > sd.width)
      fd.width = sd.width;
    frame.setLocation((sd.width - fd.width) / 2, (sd.height - fd.height) / 2);

This works for both Frame and JFrame objects.
  
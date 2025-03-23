import javax.swing.*
import java.awt.*

// Create the main window
def frame = new JFrame("Current Time")
frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
frame.size = new Dimension(400, 200)

// Create a label to display the time
def timeLabel = new JLabel()
timeLabel.font = new Font("Arial", Font.BOLD, 48) // Set font size
timeLabel.horizontalAlignment = JLabel.CENTER // Center-align text
frame.add(timeLabel)

// Make the window visible
frame.visible = true

// Create a date formatter for 12-hour format
def timeFormat = new java.text.SimpleDateFormat("h:mm:ss a")

// Timer to update the time every second
def timer = new Timer(1000, {
    // Get the current time
    def currentTime = timeFormat.format(new Date())

    // Update the label with the current time
    timeLabel.text = currentTime
})
timer.start() // Start the timer
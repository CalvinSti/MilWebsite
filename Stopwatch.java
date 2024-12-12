const stopwatch = document.getElementById('stopwatch');

function updateStopwatch() {
  let seconds = 0;
  let minutes = 0;

  const intervalId = setInterval(() => {
    seconds++;
    if (seconds === 60) {
      minutes++;
      seconds = 0;
    }

    const formattedTime = `${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;
    stopwatch.textContent = formattedTime;
  }, 1000);
}

window.onload = updateStopwatch;
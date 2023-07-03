window.onload = function() {
  const menu_btn = document.querySelector('.hamburger');
  const mobile_menu = document.querySelector('.mobile-nav');

  menu_btn.addEventListener('click', function() {
    menu_btn.classList.toggle('is-active');
    mobile_menu.classList.toggle('is-active');
  });
};


// Array of YouTube video IDs
const videoIDs = ['LM2F56uK0fs', 'X9ebeNKkc08', 'cnDObXxwWy0', 'LM2F56uK0fs'];

// Generate a random index
const randomIndex = Math.floor(Math.random() * videoIDs.length);

// Get the random video ID
const randomVideoID = videoIDs[randomIndex];

// Load the YouTube player
function onYouTubePlayerAPIReady() {
  new YT.Player('player', {
    videoId: randomVideoID,
    playerVars: {
      autoplay: 1,
      mute: 1,
      loop: 1,
      playlist: randomVideoID,
      controls: 0,
      disablekb: 1
    }
  });
}




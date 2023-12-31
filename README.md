# [A] 🎬 Android Movie App
### This Android Movie🍿 App project allows users to browse and discover popular and top-rated movies. It leverages the TMDb API to fetch movie data and displays it in a user-friendly interface.

# [B] 🚀 Project Overview
## MainActivity:
### The main activity of the app provides navigation options to switch between popular and top-rated movies. It uses fragments to display movie lists and utilizes the TMDb API for data retrieval.

## SecondActivity:
### A secondary activity for your app.

## TMDbAPI:
### An interface defining API endpoints for fetching popular and top-rated movies using Retrofit.

## TMDbClient: 
### A singleton class responsible for making network requests to the TMDb API and returning LiveData objects with movie data.

## MovieAdapter: 
### An adapter for populating RecyclerViews with movie data. It uses Glide for image loading.

## MovieFragment:
### A fragment responsible for displaying a list of movies. It observes changes in user preferences and fetches movie data accordingly.

## MovieNetworkResponse:
### A data class representing the structure of responses from the TMDb API.

## item_movie.xml:
### A layout file defining the structure of individual movie items displayed in RecyclerViews. It supports data binding to display movie information.

## fragment_movie.xml:
### A layout file defining the structure of the fragment responsible for displaying movie lists. It includes elements like ImageView, TextView, and RecyclerView.

## activity_main.xml:
### The layout file for the main activity, including a BottomNavigationView for navigation and a FrameLayout for fragment hosting.

## activity_second.xml:
### The layout file for the secondary activity. Currently empty, it can be customized for secondary functionality.

# [C] Usage
### Customize the app's appearance, styles, and themes to match your design preferences.

### Modify the layout files (activity_main.xml, activity_second.xml, fragment_movie.xml, item_movie.xml) to enhance the user interface and layout.

### Implement additional functionality and features in the app as needed.

# [D] Dependencies
### AndroidX Libraries
### Retrofit and Gson for networking
### Glide for image loading
### LiveData and ViewModel for data management
### Timber for logging


# Refer the screenshots below:- 
![Screenshot_20230906-085045](https://github.com/Sarthakverse/Popular_Movies_App/assets/117356021/7cd203ab-9379-43d8-9730-d2e9e2bb04dc)
![Screenshot_20230906-085048](https://github.com/Sarthakverse/Popular_Movies_App/assets/117356021/6ae0e04c-e1ee-4d1a-a22c-5d323e201728)
![Screenshot_20230906-085009](https://github.com/Sarthakverse/Popular_Movies_App/assets/117356021/bad406a7-9f4f-40d1-ae14-aed30c62ec14)




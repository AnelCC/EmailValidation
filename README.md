# Clean Architecture handling errors

Project name: **Email Validation**

### Android
Develop in android over Clean Architecture, MVVM, Kotlin, Compose.



View Model
Jet Pack Compose View 
Clean Architecture 
Handling Error from the repository: Success and Error. 

### Package Structure
```
com.anelcc.cleanarchitecturehandleerrors      # Root Package
.
│
├── data               # Model classes,
│   └── Repository     # Web service repository
│
├── domain             # Conectiones al repositorio
│   │── SubmitEmailUseCase      # Comunication to the view model and repo   
│   └── RepositoryInterface     # Comunication to the repo with interface       
│
├── presentation       # View Models
│   └── BaseViewModel  
│
├── ui                 # Themes or Compose
│   └── theme          
│       ├── Color          
│       │── Theme.          
│       └── UiText  
│
├── util                  # Util Class
│   ├── Resource
│   └── UiText       
└── MainActivity    # View 
```
### Preview 🎉



### Library References

0. Kotlin [Read here](https://developer.android.com/kotlin/ktx)
0. Jetpack [Read here](https://developer.android.com/jetpack/getting-started)
0. Compose [Read here](https://developer.android.com/jetpack/androidx/releases/compose-ui)
0. MVVM [Read here](https://blog.mindorks.com/mvc-mvp-mvvm-architecture-in-android)
0. View Models [Read here](https://developer.android.com/topic/libraries/architecture/viewmodel)
0. DataModel [Read here](https://developer.android.com/topic/libraries/architecture/viewmodel)
0. DataModel [Read here](https://developer.android.com/topic/libraries/architecture/viewmodel)
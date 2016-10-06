# SYM
## Labo01
### 1.
Il faut ajouter un dossier values-(country code) dans les ressources, contenant un fichier strings.xml.  
Ceci permet d'avoir une application multi-lingue.  
La langue apr défaut est la langue contenue dans le fichier strings.xml sous le dossier "values".

### 2.
Il faut mettre l'image dans le dossier ressource "drawable". Physiquement il existe plusieurs dossier pour différentes résolutions.  
Les images sont gérées selon la résolution du téléphone utilisé. Comme la version d'android ne change pas beaucoup d'un téléphone à l'autre contrairement au matériel (et notamment l'écran), il faut pouvoir supporter différentes résolutions pour l'application.  
D'où la gestion via différents folders.

### 3.
Sans rien faire, l'action de cliquer sur le bouton lors de la 2ième activité fait quitter l'application, alors que elle devrait simplement nous ramener à l'écran de login. 
Afin de palier à ce problème, nous avons utiliser la fonction OnBackPressed dans la BasicActivity (2ième activité) afin de lui dire de retourner à l'écran de login en cas de pression sur le bouton Back.

### 4.
Afin de faire ceci, au moment de crée l'activité, il ne faudra pas utiliser la fonction startActivity() mais plutôt la fonction startActivityForResult() ce qui nous permettera de récupere une valeur par la suite dans la première activité.
Dans la 2ième activité, nous pourrons faire les 2 fonctions getIntent().putExtra("ResultValue", "0"); et setResult(Activity.RESULT_OK, getIntent()); afin de dire que le résultat est une string comme clé "ResultValue" et valeur "0" 
et également lui dire que l'activité a correctement quitté (RESULT_OK). Ensuite, dans la 1ère activité, il suffira de handle le retour grâce à la fonction OnActivityResult() qui nous permettera de récuperer toutes les informations que nous 
avons passé lors du retour de la 2ième activité.

### 5.
Il faut créer un second layout, en mode paysage (depuis la gui de android studio par exemple).  
Ensuite ce layout doit être déposé dans un folder "layout-land" qui permet d'utiliser l'application en mode paysage et avoir un autre affichage.
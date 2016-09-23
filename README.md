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

### 4.

### 5.
Il faut créer un second layout, en mode paysage (depuis la gui de android studio par exemple).  
Ensuite ce layout doit être déposé dans un folder "layout-land" qui permet d'utiliser l'application en mode paysage et avoir un autre affichage.
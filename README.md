# Spring-boot-MicroServices-Demo

**Spring Boot Microservices Demo**

Ce projet est une démonstration de la création de microservices avec Spring Boot. Il utilise l'exemple d'insérer, afficher, modifier et supprimer des étudiants.

## Prérequis

* Java 11 ou version ultérieure
* Maven 3.8.1 ou version ultérieure

## Installation

Pour installer le projet, exécutez les commandes suivantes :

```
git clone https://github.com/MouadHouari/Spring-boot-MicroServices-Demo.git
cd Spring-boot-MicroServices-Demo
mvn clean install
```

## Lancement

Pour lancer le projet, exécutez la commande suivante :

```
mvn spring-boot:run
```

Le projet sera lancé sur le port 8084.

## Utilisation

Pour utiliser le projet, vous pouvez utiliser l'API REST suivante :

* **Insérer un étudiant**

```
POST /etudiants
```

Body :

```
{
    "id": 1,
    "codeApogee": 1901111,
    "email": "houarimouad@gmail.com",
    "nomComplet": "Mouad Houari",
    "filiere": "Informatique Appliquee Offshoring"
}
```

* **Afficher un étudiant**

```
GET /etudiants/{id}
```

* **Modifier un étudiant**

```
PUT /etudiants/{id}
```

Body :

```
{
    "id": 1,
    "codeApogee": 1901111,
    "email": "houarimouad@gmail.com",
    "nomComplet": "Mouad Houari",
    "filiere": "Informatique Appliquee Offshoring"
}
```

* **Supprimer un étudiant**

```
DELETE /etudiants/{id}
```

## Packages

Les packages suivants sont utilisés dans le projet :

* **com.houari.dto** : contient les DTO utilisés pour l'API REST
* **com.houari.entities** : contient les entités utilisées pour la persistance des données
* **com.houari.mapper** : contient les mappers utilisés pour convertir les DTO en entités et vice versa
* **com.houari.repositories** : contient les repositories utilisés pour accéder aux données
* **com.houari.services** : contient les services utilisés pour les opérations CRUD sur les données
* **com.houari.web** : contient le contrôleur REST utilisé pour exposer l'API REST

## Tests

Le projet contient des tests unitaires et d'intégration qui génèrent des données aléatoires. Pour exécuter les tests, exécutez le fichier "EtudiantApplication.java" :


## Déploiement

Le projet peut être déployé sur un serveur d'applications ou sur un cluster Kubernetes.

## Auteurs

* Mouad Houari

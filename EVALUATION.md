# Evaluation

## Installation

- Nous avons eu un problème de compréhension au niveau de l'installation de maven dans le projet, 
nous avons créé un nouveau projet maven à l'interieur du projet initial, car nous avions suivi la procédure de création 
de projet maven dans le install.md. Nous avons alors affiné cette partie et ajouté une autre partie afin d'expliquer 
l'installation de maven sur les ordinateurs personnels. 
Commit : https://github.com/Jlebours/PDL_1920_groupe-7/commit/90c560e47ceb18d7cda056772c74f504b3b8414f

## Maven test

- Lors du run mvn test, le build se déroule correctement, nous obtenons 10 tests qui ne fonctionnent pas ainsi 4 qui fonctionnent sur les 14 cas de test.
Le test de l'extractor génère 3 bugs en lisant les urls, causé par les caractères spéciaux.
Solution dans cette issue : https://github.com/Jlebours/PDL_1920_groupe-7/issues/5
- L'extracteur HTML génère 1621 fichiers et l'extracteur WIKITEXT génère 1547 fichiers.
Le test de l'extracteur peut être généré par cette commande : mvn -Dtest=ConverterToCsvTest#extractor test

## JUnit test

Lors du lancement des tests unitaires directement sur le projet, le build se déroule correctement, 
et nous obtenons, comme pour le mvn test, 10 tests qui ne fonctionnent pas ainsi 4 qui fonctionnent sur les 14 cas de test.
- Voir l'issue pour plus de détails : https://github.com/Jlebours/PDL_1920_groupe-7/issues/3

Nous avons observé que lors d'une nouvelle extraction, tous les fichiers sont de nouveau générés, et ne sont jamais identiques à la génération précédente.
Cela falsifie la majorité des tests, particulièrement les tests de VéritéTerrain qui compare un fichier csv stable, dans le répertoire verite,
à un nouveau csv à chaque fois qu'une extraction est faite, ce qui entrainera toujours des erreurs.
Issue pour la résolution de ce problème : 


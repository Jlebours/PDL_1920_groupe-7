# Evaluation

## Installation

We had a comprehension problem with the installation of maven in the project, 
we created a new maven project within the initial project, as we had followed the creation procedure of project maven in the install.md. 
Then we refined this part and added another part to explain the installation of maven on personal computers. 
- Commit : https://github.com/Jlebours/PDL_1920_groupe-7/commit/90c560e47ceb18d7cda056772c74f504b3b8414f

## Maven test

During the mvn test run, the build is running correctly, we get 10 tests that don't work so 4 that work on the 14 test cases.
The extractor test generates 3 bugs when reading urls, caused by special characters.
- Solution in this issue : https://github.com/Jlebours/PDL_1920_groupe-7/issues/5

The HTML extractor generates 1621 files and the WIKITEXT extractor generates 1547 files.
The test of the extractor can be generated by this command: mvn -Dtest=ConverterToCsvTest#extractor test

## JUnit test

When unit tests are launched directly on the project, the build goes smoothly, 
and we get, as for the mvn test, 10 tests that do not work so 4 that work on the 14 test cases.
- Issue on JUnit test : https://github.com/Jlebours/PDL_1920_groupe-7/issues/3

We have observed that during a new extraction, all the files are generated again, and are never identical to the previous generation.
This falsifies the majority of tests, especially the tests of VéritéTerrain which compares a stable csv file in the verite directory,
to a new csv each time an extraction is made, which will always generate errors.
- Solution in this issue : https://github.com/Jlebours/PDL_1920_groupe-7/issues/8

## Extractor defaults

- The HTML extractor generates more csv than the WIKITEXT extractor. 
- Special characters are not displayed in the same way inside tables.
- Tables are not generated in the same order in the HTML and WIKITEXT directories, for example : 
 html/Comparison_between_Esperanto_and_Ido-0 corresponds to wikitext/Comparison_between_Esperanto_and_Ido-2.

## Extractor success rate

We have developed an algorithm to check the success rate of the extractor between html and wikitext.
As we know that the csv are not extracted in the same order then the success rate would be close to 0 
if we compare them in the order generated in the output directory.

The algorithm then follows the following procedure:
1. For each csv file in the output/html directory, it looks for a csv with the same name in the output/wikitext directory.
2. We check that the container of each csv is the same for all the given file names. 
3. If everything is valid for the same csv name in both directories then we can say that the case is a success.

We obtain a success rate of 337 out of 1627 csv extracts (20.5%).
- File corresponding to the test: https://github.com/Jlebours/PDL_1920_groupe-7/blob/master/src/main/java/fr/istic/pdl1819_grp5/SuccesRate.java
- See the result at the end of the issue: https://github.com/Jlebours/PDL_1920_groupe-7/issues/3

## Improvement path 

A good extraction order of the tables could be a solution, which would also make unit tests more reliable. 
It is necessary to improve the stability of the extractor and so we can make the html and wikitext at the same time and using a buffer 
that contains all URL and a syncronized that will make the extraction at the same time. 
Unfortunaly we didn't had the time to do it and it would have been very hard.



 




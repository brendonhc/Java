all: App.java BubbleSort.java
	javac App.java BubbleSort.java

run: all
	java App

clean:
	rm -rf *.class *.zip

zip: clean
	zip zip.zip *.java Makefile

# Utils

gradle:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
	dependencies {
	        compile 'com.github.MavenPack:Utils:0.1'
	}


Maven:
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
	<dependency>
	    <groupId>com.github.MavenPack</groupId>
	    <artifactId>Utils</artifactId>
	    <version>0.1</version>
	</dependency>


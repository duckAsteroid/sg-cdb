sg-cdb
========================================================================


Overview
========================================================================

sg-cdb is a pure Java version of [D.J. Bernstein](http://cr.yp.to/)'s 
constant database (cdb) package.  Its API is the same as the one used in 
the original cdb library.  

Files created with sg-cdb can be read with the cdb library and
vice versa.  My goal was to provide a seamless way of porting cdb code
to a Java environment without the need for a JNI library.

More cdb information can be found at D.J. Bernstein's home page:
[http://cr.yp.to/cdb.html](http://cr.yp.to/cdb.html). Please do **not** send sg-cdb questions to
Mr. Bernstein.  He is not the maintainer of this implementation.

See the [sg-cdb product page](http://www.strangeGizmo.com/products/sg-cdb/) 
on the strangeGizmo.com site for more information on the basis of this fork.

Continuous integration builds are performed by [Travis-CI](https://travis-ci.org/duckAsteroid/sg-cdb) [![Build Status](https://travis-ci.org/duckAsteroid/sg-cdb.svg?branch=master)](https://travis-ci.org/duckAsteroid/sg-cdb)

Software metrics are tracked via [SonarQube](https://sonarcloud.io/dashboard?id=sg-cdb) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.asteroid.duck%3Asg-cdb&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.asteroid.duck%3Asg-cdb)

Security vulnerabilities via [Snyk](https://snyk.io/) [![Known Vulnerabilities](https://snyk.io/test/github/duckAsteroid/sg-cdb/badge.svg?targetFile=build.gradle)](https://snyk.io/test/github/duckAsteroid/sg-cdb?targetFile=build.gradle)

Contributing
=========================================================================
Pull requests welcome, see GitHub issues for outstanding items.

Note this project is [![Ready-to-Code on GitPod](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/malyn/sg-cdb) 

Change List
========================================================================
1.0.5
-----
-   Upgraded to use Gradle build tools.
-   Added a main method/class that simply redirects between the 
    `dump`/`make`/`get` tools.
-   Added metadata to make JAR executable
-   Added Travis-CI build script

1.0.4
-----

-   Fixed cdb.dump to avoid problems with charset conversion issues on
    some platforms (fixed by Ito Kazumitsu).
-   Fixed cdb.dump so that it outputs \\n as the record terminator on
    Windows platforms, which would otherwise output \\r\\n (fixed by Ito
    Kazumitsu).

1.0.3
-----

-   Fixed sign bit problem with binary keys (fixed by Eric Kampf).
-   Fixed findNext to correctly deal with multiple keys mapping to the
    same value (fixed by Eric Kampf).

1.0.2
-----

-   First public release.

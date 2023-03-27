# SingleFunctionIntegration
A single function written in Java which performs Monte Carlo Integration to test single thread performance.

Designed to test serverless functions on AWS Lambda and GCP Cloud Functions

Includes two functions in Integrate.java:

integrate (double a, double b, long pointCount)
return: time taken to approximate the integral for the point count

integrate_time (double a, double b, long duration) 
return: number of points generated and used for approximation

# Usages:
java Integrate --count a b point_count
> integrates over the interval (a,b) using the specified number of approximation points. 

java Integrate --timed a b duration_millis
> integrates over the interval (a,b) by generating points for the specified amount of time.

java Integrate --both a b point_count duration_millis
> runs both test types sequentially. tests point-count based integration first, then time-based.


## Reference Scores (--both -1 1 1000000000 8000):

AMD Ryzen 7 7700X (4.5Ghz): 
>  7724 ms, 827634106 points

Intel Core i7-8550U (2.0Ghz):
> 37033 ms, 204506563 points

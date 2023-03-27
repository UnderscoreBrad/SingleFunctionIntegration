# SingleFunctionIntegration
A set of single methods written in Java which performs Monte Carlo Integration to test single thread performance.

Designed to test serverless functions on AWS Lambda and GCP Cloud Functions

# Usages:
java Integrate --count a b point_count
> integrates over the interval (a,b) using the specified number of approximation points. 

java Integrate --timed a b duration_millis
> integrates over the interval (a,b) by generating points for the specified amount of time.

java Integrate --both a b point_count duration_millis
> runs both test types sequentially. tests point-count based integration first, then time-based.

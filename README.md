# SingleFunctionIntegration
A single function written in Java which performs Monte Carlo Integration to test single thread performance.

Includes two functions in Main.java:

integrate: 
args: a - lower bound
      b - upper bound
      pointCount - number of points for use in approximation
return: time taken to approximate the integral for the point count

integrate_time:
args: a - lower bound
      b - upper bound
      duration - time interval to continue generating points (millis)
return: number of points generated and used for approximation

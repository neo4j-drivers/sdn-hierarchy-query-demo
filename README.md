# sdn-hierarchy-query-demo

Proof that we don't issue multiple queries just because "inheritance".

There are 5 packages ("com.example.demo.d1" upto "com.example.demo.d5") and 5 corresponding tests (`D1Test` upto `D5Test`).
To run them you need to have Docker installed.

In each package there is a command line runner that queries exactly one instance of a class inside a hierachy with some attributes and one or more relations.
Look for the `Config` class in each package.
d1, d2 and d3 are scenarios in which we can find out, that there are no cycles defined and thus execute exactly one query.

d4 and d5 are examples that demonstrate how a mixture of a class hierachy and generic relationships / mappings makes it impossible for us to figure out that there is no actual circle (but potentially could be one).
We cannot assume there is none because if we do, the required query cannot be written in such a way that it does retrieve all nodes and relationships that are potentially required to populate the model AND returns in a acceptable time without grinding down the server.

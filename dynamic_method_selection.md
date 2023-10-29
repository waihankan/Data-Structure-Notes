## Compile Time Steps

1. check for valid assignments (parrent = new child())
2. collect all methods with the same name starting from the static class, and going up the heirerarchy
    - exclude those that overwrite (same naem same parameter)
3. find the method with the most specific parameter type to the argument passed in. (**Most Specific = Closet Parent**)
4. Lock in the method signature found or ERROR if no method matches

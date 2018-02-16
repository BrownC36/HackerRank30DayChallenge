// Add your code here
  Difference(int[] input){
      elements = input;
  }

  void computeDifference() {
      int min = elements[0], max = elements[0];
      for(int i = 0; i < elements.length; i++) {
          min = Math.min(min, elements[i]);
          max = Math.max(max, elements[i]);
      }
      maximumDifference = max - min;
  }

package exercises.itb.ex11;

import javax.xml.transform.stream.StreamSource;

public class GlobalTemp {
  public static void main(String[] args) {
    String cities[] = {"Londres", "Madrid", "New York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago", "Lisboa", "Tokio"};
    float temps[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
    float higherTemp = 0.f;
    float lowerTemp = 0.f;
    int x = 0, y = 0;

    for (int i = 0; i < cities.length; i++) {

      if (temps[i][1] >= higherTemp){
        higherTemp = temps[i][1];
        x = i;
      }

      if (temps[i][0] <= lowerTemp){
        lowerTemp = temps[i][0];
        y = i;
      }
    }

    System.out.println("Higher Temp: " + higherTemp + " from " + cities[x]);
    System.out.println("Lower Temp: " + lowerTemp + " from " + cities[y]);
  }
}

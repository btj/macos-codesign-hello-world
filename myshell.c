#include <stdlib.h>

int main(int argc, char **argv) {
  if (argc < 2)
    return 2;
  return system(argv[1]) != 0;
}

# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
from point import Point

def main():
    p1 = Point(8.0, 15.0)

    print(f"Point 1 x: {p1.x}")
    print(f"Point 1 y: {p1.y}")
    print(f"Point 1 distance from origin: {p1.distance():.1f}")

    p2 = Point(4.5, 7.0)

    print(f"Point 1 distance from Point 2: {p1.distanceTo(p2):.1f}")

if __name__ == "__main__":
    main()
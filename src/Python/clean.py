from math import sqrt

if __name__ == '__main__':
    while (x := input("\nWhich side are you looking for?\n[a, b, c, exit]: ")) != "exit":
        result = 0
        if x.lower() in "ab":
            f = input(f"give me ({'b' if x.lower() == 'a' else 'a'}) and (c): ")
            y, c = f.split(" ")
            result = sqrt((int(c) ** 2) - (int(y) ** 2))

        elif x.lower() == "c":
            f = input("give me (a) and (b): ")
            a, b = f.split(" ")
            result = sqrt((int(a) ** 2) + (int(b) ** 2))

        print(f"\nSide ({x.lower()}) is equal to %.2f" % result)

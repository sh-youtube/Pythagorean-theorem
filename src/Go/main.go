package main

import (
	"fmt"
	"math"
	"strings"
)

func main() {
	var a, b, c float64
	var d string

	fmt.Print("Which side are you looking for: ")
	fmt.Scanln(&d)

	e := strings.ToLower(d)

	if e == "a" {
		fmt.Print("give me (b): ")
		fmt.Scanln(&b)

		fmt.Print("give me (c): ")
		fmt.Scanln(&c)

		a := math.Sqrt(math.Pow(c, 2) - math.Pow(b, 2))

		fmt.Printf("a = %.3f", a)
	} else if e == "b" {
		fmt.Print("give me (a): ")
		fmt.Scanln(&a)

		fmt.Print("give me (c): ")
		fmt.Scanln(&c)

		b := math.Sqrt(math.Pow(c, 2) - math.Pow(a, 2))

		fmt.Printf("b = %.3f", b)
	} else if e == "c" {
		fmt.Print("give me (a): ")
		fmt.Scanln(&a)

		fmt.Print("give me (b): ")
		fmt.Scanln(&b)

		c := math.Sqrt(math.Pow(a, 2) + math.Pow(b, 2))

		fmt.Printf("c = %.3f", c)
	}

}

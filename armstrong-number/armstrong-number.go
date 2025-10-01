package main

import (
	"fmt"
	"math"
)

func main() {
	num := 153 // Change this to test other numbers
	original := num
	sum := 0
	digits := 0

	temp := num
	for temp > 0 {
		digits++
		temp /= 10
	}

	temp = num
	for temp > 0 {
		digit := temp % 10
		sum += int(math.Pow(float64(digit), float64(digits)))
		temp /= 10
	}

	if sum == original {
		fmt.Printf("%d is an Armstrong number.\n", original)
	} else {
		fmt.Printf("%d is NOT an Armstrong number.\n", original)
	}
}

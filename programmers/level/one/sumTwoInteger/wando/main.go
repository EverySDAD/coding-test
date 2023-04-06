package main

import "sort"

func solution(a int, b int) int64 {
	inputToArray := []int{a, b}
	sort.Ints(inputToArray)
	sum := 0
	for i := inputToArray[0]; i <= inputToArray[1]; i++ {
		sum += i
	}
	return int64(sum)
}

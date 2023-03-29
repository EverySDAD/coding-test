package main

import "sort"

func solution(arr []int, divisor int) []int {
	var result []int
	for _, value := range arr {
		if value%divisor == 0 {
			result = append(result, value)
		}
	}
	if len(result) != 0 {
		sort.Ints(result)
	} else {
		result = append(result, -1)
	}

	return result
}

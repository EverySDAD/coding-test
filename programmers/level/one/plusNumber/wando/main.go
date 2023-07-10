package main

import (
	"strconv"
)

func solution(n int) int {
	answer := 0
	for _, v := range strconv.Itoa(n) {
		n, _ := strconv.Atoi(string(v))
		answer += n
	}
	return answer
}

package main

func solution(n int) int {
	var sum int
	for i := 1; i <= n; i++ {
		if n%i == 0 {
			sum += i
		}
	}
	return sum
}

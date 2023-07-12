package main

func solution(n int64) []int {
	var result []int
	for {
		result = append(result, int(n)%10)
		n /= 10
		if n == 0 {
			break
		}
	}
	return result
}

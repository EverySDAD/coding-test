package main

func solution(s string) bool {
	result := true

	if l := len(s); !(l == 4 || l == 6) {
		result = false
	}

	for _, v := range s {
		if v < '0' || v > '9' {
			result = false
			break
		}
	}
	return result
}

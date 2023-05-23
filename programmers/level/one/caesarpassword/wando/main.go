package main

func solution(s string, n int) string {
	offest := rune(n)
	result := []rune(s)

	for i, v := range s {
		if v >= 'A' && v <= 'Z' { // 대문자
			result[i] = (((v + offest) - 'A') % 26) + 'A'
		} else if v >= 'a' && v <= 'z' { // 소문자
			result[i] = (((v + offest) - 'a') % 26) + 'a'
		} else {
			result[i] = ' '
		}
	}

	return string(result)
}

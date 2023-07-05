package main

import "strings"

func solution(s string) string {
	var convertString strings.Builder
	index := 0

	for i := 0; i < len(s); i++ {
		if s[i] != ' ' {
			if index%2 == 0 {
				convertString.WriteString(strings.ToUpper(string(s[i])))
			} else {
				convertString.WriteString(strings.ToLower(string(s[i])))
			}
			index++
		} else {
			convertString.WriteString(" ")
			index = 0
		}
	}

	return convertString.String()
}

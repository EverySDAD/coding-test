package main

import "strings"

func solution(n int) string {
	var builder strings.Builder
	for i := 1; i <= n; i++ {
		if i%2 != 0 {
			builder.WriteString("수")
		} else {
			builder.WriteString("박")
		}
	}
	return builder.String()
}

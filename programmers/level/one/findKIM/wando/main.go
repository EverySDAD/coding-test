package main

import "fmt"

func solution(seoul []string) string {
	var index int
	for i, v := range seoul {
		if v == "Kim" {
			index = i
			break
		}
	}
	return fmt.Sprintf("김서방은 %d에 있다", index)
}

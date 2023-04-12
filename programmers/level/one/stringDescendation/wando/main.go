package main

import (
	"sort"
)

func solution(s string) string {
	convertString := []byte(s)

	sort.Slice(convertString, func(i, j int) bool {
		return convertString[i] > convertString[j]
	})

	return string(convertString)
}

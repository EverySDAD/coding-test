package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := "Zbcdefg"
	expect := "gfedcbZ"

	result := solution(testCase)
	if result != expect {
		t.Errorf("기대값: %s, 출력값: %s", expect, result)
	}
}

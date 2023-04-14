package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := []string{"Jane", "Kim"}
	expect := "김서방은 1에 있다"

	result := solution(testCase)
	if expect != result {
		t.Errorf("기대값: %s, 출력값: %s", expect, result)
	}
}

package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := "try hello world"
	expect := "TrY HeLlO WoRlD"

	result := solution(testCase)
	if expect != result {
		t.Errorf("출력값: %s, 기대값: %s", result, expect)
	}
}

package main

import "testing"

func TestSolution(t *testing.T) {
	testCase_S := "AB"
	testCase_N := 1
	expect := "BC"
	result := solution(testCase_S, testCase_N)
	if result != expect {
		t.Errorf("기대값: %v, 출력값: %v", expect, result)
	}

	testCase_S = "z"
	testCase_N = 1
	expect = "a"
	result = solution(testCase_S, testCase_N)
	if result != expect {
		t.Errorf("기대값: %v, 출력값: %v", expect, result)
	}

	testCase_S = "a B z"
	testCase_N = 4
	expect = "e F d"
	result = solution(testCase_S, testCase_N)
	if result != expect {
		t.Errorf("기대값: %v, 출력값: %v", expect, result)
	}
}

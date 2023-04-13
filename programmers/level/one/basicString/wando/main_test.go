package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := []string{"a234", "1234"}
	expect := []bool{false, true}

	for i := range testCase {
		result := solution(testCase[i])
		if result != expect[i] {
			t.Errorf("기대값: %v, 출력값: %v", result, expect[i])
		}
	}
}

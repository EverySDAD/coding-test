package main

import "testing"

func TestSolution(t *testing.T) {
	// given
	var testCase int64 = 12345
	expect := []int{5, 4, 3, 2, 1}

	// when
	result := solution(testCase)

	// then
	for i := range expect {
		if expect[i] != result[i] {
			t.Errorf("기대값: %v, 출력값: %v", expect[i], result[i])
		}
	}
}

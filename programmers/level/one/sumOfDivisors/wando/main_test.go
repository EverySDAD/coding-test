package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := [5]int{12, 5, 1, 0, 2}
	expect := [5]int{28, 6, 1, 0, 3}

	for i, v := range testCase {
		result := solution(v)
		if result != expect[i] {
			t.Errorf("기대값: %d, 출력값: %d", expect[i], result)
		}
	}
}

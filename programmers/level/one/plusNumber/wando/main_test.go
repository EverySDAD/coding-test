package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := []int{123, 987, 24, 13}
	expect := []int{6, 24, 6, 4}

	for idx, number := range testCase {
		result := solution(number)
		if result != expect[idx] {
			t.Errorf("출력값: %d, 기대값: %d", result, expect[idx])
		}
	}

}

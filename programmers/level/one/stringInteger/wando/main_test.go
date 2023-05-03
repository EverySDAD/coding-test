package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := []string{"1234", "-1234"}
	expect := []int{1234, -1234}

	for i := range testCase {
		result := solution(testCase[i])
		if result != expect[i] {
			t.Errorf("기대값: %d, 출력값: %d", expect[i], result)
		}
	}
}

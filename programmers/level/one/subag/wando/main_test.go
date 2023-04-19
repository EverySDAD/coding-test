package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := []int{3, 4}
	expect := []string{"수박수", "수박수박"}

	for i := range testCase {
		result := solution(testCase[i])
		if result != expect[i] {
			t.Errorf("기대값: %s, 출력값: %s", expect[i], result)
		}
	}
}

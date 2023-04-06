package main

import "testing"

func TestSolution(t *testing.T) {
	testCase := [][]int{{3, 5}, {3, 3}, {5, 3}}
	testResult := []int64{12, 3, 12}

	for i := range testCase {
		result := solution(testCase[i][0], testCase[i][1])
		if result != testResult[i] {
			t.Errorf("기대값: %d, 출력값: %d", testResult[i], result)
		}
	}
}

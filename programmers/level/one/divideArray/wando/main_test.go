package main

import "testing"

func TestSolution(t *testing.T) {
	result := solution([]int{5, 9, 7, 10}, 5)
	mockData := []int{5, 10}
	check_test(result, mockData, t)

	result = solution([]int{2, 36, 1, 3}, 1)
	mockData = []int{1, 2, 3, 36}
	check_test(result, mockData, t)

	result = solution([]int{3, 2, 6}, 10)
	mockData = []int{-1}
	check_test(result, mockData, t)
}

func check_test(result, mock []int, t *testing.T) {
	for idx := range result {
		if mock[idx] != result[idx] {
			t.Errorf("배열 %d 기대값 : %d, 출력값: %v", idx, mock[idx], result[idx])
		}
	}
}

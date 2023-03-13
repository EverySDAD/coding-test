package main

import (
	"testing"
)

func TestSolution(t *testing.T) {
	result := Solution(1, 1)
	if result != "FRI" {
		t.Errorf("기대값 : FRI, 출력값: %v", result)
	}

	result = Solution(5, 24)
	if result != "TUE" {
		t.Errorf("기대값 : TUE, 출력값: %v", result)
	}
}

package main

import "testing"

func TestSolution(t *testing.T) {
	result := solution("abcde")
	if result != "c" {
		t.Errorf("기대값 : c, 출력값: %v", result)
	}

	result = solution("qwer")
	if result != "we" {
		t.Errorf("기대값 : we, 출력값: %v", result)
	}

	result = solution("asdf")
	if result != "sd" {
		t.Errorf("기대값 : sd, 출력값: %v", result)
	}

	result = solution("asd")
	if result != "s" {
		t.Errorf("기대값 : s, 출력값: %v", result)
	}
}

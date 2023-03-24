package main

func solution(s string) string {
	API := new(Api)
	return API.getCenterString(s)
}

const (
	ODD  = "ODD"  // 홀수
	EVEN = "EVEN" // 짝수
)

type Api struct{}

func (a Api) getCenterString(str string) string {
	detectorStr, centerIndex := lengthDetector(str)
	return getCenterString(detectorStr, str, centerIndex)
}

func lengthDetector(str string) (string, int) {
	var detector string
	centerIndex := len(str) / 2
	if len(str)%2 == 0 {
		detector = EVEN
	} else {
		detector = ODD
	}
	return detector, centerIndex
}

func getCenterString(strType string, str string, index int) string {
	if strType == ODD {
		return getODDCenterString(str, index)
	} else if strType == EVEN {
		return getEVENCenterString(str, index)
	} else {
		return ""
	}
}

func getODDCenterString(str string, index int) string {
	return string(str[index])
}

func getEVENCenterString(str string, index int) string {
	return str[index-1 : index+1]
}

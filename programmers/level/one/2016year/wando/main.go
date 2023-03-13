package main

func Solution(a int, b int) string {
	API := new(api)
	dayBeforeMonth := API.getDayBeforeMonth(a)
	totalDays := dayBeforeMonth + b
	return API.getDay(totalDays)
}

const (
	SUN string = "SUN"
	MON string = "MON"
	TUE string = "TUE"
	WED string = "WED"
	THU string = "THU"
	FRI string = "FRI"
	SAT string = "SAT"

	JAN = 31
	FEB = JAN + 29
	MAR = FEB + 31
	APR = MAR + 30
	MAY = APR + 31
	JUN = MAY + 30
	JUL = JUN + 31
	AUG = JUL + 31
	SEP = AUG + 30
	OCT = SEP + 31
	NOV = OCT + 30
)

type api struct{}

func (a api) getDayBeforeMonth(currentMonth int) int {
	switch currentMonth {
	case 2:
		return JAN
	case 3:
		return FEB
	case 4:
		return MAR
	case 5:
		return APR
	case 6:
		return MAY
	case 7:
		return JUN
	case 8:
		return JUL
	case 9:
		return AUG
	case 10:
		return SEP
	case 11:
		return OCT
	case 12:
		return NOV
	default:
		return 0
	}
}

func (a api) getDay(totalDays int) string {
	rest := totalDays % 7
	switch rest {
	case 1:
		return FRI
	case 2:
		return SAT
	case 3:
		return SUN
	case 4:
		return MON
	case 5:
		return TUE
	case 6:
		return WED
	case 0:
		return THU
	default:
		return ""
	}
}

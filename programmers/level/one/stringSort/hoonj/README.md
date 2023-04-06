# 문자열 내 마음대로 정렬하기 박살!

## 좋아요 가장 많이 받은 풀이코드
``` java
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
```

생각의 전환이 눈에 띄는 코드같음

비교해야할 문자열을 맨 앞으로 끌어당기고 걍 정렬해버리니까
비교대상 문자가 같을때 따로 처리할 필요없이 고민없이 해치운게 신박했음.
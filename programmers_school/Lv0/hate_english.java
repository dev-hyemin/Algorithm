class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<english.length; i++)
            if (numbers.contains(english[i])) numbers = numbers.replaceAll(english[i], Integer.toString(i));
        answer = Long.parseLong(numbers);
        return answer;
    }
}


// version 2
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        while(true){
            if (numbers.contains("zero")) numbers = numbers.replaceAll("zero", "0");
            else if (numbers.contains("one")) numbers = numbers.replaceAll("one", "1");
            else if (numbers.contains("two")) numbers = numbers.replaceAll("two", "2");
            else if (numbers.contains("three")) numbers = numbers.replaceAll("three", "3");
            else if (numbers.contains("four")) numbers = numbers.replaceAll("four", "4");
            else if (numbers.contains("five")) numbers = numbers.replaceAll("five", "5");
            else if (numbers.contains("six")) numbers = numbers.replaceAll("six", "6");
            else if (numbers.contains("seven")) numbers = numbers.replaceAll("seven", "7");
            else if (numbers.contains("eight")) numbers = numbers.replaceAll("eight", "8");
            else if (numbers.contains("nine")) numbers = numbers.replaceAll("nine", "9");
            else break;
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}


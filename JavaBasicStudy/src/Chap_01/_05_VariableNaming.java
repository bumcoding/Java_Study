package Chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, main 등 라이브러리에 이미 있는 언어)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "범찬"; // 이름
        String lastName = "박"; // 성
        String dateOfBirth = "2000-02-08"; // 생년월일
        String residentialAddress = "신라호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국 목적
        String flightNumber = "BC208"; // 항공 편명

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
        // CODE = "US"; > 이미 앞에서 final로 바뀌지 않게 설정했음 (오류)
    }
}

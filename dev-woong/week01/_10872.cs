// 팩토리얼 개수 입력
var count = Convert.ToInt32(Console.ReadLine());

// Enumerable.Range()를 통해 1부터 {count}개의 차례대로 증가되는 컬렉션을 생성
// 해당 컬렉션의 값을 Linq의 Aggregate 함수를 통해 집계
// 컬렉션에 데이터가 없는 경우 1을 sum에 저장, 데이터가 있는 경우 i에 차례대로 할당되어 연산 수행
// 연산의 결과값이 current에 누적되어 최종 결과값이 sum에 저장됨
var sum = Enumerable.Range(1, count).Aggregate(1, (current, i) => current * i);

Console.WriteLine(sum);

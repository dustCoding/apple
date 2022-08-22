// 명령어의 개수 입력
var command_count = int.Parse(Console.ReadLine()!);

// Stack으로 사용될 변수 생성
var stack = new List<int>();

// 명령어 개수 만큼 반복
while (command_count-- > 0)
{
	// 명령어 입력 후 공백(" ")을 기준으로 분리
	var command = Console.ReadLine()!.Split(" ");

	// 공백 기준 앞에 있는 명령어를 통한 switch 조건 분기
	switch (command[0])
	{
		case "push":
			// stack 변수에 데이터 축적
			stack.Add(int.Parse(command[1]));
			continue;
		case "pop":
			// Stack의 특성에 따라 후입선출하여 마지막 데이터부터 pop!
			// Any() 함수는 조건에 맞는 값이 해당 컬렉션에 존재하는지 확인하는 함수이다.
			// 매개변수가 없는 경우는 컬렉션에 값이 존재하는지 여부를 반환한다.
			Console.WriteLine(stack.Any() ? stack.Last().ToString() : "-1");
			if (stack.Any()) stack.RemoveAt(stack.Count - 1);
			continue;
		case "size":
			Console.WriteLine(stack.Count.ToString());
			continue;
		case "empty":
			Console.WriteLine(stack.Any() ? "0" : "1");
			continue;
		case "top":
			// Linq의 Last()를 이용하여 마지막 값을 반환받는다.
			Console.WriteLine(stack.Any() ? stack.Last().ToString() : "-1");
			continue;
	}
}

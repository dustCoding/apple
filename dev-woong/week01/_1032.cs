// 개수 입력
var input_count = Console.ReadLine();

// input_count 개수만큼 추가로 입력(CharArray 형태로 Return)
var input_list = Enumerable.Range(0, Convert.ToInt32(input_count)).Select(_ => Console.ReadLine()?.ToCharArray()).ToList();

// 0번 인덱스의 값을 기준값으로 지정
var result = input_list[0];

// 입력받은 값의 리스트를 순환하여 반복
foreach (var check_string in input_list)
	// 입력받은 문자열 각각을 비교하기 위해 Length 값 만큼 반복
	for (var j = 0; j < result!.Length; j++)
	{
		// 문자열의 각 문자가 같으면 반복을 이어나간다.
		if (result[j] == check_string![j]) continue;

		// 문자열의 각 문자가 틀리면 해당 문자를 '?'로 치환한다.
		result[j] = '?';
	}

Console.WriteLine(result);

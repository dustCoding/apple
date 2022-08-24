namespace Week02;

public class _14469 {
	public static void Run()
	{
		var count = Convert.ToInt32(Console.ReadLine());
		var cow_times = new List<List<int>>();
		var min_elapsed_time = 0;

		foreach (var _ in Enumerable.Range(0, count)) 
			cow_times.Add(Console.ReadLine().Split(" ").Select(x => Convert.ToInt32(x)).ToList());

		
		while (cow_times.Count != 0)
		{
			var min_index = 0;
			for (var i = 1; i < cow_times.Count; i++)
				if (cow_times[min_index][0] > cow_times[i][0])
					min_index = i;

			if(min_elapsed_time > cow_times[min_index][0])
				min_elapsed_time += cow_times[min_index][1];
			else	
				min_elapsed_time = cow_times[min_index][0] + cow_times[min_index][1];

			cow_times.RemoveAt(min_index);
		}
		Console.WriteLine(min_elapsed_time);
	}
}


/*
My explanation:

reviewsRepository sorted when there were more than three acceptable keywords, 
returns the keywords that are first in alphabetical order.
[silence, silver, similar, simple, sister]
When typed most two characters like s and si as mentioned in the question, 
it suggests us 3 keywords and the user sees [silver, silence, similar]
After typing sil, sile and silen the system shows [silence]

*/

public static List<List<String>> searchSuggestions(List<String> repository, String userInput) 
{
    List<List<String>> result = new ArrayList<>();

//currently result == []

    for(int i=1; i < userInput.length(); i++)
    {
        String s = userInput.substring(0, i+1).toLowerCase();
        List <String> keywordsList = new ArrayList<>();

        int a=0;
        for(int j=0; j<repository.size(); j++)
	        {
              if(repository.get(j).toLowerCase().startsWith(s))
		          { 
			           keywordsList.add(repository.get(j).toLowerCase());
			            a++;
		          }
	        }

        Collections.sort(keywordsList);
        List<String> v=new ArrayList < String>(); 
        for(int p=0; p<=2&&p<keywordsList.size(); p++)
        {
            v.add(keywordsList.get(p));
        }
        result.add(v);
    }
    return result;
}

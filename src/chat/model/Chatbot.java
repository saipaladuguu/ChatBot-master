package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		this.userName = userName;
		this.content = new String("content");
	}
	
	private void buildMemesList()
	{
		memesList.add("doge");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("pepe");
		memesList.add("pupper");
		memesList.add("doot doot");
		memesList.add("bad luck brian");
		memesList.add("one does not simply");
		memesList.add("futurama fry");
		memesList.add("y u no");
		memesList.add("science man");
		memesList.add("not bad obama");
		memesList.add("pepe boi");
	}
	
	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("Stein");
		politicalTopicList.add("ohnson");
		politicalTopicList.add("election");
		politicalTopicList.add("Vote");
		politicalTopicList.add("Obama");
		politicalTopicList.add("Immigration");
		politicalTopicList.add("White House");
		politicalTopicList.add("Dedt");
		politicalTopicList.add("Women rights");
		politicalTopicList.add("muslim discrimination");
	}
	

	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		if(currentInput !=null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		return hasLength;
	}
	

	public boolean contentChecker(String currentInput)
	{
		boolean containsinput = false;
		if (currentInput.contains("feet"))
		{
			return containsinput = true;
		}
		return containsinput;
	}
	
	
	public boolean politicalTopicChecker(String currentInput)
	{
		return false;
	}
	
	
	public boolean memeChecker(String currentInput)
	{
		boolean hasinput = false;
		if (currentInput != null && memesList.contains(currentInput)){hasinput = true;}
		{
			return hasinput = true;
		}
	}
	
	
	public String getUserName()
	{
		return userName;
	}
	
	
	public String getContent()
	{
		return content;
	}
	
	public ArrayList<String> getMemesList()
	{
		
		return memesList;
	}
	
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
}
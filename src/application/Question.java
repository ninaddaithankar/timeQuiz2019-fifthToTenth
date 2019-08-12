package application;

public class Question {

	public static int visualButtonClicked;
	public static int numberOnDice;
	public static int standard;
	public static String selectedOption;
	public static String correctOption;
	public static int counter=0;
	public static int mixedBagCounter[]=new int[] {-1,-1,-1,-1,-1,-1};
	public static int audioButtonClicked;
	
	public static String[][] que_fifth=new String[][] {
		{"The award given for excellence in Sports Coaching is ?","Dronacharya Award","text"},
		{"Which state in India is called the 'Land of Five Rivers' ?","Punjab","text"},
		{"Who is the Supreme Commander of the Indian Armed Forces ?","The President","text"},
		{"The doctor who treats diseases of the heart is called ?","Cardiologist","text"},
		};
		
		public static String[][] opt_fifth=new String[][] {
			{"Arjuna Award","Bravery Award","Rajiv Gandhi Khel Ratna","Dronacharya Award"},
			{"Uttar Pradesh","Haryana","Punjab","Maharashtra"},
			{"The President","The Vice President","The Prime Minister","Defence Minister"},
			{"Orthopedic","Cardiologist","Ophthalmologist","Gynaecologist"},
			};
	
	public static String[][] que_sixth=new String[][] {
		{"Which was the first university\n established in the world ?","Nalanda University","text"},
		{"The highest civilian Indian Award is ?","Bharat Ratna","text"},
		{"'Bohag Bihu' festival is celebrated in ?","Assam","text"},
		{"Along with Tamil Nadu, Tamil is the official language of which country ?","Sri Lanka","text"},
		};
		
		public static String[][] opt_sixth=new String[][] {
			{"Oxford University","Nalanda University","Harvard University","Takshashila University"},
			{"Padma Bhushan","Padma Vibhushan","Bharat Ratna","Padma Shri"},
			{"Assam","Mizoram","Tripura","Nagaland"},
			{"Sri Lanka","Bhutan","Myanmar","Nepal"},
			};

	
	public static String[][] que_seventh=new String[][] {
		{"A sobriquet 'The Land Of Canals' is used for ?","Netherlands","text"},
		{"The Headquarters of World Health Organization are at ? ","Geneva","text"},
		{"The disease caused by lack of Vitamin B3 ?","Pellagra","text"},
		{"World famous 'Dilwara Temple' is located in India at ?","Mount Abu","text"},
		};
	
		public static String[][] opt_seventh=new String[][] {
			{"Bhutan","Canada","Belgium","Netherlands"},
			{"Geneva","New York","Paris","Beijing"},
			{"Scurvy","Pellagra","Beri Beri","Goitre"},
			{"Mount Abu","Jaipur","Udaipur","Mysore"},
			};
		
	public static String[][] que_eighth=new String[][] {
		{"Who is called the 'Father of Civil Aviation' in India ?","J.R.D. Tata","text"},
		{"Who among the following is the renowned Kathak Dancer ?","Pandit Birju Maharaj","text"},
		{"'Olympus Mons' the largest volcano in the solar system is located at ?","Mars","text"},
		{"Stephen Hawking is an author of which of the following book ?","Brief History of Time","text"},
		};
	
		public static String[][] opt_eighth=new String[][] {
			{"Sunil Mittal","Vijay Mallya","Naresh Goyal","J.R.D. Tata"},
			{"Pandit Shivkumar Sharma","Ustad Amjad Ali Khan","Pandit Birju Maharaj","Pandit Hariprasad Chaurasiya"},
			{"Mars","Jupiter","Saturn","Earth"},
			{"Two Lives","The Thorn Birds","Brief History of Time","Sea of Poppies"},
			};
		
	public static String[][] que_ninth=new String[][] {
		{"In how many languages the amount of a bank note is written on it ?","17","text"},
		{"Who is the current Governer of RBI ?","Shaktikanta Das","text"},
		{"Which of the following is also known as 'the Lake City in India' ?","Udaipur","text"},
		{"A flag flown at half-mast is the symbol of ? ","Mourning","text"},
		};
	
		public static String[][] opt_ninth=new String[][] {
			{"17","22","19","21"},
			{"Urjit Patel","Piyush Goyal","Raghuram Rajan","Shaktikanta Das"},
			{"Kolkata","Udaipur","Bengaluru","Patna"},
			{"Mourning","Distress","Protest and Sorrow","Mutiny"},
			};
		
	public static String[][] que_tenth=new String[][] {
		{"First English Newspaper in India ?","The Bengal Gazette","text"},
		{"Who is the current Defence Advisor of India ?","Ajit Doval","text"},
		{"Which of the following temple is carved out of a single rock in Maharashtra ?","Kailasa Temple","text"},
		{"Who was the Flt. Lt. of MiG 27, who remained in custody of Pakistani Forces for 8 days ?","Nachiket","text"},
		};
	
		public static String[][] opt_tenth=new String[][] {
			{"The Bombay Herald","The Bengal Gazette","The Calcutta Gazette","The Times of India"},
			{"Ajit Doval","Sushma Swaraj","Nirmala Sitharaman","Arun Jaitley"},
			{"Tirupati Temple","Jagannatha Temple","Somnath Temple","Kailasa Temple"},
			{"Abhinandan","Nachiket","Sarabjit","Dharam Pal Singh"},
			};
			
			
			public static String[][] diceNumberOne=new String[][] {
				
				{"MATHS","On a trip, there are 11 children and 1 adult per boat. If a total of 96 people went on this boat trip, how many children were there for the trip.","88 Children","96 – (96 ÷ (11+1))"},
				{"G.K. AND CURRENT AFFAIRS","I am a river in South Africa and I am considered to be the richest river as I carry diamonds with me as I flow. Who am I?","The Orange River","It is also the name of a fruit."},	
				{"SCIENCE AND TECHNOLOGY","It is the most abundant chemical substance in the universe. Name the element having its meaning ‘Water former’ in Greek.","Hydrogen","It is the first element of the periodic table."},
				{"GEOGRAPHY","Which is the first National park in India to save the endangered species of Bengal Tiger?","Jim Corbett National Park","It was renamed to honour a well known wild life conservationist."},
				{"HISTORY","The first satyagraha movement inspired by Mahatma Gandhiji for the uprising of farmers during Indian Independence  movement was _________.","Champaran Satyagraha.","It was named after one of the city in district Bihar."},
				{"SCHOOL RELATED","In our school emblem ‘Nurtures an individual with utmost care’ is symbolized by____.","Hands","It is an important part of a clock"},
				{"SPORTS","The Bharat Kesari is a ________ tournament in India. Winners receive the Bharat Kesari trophy.","Wrestling","A combat sport which is a physical competition between two competitors."},
			};
			
			public static String[][] diceNumberTwo=new String[][] {
				
				{"SCIENCE AND TECHNOLOGY","The disease in which the body produces abnormally crescent shaped red blood cells is _______.","Sickle Cell Anemia.","It is a type of chronic anemia."},
				{"HISTORY","This Nobel – winning book became popular in the west and was widely translated. The name of the book meant “An offering of songs” in English. Identify this work from Asia, whose original collection of poems was published in 1910.","Gitanjali.","The author of this book is Gurudev Rabindranath Tagore."},
				{"SCHOOL RELATED","Rearrange the following words to make a meaningful school hymn.\r\n" + 
						"Promise/ blessings/ of love / this is/ the/ shall be/ there/ showers/ of/\r\n" + 
						"","There shall be showers of blessings....."," __________________blessings ________________ of love."},
				{"MATHS","Sam adopted 3 cats. He feeds them a total of 3 cans of cat food a day and 2 boxes of cat food a week. How much cat food he needs to buy each week ?","21 cans and 2 boxes.","7 × 3,  2"},
				{"G.K AND CURRENT AFFAIRS","What name is given to the Japanese art of paper folding ?","Origami.","It is one of the extra – curricular activities of our school."},
				{"ENGLISH","Annual, Odd, Evil, Super, Black, Real are the examples of which parts of speech?","Adjective.","It is majorly categorized into quality and quantity."},
				{"GEOGRAPHY","Tsunamis are originated due to __________.","Earthquake.","It creates tremors."},
			};
			
			public static String[][] diceNumberThree=new String[][] {
				
				{"GEOGRAPHY","Name the the two Continents that are similar in shape ?","Africa and South America.","Both of them are almost triangular in shape."},
				{"G.K. AND CURRENT AFFAIRS","Moss grows on the body of this slowest animal. Identify this animal?","Sloth.","They belong to the bear family and are sluggish and lazy."},
				{"HISTORY","Name the war in which the allied powers (Britain and its allies)defeated central powers (Germany and its allies), with the use of airplanes and tanks for the first time.","First World War."," The duration of this war was 1914 – 1918."},
				{"ENGLISH","Rearrange the words to make a meaningful proverb:\r\n" + 
						"Bricks/ you/ without / make / straws/ can’t\r\n" + 
						""," You can’t make bricks without straws.","You can’t ----------------."},
				{"MATHS","What is the obtuse angle between the hour hand and minute hand when the clock shows time 5 p.m.?","150 degrees","At 1 p.m., the angle is 30 degrees"},
				{"SPORTS","On 31st January, which games were inaugurated by our honourable PM Modi based on Guru – Shishya tradition.","Khelo India Youth Games.","These games were formerly known Khelo India School Games."},
				{"SCIENCE AND TECH","Oak is a programming language created by James Gosling in 1991. Later it was renamed as _______ and became one of the most popular programming languages. Identify this programming language.","Java.","It is also a type of coffee."},
			};
			
			public static String[][] diceNumberFour=new String[][] {
				{"HISTORY","Name the first deaf – blind woman who earned B.A. degree and was an American author, lecturer and political activist.","Helen Keller","Movie ‘ Black’ was inspired by this great personality."},
				{"G.K. AND CURRENT AFFAIRS","This city is known as ‘Detroit of Asia’ in recognition of large no. of automotive companies situated here. There is a strong possibility for it to become the automobile capital of Asia in the future. Which city are we talking about ?","Chennai","It is capital of Tamil Nadu."},
				{"ENGLISH","Variety is the spice of life. Identify the figure of speech.","Metaphor.","It is a comparison between two unlike objects."},
				{"SCIENCE AND TECH","Human blood is red because of haemoglobin which contains iron to transport oxygen. Animals like octopus bleed blue because of the presence of which element ?","Copper","It is a famous metal used to make wires"},
				{"MATHS","A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train ?","150 m.","Distance = Speed × Time and Convert Km/hr into m/s."},
				{"SPORTS"," Which is the bull taming sport played on third day of pongal and observed a massive agitation in January 2017 ?","Jallikattu.","It is played in Tamil Nadu."},
				{"GEOGRAPHY","I am a heavenly body which takes nearly the same time to complete one rotation and one revolution ? Can you identify me ?","Moon","I am not a planet but a natural satellite."},
				{"SCHOOL RELATED","'If you have interest in reading, you will leave loneliness' is quoted by ?","St. Chavara","Founder of CMC Congregation."},
			};
			
			public static String[][] diceNumberFive=new String[][] {
			
				{"SCIENCE AND TECH","This element is also referred as ‘Devil’s element’ because of its glow, when exposed to oxygen. It is also used in smoke bombs.","Phosphorus","It is highly reactive and exists in two forms – red and white."},
				{"G.K. AND CURRENT AFFAIRS","Name the first South Asian country in the world that has banned the use of tobacco and all the tobacco products and got its name from the Sanskrit word meaning ‘End of Tibet’.","Bhutan.","A Buddhist kingdom on the Himalayas."},
				{"SPORTS","Mention the Indian athlete who is often called as ‘Queen of Indian Track and Field.’","P.T. Usha.","Her nick name is Golden Girl."},
				{"HISTORY","The quote ‘The life which is unexamined is not worth living’ was coined by ?","Socrates.","Classical Greek philosopher,founder of Western Philosophy."},
				{"GEOGRAPHY"," Which of the following planets is known as Earth's twin? ","Venus","It is also called Evening star."},
				{"SCHOOL RELATED","Which school house claims that it has strong emotional correspondence with safety ?","Mahatma Gandhi House (Green House)","The motto of this house is ‘Loyalty with Dedication’."},
			};
			
			public static String[][] diceNumberSix=new String[][] {
				
				{"HISTORY","Name the first woman to win the Nobel prize twice for her excellent work in two different sciences. She died due to the exposure to radiations in course of her scientific research.","Marie Curie","She discovered two elements – Polonium and Radium."},
				{"SCHOOL RELATED","‘Try to be a drop in the ocean’ is the goal of _______ forum of our school.","Social Forum","They had taken an initiative for donating fruits to the Civil Hospital."},
				{"G.K AND CURRENT AFFAIRS","Who was named as ‘India’s first Lokpal’?","Pinaki Chandra Ghose.","He is also the former supreme court judge."},
				{"MATHS"," Name the mathematician who first computed the decimal expansion of Pi?","Archimedes","Physicist who gave a principle related to buoyant force."},
				{"ENGLISH","Give an anagram of word ‘DUSTY’","STUDY.","An action related to learning or gaining knowledge."},
			};
			
	public static String[][] queGrpTopaz=new String[][] {
		{"Most poisonous fish that grows upto 20 feet ?","Stone Fish"},
		{"The Vitamin necessary for blood clotting in the human body ?","Vitamin K"},
		{"Founder of Mughal empire in India ?","Babur"},
		{"Name of India’s first future manned space flight ?","Gaganyaan"},
		{"People suffering from Myopia are recommended to use which lenses ?","Concave\n"},
		{"Special Olympics world games 2019 were held at ?","Abu Dhabi, UAE"},
		{"Smallest 3 digit number with 3 different digits ?","102"},
		{"Full form of ECG ?","Electro Cardio Gram"},
		{"Deepest and biggest ocean ?","Pacific Ocean"},
		{"‘The Complete Man’ is the tagline of ?","Raymond"},
		{"Who invented Computer ?","Charles Babbage"},
		{"‘Indraprastha’ was the former name of which city ?","Delhi"},
	};
	
	public static String[][] queGrpIndicolite=new String[][] {
		{"The male fish that gives birth to babies is ?","Sea Horse"},
		{"The second largest living bird by height is ?","Emu"},
		{"First Muslim woman ruler who adorned the throne of Delhi ?","Razia Sultan"},
		{"A rocky material in space known as ‘Shooting star’ ?","Meteor"},
		{"Fastest healing tissue in human body without blood vessel ?","Cornea"},
		{"‘Gymnast’s pole' refers to which ancient Indian sport ?","Mallakhamb"},
		{"Point of concurrence of altitudes of a triangle ?","Orthocentre"},
		{"Full form of BSE ?","Bombay Stock Exchange"},
		{"Largest Planetarium in India ?","Birla Planetarium"},
		{"'Think Different' is the tagline of ?","Apple"},
		{"Father of theory of Evolution ?","Charles Darwin"},
		{"New name of city ‘Gurgaon’ ?","Gurugram"},
	};
	
	public static String[][] queGrpMelopearl=new String[][] {
		{"Name any one egg laying mammal ?","Echidna/Platypus"},
		{"Bark of Cinchona tree is used as a remedy for ?","Malaria"},
		{"First paper money was originated in ?","China"},
		{"Nearest major galaxy to the Milky Way ?","Andromeda"},
		{"Toxic gas released during Bhopal Gas Tragedy ?","Methyl Isocyanate"},
		{"National game of Bhutan ?","Archery"},
		{"Full form of DTH ?","Direct to Home"},
		{"Longest mountain range in the world ?","Andes"},
		{"‘At the heart of the image’ is the tagline of ?","Nikon"},
		{"Who invented Radium ?","Marie and Pierre Curie"},
		{"New name of city Allahabad ?","Prayagraj"},
		{"The point at which three medians of a triangle meet ?","Centroid"},
	};
	
	public static String[][] queGrpEmerald=new String[][] {
		{"The fish that comes back to its birthplace to lay eggs ?","Salmon"},
		{"This animal reminds you of Santa Claus ?","Reindeer"},
		{"South African President and anti – racism revolutionary ?","Nelson Mandela"},
		{"Planets that have no moon ?","Mercury and Venus"},
		{"Discipline of science that studies Kidneys ?","Nephrology"},
		{"Kabbadi is the national game of which country ?","Bangladesh"},
		{"Full form of BCCI ?\n","Board of Control for Cricket in India"},
		{"Largest Gulf ?","Gulf of Mexico"},
		{"‘Impossible is nothing’ is the tagline of ?","Adidas"},
		{"Who invented Pasteurization process ?","Louis Pasteur"},
		{"Ancient name of Patna was ?","Pataliputra"},
		{"Standard form of quadratic equation is ?","ax2 + bx + c = 0"},
	};

	

	public static String[][] visualQuestions=new String[][] {
		{"Identify the Researcher","src/videos/pranav.mp4","Pranav Mistry","He is the Global Vice President of Samsung.","video"},
		{"Identify the Dance Form","src/videos/dance.mp4","Kuchipudi","It is a Classical Dance Form of Andhra Pradesh.","video"},
		{"Identify the Name of Spacecraft","src/videos/rover.mp4","Opportunity Rover","It was a Mars Mission Spacecraft.","video"},
		{"Identify the Oceanic Animal","src/videos/fish.mp4","Hammerhead Shark","Named after distinctive structure of their head","video"},
	};
	
	public static String[][] audioQuestions=new String[][] {
		{"Identify the Instrument","src/sounds/instrument.mp3","Sitar","It is a plucked stringed instrument used in classical music."},
		{"Identify the Speaker","src/sounds/tata.mp3","Ratan Tata","He is the chairman of the Tata Group."},
		{"Identify the Sportsperson","src/sounds/serena.mp3","Serena Williams","She is an American professional tennis player."},
		{"Identify the Singer","src/sounds/singer.mp3","Sukhwinder Singh","He is a famous Indian Bollywood playback singer."},
	};
	
	
	
	
	public static boolean checkAnswer()
	{
		if(standard==5)
		{
			if(que_fifth[Question.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				Question.correctOption=que_fifth[Question.counter][1];
				return false;
			}
				
		}
		else if(standard==6)
		{
			if(que_sixth[Question.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				Question.correctOption=que_sixth[Question.counter][1];
				return false;
			}
				
		}
		else if(standard==7)
		{
			if(que_seventh[Question.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				Question.correctOption=que_seventh[Question.counter][1];
				return false;
			}
				
		}
		else if(standard==8)
		{
			if(que_eighth[Question.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				Question.correctOption=que_eighth[Question.counter][1];
				return false;
			}
		}
		else if(standard==9)
		{
			if(que_ninth[Question.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				Question.correctOption=que_ninth[Question.counter][1];
				return false;
			}
		}
		else if(standard==10)
		{
			if(que_tenth[Question.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				Question.correctOption=que_tenth[Question.counter][1];
				return false;
			}
		}
		return false;
	}
	
}

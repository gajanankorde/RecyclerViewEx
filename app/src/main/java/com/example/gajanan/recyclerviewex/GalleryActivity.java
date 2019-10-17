package com.example.gajanan.recyclerviewex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryActivity extends AppCompatActivity {


    ImageView imageView;
    TextView txtName,txtTenure,txtInfo;

    /*
    String data="Narendra Damodardas Modi (born 17 September 1950) is an Indian politician serving as the 14th and current Prime Minister of India since 2014. He was the Chief Minister of Gujarat from 2001 to 2014 and is the Member of Parliament for Varanasi. Modi is a member of the Bharatiya Janata Party (BJP) and of the Rashtriya Swayamsevak Sangh (RSS), a Hindu nationalist volunteer organisation. He is the first prime minister outside of the Indian National Congress to win two consecutive terms with a full majority and the second to complete five years in office after Atal Bihari Vajpayee " +
            "\nBorn to a Gujarati family in Vadnagar, Modi helped his father sell tea as a child and has said he later ran his own stall. He was introduced to the RSS at the age of eight, beginning a long association with the organisation. Modi left home after finishing high-school in part due to an arranged marriage to Jashodaben Chimanlal, which he abandoned and publicly acknowledged only many decades later. Modi travelled around India for two years and visited a number of religious centres before returning to Gujarat. In 1971 he became a full-time worker for the RSS. During the state of emergency imposed across the country in 1975, Modi was forced to go into hiding. The RSS assigned him to the BJP in 1985 and he held several positions within the party hierarchy until 2001, rising to the rank of general secretary.";
    */

    String[] personInfo={
            "Pandit Jawaharlal Nehru ( 14 November 1889 – 27 May 1964) was an Indian independence activist, and subsequently, the first Prime Minister of India and a central figure in Indian politics before and after independence. He emerged as an eminent leader of the Indian independence movement under the tutelage of Mahatma Gandhi and served India as Prime Minister from its establishment as an independent nation in 1947 until his death in 1964. He has been described by the Amar Chitra Katha as the architect of India. He was also known as Pandit Nehru due to his roots with the Kashmiri Pandit community while Indian children knew him as Chacha Nehru (Hindi, lit., \"Uncle Nehru\")." +
                    "\nThe son of Motilal Nehru, a prominent lawyer and nationalist statesman and Swaroop Rani, Nehru was a graduate of Trinity College, Cambridge and the Inner Temple, where he trained to be a barrister. Upon his return to India, he enrolled at the Allahabad High Court and took an interest in national politics, which eventually replaced his legal practice. A committed nationalist since his teenage years, he became a rising figure in Indian politics during the upheavals of the 1910s. He became the prominent leader of the left-wing factions of the Indian National Congress during the 1920s, and eventually of the entire Congress, with the tacit approval of his mentor, Gandhi. As Congress President in 1929, Nehru called for complete independence from the British Raj and instigated the Congress's decisive shift towards the left." +
                    "\nNehru and the Congress dominated Indian politics during the 1930s as the country moved towards independence. His idea of a secular nation-state was seemingly validated when the Congress swept the 1937 provincial elections and formed the government in several provinces; on the other hand, the separatist Muslim League fared much poorer. But these achievements were severely compromised in the aftermath of the Quit India Movement in 1942, which saw the British effectively crush the Congress as a political organisation. Nehru, who had reluctantly heeded Gandhi's call for immediate independence, for he had desired to support the Allied war effort during World War II, came out of a lengthy prison term to a much altered political landscape. The Muslim League under his old Congress colleague and now opponent, Muhammad Ali Jinnah, had come to dominate Muslim politics in India. Negotiations between Congress and Muslim League for power sharing failed and gave way to the independence and bloody partition of India in 1947." +
                    "\nNehru was elected by the Congress to assume office as independent India's first Prime Minister, although the question of leadership had been settled as far back as 1941, when Gandhi acknowledged Nehru as his political heir and successor. As Prime Minister, he set out to realise his vision of India. The Constitution of India was enacted in 1950, after which he embarked on an ambitious program of economic, social and political reforms. Chiefly, he oversaw India's transition from a colony to a republic, while nurturing a plural, multi-party system. In foreign policy, he took a leading role in the Non-Aligned Movement while projecting India as a regional hegemon in South Asia." +
                    "\nUnder Nehru's leadership, the Congress emerged as a catch-all party, dominating national and state-level politics and winning consecutive elections in 1951, 1957, and 1962. He remained popular with the people of India in spite of political troubles in his final years and failure of leadership during the 1962 Sino-Indian War. In India, his birthday is celebrated as Bal Diwas (Children's Day).",
            "Lal Bahadur Shastri ( 2 October 1904 – 11 January 1966) was the 2nd Prime Minister of India and a senior leader of the Indian National Congress political party." +
                    "\nHe joined the Indian independence movement in the 1920s. Deeply impressed and influenced by Mahatma Gandhi (with whom he shared his birthday). Following independence in 1947, he joined the latter's government and became one of Prime Minister Nehru's principals, first as Railways Minister (1951–56), and then in a variety of other functions, including Home Minister." +
                    "\nHe led the country during the Indo-Pakistan War of 1965. His slogan of \"Jai Jawan Jai Kisan\" (\"Hail the soldier, Hail the farmer\") became very popular during the war. The war formally ended with the Tashkent Agreement on 10 January 1966; he died the following day, still in Tashkent, with the cause of his death in dispute and it was reported to be a cardiac arrest but his family was not satisfied with it. Shastri was Congress loyalist. Although Shastri faced stiff opposition from within his party, his relationship with the party and his work aided his ascension to the office of Prime Minister.",
            "Indira Priyadarshini Gandhi ( 19 November 1917 – 31 October 1984) was an Indian politician, stateswoman and a central figure of the Indian National Congress.She was the first and, to date, the only female Prime Minister of India. Indira Gandhi was the daughter of Jawaharlal Nehru, the first prime minister of India. She served as Prime Minister from January 1966 to March 1977 and again from January 1980 until her assassination in October 1984, making her the second longest-serving Indian Prime Minister, after her father." +
                    "\nGandhi served as her father's personal assistant and hostess during his tenure as Prime Minister between 1947 and 1964. She was elected President of the Indian National Congress in 1959. Upon her father's death in 1964 she was appointed as a member of the Rajya Sabha (upper house) and became a member of Lal Bahadur Shastri's cabinet as Minister of Information and Broadcasting. In the Congress Party's parliamentary leadership election held in early 1966 (upon the death of Shastri), she defeated her rival Morarji Desai to become leader, and thus succeeded Shastri as Prime Minister of India." +
                    "\nAs Prime Minister, Gandhi was known for her political intransigency and unprecedented centralisation of power. She went to war with Pakistan in support of the independence movement and war of independence in East Pakistan, which resulted in an Indian victory and the creation of Bangladesh, as well as increasing India's influence to the point where it became the regional hegemon of South Asia. Citing separatist tendencies and in response to a call for revolution, Gandhi instituted a state of emergency from 1975 to 1977 where basic civil liberties were suspended and the press was censored. Widespread atrocities were carried out during the emergency. In 1980, she returned to power after free and fair elections. After Gandhi ordered military action in the Golden Temple in Operation Blue Star, she was assassinated by her own bodyguards and Sikh nationalists on 31 October 1984.",
            "Morarji Ranchhodji Desai(29 February 1896 – 10 April 1995) was an Indian independence activist and served between 1977 and 1979 as the 4th Prime Minister of India and led the government formed by the Janata Party. During his long career in politics, he held many important posts in government such as Chief Minister of Bombay State, Home Minister, Finance Minister and 2nd Deputy Prime Minister of India." +
                    "\nFollowing the passing of Prime Minister Lal Bahadur Shastri, Desai was a strong contender for the position of Prime Minister, only to be defeated by Indira Gandhi in 1966. He was appointed as Deputy Prime Minister and Minister of Finance in Indira Gandhi’s cabinet, until 1969. He resigned from the Congress during the split of 1969, and joined the INC (O). After the controversial emergency was lifted in 1977, the political parties of the opposition fought together against the Congress, under the umbrella of the Janata Party, and won the 1977 election. Desai was elected Prime Minister, and became the first non-Congress Prime Minister of India." +
                    "\nOn the international scene, Desai holds international fame for his peace activism and created efforts to initiate peace between two rival South Asian states, Pakistan and India[citation needed]. After India's first nuclear test in 1974, Desai helped restore friendly relations with China and Pakistan, and vowed to avoid armed conflict such as Indo-Pakistani war of 1971. He was honoured with the highest civilian award of Pakistan, the Nishan-e-Pakistan on 19 May 1990." +
                    "\nHe is the oldest person to hold the office of prime minister, at the age of 84, in the history of Indian politics.He subsequently retired from all political posts, but continued to campaign for the Janata Party in 1980. He was conferred with India's highest civilian honour, the Bharat Ratna. He died in 1995, at the age of 99.",
            "Chaudhary Charan Singh (23 December 1902 – 29 May 1987) served as the 5th Prime Minister of India between 28 July 1979 and 14 January 1980. Historians and people alike frequently refer to him as the 'champion of India's peasants.'" +
                    "\nCharan Singh was born on 23 December 1902 in a rural peasant Jat family of village Noorpur, District Hapur (Erstwhile District Meerut), Uttar Pradesh (Erstwhile United Provinces of Agra and Oudh).[2] Charan Singh entered politics as part of the Independence Movement motivated by Mohandas Gandhi. He was active from 1931 in the Ghaziabad District Arya Samaj as well as the Meerut District Indian National Congress for which he was jailed twice by the British. Before independence, as a member of Legislative Assembly of the United Provinces elected in 1937, he took a deep interest in the laws that were detrimental to the village economy and he slowly built his ideological and practical stand against the exploitation of tillers of the land by landlords." +
                    "\nBetween 1952 and 1967, he was one of \"three principal leaders in Congress state politics.\" He became particularly notable in Uttar Pradesh from the 1950s for drafting and ensuring the passage of what were then the most revolutionary land reform laws in any state in India under the tutelage of the then Chief Minister Pandit Govind Ballabh Pant; first as Parliamentary Secretary and then as Revenue Minister responsible for Land Reforms. He became visible on the national stage from 1959 when he publicly opposed the unquestioned leader and Prime Minister Jawaharlal Nehru's socialistic and collectivist land policies in the Nagpur Congress Session. Though his position in the faction-ridden UP Congress was weakened, this was a point when the middle peasant communities across castes in North India began looking up to him as their spokesperson and later as their unquestioned leader. Singh stood for tight government spending, enforced consequences for corrupt officers, and advocated a \"firm hand in dealing with the demands of government employees for increased wages and dearness allowances.\" It is also worth noting that within the factional UP Congress, his ability to articulate his clear policies and values made him stand out from his colleagues. Following this period, Charan Singh defected from the Congress on 1 April 1967, joined the opposition party, and became the first non-Congress chief minister of UP.[3] This was a period when non-Congress governments were a strong force in India from 1967–1971." +
                    "\nAs leader of the Bharatiya Lok Dal, a major constituent of the Janata coalition, he was disappointed in his ambition to become Prime Minister in 1977 by Jayaprakash Narayan's choice of Morarji Desai, not to seek power for himself but to enable him to implement his revolutionary economic programs in the interest of the rural economy." +
                    "\nDuring 1977 Lok Sabha Elections, the fragmented opposition united a few months before the elections under the Janata Party banner, for which Chaudhary Charan Singh had been struggling almost single-handedly since 1974. It was because of the efforts of Raj Narain that he became Prime Minister in the year 1979 though Raj Narain was Chairman of Janata Party-Secular and assured Charan Singh of elevating him as Prime Minister, the way he helped him to become Chief Minister in the year 1967 in Uttar Pradesh. However, he resigned after just 24 weeks in office when Indira Gandhi's Congress Party withdrew support to the government. Charan Singh said he resigned because he was not ready to be blackmailed into withdrawing Indira Gandhi's emergency-related court cases.[4] Fresh elections were held six months later. Charan Singh continued to lead the Lok Dal in opposition till his death in 1987.",
            "Rajiv Gandhi ( 20 August 1944 – 21 May 1991) was an Indian politician who served as the 6th Prime Minister of India from 1984 to 1989. He took office after the 1984 assassination of his mother, Prime Minister Indira Gandhi, to become the youngest Indian Prime Minister at the age of 40." +
                    "\nGandhi was a scion of the politically powerful Nehru–Gandhi family, which had been associated with the Indian National Congress party. For much of his childhood, his maternal grandfather Jawaharlal Nehru was Prime Minister. Gandhi attended college in the United Kingdom. He returned to India in 1966 and became a professional pilot for the state-owned Indian Airlines. In 1968, he married Sonia Gandhi; the couple settled in Delhi to a domestic life with their children Rahul Gandhi and Priyanka Gandhi Vadra. For much of the 1970s, his mother Indira Gandhi was prime minister and his brother Sanjay Gandhi an MP; despite this, Rajiv Gandhi remained apolitical. After Sanjay's death in a fighter plane crash in 1980, Gandhi reluctantly entered politics at the behest of Indira. The following year he won his brother's Parliamentary seat of Amethi and became a member of the Lok Sabha—the lower house of India's Parliament. As part of his political grooming, Rajiv was made general secretary of the Congress party and given significant responsibility in organising the 1982 Asian Games." +
                    "\nOn the morning of 31 October 1984, his mother was assassinated by one of her bodyguards; later that day, Gandhi was appointed Prime Minister. His leadership was tested over the next few days as organised mobs rioted against the Sikh community, resulting in anti-Sikh riots in Delhi. That December, Congress party won the largest Lok Sabha majority to date, 411 seats out of 542. Rajiv Gandhi's period in office was mired in controversies; perhaps the greatest crises were the Bhopal disaster, Bofors scandal and the Shah Bano case. In 1988, he reversed the coup in Maldives, antagonising militant Tamil groups such as PLOTE, intervening and then sending peacekeeping troops to Sri Lanka in 1987, leading to open conflict with the Liberation Tigers of Tamil Eelam (LTTE). In mid-1987, the Bofors scandal damaged his corruption-free image and resulted in a major defeat for his party in the 1989 election." +
                    "\nGandhi remained Congress President until the elections in 1991. While campaigning for the elections, he was assassinated by a suicide bomber from the LTTE. His widow Sonia became the president of the Congress party in 1998 and led the party to victory in the 2004 and 2009 parliamentary elections. His son Rahul Gandhi is a Member of Parliament and the current President of Indian National Congress. In 1991, Indian government posthumously awarded Gandhi the Bharat Ratna, the country's highest civilian award. At the India Leadership Conclave in 2009, the Revolutionary Leader of Modern India award was conferred posthumously on Gandhi.",
            "Vishwanath Pratap Singh (25 June 1931 – 27 November 2008) was an Indian politician, government official, and royal who was the 7th Prime Minister of India from 1989 to 1990. He was also the last ruler of Manda, having become the chief in 1941. Singh is known for his decision, as Prime Minister, to implement the Mandal Commission report for India's backward castes.",
            "Chandra Shekhar (1 July 1927 – 8 July 2007) was an Indian politician who served as the eighth Prime Minister of India, between 10 November 1990 and 21 June 1991. He headed a minority government of a breakaway faction of the Janata Dal with outside support from the Indian National Congress as a stop gap arrangement to delay elections. He is the first Indian Prime Minister who has never held any Government office.His government was largely seen as a \"puppet\" and \"lame duck\" and the government was formed with the fewest party MPs in the Lok Sabha.His government could not pass the budget at a crucial time when Moody had downgraded India and it further went down after the budget was not passed and global credit-rating agencies further downgraded India from investment grade making it impossible to even get short term loans and in no position to give any commitment to reform the World Bank and IMF stopped their assistance. Chandrasekhar had to authorise mortgaging of gold to avoid default of payment and this action came in for particular criticism as it was done secretly in the midst of the election. The Indian economic crisis, 1991, and the Assassination of Rajiv Gandhi plunged his government into crisis.",
            "Pamulaparthi Venkata Narasimha Rao (28 June 1921 – 23 December 2004) was an Indian lawyer and politician who served as the 9th Prime Minister of India from 1991 to 1996.His ascendancy to the prime ministership was politically significant in that he was the second holder of this office from a non-Hindi-speaking region and 1st belonging to the southern part of India. He led an important administration, overseeing a major economic transformation and several home incidents affecting national security of India.Rao, who held the Industries portfolio, was personally responsible for the dismantling of the Licence Raj, as this came under the purview of the Ministry of Commerce and Industry.He is often referred to as the \"Father of Indian Economic Reforms\".Future prime ministers Atal Bihari Vajpayee and Manmohan Singh continued the economic reform policies pioneered by Rao's government. Rao accelerated the dismantling of the License Raj, reversing the socialist policies of Rajiv Gandhi's government. He employed Dr. Manmohan Singh as his Finance Minister to embark on historic economic transition. With Rao's mandate, Dr. Manmohan Singh launched India's globalisation angle of the reforms that implemented the International Monetary Fund (IMF) policies to rescue the almost bankrupt nation from economic collapse.Rao was also referred to as Chanakya for his ability to steer economic and political legislation through the parliament at a time when he headed a minority government." +
                    "\nAccording to a former Foreign Minister of India Natwar Singh, \"Unlike Nehru, his knowledge of Sanskrit was profound. Nehru had a temper, PV a temperament. His roots were deep in the spiritual and religious soil of India. He did not need to 'Discover India'\". 11th President of India APJ Abdul Kalam described Rao as a \"patriotic statesman who believed that the nation is bigger than the political system\". Kalam acknowledged that Rao in fact asked him to get ready for nuclear tests in 1996 but they were not carried out as government at center got changed due to 1996 general election. The tests were later conducted by Vajpayee-led NDA government. In fact Rao briefed Vajpayee on nuclear plans." +
                    "\nRao's term as Prime Minister was an eventful one in India's history. Besides marking a paradigm shift from the industrialising, mixed economic model of Jawaharlal Nehru to a market driven one, his years as Prime Minister also saw the emergence of the Bharatiya Janata Party (BJP), a major right-wing party, as an alternative to the Indian National Congress which had been governing India for most of its post-independence history. Rao's term also saw the destruction of the Babri Mosque in Ayodhya in Uttar Pradesh when BJP's Kalyan Singh was Chief Minister, which triggered one of the worst Hindu-Muslim riots in the country since its independence.Rao died in 2004 of a heart attack in New Delhi. He was cremated in Hyderabad.He was a versatile personality with interests in a variety of subjects (other than politics) such as literature and computer software (including computer programming). He spoke 17 languages.",

            "Atal Bihari Vajpayee (25 December 1924 – 16 August 2018) was an Indian politician, statesman and a poet who served three terms as the Prime Minister of India, first for a term of 13 days in 1996, then for a period of 13 months from 1998 to 1999, and finally, for a full term from 1999 to 2004. A member of the Bharatiya Janata Party (BJP), he was the first Indian prime minister who was not a member of the Indian National Congress party to have served a full five-year term in office." +
                    "\nHe was a member of the Indian Parliament for over five decades, having been elected to the Lok Sabha, the lower house, ten times, and twice to the Rajya Sabha, the upper house. He served as the Member of Parliament for Lucknow until 2009 when he retired from active politics due to health concerns. Vajpayee was among the founding members of the Bharatiya Jana Sangh (BJS), of which he was the president from 1968 to 1972. The BJS merged with several other parties to form the Janata Party, which won the 1977 general election. Vajpayee became the Minister of External Affairs in the cabinet of Prime Minister Morarji Desai. He resigned in 1979, and the Janata alliance collapsed soon after. The erstwhile members of the BJS formed the BJP in 1980, with Vajpayee as its first president." +
                    "\nDuring his tenure as prime minister, India carried out the Pokhran-II nuclear tests in 1998. Vajpayee sought to improve diplomatic relations with Pakistan, travelling to Lahore by bus to meet with Prime Minister Nawaz Sharif. After the 1999 Kargil War with Pakistan, he sought to restore relations through engaging with President Pervez Musharraf, inviting him to India for a summit at Agra." +
                    "\nHe was conferred India's highest civilian honour, the Bharat Ratna, by the President of India, Pranab Mukherjee in 2015.The administration of Narendra Modi declared in 2014 that Vajpayee's birthday, 25 December, would be marked as Good Governance Day.He died on 16 August 2018 due to an age-related illness",
            "Haradanahalli Doddegowda Deve Gowda (born 18 May 1933) is an Indian politician who served as the 11th Prime Minister of India from 1 June 1996 to 21 April 1997.He was previously the 14th Chief Minister of Karnataka from 1994 to 1996." +
                    "\nHe was a member of the 16th Lok Sabha, representing the Hassan constituency of Karnataka, and is the National President of the Janata Dal (Secular) party.",
            "Inder Kumar Gujral (4 December 1919 – 30 November 2012) was an Indian politician who served as the 12th Prime Minister of India from April 1997 to March 1998. Gujral was the third PM to be from the Rajya Sabha, the first being Indira Gandhi (January 1966 - March 1977) and the second H. D. Deve Gowda (June 1996 - April 1997) and followed by Manmohan Singh (May 2004 - May 2014).",
            "Manmohan Singh (born 26 September 1932) is an Indian economist and politician who served as the Prime Minister of India from 2004 to 2014. The first Sikh in office, Singh was also the first prime minister since Jawaharlal Nehru to be re-elected after completing a full five-year term." +
                    "\nBorn in Gah (now in Punjab, Pakistan), Singh's family migrated to India during its partition in 1947. After obtaining his doctorate in economics from Oxford, Singh worked for the United Nations during 1966–69. He subsequently began his bureaucratic career when Lalit Narayan Mishra hired him as an advisor in the Ministry of Commerce and Industry. Over the 70s and 80s, Singh held several key posts in the Government of India, such as Chief Economic Advisor (1972–76), governor of the Reserve Bank (1982–85) and head of the Planning Commission (1985–87)." +
                    "\nIn 1991, as India faced a severe economic crisis, newly elected Prime Minister P. V. Narasimha Rao surprisingly inducted the apolitical Singh into his cabinet as Finance Minister. Over the next few years, despite strong opposition, he as a Finance Minister carried out several structural reforms that liberalised India's economy. Although these measures proved successful in averting the crisis, and enhanced Singh's reputation globally as a leading reform-minded economist, the incumbent Congress party fared poorly in the 1996 general election. Subsequently, Singh served as Leader of the Opposition in the Rajya Sabha (the upper house of Parliament of India) during the Atal Bihari Vajpayee government of 1998–2004." +
                    "\nIn 2004, when the Congress-led United Progressive Alliance (UPA) came to power, its chairperson Sonia Gandhi unexpectedly relinquished the premiership to Manmohan Singh. Singh's first ministry executed several key legislations and projects, including the Rural Health Mission, Unique Identification Authority, Rural Employment Guarantee scheme and Right to Information Act. In 2008, opposition to a historic civil nuclear agreement with the United States nearly caused Singh's government to fall after Left Front parties withdrew their support. Although India's economy grew rapidly under UPA I, its security was threatened by several terrorist incidents (including the 2008 Mumbai attacks) and the continuing Maoist insurgency." +
                    "\nThe 2009 general election saw the UPA return with an increased mandate, with Singh retaining the office of Prime Minister. Over the next few years, Singh's second ministry government faced a number of corruption charges—over the organisation of the 2010 Commonwealth Games, the 2G spectrum allocation case and the allocation of coal blocks. After his term ended in 2014 he opted out from the race to the office of the Prime Minister of India during 2014 Indian general election.Singh was never a member of the Lok Sabha but served as a member of the Parliament of India, representing the state of Assam in the Rajya Sabha for five terms from 1991 to 2019.In August 2019, Singh filed nomination as a Congress candidate to Rajya Sabha from Rajasthan after the death of sitting MP Madan Lal Saini.",

            "Narendra Damodardas Modi ( born 17 September 1950) is an Indian politician serving as the 14th and current Prime Minister of India since 2014. He was the Chief Minister of Gujarat from 2001 to 2014 and is the Member of Parliament for Varanasi. Modi is a member of the Bharatiya Janata Party (BJP) and of the Rashtriya Swayamsevak Sangh (RSS), a Hindu nationalist volunteer organisation. He is the first prime minister outside of the Indian National Congress to win two consecutive terms with a full majority and the second to complete five years in office after Atal Bihari Vajpayee" +
                    "\nBorn to a Gujarati family in Vadnagar, Modi helped his father sell tea as a child and has said he later ran his own stall. He was introduced to the RSS at the age of eight, beginning a long association with the organisation. Modi left home after finishing high-school in part due to an arranged marriage to Jashodaben Chimanlal, which he abandoned and publicly acknowledged only many decades later. Modi travelled around India for two years and visited a number of religious centres before returning to Gujarat. In 1971 he became a full-time worker for the RSS. During the state of emergency imposed across the country in 1975, Modi was forced to go into hiding. The RSS assigned him to the BJP in 1985 and he held several positions within the party hierarchy until 2001, rising to the rank of general secretary." +
                    "\nModi was appointed Chief Minister of Gujarat in 2001 due to Keshubhai Patel's failing health and poor public image following the earthquake in Bhuj. Modi was elected to the legislative assembly soon after. His administration has been considered complicit in the 2002 Gujarat riots or otherwise criticised for its handling of it. A Supreme Court-appointed Special Investigation Team found no evidence to initiate prosecution proceedings against Modi personally. His policies as chief minister, credited with encouraging economic growth, have received praise. His administration has been criticised for failing to significantly improve health, poverty and education indices in the state." +
                    "\nModi led the BJP in the 2014 general election which gave the party a majority in the Indian lower house of parliament, the Lok Sabha, the first time for any single party since 1984. Modi's administration has tried to raise foreign direct investment in the Indian economy and reduced spending on healthcare and social welfare programmes. Modi has attempted to improve efficiency in the bureaucracy; he has centralised power by abolishing the Planning Commission. He began a high-profile sanitation campaign and weakened or abolished environmental and labour laws. He initiated a controversial demonetisation of high-denomination banknotes. Described as engineering a political realignment towards right-wing politics, Modi remains a figure of controversy domestically and internationally over his Hindu nationalist beliefs and his role during the 2002 Gujarat riots, cited as evidence of an exclusionary social agenda.",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// to enable up button

        imageView=(ImageView)findViewById(R.id.pic);
        txtName=(TextView)findViewById(R.id.image_description);
        txtTenure=(TextView)findViewById(R.id.txt_tenure);

        txtInfo=(TextView)findViewById(R.id.txt_info);

        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("personImages", 0));

        //String imageName = getIntent().getStringExtra("image_name");

        txtName.setText(intent.getStringExtra("personNames"));
        //String text=txtTenure.getText().toString();

        txtTenure.setText(intent.getStringExtra("tenure"));

        //txtInfo.setText(data);


        if(txtName.getText().toString().equals("Shri Jawaharlal Nehru")){
            txtInfo.setText(personInfo[0]);
        }
        else if(txtName.getText().toString().equals("Shri Lal Bahadur Shastri")){
            txtInfo.setText(personInfo[1]);
        }
        else if(txtName.getText().toString().equals("Mrs. Indira Gandhi")){
            txtInfo.setText(personInfo[2]);
        }
        else if(txtName.getText().toString().equals("Shri Morarji Desai")){
            txtInfo.setText(personInfo[3]);
        }
        else if(txtName.getText().toString().equals("Shri Charan Singh")){
            txtInfo.setText(personInfo[4]);
        }
        else if(txtName.getText().toString().equals("Shri Rajiv Gandhi")){
            txtInfo.setText(personInfo[5]);
        }
        else if(txtName.getText().toString().equals("Shri Vishwanath Pratap Singh")){
            txtInfo.setText(personInfo[6]);
        }
        else if(txtName.getText().toString().equals("Shri Chandra Shekhar")){
            txtInfo.setText(personInfo[7]);
        }
        else if(txtName.getText().toString().equals("Shri P. V. Narasimha Rao")){
            txtInfo.setText(personInfo[8]);
        }
        else if(txtName.getText().toString().equals("Shri Atal Bihari Vajpayee")){
            txtInfo.setText(personInfo[9]);
        }
        else if(txtName.getText().toString().equals("Shri H. D. Deve Gowda")){
            txtInfo.setText(personInfo[10]);
        }
        else if(txtName.getText().toString().equals("Shri Inder Kumar Gujral")){
            txtInfo.setText(personInfo[11]);
        }
        else if(txtName.getText().toString().equals("Dr. Manmohan Singh")){
            txtInfo.setText(personInfo[12]);
        }
        else if(txtName.getText().toString().equals("Shri Narendra Modi")){
            txtInfo.setText(personInfo[13]);
        }

    }

}

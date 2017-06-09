package com.example.compaq.connect;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class UsActivity extends AppCompatActivity {
  Intent j;
    AutoCompleteTextView act;
    String places[]={"Adarsh Nagar", "AIIMS","Akshardham"
            ,"Anand Vihar"
            ,"Arjan Garh"
            ,"Ashok Park Main"
            ,"Azadpur"
            ,"Badarpur"
            ,"Badkal Mor"
            ,"Barakhamba"
            ,"Bata Chowk"
            ,"Botanical Garden"
            ,"Central Secretariat"
            ,"Chandni Chowk"
            ,"Chawri Bazar"
            ,"Chhattarpur"
            ,"Civil Lines"
            ,"Delhi Aero City"
            ,"Dhaula Kuan"
            ,"Dilshad Garden"
            ,"DLF Phase 2"
            ,"DLF Phase 3"
            ,"DLF Sikanderpur"
            ,"Dwarka"
            ,"Dwarka Mor"
            ,"Dwarka Sec-08"
            ,"Dwarka Sec-09"
            ,"Dwarka Sec-10"
            ,"Dwarka Sec-11"
            ,"Dwarka Sec-12"
            ,"Dwarka Sec-13"
            ,"Dwarka Sec-14"
            ,"Dwarka Sec-21"
            ,"Dwarka Sec-21-Airport"
            ,"Escorts Mujesar"
            ,"G.T.B. Nagar"
            ,"Ghitorni"
            ,"Golf Course"
            ,"Govind Puri"
            ,"Green Park"
            ,"Guru Dronacharya"
            ,"Haiderpur Badli Mor"
            ,"Hauz Khas"
            ,"Huda City Centre"
            ,"IFFCO Chowk"
            ,"Dhaula Khuan"
            ,"INA"
            ,"Inder Lok"
            ,"Indraprastha"
            ,"Indus Bank Cyber City"
            ,"ITO"
            ,"Jahangirpuri"
            ,"Janak Puri East"
            ,"Janak Puri West"
            ,"Jangpura"
            ,"Janpath"
            ,"Jasola"
            ,"Zakhira"
            ,"Jhandewalan"
            ,"Jhil Mil"
            ,"Jorbagh"
            ,"Kailash Colony"
            ,"Kalkaji Mandir"
            ,"Kanhaiya Nagar"
            ,"Karkar Duma"
            ,"Karol Bagh"
            ,"Kashmere Gate"
            ,"Kaushambi"
            ,"Keshav Puram"
            ,"Khan Market"
            ,"Kirti Nagar"
            ,"Kohat Enclave"
            ,"Lajpat Nagar"
            ,"Laxmi Nagar"
            ,"MadiPur"
            ,"Malviya Nagar"
            ,"Mandi House"
            ,"Mansarovar Park"
            ,"Mayur Vihar Extention"
            ,"Mayur Vihar Phase-1"
            ,"Mewala Maharajpur"
            ,"MG Road"
            ,"Micromax Moulsari"
            ,"Model Town"
            ,"Mohan Estate"
            ,"Moolchand"
            ,"Moti Nagar"
            ,"Mundka"
            ,"N.H.P.C. Chowk"
            ,"Nangloi"
            ,"Nangloi Rly Station"
            ,"Nawada"
            ,"Neelam Chowk Ajronda"
            ,"Nehru Place"
            ,"Netaji Subhash Place"
            ,"New Ashok Nagar"
            ,"New Delhi"
            ,"New Delhi-Airport Express"
            ,"Nirman Vihar"
            ,"Noida City Center"
            ,"Noida Sector-15"
            ,"Noida Sector-16"
            ,"Noida Sector-18"
            ,"Okhla"
            ,"Old Faridabad"
            ,"Paschim Vihar (East)"
            ,"Paschim Vihar (West)"
            ,"Patel Chowk"
            ,"Patel Nagar"
            ,"Peera Garhi"
            ,"Pitam Pura"
            ,"Pragati Maidan"
            ,"Pratap Nagar"
            ,"Preet Vihar"
            ,"Pul Bangash"
            ,"Punjabi Bagh"
            ,"Qutab Minar"
            ,"R K Ashram Marg"
            ,"Race Course"
            ,"Rajdhani Park"
            ,"Rajendra Place"
            ,"Rajiv Chowk"
            ,"Rajouri Garden"
            ,"Ramesh Nagar"
            ,"Rithala"
            ,"Rohini East"
            ,"Rohini Sector 18"
            ,"Rohimi Sector 19"
            ,"Rohini West"
            ,"Saket"
            ,"Samaypur Badli"
            ,"Sarai"
            ,"Sarita Vihar"
            ,"Satguru Ram Singh Marg"
            ,"Sector 28 Faridabad"
            ,"Seelampur"
            ,"Shadipur"
            ,"Shahdara"
            ,"Shastri Nagar"
            ,"Shastri Park"
            ,"Shivaji Park"
            ,"Shivaji Stadium"
            ,"Sikandarpur"
            ,"Subhash Nagar"
            ,"Sultanpur"
            ,"Surajmal Stadium"
            ,"Tagore Garden"
            ,"Tilak Nagar"
            ,"Tis Hazari"
            ,"Tughlakabad"
            ,"Udyog Bhawan"
            ,"Udyog Nagar"
            ,"Uttam Nagar East"
            ,"Uttam Nagar West"
            ,"Vaishali"
            ,"Vidhan Sabha"
            ,"Vishwavidyalaya"
            ,"Vishnu Garden"
            ,"Anand Parbat"
            ,"Yamuna Bank"
    };
    /*Ajmeri Gate Extension 110002
2 A G C R 110002
3 Ansari Road 110002
4 Aliganj 110003
5 Anand Parbat 110005
6 Anand Nagar 110005
7 Army Base 110010
8 A P S Colony 110010
9 A F Palam 110010
10 Ashram 110016
11 Ashok Nagar 110018
12 Ashoka Hotel 110021
13 Anand Niketan 110021
14 Amar Colony 110024
15 Adarsh Nagar 110033
16 A T Mills 110033
17 Anandvas Shakurpur 110034
18 Alipur 110036
19 A F Rajokari 110038
20 Ambrohi 110045
21 Arjan Garh 110047
22 Asian Games Village 110049
23 Andrews Ganj 110049
24 Azad Nagar 110051
25 Anarkali 110051
26 Ashok Vihar H O 110052
27 Amrit Kaur Market 110055
28 Ambedkar Nagar 110062
1 Bank Street 110005
2 Bara Tooti 110006
3 Birla Lines 110007
4 Bazar Road 110010
5 Bhola Nath Nagar 110032
6 Balbir Nagar 110032
7 Bhaiparma Nand Nagar 110033
8 Bawana 110039
9 Budh Nagar 110041
10 Badli 110042
11 Badarpur T P Station 110044
12 Badarpur 110044
13 Bakrola 110045
14 Bharat Nagar 110052
15 Bhajanpuri 110053
16 Brahampuri 110053
17 Bijwasan 110061
18 B S F Camp Tigri 110062
19 Bhajan Pura 110096
1 Connaught Place 110001
2 Constitution House 110001
3 Chawri Bazar 110006
4 Chandni Chowk 110006
5 C C Institute 110007
6 Central Ordinance 110010
7 Central Vehicle 110010
8 Central Tractor 110012
9 Central Kirti Nagar 110015
10 Chand Nagar 110018
11 C R R I 110020
12 Chankyapuri 110021
13 Civil Lines 110054
14 C R P F Camp 110054
15 Chhawla 110071
16 Chilla Villege 110094
1 Darya Ganj 110002
2 Delhi High Court 110003
3 Desh Bandhu Gupta Road 110005
4 Delhi Sadar Bazar 110006
5 Delhi G P O 110006
6 Delhi Cloth Mills 110006
7 Dareeba 110006
8 Delhi University 110007
9 Dada Ghosh Bhawan 110008
10 Depot 110010
11 Dhaula Khuan 110010
12 Delhi Cantt 110010
13 Defence Head Qrs 110011
14 Dargah Shareef 110013
15 D I Area 110015
16 Defence Colony 110024
17 Dilshad Garden 110032
18 Distt Courts 110054
19 Dakshinpuri Phase Iii 110062
20 Dakshimpuri Phase I 110062
21 D D A Munirka 110067
22 D D A Salam 110072
1 Eastern Court 110001
2 Election Commission 110001
3 E S I Hospital 110015
4 East Of Kailash 11006
1 Farashkhana 110006
2 Fatehpuri 110006
3 Fateh Nagar 110018
4 Flatted Factories Complex 110020
1 Gandhi Samarak 110002
2 Golf Links 110003
3 Guru Gobind Singh Marg 110005
4 Gymkhana Club 110011
5 Green Park Market 110016
6 Green Park 110016
7 Govindpuri 110019
8 Gandhi Nagar Bazar 110031
9 Gandhi Nagar 110031
10 Geeta Colony 110031
11 Gujranwala Nagar Part Ii 110033
12 G T S Nagar 110033
13 Ganeshpuri 110035
14 Gurgaon Road 110037
15 Greater Kailash Ii 110048
16 Greater Kailash 110048
17 Guatam Nagar 110049
18 Gulmohar Park 110049
19 Gobindpura 110051
20 Gokulpuri 110094
o. Area Name Pincode
1 Hamdard Dawakhana 110006
2 Hauz Qazi 110006
3 Hazrat Nizamuddin 110013
4 Hari Nagar Ashram 110014
5 Hauz Khas Market 110016
6 Hauz Khas 110016
7 Himayunpur Extn 110029
8 Harijan Sewak Sangh 110033
9 Haiderpur 110042
10 Hamdard Nagar 110062
11 Hari Nagar Da & Db Block 110064
12 Hari Nagar Be Block 110064
13 Himmatpuri 110091
1 Indian Agriculture 110002
2 Indraprastha Estate 110002
3 Indraprastha H O 110002
4 Industrial Area 110005
5 Idgah Road I S B T 110006
6 Inderpuri 110012
7 Industrial Area 110015
8 I I T Hauz Khas 110016
9 Inderlok 110035
o. Area Name Pincode
1 Janpath 110001
2 Jawahar Lal Nehru Stadium 110003
3 Joshi Nagar 110005
4 Jama Masjid 110006
5 Jawahar Nagar 110007
6 Jangpura 110014
7 Jamia Nagar 110025
8 Janta Market 110027
9 J 6Block Rajouri Garden 110027
10 J J Colony 110027
11 Jahangirpuri Block H 110033
12 Jahangirpuri Block D 110033
13 Jahangirpuri Block A 110033
14 Jaroda Majra 110033
15 Jawalpuri 110041
16 Jagjit Nagar 110053
17 Janakpuri Block C 4 110058
18 Janakpuri 110058
19 Janakpuri Block D 1 110058
20 Janakpuri Blockc 2 110058
21 Jeewan Park 110059
22 Jawahar Lal Nehru Univers 110067
23 Jharoda Kalan 110072
1 Krishi Bhawan 110001
2 Karol Bagh 110005
3 Kamla Nagar 110007
4 Kirby Place 110010
5 Karampura 110015
6 Kirti Nagar 110015
7 Khyalla Phase Ii 110018
8 Khyalla Phase I 110018
9 Kalkaji 110019
10 Kidwai Nagar 110023
11 Kidwai Nagar West 110023
12 Krishna Market 110024
13 Kailash Nagar 110031
14 Kabool Nagar 110032
15 Kailash Colony 110048
16 Kailash 110048
17 Krishan Nagar Bazar 110051
18 Krishan Nagar H O 110051
19 Khanpur 110062
20 Kanjhawala 110081
21 Khera Kalan 110082
22 Kutubgarh 110084
23 Khichripur 110091
24 Kalyanpuri 110091
25 Kalyan Vas 110092
26 Karawal Nagar 110094
1 Lady Harding Medical College 110001
2 Laxminarain Mandir 110001
3 Lok Nagar Bhawan 110003
4 Lodi Road H O 110003
5 Lodi House Hostel 110003
6 Lodi Colony Market 110003
7 Lower Camp Anand Parbat 110005
8 Lancer Road Market 110007
9 Lok Nayak Bhawan 110007
10 Laxmi Bai Nagar 110023
11 Lajpat Nagar 110024
12 Loni Road 110032
13 Lawrence Road 110035
14 Lekhu Nagar 110035
15 Lajpat Rai Chowk 110051
16 Laxmi Nagar Market 110092
1 Minto Road 110002
2 Model Basti 110005
3 Mori Gate 110006
4 Malka Ganj Market 110007
5 Malka Ganj 110007
6 Mansarover Garden 110015
7 Moti Nagar 110015
8 Malviya Nagar 110017
9 Mahabir Nagar 110018
10 Major Bhupinder Singh Nag 110018
11 Malcha Marg 110021
12 Moti Bagh 110021
13 Mehrau;I 110030
14 Mansarover Park 110032
15 Mukerjee Nagar 110033
16 Model Town A Block 110033
17 Model Town Ii 110033
18 Multani Mohalla 110034
19 Masjidmoth Phase Ii 110048
20 Masjid Moth Extn 110049
21 Maujpur 110053
22 Maidens Hotel 110054
23 Multani Dhanda 110055
24 Munirka 110057
25 Madangir 110062
26 Madipur 110063
27 Mayapuri Shopping Centre 110064
28 Mayapuri 110064
29 Mangolpuri Block S 110083
30 Mangolpuri Block A 110083
31 Mangolpuri Block 1 110083
32 Mangolpuri 110083
1 North Avenue 110001
2 New Delhi G P O 110001
3 Nidhi 110002
4 Nirman Bhawan 110011
5 N P Laboratories 110012
6 North Industrial Area 110015
7 N I E Compus 110016
8 Nehru Place 110019
9 Nanakpura 110021
10 Netaji Nagar 110023
11 Najafgarh Road 110027
12 Naraina Vihar 110028
13 Naraina 110028
14 Naraina Industrial Estate 110028
15 Nauroji Nagar 110029
16 New Seemapuri 110032
17 New Sabzi Mandi 110033
18 Nirankari Colony 110033
19 Nangli Poona 110036
20 Narela Town 110040
21 Narela 110040
22 Nagloi 110041
23 Nangloi Phase Iii 110041
24 Najafgarh 110043
25 Nangal Rava 110046
26 N Block Greater 110048
27 Nimri 110052
28 New Rajinder Nagar 110060
29 Nehru Nagar 110065
30 Nand Nagri A Block 110093
31 Nand Nagri 110093
32 Nathu Colony 110093
1 Oberei Intercontinental 110003
2 Organisation 110012
3 Okhla Industrial Estate 110020
4 Onkar Nagar 110035
1 Parliament House 110001
2 Patiala House 110001
3 Parliament Street H O 110001
4 Pragati Maidan 110001
5 Pandara Road 110003
6 Pragati Vihar 110003
7 Patrachar Road 110007
8 Patrachar Vidyala 110007
9 Partap Nagar 110007
10 Pragati Vihar 110007
11 Patel Nagar East 110008
12 Patel Nagar 110008
13 Patel Nagar West 110008
14 Patel Nagar South 110008
15 Pushpa Vihar Sector I 110017
16 Panchseel Enclave 110017
17 Postal Saving Bureau 110022
18 Punjabi Bagh Sector Iii 110026
19 Punjabi Bagh 110026
20 Pitampura 110034
21 Power House 110035
22 Palam Enclave 110045
23 Palam 110045
24 Paharganj 110055
25 P S B Paharganj 110055
26 Possangipur 110058
27 Pushpa Bhawan 110062
28 Paschim Vihar 110063
29 Paschim Vihar Block B 110063
30 P T S Jharoda Kalan 110072
31 Patper Ganj 110092
1 Rail Bhawan 110001
2 Rajghat Power House 110002
3 Rashtrapati Bhawan 110004
4 Red Fort 110006
5 Rly C A O 110007
6 Rana Pratap Bagh 110007
7 Roshan Area Road 110007
8 Roop Nagar 110007
9 Research Institute 110012
10 Ramesh Nagar H O 110015
11 R K Puram Sector I 110022
12 R K Puram Sector Ii 110022
13 R K Puram Sector Iii 110022
14 R K Puram Sector Iv 110022
15 R K Puram Sector Xii 110022
16 R K Puram Sector Ix 110022
17 R K Puram V 110022
18 R K Puram Sector Vii 110022
19 R K Puram Sector Viii 110022
20 Rajouri Market 110027
21 Rajouri Garden 110027
22 Raghubarpura 110031
23 Rohtash Nagar 110032
24 Rani Bagh 110034
25 Radheypuri 110051
26 Ram Nagar 110051
27 Ravinder Rangsala 110060
28 Rajinder Nagar 110060
29 R K Puram West 110066
30 R K Puram 110066
1 Shastri Bhawan 110001
2 Supreme Court 110001
3 Sectt North 110001
4 Sansadiya Soudha 110001
5 Safdarjang Air Port 110003
6 Sat Nahar 110005
7 Sadar Thana Road 110006
8 Shakti Nagar 110007
9 Subzi Mandi 110007
10 Sewa Sangh 110007
11 Safdarjang Air Port 110007
12 South Avenue 110011
13 Sectt South 110011
14 Shahjahan Road 110011
15 Sudershan Park 110015
16 Shri Aurobindo 110016
17 South Malviya Nagar 110017
18 Sarojini Nagar H O 110023
19 Subhash Nagar 110027
20 Subhash Nagar West 110027
21 Safdarjang Enclave 110029
22 Sahstri Nagar 110031
23 Seemapuri Old 110032
24 Shahdara Mandi 110032
25 Shahdara 110032
26 Suraj Nagar 110033
27 Shalimar Bagh 110033
28 Shakurpur Block I 110034
29 Srinagar Colony 110034
30 Saraswati Vihar 110034
31 Shakurbasti R S 110034
32 Sarai Rohila 110035
33 Sanoth 110040
34 Sultanpuri Block F 110041
35 Suttanpuri Block B 110041
36 Sultanpuri Block C 110041
37 Sameypur Badli 110042
38 Sadiq Nagar 110049
39 South Extn Part Ii 110049
40 South Extn Part I 110049
41 Shastri Nagar 110052
42 Satyawati Nagar 110052
43 Seelampur 110053
44 Swami Ram Tirath Nagar 110055
45 Shakurbasti 110056
46 Sriniwaspuri 110065
47 Shakarpur 110092
1 Than Singh Nagar 110005
2 Timarpur 110007
3 Tilak Nagar 110018
4 Tihar 110018
5 Tilak Nagar East 110018
6 Tatarpur 110027
7 T B Hospital 110030
8 Teliwara 110032
9 Tughlakabad 110044
10 Tughlakabad A F Station 110044
11 Trilokpuri 110091
1 U P S C 110011
2 Udyog Bhawan 110011
3 Uttam Nagar 110059
4 Ujwa 1100731 Vishnu Garden 110015
2 Vikaspuri 110018
3 Vishnu Garden 110018
4 Vishwa Karma Nagar 110032
5 Vishwan Nagar 110032
6 Vivek Vihar 110032
7 Vijay Nagar 110033
8 Vasant Vihar I 110057
9 Vasant Vihar Ii 110057
1 Wazir Nagar 110003
2 Wazir Nagar 110007
3 Work Shop 110010
4 Wazirpur Phase Iii 1100521 Yusaf Sarai 110016
2 Yamuna Vihar 110053
1 Zakhira 110015
2 Zakhir Nagar 110025
3 Zafrabad 110053
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        final ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.select_dialog_item, places);
        act.setThreshold(1);
        act.setAdapter(ad);
    }
    public void local(View v) {


        //if (ed.getText().toString().trim().length() != 0) {
        j = new Intent(this, StartingActivity.class);
        //   Toast.makeText(this, "You did not enter the place", Toast.LENGTH_SHORT).show();
        // return;


        AlertDialog.Builder builder = new AlertDialog.Builder(UsActivity.this);
        builder.setTitle("Confirm Login");
        builder.setMessage("You are almost done..Please login to continue");
        builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(j);
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        /* }else

        {
            Toast.makeText(this, "You did not enter the place", Toast.LENGTH_SHORT).show();
        }*/
    }
}

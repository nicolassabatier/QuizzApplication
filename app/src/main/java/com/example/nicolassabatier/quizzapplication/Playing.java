package com.example.nicolassabatier.quizzapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.nicolassabatier.quizzapplication.R.styleable.View;

public class   Playing extends AppCompatActivity implements  android.view.View.OnClickListener {
    List<Question> questions = new ArrayList<Question>();
    List<Question> questionsPlay = new ArrayList<Question>();

    public void getAllquestions() {
        questions.add(new Question(0, "afghanistan", "indonezia", "afghanistan", "palestine", "kosovo", "afghanistan"));
        questions.add(new Question(1, "african_union", "yemen", "african_union", "trinidad_tobago", "swaziland", "african_union"));
        questions.add(new Question(2, "albania", "slovenia", "albania", "sri_lanka", "ethiopia", "albania"));
        questions.add(new Question(3, "algeria", "solomon_islands", "algeria", "somalia", "ethiopia", "algeria"));
        questions.add(new Question(4, "american_samoa", "vatican_city", "liberia", "england", "american_samoa", "american_samoa"));
        questions.add(new Question(5, "andorra", "scotland", "andorra", "peru", "greece", "andorra"));
        questions.add(new Question(6, "angola", "papua_new_guinea", "angola", "martinique", "sweden", "angola"));
        questions.add(new Question(7, "anguilla", "northern_cyprus", "slovenia", "sierra_leone", "anguilla", "anguilla"));
        questions.add(new Question(8, "antarctica", "united_nations", "antarctica", "bermuda", "mongolia", "antarctica"));
        questions.add(new Question(9, "antigua_barbuda", "malta", "antigua_barbuda", "bermuda", "sudan", "antigua_barbuda"));
        questions.add(new Question(10, "arab_league", "netherlands_antilles", "guinea_bissau", "arab_league", "brazil", "arab_league"));
        questions.add(new Question(11, "argentina", "jersey", "oman", "argentina", "morocco", "argentina"));
        questions.add(new Question(12, "armenia", "oman", "armenia", "northern_cyprus", "cayman_islands", "armenia"));
        questions.add(new Question(13, "aruba", "denmark", "aruba", "united_states_of_america", "ethiopia", "aruba"));
        questions.add(new Question(14, "asean", "venezuela", "swaziland", "asean", "bahamas", "asean"));
        questions.add(new Question(15, "australia", "australia", "iran", "turkmenistan", "el_salvador", "australia"));
        questions.add(new Question(16, "austria", "austria", "sierra_leone", "denmark", "england", "austria"));
        questions.add(new Question(17, "azerbaijan", "botswana", "denmark", "azerbaijan", "tuvalu", "azerbaijan"));
        questions.add(new Question(18, "bahamas", "bahamas", "asean", "czech_republic", "denmark", "bahamas"));
        questions.add(new Question(19, "bahrain", "thailand", "bahrain", "guinea_bissau", "montserrat", "bahrain"));
        questions.add(new Question(20, "bangladesh", "armenia", "tanzania", "commonwealth", "bangladesh", "bangladesh"));
        questions.add(new Question(21, "barbados", "barbados", "somaliland", "israel", "barbados", "barbados"));
        questions.add(new Question(22, "belarus", "uzbekistan", "belarus", "malaysia", "mozambique", "belarus"));
        questions.add(new Question(23, "belgium", "central_african_republic", "switzerland", "new_zealand", "belgium", "belgium"));
        questions.add(new Question(24, "belize", "belize", "guatemala", "cambodja", "philippines", "belize"));
        questions.add(new Question(25, "benin", "cayman_islands", "denmark", "benin", "puerto_rico", "benin"));
        questions.add(new Question(26, "bermuda", "bermuda", "armenia", "taiwan", "namibia", "bermuda"));
        questions.add(new Question(27, "bhutan", "sierra_leone", "bhutan", "netherlands", "uruguay", "bhutan"));
        questions.add(new Question(28, "bolivia", "sierra_leone", "greece", "bolivia", "kyrgyzstan", "bolivia"));
        questions.add(new Question(29, "bosnia_herzegovina", "bosnia_herzegovina", "bhutan", "guam", "hong_kong", "bosnia_herzegovina"));
        questions.add(new Question(30, "botswana", "bermuda", "monaco", "angola", "botswana", "botswana"));
        questions.add(new Question(31, "brazil", "united_states_of_america", "new_zealand", "brazil", "tahiti", "brazil"));
        questions.add(new Question(32, "brunei", "palestine", "brunei", "virgin_islands_british", "tahiti", "brunei"));
        questions.add(new Question(33, "bulgaria", "north_korea", "anguilla", "venezuela", "bulgaria", "bulgaria"));
        questions.add(new Question(34, "burkina_faso", "burkina_faso", "cambodja", "moldova", "dominican_republic", "burkina_faso"));
        questions.add(new Question(35, "burundi", "ghana", "syria", "burundi", "kazakhstan", "burundi"));
        questions.add(new Question(36, "cambodja", "saudi_arabia", "cambodja", "somaliland", "russian_federation", "cambodja"));
        questions.add(new Question(37, "cameroon", "south_africa", "suriname", "cameroon", "reunion", "cameroon"));
        questions.add(new Question(38, "canada", "st_vincent_the_grenadines", "france", "canada", "burundi", "canada"));
        questions.add(new Question(39, "cape_verde", "cape_verde", "bulgaria", "armenia", "djibouti", "cape_verde"));
        questions.add(new Question(40, "caricom", "qatar", "reunion", "caricom", "libya", "caricom"));
        questions.add(new Question(41, "cayman_islands", "new_caledonia", "belgium", "olimpic_movement", "cayman_islands", "cayman_islands"));
        questions.add(new Question(42, "central_african_republic", "argentina", "central_african_republic", "uganda", "western_sahara", "central_african_republic"));
        questions.add(new Question(43, "chad", "indonezia", "bahamas", "chad", "turkmenistan", "chad"));
        questions.add(new Question(44, "chile", "wales", "chile", "poland", "macao", "chile"));
        questions.add(new Question(45, "china", "tajikistan", "china", "angola", "greece", "china"));
        questions.add(new Question(46, "cis", "belgium", "laos", "cis", "bhutan", "cis"));
        questions.add(new Question(47, "colombia", "lesotho", "fiji", "colombia", "somaliland", "colombia"));
        questions.add(new Question(48, "commonwealth", "commonwealth", "new_zealand", "colombia", "liechtenshein", "commonwealth"));
        questions.add(new Question(49, "comoros", "burkina_faso", "equatorial_guinea", "comoros", "scotland", "comoros"));
        questions.add(new Question(50, "congo_brazzaville", "marshall_islands", "arab_league", "congo_brazzaville", "faroes", "congo_brazzaville"));
        questions.add(new Question(51, "congo_kinshasa", "slovenia", "eritrea", "nicaragua", "congo_kinshasa", "congo_kinshasa"));
        questions.add(new Question(52, "cook_islands", "ethiopia", "mozambique", "cook_islands", "bulgaria", "cook_islands"));
        questions.add(new Question(53, "costa_rica", "guadeloupe", "sao_tome_principe", "nato", "costa_rica", "costa_rica"));
        questions.add(new Question(54, "cote_d_ivoire", "nato", "isle_of_man", "cote_d_ivoire", "iran", "cote_d_ivoire"));
        questions.add(new Question(55, "croatia", "spain", "croatia", "canada", "tanzania", "croatia"));
        questions.add(new Question(56, "cuba", "belgium", "micronesia", "ethiopia", "cuba", "cuba"));
        questions.add(new Question(57, "cyprus", "guinea_bissau", "cuba", "congo_brazzaville", "cyprus", "cyprus"));
        questions.add(new Question(58, "czech_republic", "rwanda", "jordan", "czech_republic", "austria", "czech_republic"));
        questions.add(new Question(59, "denmark", "algeria", "denmark", "solomon_islands", "burundi", "denmark"));
        questions.add(new Question(60, "djibouti", "fiji", "commonwealth", "mexico", "djibouti", "djibouti"));
        questions.add(new Question(61, "dominica", "czech_republic", "spain", "dominica", "montenegro", "dominica"));
        questions.add(new Question(62, "dominican_republic", "guinea", "dominican_republic", "germany", "nicaragua", "dominican_republic"));
        questions.add(new Question(63, "ecuador", "northern_cyprus", "jamaica", "kenya", "ecuador", "ecuador"));
        questions.add(new Question(64, "egypt", "cameroon", "egypt", "canada", "myanmar", "egypt"));
        questions.add(new Question(65, "el_salvador", "bermuda", "jordan", "el_salvador", "slovenia", "el_salvador"));
        questions.add(new Question(66, "england", "south_africa", "england", "paraguay", "central_african_republic", "england"));
        questions.add(new Question(67, "equatorial_guinea", "netherlands_antilles", "benin", "fiji", "equatorial_guinea", "equatorial_guinea"));
        questions.add(new Question(68, "eritrea", "greenland", "uzbekistan", "eritrea", "antarctica", "eritrea"));
        questions.add(new Question(69, "estonia", "nicaragua", "opec", "estonia", "red_cross", "estonia"));
        questions.add(new Question(70, "ethiopia", "samoa", "ethiopia", "cyprus", "morocco", "ethiopia"));
        questions.add(new Question(71, "european_union", "yemen", "turkey", "turkmenistan", "european_union", "european_union"));
        questions.add(new Question(72, "faroes", "georgia", "faroes", "sudan", "belarus", "faroes"));
        questions.add(new Question(73, "fiji", "montenegro", "fiji", "greece", "equatorial_guinea", "fiji"));
        questions.add(new Question(74, "finland", "turkey", "finland", "virgin_islands_us", "egypt", "finland"));
        questions.add(new Question(75, "france", "finland", "france", "vanutau", "denmark", "france"));
        questions.add(new Question(76, "gabon", "malaysia", "cape_verde", "gabon", "burundi", "gabon"));
        questions.add(new Question(77, "gambia", "gambia", "cote_d_ivoire", "caricom", "st_vincent_the_grenadines", "gambia"));
        questions.add(new Question(78, "georgia", "wales", "jamaica", "georgia", "isle_of_man", "georgia"));
        questions.add(new Question(79, "germany", "virgin_islands_us", "argentina", "new_zealand", "germany", "germany"));
        questions.add(new Question(80, "ghana", "st_kitts_nevis", "trinidad_tobago", "france", "ghana", "ghana"));
        questions.add(new Question(81, "gibraltar", "st_kitts_nevis", "gibraltar", "iraq", "uzbekistan", "gibraltar"));
        questions.add(new Question(82, "greece", "albania", "nigeria", "greece", "panama", "greece"));
        questions.add(new Question(83, "greenland", "iceland", "poland", "rwanda", "greenland", "greenland"));
        questions.add(new Question(84, "grenada", "bahamas", "kazakhstan", "grenada", "benin", "grenada"));
        questions.add(new Question(85, "guadeloupe", "honduras", "palau", "guadeloupe", "libya", "guadeloupe"));
        questions.add(new Question(86, "guam", "india", "samoa", "seychelles", "guam", "guam"));
        questions.add(new Question(87, "guatemala", "guatemala", "namibia", "cape_verde", "mauritania", "guatemala"));
        questions.add(new Question(88, "guernsey", "jordan", "guernsey", "guam", "spain", "guernsey"));
        questions.add(new Question(89, "guinea", "guinea", "kenya", "jamaica", "somalia", "guinea"));
        questions.add(new Question(90, "guinea_bissau", "guinea_bissau", "belarus", "seychelles", "ukraine", "guinea_bissau"));
        questions.add(new Question(91, "guyana", "guyana", "andorra", "micronesia", "solomon_islands", "guyana"));
        questions.add(new Question(92, "haiti", "nigeria", "malaysia", "haiti", "islamic_conference", "haiti"));
        questions.add(new Question(93, "honduras", "united_nations", "kazakhstan", "honduras", "botswana", "honduras"));
        questions.add(new Question(94, "hong_kong", "mexico", "caricom", "fiji", "hong_kong", "hong_kong"));
        questions.add(new Question(95, "hungary", "iran", "mauritius", "hungary", "azerbaijan", "hungary"));
        questions.add(new Question(96, "iceland", "nigeria", "iceland", "guinea_bissau", "botswana", "iceland"));
        questions.add(new Question(97, "india", "ukraine", "north_korea", "uruguay", "india", "india"));
        questions.add(new Question(98, "indonezia", "iran", "finland", "indonezia", "mali", "indonezia"));
        questions.add(new Question(99, "iran", "jersey", "iran", "grenada", "china", "iran"));
        questions.add(new Question(100, "iraq", "belize", "mongolia", "moldova", "iraq", "iraq"));
        questions.add(new Question(101, "ireland", "ireland", "seychelles", "oman", "eritrea", "ireland"));
        questions.add(new Question(102, "islamic_conference", "uzbekistan", "qatar", "uganda", "islamic_conference", "islamic_conference"));
        questions.add(new Question(103, "isle_of_man", "italy", "isle_of_man", "haiti", "mauritania", "isle_of_man"));
        questions.add(new Question(104, "israel", "greenland", "benin", "angola", "israel", "israel"));
        questions.add(new Question(105, "italy", "yemen", "sierra_leone", "western_sahara", "italy", "italy"));
        questions.add(new Question(106, "jamaica", "jamaica", "ireland", "barbados", "namibia", "jamaica"));
        questions.add(new Question(107, "japan", "japan", "kuwait", "lebanon", "hungary", "japan"));
        questions.add(new Question(108, "jersey", "macao", "england", "jersey", "eritrea", "jersey"));
        questions.add(new Question(109, "jordan", "st_vincent_the_grenadines", "afghanistan", "jordan", "macao", "jordan"));
        questions.add(new Question(110, "kazakhstan", "ireland", "estonia", "kazakhstan", "puerto_rico", "kazakhstan"));
        questions.add(new Question(111, "kenya", "lebanon", "kenya", "cayman_islands", "burkina_faso", "kenya"));
        questions.add(new Question(112, "kiribati", "egypt", "kiribati", "scotland", "saudi_arabia", "kiribati"));
        questions.add(new Question(113, "kosovo", "kosovo", "solomon_islands", "dominican_republic", "estonia", "kosovo"));
        questions.add(new Question(114, "kuwait", "norway", "kuwait", "mexico", "antigua_barbuda", "kuwait"));
        questions.add(new Question(115, "kyrgyzstan", "haiti", "tanzania", "north_korea", "kyrgyzstan", "kyrgyzstan"));
        questions.add(new Question(116, "laos", "laos", "islamic_conference", "nicaragua", "tunisia", "laos"));
        questions.add(new Question(117, "latvia", "iceland", "united_states_of_america", "kyrgyzstan", "latvia", "latvia"));
        questions.add(new Question(118, "lebanon", "samoa", "saudi_arabia", "arab_league", "lebanon", "lebanon"));
        questions.add(new Question(119, "lesotho", "malawi", "lesotho", "guam", "equatorial_guinea", "lesotho"));
        questions.add(new Question(120, "liberia", "kosovo", "liberia", "dominica", "red_cross", "liberia"));
        questions.add(new Question(121, "libya", "libya", "mauritania", "slovenia", "commonwealth", "libya"));
        questions.add(new Question(122, "liechtenshein", "european_union", "canada", "liechtenshein", "ghana", "liechtenshein"));
        questions.add(new Question(123, "lithuania", "somaliland", "denmark", "andorra", "lithuania", "lithuania"));
        questions.add(new Question(124, "luxembourg", "afghanistan", "luxembourg", "nicaragua", "kyrgyzstan", "luxembourg"));
        questions.add(new Question(125, "macao", "zimbabwe", "guernsey", "macao", "haiti", "macao"));
        questions.add(new Question(126, "macedonia", "latvia", "northern_ireland", "macedonia", "portugal", "macedonia"));
        questions.add(new Question(127, "madagascar", "vanutau", "madagascar", "dominican_republic", "tonga", "madagascar"));
        questions.add(new Question(128, "malawi", "luxembourg", "st_kitts_nevis", "opec", "malawi", "malawi"));
        questions.add(new Question(129, "malaysia", "monaco", "malaysia", "central_african_republic", "chad", "malaysia"));
        questions.add(new Question(130, "maldives", "italy", "maldives", "guam", "cameroon", "maldives"));
        questions.add(new Question(131, "mali", "belgium", "liechtenshein", "algeria", "mali", "mali"));
        questions.add(new Question(132, "malta", "malta", "estonia", "malta", "ecuador", "malta"));
        questions.add(new Question(133, "marshall_islands", "cook_islands", "kenya", "bhutan", "marshall_islands", "marshall_islands"));
        questions.add(new Question(134, "martinique", "san_marino", "romania", "belarus", "martinique", "martinique"));
        questions.add(new Question(135, "mauritania", "comoros", "saint_lucia", "mauritania", "peru", "mauritania"));
        questions.add(new Question(136, "mauritius", "mauritius", "russian_federation", "swaziland", "netherlands", "mauritius"));
        questions.add(new Question(137, "mexico", "turkmenistan", "mexico", "croatia", "colombia", "mexico"));
        questions.add(new Question(138, "micronesia", "laos", "micronesia", "namibia", "swaziland", "micronesia"));
        questions.add(new Question(139, "moldova", "aruba", "moldova", "san_marino", "sudan", "moldova"));
        questions.add(new Question(140, "monaco", "switzerland", "belize", "monaco", "bosnia_herzegovina", "monaco"));
        questions.add(new Question(141, "mongolia", "latvia", "mongolia", "montenegro", "france", "mongolia"));
        questions.add(new Question(142, "montenegro", "ethiopia", "opec", "dominica", "montenegro", "montenegro"));
        questions.add(new Question(143, "montserrat", "montserrat", "monaco", "lithuania", "montserrat", "montserrat"));
        questions.add(new Question(144, "morocco", "morocco", "finland", "taiwan", "taiwan", "morocco"));
        questions.add(new Question(145, "mozambique", "mozambique", "virgin_islands_british", "eritrea", "sierra_leone", "mozambique"));
        questions.add(new Question(146, "myanmar", "cape_verde", "malawi", "myanmar", "mexico", "myanmar"));
        questions.add(new Question(147, "namibia", "israel", "namibia", "colombia", "martinique", "namibia"));
        questions.add(new Question(148, "nato", "virgin_islands_us", "commonwealth", "nato", "kuwait", "nato"));
        questions.add(new Question(149, "nauru", "nauru", "lesotho", "northern_ireland", "swaziland", "nauru"));
        questions.add(new Question(150, "nepal", "nepal", "trinidad_tobago", "asean", "kiribati", "nepal"));
        questions.add(new Question(151, "netherlands", "caricom", "netherlands", "greece", "brunei", "netherlands"));
        questions.add(new Question(152, "netherlands_antilles", "niger", "netherlands_antilles", "somalia", "ghana", "netherlands_antilles"));
        questions.add(new Question(153, "new_caledonia", "italy", "new_caledonia", "samoa", "algeria", "new_caledonia"));
        questions.add(new Question(154, "new_zealand", "ireland", "new_zealand", "wales", "denmark", "new_zealand"));
        questions.add(new Question(155, "nicaragua", "nicaragua", "botswana", "cis", "tonga", "nicaragua"));
        questions.add(new Question(156, "niger", "madagascar", "niger", "venezuela", "suriname", "niger"));
        questions.add(new Question(157, "nigeria", "bangladesh", "nigeria", "angola", "antigua_barbuda", "nigeria"));
        questions.add(new Question(158, "north_korea", "north_korea", "grenada", "cameroon", "el_salvador", "north_korea"));
        questions.add(new Question(159, "northern_cyprus", "northern_cyprus", "nicaragua", "cyprus", "dominica", "northern_cyprus"));
        questions.add(new Question(160, "northern_ireland", "northern_ireland", "scotland", "cambodja", "panama", "northern_ireland"));
        questions.add(new Question(161, "norway", "united_nations", "norway", "india", "moldova", "norway"));
        questions.add(new Question(162, "olimpic_movement", "estonia", "olimpic_movement", "turkmenistan", "sweden", "olimpic_movement"));
        questions.add(new Question(163, "oman", "martinique", "oman", "italy", "australia", "oman"));
        questions.add(new Question(164, "opec", "opec", "ethiopia", "american_samoa", "opec", "opec"));
        questions.add(new Question(165, "pakistan", "tanzania", "burkina_faso", "pakistan", "cote_d_ivoire", "pakistan"));
        questions.add(new Question(166, "palau", "palau", "solomon_islands", "cote_d_ivoire", "slovenia", "palau"));
        questions.add(new Question(167, "palestine", "jersey", "palestine", "mauritius", "united_nations", "palestine"));
        questions.add(new Question(168, "panama", "argentina", "panama", "lithuania", "monaco", "panama"));
        questions.add(new Question(169, "papua_new_guinea", "lesotho", "ukraine", "papua_new_guinea", "jordan", "papua_new_guinea"));
        questions.add(new Question(170, "paraguay", "new_zealand", "netherlands_antilles", "qatar", "paraguay", "paraguay"));
        questions.add(new Question(171, "peru", "peru", "guernsey", "lesotho", "islamic_conference", "peru"));
        questions.add(new Question(172, "philippines", "philippines", "laos", "macedonia", "nigeria", "philippines"));
        questions.add(new Question(173, "poland", "jersey", "poland", "costa_rica", "mexico", "poland"));
        questions.add(new Question(174, "portugal", "spain", "kenya", "djibouti", "portugal", "portugal"));
        questions.add(new Question(175, "puerto_rico", "puerto_rico", "faroes", "faroes", "belarus", "puerto_rico"));
        questions.add(new Question(176, "qatar", "bermuda", "cape_verde", "qatar", "qatar", "qatar"));
        questions.add(new Question(177, "red_cross", "chile", "turks_and_caicos_islands", "red_cross", "czech_republic", "red_cross"));
        questions.add(new Question(178, "reunion", "bulgaria", "western_sahara", "reunion", "cape_verde", "reunion"));
        questions.add(new Question(179, "romania", "romania", "el_salvador", "portugal", "czech_republic", "romania"));
        questions.add(new Question(180, "russian_federation", "united_kingdom", "oman", "russian_federation", "swaziland", "russian_federation"));
        questions.add(new Question(181, "rwanda", "yemen", "singapore", "paraguay", "rwanda", "rwanda"));
        questions.add(new Question(182, "saint_lucia", "croatia", "andorra", "saint_lucia", "saint_lucia", "saint_lucia"));
        questions.add(new Question(183, "samoa", "antarctica", "united_arab_emirates", "gambia", "samoa", "samoa"));
        questions.add(new Question(184, "san_marino", "sudan", "sudan", "pakistan", "san_marino", "san_marino"));
        questions.add(new Question(185, "sao_tome_principe", "algeria", "caricom", "sao_tome_principe", "morocco", "sao_tome_principe"));
        questions.add(new Question(186, "saudi_arabia", "cook_islands", "saudi_arabia", "finland", "madagascar", "saudi_arabia"));
        questions.add(new Question(187, "scotland", "scotland", "faroes", "slovakia", "georgia", "scotland"));
        questions.add(new Question(188, "senegal", "somalia", "bolivia", "senegal", "tajikistan", "senegal"));
        questions.add(new Question(189, "serbia", "serbia", "cayman_islands", "monaco", "madagascar", "serbia"));
        questions.add(new Question(190, "seychelles", "tanzania", "vanutau", "seychelles", "laos", "seychelles"));
        questions.add(new Question(191, "sierra_leone", "yemen", "northern_cyprus", "sierra_leone", "bolivia", "sierra_leone"));
        questions.add(new Question(192, "singapore", "singapore", "nicaragua", "maldives", "south_africa", "singapore"));
        questions.add(new Question(193, "slovakia", "ukraine", "zambia", "monaco", "slovakia", "slovakia"));
        questions.add(new Question(194, "slovenia", "reunion", "opec", "slovenia", "zambia", "slovenia"));
        questions.add(new Question(195, "solomon_islands", "solomon_islands", "cis", "malaysia", "cis", "solomon_islands"));
        questions.add(new Question(196, "somalia", "somalia", "denmark", "denmark", "caricom", "somalia"));
        questions.add(new Question(197, "somaliland", "cis", "somaliland", "egypt", "mauritius", "somaliland"));
        questions.add(new Question(198, "south_africa", "tunisia", "south_africa", "romania", "brunei", "south_africa"));
        questions.add(new Question(199, "south_korea", "guinea_bissau", "eritrea", "south_korea", "monaco", "south_korea"));
        questions.add(new Question(200, "spain", "macao", "spain", "bulgaria", "iraq", "spain"));
        questions.add(new Question(201, "sri_lanka", "tahiti", "thailand", "israel", "sri_lanka", "sri_lanka"));
        questions.add(new Question(202, "st_kitts_nevis", "timor_leste", "st_kitts_nevis", "portugal", "portugal", "st_kitts_nevis"));
        questions.add(new Question(203, "st_vincent_the_grenadines", "united_kingdom", "estonia", "islamic_conference", "st_vincent_the_grenadines", "st_vincent_the_grenadines"));
        questions.add(new Question(204, "sudan", "portugal", "western_sahara", "sudan", "european_union", "sudan"));
        questions.add(new Question(205, "suriname", "kosovo", "belarus", "suriname", "lebanon", "suriname"));
        questions.add(new Question(206, "swaziland", "morocco", "swaziland", "guinea", "somalia", "swaziland"));
        questions.add(new Question(207, "sweden", "sweden", "ecuador", "ethiopia", "haiti", "sweden"));
        questions.add(new Question(208, "switzerland", "switzerland", "qatar", "olimpic_movement", "tahiti", "switzerland"));
        questions.add(new Question(209, "syria", "syria", "kenya", "solomon_islands", "papua_new_guinea", "syria"));
        questions.add(new Question(210, "tahiti", "brazil", "tahiti", "ukraine", "israel", "tahiti"));
        questions.add(new Question(211, "taiwan", "martinique", "taiwan", "costa_rica", "liberia", "taiwan"));
        questions.add(new Question(212, "tajikistan", "turkey", "tajikistan", "puerto_rico", "virgin_islands_british", "tajikistan"));
        questions.add(new Question(213, "tanzania", "dominica", "belgium", "bahamas", "tanzania", "tanzania"));
        questions.add(new Question(214, "thailand", "liberia", "bermuda", "mozambique", "thailand", "thailand"));
        questions.add(new Question(215, "timor_leste", "trinidad_tobago", "timor_leste", "turkey", "vatican_city", "timor_leste"));
        questions.add(new Question(216, "togo", "england", "togo", "uruguay", "bosnia_herzegovina", "togo"));
        questions.add(new Question(217, "tonga", "jersey", "costa_rica", "andorra", "tonga", "tonga"));
        questions.add(new Question(218, "trinidad_tobago", "trinidad_tobago", "ukraine", "sao_tome_principe", "latvia", "trinidad_tobago"));
        questions.add(new Question(219, "tunisia", "bahrain", "comoros", "tunisia", "qatar", "tunisia"));
        questions.add(new Question(220, "turkey", "spain", "botswana", "turkey", "nauru", "turkey"));
        questions.add(new Question(221, "turkmenistan", "american_samoa", "turkmenistan", "poland", "mauritius", "turkmenistan"));
        questions.add(new Question(222, "turks_and_caicos_islands", "philippines", "turks_and_caicos_islands", "poland", "palau", "turks_and_caicos_islands"));
        questions.add(new Question(223, "tuvalu", "cyprus", "tuvalu", "honduras", "belgium", "tuvalu"));
        questions.add(new Question(224, "uganda", "uganda", "nato", "austria", "uzbekistan", "uganda"));
        questions.add(new Question(225, "ukraine", "netherlands_antilles", "liechtenshein", "colombia", "ukraine", "ukraine"));
        questions.add(new Question(226, "united_arab_emirates", "kenya", "papua_new_guinea", "india", "united_arab_emirates", "united_arab_emirates"));
        questions.add(new Question(227, "united_kingdom", "united_kingdom", "portugal", "brazil", "philippines", "united_kingdom"));
        questions.add(new Question(228, "united_nations", "ethiopia", "united_nations", "micronesia", "palau", "united_nations"));
        questions.add(new Question(229, "united_states_of_america", "croatia", "united_states_of_america", "saudi_arabia", "samoa", "united_states_of_america"));
        questions.add(new Question(230, "uruguay", "haiti", "uruguay", "guinea_bissau", "congo_brazzaville", "uruguay"));
        questions.add(new Question(231, "uzbekistan", "ethiopia", "uzbekistan", "oman", "antarctica", "uzbekistan"));
        questions.add(new Question(232, "vanutau", "vanutau", "cook_islands", "thailand", "st_kitts_nevis", "vanutau"));
        questions.add(new Question(233, "vatican_city", "vanutau", "opec", "austria", "vatican_city", "vatican_city"));
        questions.add(new Question(234, "venezuela", "gambia", "venezuela", "macao", "trinidad_tobago", "venezuela"));
        questions.add(new Question(235, "viet_nam", "virgin_islands_british", "viet_nam", "kuwait", "marshall_islands", "viet_nam"));
        questions.add(new Question(236, "virgin_islands_british", "myanmar", "virgin_islands_british", "venezuela", "spain", "virgin_islands_british"));
        questions.add(new Question(237, "virgin_islands_us", "reunion", "romania", "virgin_islands_us", "madagascar", "virgin_islands_us"));
        questions.add(new Question(238, "wales", "european_union", "united_arab_emirates", "wales", "mongolia", "wales"));
        questions.add(new Question(239, "western_sahara", "puerto_rico", "western_sahara", "cayman_islands", "vanutau", "western_sahara"));
        questions.add(new Question(240, "yemen", "mexico", "st_vincent_the_grenadines", "greenland", "yemen", "yemen"));
        questions.add(new Question(241, "zambia", "finland", "palestine", "bhutan", "zambia", "zambia"));
        questions.add(new Question(242, "zimbabwe", "lithuania", "moldova", "montserrat", "zimbabwe", "zimbabwe"));
    }

    public void Questionsplay() {
        getAllquestions();
        Collections.shuffle(questions);
        //int RandNum;
        //final int MAX=(questions.size()-1);
        //final int MIN=0;
        int count = 0;
        //List<Integer> randlist = new ArrayList<>();
        while (count < 5) {
            count++;
            //RandNum = ((int) (Math.random() * (MAX + 1 - MIN) + MIN));
            //for (int i=0;i<count;i++)

            questionsPlay.add(questions.get(count));
        }

    }


    //DBhandler db;
    int thisquestion = 0, totalQuestion, correctAnswer, index = 0, score = 0;
    ImageView mImageView;
    Button buttonA, buttonB, buttonC, buttonD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);


        //DBhandler db;


        mImageView = (ImageView) findViewById(R.id.flag_question);
        buttonA = (Button) findViewById(R.id.Answer_A_Button);
        buttonB = (Button) findViewById(R.id.Answer_B_Button);
        buttonC = (Button) findViewById(R.id.Answer_C_Button);
        buttonD = (Button) findViewById(R.id.Answer_D_Button);


        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Questionsplay();

        showQuestion(index);
        //  index++;


    }

    private void showQuestion(int index) {
        //getAllquestions();
        //Questionsplay();
        Intent intent = getIntent();
        Player  newPlayer =(Player) intent.getSerializableExtra("aplayer");
        if (index < (questionsPlay.size())) {
            thisquestion++;
            int ImageId = this.getResources().getIdentifier(questionsPlay.get(index).getImage().toLowerCase(), "drawable", getPackageName());
            mImageView.setBackgroundResource(ImageId);
            buttonA.setText(questionsPlay.get(index).getAnswerA());
            buttonB.setText(questionsPlay.get(index).getAnswerB());
            buttonC.setText(questionsPlay.get(index).getAnswerC());
            buttonD.setText(questionsPlay.get(index).getAnswerD());

        } else {
            newPlayer.setScore(score);
            Intent intention = new Intent(Playing.this, ScoreActivity.class);
            intention.putExtra("newPlayer",newPlayer);
            startActivity(intention);
            //finish();

        }
    }


    @Override
    public void onClick(View view) {



        if (index < questionsPlay.size()) {
            Button PlayerAnswer = (Button) view;
            if (PlayerAnswer.getText().equals(questionsPlay.get(index).getCorrectAnswer())) {
                score++;
                showQuestion(++index);
            } else {
                showQuestion(++index);

            }
        } else {
            showQuestion(++index);


            //showQuestion(++index);

        }

    }
}




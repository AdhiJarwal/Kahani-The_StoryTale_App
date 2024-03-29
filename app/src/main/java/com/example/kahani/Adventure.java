package com.example.kahani;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.kahani.Adapters.SpecificSoriesAdapter;
import com.example.kahani.Models.SpecificStoriesModel;
import com.example.kahani.databinding.ActivityAdventureBinding;

import java.util.ArrayList;

public class Adventure extends AppCompatActivity {

    ActivityAdventureBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdventureBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        ArrayList<SpecificStoriesModel> arrayList = new ArrayList<>();
        //-----------------------------------------------------------------------

        String str२="हरक्यूलिस एक मजबूत और बहादुर आदमी था। वह ग्रीस में रहता था। राजा हरक्यूलिस से ईर्ष्या करता था। लोग हरक्यूलिस को राजा बना सकते हैं। इसलिए वह हरक्यूलिस से छुटकारा पाना चाहता था। उसने हरक्यूलिस के लिए उसे देश से दूर रखने के लिए कठिन कार्य निर्धारित किए ताकि वह उसके (राजा) के लिए एक संभावित खतरा न हो।" +
                "एक बार उन्होंने हरक्यूलिस से तीन सुनहरे सेब लाने को कहा। कहा जाता है कि कुछ पेड़ों में सुनहरे सेब होते हैं। कहा जाता है कि ये पेड़ हेस्परिड्स नामक स्थान पर थे। लेकिन हेस्पेराइड्स का रास्ता कोई नहीं जानता था। तो राजा ने हेस्परिड्स के बारे में सोचा। हरक्यूलिस लंबी अवधि के लिए दूर होगा।" +
                "हरक्यूलिस यात्रा पर निकल पड़ा। यात्रा के दौरान सबसे पहले उनकी मुलाकात तीन युवतियों से हुई। हरक्यूलिस ने उनसे हेस्परिड्स का रास्ता पूछा। उन्होंने उससे कहा कि समुद्र के बूढ़े आदमी से पूछो। लेकिन उन्होंने उसे चेतावनी भी दी, “समुद्र के बूढ़े आदमी को कस कर पकड़ लो। नहीं तो वह बच जाएगा। कोई और रास्ता नहीं जानता।\"" +
                "हरक्यूलिस ने बूढ़े आदमी को देखा। वह किनारे पर सो रहा था। वह अजीब लग रहा था। उसके लंबे बाल और दाढ़ी थी। हरक्यूलिस बिना कोई शोर किए उसके पास चला गया। फिर उसने उसे बहुत मजबूती से पकड़ लिया।" +
                "समुद्र के बूढ़े ने आँखें खोलीं। वह हैरान था। उसने खुद को हरिण में बदल लिया। उसने खुद को हरक्यूलिस के चंगुल से छुड़ाने की कोशिश की। लेकिन हरक्यूलिस ने उसे कस कर पकड़ रखा था। फिर बूढ़े ने खुद को समुद्री पक्षी और फिर अन्य जानवरों के रूप में बदल लिया। लेकिन वह खुद को हरक्यूलिस के चंगुल से मुक्त नहीं कर सका, क्योंकि हरक्यूलिस उसके चंगुल को और सख्त कर रहा था। अंत में बूढ़े ने हरक्यूलिस से कहा, \"तुम कौन हो? आप मुझसे क्या चाहते हैं?\"" +
                "हरक्यूलिस ने उत्तर दिया, \"मैं हरक्यूलिस हूं। मुझे हेस्परिड्स का रास्ता बताओ।\"" +
                "बूढ़े ने कहा, “यह एक द्वीप है। समुद्र के किनारे जाओ। किसी महापुरुष से मुलाकात होगी। वह आपको हेस्परिड्स का रास्ता दिखाएगा।\"" +
                "हरक्यूलिस ने अपनी यात्रा जारी रखी। वह विशाल से मिला। विशाल बहुत विशाल और शक्तिशाली था। वह किनारे पर सो रहा था। हरक्यूलिस ने उसे जगाया। विशाल गुस्से में था। उन्होंने हरक्यूलिस को एक क्लब से मारा। हरक्यूलिस ने विशाल पर आरोप लगाया। उसने विशाल को उठाकर नीचे फेंक दिया। लेकिन विशाल तुरंत उठ गया। वह दस गुना मजबूत हो गया था। हरक्यूलिस ने उसे बार-बार नीचे फेंक दिया। लेकिन हर बार विशाल और मजबूत हुआ। तब हरक्यूलिस ने विशाल को हवा में ऊपर उठा लिया। लेकिन उन्होंने उसे नीचे नहीं उतारा। विशाल ने धीरे-धीरे अपनी सारी ताकत खो दी। उसने अब हरक्यूलिस से उसे धरती पर उतारने की याचना की। हरक्यूलिस ने उसे हेस्परिड्स का रास्ता बताने के लिए कहा। विशाल ने हरक्यूलिस को एटलस से मिलने के लिए कहा। उसने उसे उस जगह का रास्ता बताया जहां एटलस था।" +
                "हरक्यूलिस ने अपनी यात्रा जारी रखी। वह, अंत में, एटलस से मिला।" +
                "\"आपको सुनहरे सेब क्यों चाहिए?\" एटलस ने पूछा।" +
                "हरक्यूलिस ने कहा, \"मेरे राजा ने मुझे ये तीन सुनहरे सेब लाने का आदेश दिया है।\"" +
                "“यहाँ से उस स्थान तक बहुत लंबा रास्ता है। मैं ही वहां जा सकता हूं। मेरे लिए इस आकाश को पकड़ो। मैं उन्हें तुम्हारे लिए लाऊंगा,\" एटलस ने कहा।" +
                "हरक्यूलिस सहमत हुए। उसने आकाश को अपने कंधों पर पकड़ रखा था। एटलस चला गया। कुछ ही देर में वह वापस आ गया। उसने तीन सुनहरे सेब हरक्यूलिस के पैर में डाल दिए। हरक्यूलिस ने एटलस को धन्यवाद दिया। उसने एटलस से आकाश को वापस लेने का अनुरोध किया।" +
                "\"आकाश वापस ले लो!\" एटलस ने चालाकी से कहा। \"मैंने इसे एक हजार साल तक रखा है। मैं एक और हजार साल बाद वापस आऊंगा!\"" +
                "एटलस ने उसे जो बताया, उससे हरक्यूलिस चकित रह गया। लेकिन उन्होंने हैरानी जाहिर नहीं की। उसने होश संभाला और जवाब दिया, \"ओह! उस स्थिति में, क्या आप कृपया थोड़ी देर के लिए आकाश को थामे रहेंगे? मैं आकाश को सहारा देने के लिए अपने कंधों के लिए एक पैड बनाऊंगा। तब मैं तुमसे आकाश वापस ले लूंगा।\" इस प्रकार हरक्यूलिस बहुत चुपचाप बोला।" +
                "एटलस सहमत हो गया। एटलस ने हरक्यूलिस से आकाश वापस ले लिया। हरक्यूलिस ने तुरंत तीन सुनहरे सेब एकत्र किए। उसने अपने चेहरे पर एक शरारती मुस्कान के साथ एटलस को अलविदा कह दिया। वह एटलस को अवाक और आश्चर्यचकित छोड़कर ग्रीस की ओर चला गया।" +
                "कई दिनों की यात्रा के बाद हरक्यूलिस अपनी मातृभूमि ग्रीस पहुंचा। उसने राजा को तीन सुनहरे सेब दिए। राजा हरक्यूलिस से सुनहरे सेब पाकर हैरान था। वह ख़ुश था। लेकिन उन्होंने संतुष्ट न होने का नाटक किया। लेकिन वह चुपके से हरक्यूलिस को एक और खतरनाक साहसिक कार्य पर भेजने की योजना बना रहा था।";
        String str3="बहुत पहले जापान में किंटोकी नाम का एक महान सैनिक रहता था। उसे एक युवती से प्यार हो गया और उसने उससे शादी कर ली। इसके कुछ समय बाद ही वह कोर्ट में बदनाम हो गया और उसे बर्खास्त कर दिया गया। यह दुर्भाग्य उसके दिमाग पर इतना हावी हो गया कि वह लंबे समय तक अपनी बर्खास्तगी से नहीं बचा, इसलिए वह मर गया, अपनी खूबसूरत युवा पत्नी को अकेले दुनिया का सामना करने के लिए छोड़ दिया। अपने पति के शत्रुओं से डरकर आशिगार पर्वत की ओर भागी। वहाँ उसने एक छोटे लड़के को जन्म दिया जिसका नाम उसने किंटारो रखा। किंटारो अन्य लड़कों की तरह नहीं था, वह हमेशा की तरह मजबूत था। जब वह बड़ा हुआ तो उसकी ताकत बढ़ती गई। चूंकि किंटारो पहाड़ों में रहता था, इसलिए उसका कोई दोस्त नहीं बल्कि जानवर था। उनके प्रिय मित्र भालू, बंदर, हिरण और खरगोश थे। एक दिन 5 दोस्तों को सुंदर फूलों से भरी एक खुली जगह मिली। किंटारो ने कहा, \"यहां एक अच्छे खेल के लिए जगह है। आप सभी कुश्ती मैच के बारे में क्या कहते हैं?\" भालू ने कहा, \"यह बहुत मजेदार होगा। मैं सबसे मजबूत जानवर हूं इसलिए मैं पहलवानों के लिए मंच बनाऊंगा।\" और वह पृय्वी को खोदने और उसे आकार देने का काम करने लगी। जब ऐसा किया गया तो मित्र समूहों में विभाजित हो गए कि कौन कुश्ती करेगा। जब बंदर और खरगोश की बारी आई, तो खरगोश जीत गया और उसे उसका पुरस्कार मिल गया। बंदर पागल हो गया और कहा कि वह नहीं जीता इसलिए उनका दोबारा मैच हुआ। इस बार बंदर जीत गया। जब यह खत्म हो गया, तो वे एक साथ घर वापस जाने लगे। अचानक 5 दोस्तों को एक झील का सामना करना पड़ा और उन्हें कोई सुराग नहीं था कि कैसे पार किया जाए। किंटारो ने कहा, \"एक क्षण रुको। मैं कुछ ही मिनटों में आप सभी के लिए एक अच्छा ब्रिज बना दूँगा।\" उसने पास में एक बड़े पेड़ को पकड़ लिया और उसे पृथ्वी से उठा लिया। फिर, किंटारो ने उसे नदी में खींच लिया। किंटारो कितने मजबूत थे, इससे हर कोई प्रभावित था। एक बूढ़े ने यह देखा और यह सुनिश्चित करने के लिए अपनी आँखें मसल लीं कि वह सपना तो नहीं देख रहा है।" +
                "उसने अपने आप से कहा, “यह कोई साधारण बच्चा नहीं है। वह किसका पुत्र हो सकता है? मैं इस दिन के पूरा होने से पहले पता लगा लूंगा।” जब किंटारो घर वापस गया, तो उसने अपनी माँ को सब कुछ बताया। उनकी बातचीत के बीच में वही बूढ़ा आया और किंटारो से हाथ की कुश्ती के लिए कहा। किंटारो सहमत हो गया। वे काफी देर तक बीच में रहे। अंत में बूढ़े ने घोषणा की कि यह एक ड्रा खेल है। उसने किंटारो की माँ से कहा, “मैं जापान के महान सेनापतियों में से एक हूँ। मेरा नाम सदामित्सु है, और मैं शक्तिशाली भगवान मिनामोतो-नो-रायको का जागीरदार हूं। उसने मुझे देश का चक्कर लगाने और उन लड़कों की तलाश करने का आदेश दिया जो उल्लेखनीय ताकत का वादा करते हैं, ताकि उन्हें अपनी सेना के लिए सैनिकों के रूप में प्रशिक्षित किया जा सके। मैंने सोचा कि लकड़हारे का वेश धारण करके मैं यह सबसे अच्छा कर सकता हूं। सौभाग्य से, मैं इस प्रकार अप्रत्याशित रूप से आपके पुत्र से मिला हूँ। अब यदि आप वास्तव में चाहते हैं कि वह समुराई बने तो मैं उसे ले जाऊंगा और उसकी सेवा के लिए एक उम्मीदवार के रूप में लॉर्ड रायको के सामने पेश करूंगा। आप इसे क्या कहते हैं?\" किंटारो की माँ सहर्ष मान गई और अपने बेटे को जाने दिया। किंटारो अंततः जापान में एक महान समुराई बन गया।";

        String str4="इंग्लैंड में लेम्युअल गुलिवर नामक एक साहसी व्यक्ति रहता था। वह पानी के जहाज पर सवार होकर पूरी दुनिया के आश्चर्यजनक नजारे देखने के लिए हमेशा उत्सुक और तत्पर रहता था। " +
                "गुलिवर सोचता था, ‘वे दिन कब आएंगे, जब मैं अपना जीवन लंबी यात्राओं और अनजान जगहों पर बिता सकूँगा।’ जब वह सागर की लहरों पर चमकती किरणों और नाचती डालफिनों को देखता, तो गुलिवर को यकीन हो जाता कि वे लहरें उसे संसार का सबसे सुखी इन्सान बना सकती हैं। फिर एक दिन वह डॉक्टर बनकर जहाज पर सवार हो गया। " +
                "रात्रिकाल समुद्र में भारी तूफान आने से जहाज तहस-नहस हो गया। गुलिवर को निराशा ने घेर लिया। वह सोचने लगा, ‘क्या मेरा जीवन यूं ही बरबाद हो जाएगा।’ गुलिवर के अलावा बाकी सभी मुसाफिर पानी में डूब गए थे। वह एक अच्छा तैराक था। किनारे तक जाने के लिए उसे कई मील तैरना पड़ा। " +
                "वह बहुत थक गया था, अतः किनारे पहुंचकर सो गया। गुलिवर सारा दिन सोता रहा। जब उसकी आंख खुली, तो सूरज चमक रहा था। गुलिवर सोचने लगा कि क्या वह स्वर्ग में आ गया है। जब उसने उठना चाहा, तो उससे नहीं उठा गया। बहुत से बौने उसके शरीर पर चढ़े हुए थे।" +
                "पहले तो गुलिवर की समझ में कुछ नहीं आया। उसने अपने जीवन में कभी इतने बौने लोग नहीं देखे थे। वे बहुत छोटे थे। उसने सोचा कि कहीं वह किसी दूसरी दुनिया में तो नहीं आ गया। बौने छोटे होने के बावजूद उसे काबू में करने की पूरी कोशिश कर रहे थे। " +
                "शायद वे गुलिवर को बंदी बनाना चाहते थे। उनकी कोशिश देखकर उसे मन-ही-मन में बहुत हंसी आई। उसे कई कहानियों में वर्णित राक्षसों की याद आ गई। उसने सोचा कि वे लोग उसे वैसा ही कोई राक्षस समझ रहे होंगे, क्योंकि वह उनके डील-डौल से सैंकड़ों गुना बड़ा था।" +
                "गुलिवर ने पूछा, “तुम लोग कौन हो? मुझे जाने दो।” उन्होंने कोई जवाब नहीं दिया और गुलिवर उन्हें हटाने में असफल रहा। उसके हाथ-पैर धरती से बंधे थे। सभी बौने उसके शरीर पर दौड़ रहे थे। उन बौनों का नेता गुलिवर के अंगूठे से भी छोटा था। वह आगे आकर बोला, “तुम लिलीपुट में हो, " +
                "हम लिलीपुट के वासी हैं। हम तुम्हें अपने राजा के पास ले जा रहे हैं। अगर तुम हमें परेशान करोगे, तो हम तुम्हारी जान ले लेंगे।” उसकी धमकी सुनकर गुलिवर को हंसी आ गई, लेकिन उसने चुपचाप हामी भर ली।" +
                "फिर पहियों वाला लकड़ी का एक बड़ा-सा ढांचा लाया गया। उन्होंने किसी तरह गुलिवर को उस पर धकेल दिया। जब वह लिलीपुट पहुंचा, तो उसने देखा कि बहुत से बौने धक्का-मुक्की करते हुए उसकी एक झलक पाने की कोशिश कर रहे थे। वह उनकी बातें सुन सकता था। वे लोग उसी के बारे में चर्चा कर रहे थे। एक बौना बोला, “देखो, ये कितना बड़ा है। इसकी छोटी उंगली भी मेरी लंबाई से अधिक है।”" +
                "दूसरे बौने ने गुलिवर की ओर देखते हुए कहा, “इसके समान बड़ा होने के लिए हमें बहुत भोजन करना होगा?”" +
                "तीसरा बौना व्यंग्य करते हुए बोला, “इतना बड़ा होने के लिए हमें कई सेनाओं का भोजन खाना पड़ेगा।” " +
                "फिर वे बौने हंसने लगे। चारों ओर उत्सव का माहौल था। गुलिवर के साथ-साथ वे लोग भी आनंद उठा रहे थे। इसके बाद वे सब राजा के दरबार में गए। उस समय राजा दरबार में नहीं था, लेकिन बिगुल बजते ही वह वहां पहुंच गया।" +
                "राजा ने कहा, “दैत्य जी, नमस्कार! मैं लिलीपुट का राजा हूं।” " +
                "गुलिवर बोला, “महाराज, नमस्कार! मैं गुलिवर हूं। माफ करें, मैं आपको प्रणाम नहीं कर पा रहा हूं। इन लोगों ने मुझे बांध दिया है।”" +
                " “अगर तुम यहां रहना चाहते हो, तो मेरी प्रजा की सेवा करनी पड़ेगी।” राजा ने भीड़ की ओर संकेत करते हुए कहा।" +
                " “मैं तैयार हूं, महाराज! लेकिन आपको मुझे इस बंधन से आजाद करना होगा।” गुलिवर तत्परतापूर्वक बोला। " +
                "“तुम मुझे दिखने में बुरे नहीं लगते।” राजा ने कहा। फिर उसने सिपाहियों को आदेश दिया, “इस जिंदा पहाड़ को आजाद कर दो।” " +
                "यह सुनकर गुलिवर को बहुत अच्छा लगा कि राजा ने उसे आजाद करने का हुक्म सुना दिया है। उसने मन-ही-मन में राजा को धन्यवाद दिया। " +
                "लिलीपुट के नागरिक उसे एक मंदिर के खंडहर में ले गए। यही एक जगह थी, जहां गुलिवर रह सकता था। उसी दिन से गुलिवर और बौने लोगों के बीच काफी गहरी दोस्ती हो गई। उन्होंने गुलिवर को भोजन और पानी दिया तथा उसके कपड़े सिलने के लिए माप लिया। जब गुलिवर के नए कपड़े सिलकर आए, तो यह पूरे राज्य के लिए जश्न का दिन बन गया। सभी बौने सड़क पर जमा हो गए। उन्होंने अपने हाथों से गुलिवर की पोशाक तैयार की थी। उनके पास इतना बड़ा कपड़ा नहीं था, इसलिए कपड़ों के कई टुकड़े जोड़कर वह पोशाक बनाई गई थी। गुलिवर उनका अनूठा प्यार देखकर भावुक हो उठा। " +
                "एक दिन राजा के महल में अचानक आग लग गई। " +
                "“बचाओ-बचाओ! महल में आग लग गई है। रानी महल में हैं, बचाओ!” चारों ओर भारी चीख-पुकार मची थी। लोग महल की ओर दौड़ रहे थे। यह आवाजें सुनकर गुलिवर रानी की मदद करने के लिए भागा।" +
                "शीघ्र ही गुलिवर महल में पहुंच गया। रानी के कक्ष में भीषण आग लगी थी। उसने आग बुझाकर रानी को तलाश किया। रानी भय के कारण बेहोश हो गई थी। गुलिवर ने रानी को उठाकर अपनी जेब में रख लिया और वहां से बाहर आ गया। थोड़ी ही देर बाद रानी को होश आ गया। सभी बौनों ने गुलिवर को धन्यवाद दिया। लिलीपुट का राजा गुलिवर का एहसानमंद हो गया। तभी अचानक तोप चलने की आवाज सुनाई दी। पड़ोसी देश ब्लूयूस ने अपने जहाज से लिलीपुट देश पर हमला कर दिया था। राजा ने अपने देश के नागरिकों का हौसला बढ़ाते हुए कहा, “लिलीपुट के वासियो! साहस रखो। हम सब मिलकर अपनी मातृभूमि की रक्षा करेंगे।” लेकिन वहां के लोग डर के मारे इधर-उधर भागने लगे।" +
                "ऐसी स्थिति में गुलिवर ने एक योजना बनाई। वह सीधे समुद्र में गया और दुश्मनों के जहाज उठाकर पलटने लगा। वह सारा दिन यही करता रहा। दुश्मन देश के काफी सैनिक मारे गए और बाकी डरकर भाग गए। यह सब देखकर बौने बहुत खुश हुए। अब गुलिवर उन सबका हीरो बन गया था। " +
                "राजा ने कहा, “मैं तुमसे बहुत खुश हूं। तुम जो जी चाहे, मांग लो।” " +
                "गुलिवर ने कुछ पल सोचने के बाद कहा, “महाराज, आप मेरे लिए एक बड़ा-सा जहाज बनवा दें, जिस पर सवार होकर मैं अपने देश जा सकूँ।” " +
                "लिलीपुट का राजा गुलिवर के कार्यों और व्यवहार से बहुत प्रसन्न था। वह उससे स्नेह करने लगा था। ऐसे में राजा यह नहीं चाहता था कि गुलिवर " +
                "लिलीपुट से अपने देश वापस जाए। फिर भी उसने अपने मन को काबू में रखकर गुलिवर की यह मांग पूरी कर दी। " +
                " गुलिवर को भी राजा से प्यार हो गया था, लेकिन अभी उसकी यात्रा अधूरी थी। उसे तो पूरी दुनिया देखनी थी। " +
                "फिर विदाई का समय आ गया। गुलिवर, लिलीपुट के राजा द्वारा बनवाए गए जहाज पर सवार होकर आगे चल दिया। " +
                "“अलविदा गुलिवर, हम तुम्हें कभी नहीं भूलेंगे।” सब लोगों ने कहा।" +
                "“अलविदा! आप सबको शुभकामनाएं। लिलीपुट अमर रहे।” गुलिवर ने जवाब दिया। गुलिवर जानता था कि वह भी लिलीपुट के वासियों को कभी नहीं भुला सकेगा। फिर वास्तव में वह लिलीपुट के बौनों को कभी नहीं भूल पाया। वह इस बारे में अपने मित्रों और सगे-संबंधियों से चर्चा करता रहा। लेकिन अन्य स्थानों की यात्रा में उसे ऐसा अनूठा अनुभव नहीं हुआ था। अन्य स्थानों की यात्राएं तो केवल रोमांचक थीं। ";

        String str5="बहुत साल पहले परसिआ के एक शहर में कालीन का एक व्यापारी रहता था। उसके २ बेटे थे कासिम और अलीबाबा। उसका व्यापार अच्छा चल रहा था लेकिन कुछ समय बाद उसकी मौत हो गयी जिसके बाद बड़े बेटे क़ासिम जो की लालची व्यक्ति था उसने सारे व्यापार पर कब्ज़ा कर लिया और अलीबाबा को घर निकाल दिया।" +
                "जिसके बाद अलीबाबा और उसकी बीवी दूसरी जगह जाकर रहने लगे और ग़रीबी में जीवन बिताने लगे। अलीबाबा जंगल में लकड़ियाँ काट कर बेचता था और अपनी बीवी और बच्चों का पालन पोषण करता था। यह सब ऐसा ही चल रहा था की एक दिन अलीबाबा जंगल में लकड़ियाँ काट रहा था तो उसने ४० घुड़सवार को जंगल में से गुजरते हुए देखा वह एक पेड़ के पीछे छिप कर यह सब देख रहा था।" +
                "उसने देखा उन सभी घुड़सवार के साथ एक पोटली थी और उनके पास खंजर भी था जिससे अलीबाबा समझ गया की यह सब चोर है। वह उन सभी को देख ही रहा था की वह सब ४० चोर एक छोटी पहाड़ी के सामने जाकर रुक गए। उन चोरों के सरदार ने पहाड़ी के सामने जाकर “खुल जा सिम सिम ” बोला जिसके बाद पहाड़ी में से एक खुफ़िया दरवाज़ा खुल गया और सारे चोर अंदर चले गए और वह दरवाजा बंद हो गया।" +
                "यह सब देख कर अलीबाबा बहुत हैरान हो गया। वह उस पहाड़ को ऐसे ही कुछ समय देख रहा था की वह ख़ुफ़िया दरवाजा फिर खुला और उसमे से चालीस चोर निकले। उनके सरदार ने पहाड़ी से कहा की “बंद हो जा सिम सिम”। जिसके बाद वह ख़ुफ़िया दरवाजा बंद हो गया और चालीस चोर वहाँ से चले गए।" +
                "अलीबाबा को बहुत जानने की इच्छा हुई की आख़िर उस दरवाज़े के अंदर क्या है। वह यह जानने के लिए उस पहाड़ के पास गया और जो चोरों के सरदार ने शब्द बोले थे वही बोलने लगा “खुल जा सिम सिम ” उसके यह बोलने के बाद दरवाजा फिर खुल गया और अलीबाबा गुफ़ा के अंदर चला गया।" +
                "गुफ़ा के अंदर अलीबाबा ने जाकर देखा की गुफ़ा में बहुत सा सोना, चांदी, हीरे, जवाहरात और सोने के सिक्कें रखे थे। वह यह सब देख कर बहुत खुश हो गया। उसको समझ आ गया था की सभी चोर अपनी चोरी और लूट का माल उस पहाड़ी की गुफा में छुपाते है।" +
                "उसने कुछ सोने के सिक्के एक पोटली में भरे और “बंद हो जा सिम सिम” बोलकर उस गुफ़ा का दरवाजा बंद करके वहाँ से चला आया। उसने यह सारी बात जाकर अपनी बीवी को बताई और वह सिक्के दिखाए। जिससे उसकी बीवी बहुत खुश हो गयी। अलीबाबा ने अपनी बीवी को सोने के सिक्के गिनने के लिए अपने बड़े भाई क़ासिम के घर जाकर तराजू लाने के लिए कहा और बोला की किसी को इस बारे में न बताएं।" +
                "अलीबाबा की बीवी तभी क़ासिम के घर गयी और उसकी बीवी से तराज़ू अनाज़ तोलने के लिए माँगा। क़ासिम की बीवी बहुत चालक औरत थी। उसको शक हुआ की इन गरीबों के पास इतना अनाज़ कहा से आया तब उसने तराज़ू के नीचे थोड़ा सा गोंद लगाकर उसको दे दिया। रात को अलीबाबा और उसकी बीवी ने सोने के सिक्के तोले और सुबह वह तराजू क़ासिम की बीवी को लौटा दिया।" +
                "क़ासिम की बीवी ने जब तराजू उल्टा करके देखा तो उसको एक सोने का सिक्का उसमें चिपका हुआ मिला। उसने यह बात अपने पति को बताई। यह बात सुन कर क़ासिम अपने भाई अलीबाबा के पास गया और उसको सहानुभूति दिखा कर उससे सारा राज़ जान लिया। अलीबाबा ने उसको सारी बात बताने के साथ दरवाजा खोलने के लिए ख़ुफ़िया शब्द “खुल जा सिम सिम” भी बता दिए।" +
                "क़ासिम यह सब जान कर अपने साथ कुछ खच्चर को लेकर उसी पहाड़ी के पास चला गया। उसने “खुल जा सिम सिम” बोला और दरवाज़ा खुल गया जिसके बाद वह उस उसके अंदर चला गया। उसने अंदर जाकर बहुत सारा खजाना देखा और उसने बहुत सारा ख़जाना भर लिया लेकिन जैसे ही वह उस गुफ़ा से निकलने के लिए वह ख़ुफ़िया शब्द बोलने लगा तो वह यह शब्द भूल चूका था।" +
                "जिससे वह उस गुफ़ा में ही बंद हो गया और कुछ देर बाद ४० चोर आये और दरवाजा खोलकर अंदर आये तो उन्हें क़ासिम मिला। उनको पता चल चूका था की वह उनका ख़जाना लेने आया है तो उनने क़ासिम को मार दिया और उसकी लाश को वही छोड़ कर चले गए।" +
                "जब बहुत देर तक क़ासिम नहीं आया तो क़ासिम की बीवी अलीबाबा के घर गयी और सारी बात बताई। तब अलीबाबा उसको ढूंढने के लिए गुफ़ा के अंदर गया तो उसको क़ासिम की लाश मिली जिससे वह बहुत दुःखी हुआ और उसकी लाश को अपने साथ खच्चर पर लाद कर ले आया।" +
                "उनने यह बात किसी और को न पता चले इसके लिए क़ासिम की मौत बीमारी से हुई यह बहाना बनाया। क़ासिम की याद में कुछ समय बाद उसकी बीवी भी मर गयी।" +
                "जब ४० चोर गुफ़ा में लौटे तो वहाँ पर क़ासिम की लाश को वहाँ पर न देखकर यह समझ गए की इस गुफा के बारे में किसी और को भी पता चल चूका है। उनके सरदार ने शहर में जाकर पता लगाने के लिए कहा की जिसकी भी मौत अभी हुई है उस घर का पता लगाए। जिसके बाद एक चोर ने शहर जाकर पता किया तो उसको अलीबाबा के घर के बारे में पता चला।" +
                "जिससे वह उस घर के दरवाज़े पर एक क्रॉस का निशान बनाकर चला गया। जिससे सुबह उस घर की पहचान करके उस घर के सभी सदस्यों को मार सके। जब अलीबाबा की बीवी ने अपने दरवाजे पर क्रॉस का निशान देखा तो वह समझ गयी की कुछ तो गड़बड़ है और अपने आस पास के सभी घरों में वहीं निशान बना दिए। जिसके बाद सुबह जब सरदार बाकी चोरों के साथ आया तो बहुत से घर में वह निशान बना देख कर परेशान हो गया और चला गया।" +
                "वह बाद में फिर आया और अबकी बार वह उस घर को  सही से पहचान करके चला गया। वह रात को एक तेल का व्यापारी बनकर आया और उसने ४० पीपों में अपने सभी चोरों को छुपा दिया और 1 पीपे में दिखाने के लिए तेल डाल दिया। वह इन सब पीपों को खच्चर पर लादकर अलीबाबा के घर चला गया। उसने अलीबाबा को खुद को तेल का व्यापारी बता कर रात में रुकने की जगह मांगी और तेल का भरा हुआ एक पीपा भी दिखाया।" +
                "अलीबाबा ने उसको तेल का व्यापारी जानकर उसके रात में रुकने की बात मान ली और उसको खाना भी खिलाया। लेकिन अलीबाबा की बीवी को उस पर शक हुआ तो उसने उसके पीपों को चेक किया और उसको थोड़ा ठकठका कर देखा तो उन सभी में से चोरों की आवाज़ आयी। तब अलीबाबा की बीवी ने तेल का भरा हुआ पीपे में से तेल लिया और उसको अच्छे से गर्म करके उन सभी चालीस चोर वाले पीपों में डाल दिया जिससे उन सभी चोरों की मौत हो गयी।" +
                "जब उनके सरदार ने रात में आकर अपने चोरों को बाहर निकलने की आवाज़ दी तो कोई आवाज़ नहीं आयी जिससे उसने पीपा खोलकर देखा तो सब चोर मरे हुए थे यह देख कर वह बहुत डर गया की अलीबाबा उसको भी न मार डाले इसी डर के मारे वह वहाँ से भाग गया और बहुत दूर चला गया।" +
                "सुबह अलीबाबा की बीवी ने सारी बात अलीबाबा को बतायी। अब उचालीस चोर के सब ख़जाने का मालिक केवल अलीबाबा ही था और जिससे वह बहुत अमीर हो गया और खुशी खुशी अपने बीबी और बच्चों के साथ रहने लगा।  " +
                "कहानी से सीख  – इस कहानी से हमें यह सीख़ मिलती है की हमें कभी भी लालच नहीं करना चाहिए जिस तरह क़ासिम एक लालची व्यक्ति था जिसने अपने भाई से व्यापार छीन लिया और ख़जाने के बारे में पता चलने पर अकेला ही सारा खजाना लेने चला गया।";

        //-----------------------------------------------------------------------

        String video२="https://api.vadoo.tv/landing_page?vid=xKEHANwa58z6DOwxqc60GZI0T9QnpkoS";
        String video3="https://api.vadoo.tv/landing_page?vid=O0cTWrUJmkxlFnt8q6mKSPnlQYq9lsoW";
        String video4="https://api.vadoo.tv/landing_page?vid=uDYXi06LC9na7fRuOi8QWHSk7rnu5pxK";
        String video5="https://api.vadoo.tv/landing_page?vid=aaVJ6FkfvD0vaBBImMxwYRgmJrqn9f1G";


        //-----------------------------------------------------------------------

        arrayList.add(new SpecificStoriesModel("हरक्यूलिस और सुनहरा सेब",R.drawable.hercules,str२,video२));
        arrayList.add(new SpecificStoriesModel("किंटारो द गोल्डन बॉय",R.drawable.kintaro,str3,video3));
        arrayList.add(new SpecificStoriesModel("गुलीवर की यात्रा",R.drawable.guliwar,str4,video4));
        arrayList.add(new SpecificStoriesModel("अलीबाबा और चालिस चोर",R.drawable.alibaba,str5,video5));

        SpecificSoriesAdapter specificSoriesAdapter = new SpecificSoriesAdapter(arrayList,this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        binding.adventureRecyclerView.setLayoutManager(linearLayoutManager);
        binding.adventureRecyclerView.setAdapter(specificSoriesAdapter);

    }
}
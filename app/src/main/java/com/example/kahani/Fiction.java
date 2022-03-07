package com.example.kahani;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.kahani.Adapters.SpecificSoriesAdapter;
import com.example.kahani.Models.SpecificStoriesModel;
import com.example.kahani.databinding.ActivityFictionBinding;

import java.util.ArrayList;

public class Fiction extends AppCompatActivity
{
    ActivityFictionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFictionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        ArrayList<SpecificStoriesModel> arrayList = new ArrayList<>();

        String str1="चार मित्र खरगोश, बंदर, सियार और उदबिलाव गंगा के तट पर स्थित वन में निवास करते थे. उन सबकी की मंशा थी कि वे दानवीर बनकर पुण्य प्राप्त करें. एक दिन चारों में दान के संबंध में चर्चा चली और उन्होंने निर्णय लिया कि वे सब उपोसथ के दिन परम-दान करेंगे. उपोसथ बौद्ध धर्म के धार्मिक महोत्सव का दिन है. बौद्ध धर्म की मान्यता अनुसार इस पावन दिवस पर दान करने से दान का संपूर्ण फल प्राप्त होता है.उपोसथ के दिन भोर होते ही चारों मित्र भोजन की तलाश में वन में निकल गए. बंदर एक पेड़ से दूसरे पेड़ पर उछलता-कूदता मीठे फलों की खोज में था. एक पेड़ रसीले आम से लदा हुआ था. उनमें से कुछ आम तोड़ वह अपने घर लौट आया. सियार पास के गाँव में जाकर वहाँ एक घर से दही की हांडी और मांस का एक टुकड़ा चुरा लाया. उदबिलाव को अधिक दूर नहीं जाना पड़ा, उसे गंगा के तट पर सात लोहित मछलियाँ मिल गई और वह उन्हें लेकर ख़ुशी-ख़ुशी अपने घर लौट आया.उधर वन में निकला खरगोश सोचने लगा कि वह भोजन के रूप में ग्रहण करने वाले घास-पात को अपने याचक को दान में देने का कोई अर्थ नहीं. दान का संपूर्ण फल प्राप्त करने के लिए स्वयं को ही दान करना उचित होगा. इसलिए वह खाली हाथ ही घर लौट आयाद्र ने याचक का वेश धारण किया और एक-एक कर चारों के घर पहुँचे. सबसे पहले वे सियार के घर पहुँचे, सियार ने उन्हें दही हांड़ी और मांस दान में चढ़ाया. किंतु वे उसे ग्रहण किये बिना उदबिलाव के घर आ गए. उदबिलाव ने उन्हें लोहित मछलियाँ दान स्वरुप चढ़ाई. किंतु, उन्होंने वह दान भी ग्रहण नहीं किया. बंदर के घर जाने पर बंदर ने उन्हें रसीले आम दान में देने चाहे, किंतु उन्होंने वह दान अस्वीकार कर दिया. अंत में वे खरगोश के घर पहुँचे. खरगोश याचक को देख बोला, “आदरणीय, दान में मैं स्वयं को अर्पित करता हूँ. कृपया मेरा दान स्वीकार करें.” खरगोश द्वारा स्वयं को दान करने के निर्णय ने तीनों लोकों को हिलाकर रख दिया. सक्क अर्थात् इंद्र का सिंहासन डोलने लगा. अंततः इंद्र ने उन चारों मित्रों की दानपरायणता की परीक्षा लेने स्वयं उनके घर जाने का निर्णय लिया.उसके बाद उसने एक अंगीठी जलाई. फिर अपने शरीर के रोओं को तीन बार झटका, ताकि रोओं के जीव निकल जाएं और उन्हें उसके साथ आग में न जलना पड़े. उसके बाद वो अंगीठी में कूद गया.इंद्र ने किसी जीव की ऐसी दानवीरता कभी नहीं देखी थी. वह चकित रह गए. वे समझ गए कि खरगोश सच्चा दानवीर है. आग में कूदा खरगोश अपने प्राण निकलने की प्रतीक्षा कर रहा था. किंतु, इंद्र की माया से वह अग्नि उसे जला नहीं पाई.इंद्र ने खरगोश का प्रशस्ति गान किया और चाँद के एक पर्वत को मसलकर उससे चाँद पर एक निशान बना दिया. वे खरगोश से बोले, “मैं तुम्हारी दान वीरता से अत्यंत प्रसन्न हूँ. जब तक चाँद पर निशान रहेगा, तुम्हारा नाम अमर रहेगा, और तुम्हारी दानवीरता स्मरण की जायेगी.”";
        String str2="एक जंगल में एक मनमौजी खरगोश रहता था. वह दिन भर जंगल में कूदता-फांदता, खेलता और दौड़ता रहता था. वह इतना तेज दौड़ता था कि जंगल का कोई भी जानवर उसकी बराबरी नहीं कर पाता था. इस बात पर उसे बड़ा घमंड था.वह अक्सर जंगल के जानवरों को अपने साथ दौड़ लगाने की चुनौती देता और उन्हें हराकर बहुत खुश होता था. धीरे-धीरे उसका घमंड उसके सिर चढ़कर बोलने लगा. वह जिस भी जानवर को दौड़ में हराता, उस पर ख़ूब हँसता और उसका खूब मज़ाक उड़ाता था. जंगल के जानवरों को खरगोश का ये व्यवहार बहुत बुरा लगता था, वे उससे कुछ कहते, तो वह बोलता, “पहले मुझे दौड़ में हराकर दिखाओ, फिर कुछ कहना.”एक दिन खरगोश ने एक कछुए को देखा, जो अपनी धीमी चाल में कहीं जा रहा था. उसे देख वह ज़ोर-ज़ोर से हँसने लगा.उसे हँसता देख कछुए ने पूछा, “खरगोश भाई, क्यों हँस रहे हो?”खरगोश बोला, “तुम्हें देखकर हँस रहा हूँ. तुम कितने सुस्त हो और तुम्हारी चाल तुमसे भी सुस्त. मुझे देखो, मुझ जैसा तेज दौड़ने वाला कोई जानवर इस जंगल में नहीं.”“तुम्हें खुद पर इतना घमंड नहीं करना चाहिए. हर किसी का घमंड कभी ना कभी टूट जाता है. तुम्हारा भी टूट जाएगा.” कछुआ उसे समझाते हुए बोला.“इस जंगल में मैं सबसे तेज दौड़ने वाला जानवर हूँ, तो मुझे इस बात का घमंड क्यों ना हो? और कौन मेरा घमंड तोड़ेगा, तुम?” खरगोश बोला.“हाँ मैं, मैं तुम्हारा घमंड तोडूंगा.” कछुए के कह दिया.“ऐसी बात है, तो इस कल मेरे साथ दौड़ लगाओ. देखें कौन जीतता है?” खरगोश कछुए को चुनौती देता हुआ बोला.कछुए ने उसकी चुनौती स्वीकार कर ली. अगले दिन सुबह दोनों के बीच दौड़ की प्रतियोगिता रखी गई. जंगल के सारे जानवर दौड़ देखने आये. सबको पता था कि खरगोश ही दौड़ जीतेगा, लेकिन फिर भी सबमें उत्सुकता बनी हुई थी.कछुए और खरगोश को जंगल की नदी तक दौड़ लगाना था. दोनों दौड़ के लिए तैयार हो गए. रेफ़री बंदर ने सीटी बजाई और दोनों दौड़ने लगे. कछुए ने एक कदम बढ़ाया, वहीं खरगोश इतनी तेज दौड़ा कि सबके नज़रों से ओझल हो गया.खरगोश तेजी से दौड़ता जा रहा था, वहीँ कछुआ धीमी चाल से आगे बढ़ता जा रहा था. नदी के काफ़ी पास पहुँच जाने पर खरगोश ने यह जानने के लिए पलटकर देखा कि कछुआ कहाँ तक पहुँचा है. उसे कछुआ दूर-दूर तक नज़र नहीं आया.हँसते हुए वह सोचने लगा कि इस कछुए को नदी तक पहुँचने में तो शाम हो जायेगी. ऐसा करता हूँ, कुछ देर सुस्ता लेता हूँ.वह एक पेड़ के नीचे सुस्ताने करने लगा. कब उसकी आँख लग गई, उसे पता ही नहीं चलाऔर वह गहरी नींद में सो गया.उधर कछुआ धीरे-धीरे आगे बढ़ता गया. कई जानवरों ने उसे समझाया कि खरगोश तो बहुत आगे पहुँच चुका है, अब दौड़ने का कोई फायदा नहीं. लेकिन कछुआ नहीं माना. वह बोला, “जब चुनौती ली है, तो मैं पूरी कोशिश करूंगा.”  कछुआ आगे बढ़ता-बढ़ता उसी पेड़ के पास से गुज़रा, जहाँ खरगोश खर्राटे मारकर सो रहा था. उसे देख कछुआ मुस्कुराया और आगे बढ़ गया. वह बिना रुके लगातार आगे बढ़ता रहा और नदी तक पहुँच गया. कछुआ दौड़ जीत चुका था और खरगोश अब तक सो रहा था. सब जानवर कछुए की जीत पर खुश थे, वे उसे बधाई देने लगे, उसके लिए ज़ोर-ज़ोर ताली बजाने लगे.ताली की आवाज़ जब खरगोश के कानों में पड़ी, तब उसकी नींद टूटी. वह भागता हुआ नदी के पास पहुँचा. देखा, कछुए वहाँ पहले ही पहुँच चुका है. वह पछताने लगा. उसका घमंड टूट गया था. उसने प्रण किया कि वह कभी घमंड नहीं करेगा, कभी किसी का मज़ाक नहीं उड़ाएगा और कोई काम शुरू करने के बाद उसे पूरा किये बगैर नहीं रुकेगा.कछुआ और खरगोश की कहानी की शिक्षा कभी घमंड मत करो, घमंड कभी न कभी ज़रूर टूटता है.\n";
        String str3="तपती दोपहरी में प्यास से बेहाल एक छोटी सी चींटी पानी की तलाश में भटक रही थी. बहुत देर भटकने के बाद उसे एक नदी दिखाई पड़ी और वो ख़ुश होकर नदी की ओर बढ़ने लगी. नदी के किनारे पहुँचकर जब उसने कल-कल बहता शीतल जल देखा, तो उसकी प्यास और बढ़ गई.वह सीधे नदी में नहीं जा सकती थी. इसलिए किनारे पड़े एक पत्थर पर चढ़कर पानी पीने का प्रयास करने लगी. लेकिन इस प्रयास में वह अपना संतुलन खो बैठी और नदी में गिर पड़ी.नदी के पानी में गिरते ही वह तेज धार में बहने लगी. उसे अपनी मृत्यु सामने दिखाई देने लगी. तभी कहीं से एक पत्ता उसके सामने आकर गिरा. किसी तरह वह उस पत्ते पर चढ़ गई. वह पत्ता नदी किनारे स्थित एक पेड़ पर बैठे कबूतर ने फेंका था, जिसने चींटी को पानी में गिरते हुए देख लिया था और उसके प्राण बचाना चाहता था.पत्ते से साथ बहते हुए चींटी किनारे पर आ गई और कूदकर सूखी भूमि पर पहुँच गई. कबूतर के निःस्वार्थ भाव से की गई सहायता के कारण चींटी की जान बच पाई थी. वह मन ही मन उसका धन्यवाद करने लगी.इस घटना को कुछ ही दिन बीते थे कि एक दिन कबूतर बहेलिये के द्वारा बिछाये जाल में फंस गया. उसने वहाँ से निकलने के लिए बहुत पंख फड़फड़ाये, बहुत ज़ोर लगाया, लेकिनजाल से निकलने में सफ़ल न हो सका. बहेलिये ने जाल उठाया और अपने घर की ओर जाने लगा. कबूतर निःसहाय सा जाल के भीतर कैद था.जब चींटी की दृष्टि जाल में फंसे कबूतर पर पड़ी, तो उसे वह दिन स्मरण हो आया, जब कबूतर ने उसके प्राणों की रक्षा की थी. चींटी तुरंत बहेलिये के पास पहुँची और उसके पैर पर ज़ोर-ज़ोर से काटने लगी. बहेलिया दर्द से छटपटाने लगा. जाल पर से उसकी पकड़ ढीली पड़ गई और जाल जमीन पर जा गिरा.कबूतर को जाल से निकलने का अवसर प्राप्त हो चुका था. वह झटपट जाल से निकला और उड़ गया. इस तरह चींटी ने कबूतर के द्वारा किये गये उपकार का फ़ल चुकाया.सीख कर भला, हो भला. दूसरों पर किया गया उपकार कभी व्यर्थ नहीं जाता. उसका प्रतिफल कभी न कभी अवश्य प्राप्त होता है. इसलिए सदा निःस्वार्थ भाव से दूसरों की सहायता करना चाहिए.\n";
        String str4="एक जंगल में एक हाथी रहता था। वह बड़ा दयालु था। मुसीबत के समय वह सदा सबकी सहायता किया करता था। उसके इस स्वभाव है कारण जंगल के सभी जानवर उससे बहुत प्रेम करते थे।एक दिन हाथी को प्यास लगी और वह पानी पीने नदी पर गया। वहाँ उसने देखा कि नदी के किनारे एक बड़े से पत्थर के नीचे एक मगरमच्छ दबा हुआ है और दर्द से कराह रहा है।हाथी ने उससे पूछा, “मगरमच्छ भाई! ये क्या हो गया? तुम इस पत्थर के नीचे कैसे दब गये?”मगरमच्छ ने कराहते हुए उत्तर दिया, “क्या बताऊं हाथी दादा! मैं खाना खाकर नदी किनारे आराम कर रहा था। जाने कैसे उस बड़ी चट्टान का ये टुकड़ा टूटकर मुझ पर आ गिरा। बहुत दर्द हो रहा है। मेरी मदद करो। इस पत्थर को हटा दो। मैं ज़िन्दगी भर तुम्हारा अहसानमंद रहूंगा।”हाथी को उस पर दया आ गई। लेकिन उसे डर भी था कि कहीं मगरमच्छ उस पर हमला न कर दे। इसलिए उसने पूछा, “देखो मगरमच्छ भाई! मैं तुम्हारी मदद तो कर दूं, लेकिन वादा करो कि तुम मुझ पर हमला नहीं करोगे।”“मैं वादा करता हूँ।” मगरमच्छ बोला।हाथी मगरमच्छ के पास गया और उसकी पीठ से भारी पत्थर हटा दिया। लेकिन पत्थर के हटते ही धूर्त मगरमच्छ ने हाथी का पैर अपने जबड़े में दबा लिया।हाथी कराह उठा और बोला, “ये क्या मगरमच्छ भाई? ये तो धोखा है। तुमने तो वादा किया था।”लेकिन मगरमच्छ ने हाथी का पैर नहीं छोड़ा। हाथी दर्द से चीखने लगा। कुछ ही दूर पर एक पेड़ के नीचे एक भालू आराम कर रहा था। उसने हाथी की चीख सुनी, तो नदी किनारे आया।हाथी को उस हालत में देख उसने पूछा, “ये क्या हुआ हाथी भाई?”“इस धूर्त मगरमच्छ की मैंने सहायता की और इसने मुझ पर ही हमला कर दिया। मुझे बचाओ।” हाथी ने कराहते हुए मगमच्छ के पत्थर के नीचे दबे होने की सारी कहानी सुना दी।“क्या कहा? ये मगरमच्छ पत्थर के नीचे दबा था और फिर भी ज़िन्दा था। मैं नहीं मानता।” भालू बोला।“ऐसा ही था।” मगरमच्छ गुर्राया और अपनी पकड़ हाथी के पैरों पर मजबूत कर दी।“हो नहीं सकता!” भालू फिर से बोला।“ऐसा ही था भालू भाई!” हाथी बोला।“बिना देखे तो मैं नहीं मानने वाला। मुझे दिखाओ तो ज़रा कि ये मगरमच्छ कैसे उस पत्थर के नीचे दबा था और उसके बाद भी ज़िन्दा था। हाथी भाई ज़रा इस मगरमच्छ की पीठ पर वो पत्थर तो रख देना। फिर उसे हटाकर दिखाना।” भालू बोला।मगरमच्छ भी तैयार हो गया। वह हाथी का पैर छोड़कर नदी के किनारे चला गया। हाथी ने वह भारी पत्थर उसके ऊपर रख दिया।मगरमच्छ भालू से बोला, “ये देखो! ं ऐसे इस पत्थर के नीचे दबा था। अब यकीन आया तुम्हें। इसके बाद हाथी ने आकर पत्थर हटाया था। चलो हाथी अब पत्थर हटा दो।” मगरमच्छ बोला।“नहीं हाथी भाई! ये मगरमच्छ मदद के काबिल नहीं है। इसे ऐसे ही पड़े रहने दो। आओ हम चले।” भालू बोला।इसके बाद हाथी और भालू वहाँ से चले गए। मगरमच्छ वहीं पत्थर के नीचे दबा रहा। उसकी धूर्तता का फल उसे मिल चुका था। सीख हमें हमेशा सहायता करने वाले के प्रति कृतज्ञ रहना चाहिए बुद्धिमानी से किसी भी मुसीबतसे निकला जा सकता है।\n";
        String str5="एक जंगल में एक लोमड़ी रहती थी. एक दिन वह भूखी-प्यासी भोजन की तलाश में जंगल में भटक रही थी. भटकते-भटकते सुबह से शाम हो गई, लेकिन वह शिकार प्राप्त न कर सकी. शाम होते-होते वह जंगल के समीप स्थित एक गाँव में पहुँच गई. वहाँ उसे एक खेत दिखाई पड़ा. भूख से बेहाल लोमड़ी खेत में घुस गई. वहाँ एक ऊँचे पेड़ पर अंगूर की बेल लिपटी हुई थी, जिसमें रसीले अंगूर के गुच्छे लगे हुए थे.अंगूर देखते ही लोमड़ी के मुँह से लार टपकने लगी. वह उन रस भरे अंगूरों को खाकर तृप्त हो जाना चाहती थी. उसने अंगूर के एक गुच्छे पर अपनी दृष्टि जमाई और जोर से उछली. ऊँची डाली पर लिपटी अंगूर की बेल पर लटका अंगूर का गुच्छा उसकी पहुँच के बाहर था. उसका प्रयास व्यर्थ रहा.उसने सोचा क्यों न एक प्रयास और किया जाए. इस बार वह थोड़ा और ज़ोर लगाकर उछली. लेकिन इस बार भी अंगूर तक पहुँचने में नाकाम रही. कुछ देर तक वह उछल-उछल कर अंगूर तक पहुँचने का प्रयास करती रही. लेकिन दिन भर की जंगल में भटकी थकी हुई भूखी-प्यासी लोमड़ी आखिर कितना प्रयास करती?वह थककर पेड़ के नीचे बैठ गई और ललचाई नज़रों से अंगूर को देखने लगी. वह समझ कई कि अंगूर तक पहुँचना उसने बस के बाहर है. इसलिए छ देर अंगूरों को ताकने के बाद वह उठी और वहाँ से जाने लगी.वह अंगूर खाने का विचार त्याग चुकी थी. पास ही एक पेड़ पर बैठा बंदर उसे बहुत देर से देख रहा था. उसे जाते हुए देख वह खुद को रोक नहीं पाया और पूछ बैठा, “क्या हुआ लोमड़ी बहन? वापस क्यों जा रही हो? अंगूर नहीं खाओगी?”लोमड़ी रुकी और बंदर को देखकर फीकी मुस्कान से साथ बोली, “नहीं बंदर भाई. मैं ऐसे अंगूर नहीं खाती. ये तो खट्टे हैं.”सीख जब हम किसी चीज़ को प्राप्त नहीं कर पाते, तो अपनी कमजोरियाँ को छुपाने या अपने प्रयासों की कमी को नज़रंदाज़ करने अक्सर उस चीज़ में ही कमियाँ निकालने लग जाते हैं. जबकि आवश्यकता है, अपनी कमजोरियों को पहचान कर उसे दूर करने की, सूझ-बूझ से काम लेने की और सफ़ल होने तक अनवरत प्रयत्न करते रहने की. दूसरों पर दोष मढ़ने से जीवन में कुछ हासिल नहीं होता. हासिल होता है : कड़े परिश्रम और प्रयासों से.\n";

        String video1="https://api.vadoo.tv/landing_page?vid=cqTS8BC35re5dJAIfaELXJsYVreKYLWC";
        String video2="https://api.vadoo.tv/landing_page?vid=7v8Y471LdPjhqsfSVI0PnVsE1UWLTbL6";
        String video3="https://api.vadoo.tv/landing_page?vid=tT3CUEXCNjGqiEaAU11JV7BYexJz3sod";
        String video4="https://api.vadoo.tv/landing_page?vid=QwFBSI6goH7k6XBOqgxVeoJ6c4udgHvc";
        String video5="https://api.vadoo.tv/landing_page?vid=ciu6GRoKezU6eAPfUcdKrIqAjSbbOrE9";

        arrayList.add(new SpecificStoriesModel("चाँद पर खरगोश",R.drawable.moon,str1,video1));
        arrayList.add(new SpecificStoriesModel("कछुआ और खरगोश",R.drawable.sasa,str2,video2));
        arrayList.add(new SpecificStoriesModel("चींटी और कबूतर",R.drawable.ant,str3,video3));
        arrayList.add(new SpecificStoriesModel("हाथी और भालू",R.drawable.hatti,str4,video4));
        arrayList.add(new SpecificStoriesModel("लोमड़ी और अंगूर",R.drawable.angoor,str5,video5));

        SpecificSoriesAdapter specificSoriesAdapter = new SpecificSoriesAdapter(arrayList,this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        binding.fictionRecyclerView.setLayoutManager(linearLayoutManager);
        binding.fictionRecyclerView.setAdapter(specificSoriesAdapter);

    }
}
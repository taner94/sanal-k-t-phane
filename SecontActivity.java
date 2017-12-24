package com.example.yldrm.myapplication;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;


public class SecontActivity extends AppCompatActivity {

    TextToSpeech tts;
    TextView mTextView;
    Button mButton;

    String data="";
    StringBuffer sbuffer = new StringBuffer();
    InputStream is ;
    BufferedReader reader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secont2);
        mButton = (Button) findViewById(R.id.button);
        mTextView = (TextView) findViewById(R.id.text_view);


        mTextView.setMovementMethod(new ScrollingMovementMethod());
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            //9 AAAAAAAAAAAAA
            if(bundle.getString("BookName").toString().equalsIgnoreCase("6 Kogus - Anton Cehov")){
                is =this.getResources().openRawResource(R.raw.a1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("80 Günde Devr-i Alem - Jules Verne")){
                is =this.getResources().openRawResource(R.raw.a2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("90 Dakikada NIETZSCHE - Paul Strathern")){
                is =this.getResources().openRawResource(R.raw.a3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("1984 - George Orwell")){
                is =this.getResources().openRawResource(R.raw.a4);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Aclik Oyunlari - Suzanne Collins")){
                is =this.getResources().openRawResource(R.raw.a5);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Aforizmalar - Franz Kafka")){
                is =this.getResources().openRawResource(R.raw.a6);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Amcanin Ruyasi - Dostoyevski")){
                is =this.getResources().openRawResource(R.raw.a7);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Ana - Maksim Gorki")){
                is =this.getResources().openRawResource(R.raw.a8);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Aylak Adam - Yusuf Atılgan")){
                is =this.getResources().openRawResource(R.raw.a9);
            }
            //6 BBBBBBBBB
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Baskasinin Karisi - Dostoyevski")){
                is =this.getResources().openRawResource(R.raw.b1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Beyaz Gemi - Cengiz Aytmatov")){
                is =this.getResources().openRawResource(R.raw.b2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Bir Aşk Sayfası - Emile Zola")){
                is =this.getResources().openRawResource(R.raw.b3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Bir Delinin Hatira Defteri - Nikolay Vasilyevic Gogol")){
                is =this.getResources().openRawResource(R.raw.b4);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Candide - Voltaire")){
                is =this.getResources().openRawResource(R.raw.c1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Cemile - Cengiz Aytmatov")){
                is =this.getResources().openRawResource(R.raw.c2);
            }
            //14 DDDDDDDDDDDDDDD
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Dava - Franz Kafka")){
                is =this.getResources().openRawResource(R.raw.d1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Degirmenimden Mektuplar - Alphonse Daudet")){
                is =this.getResources().openRawResource(R.raw.d2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Deliler Mezarlığı - Ray Bradbury")){
                is =this.getResources().openRawResource(R.raw.d3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Deliligin Daglarinda - H. P. Lovercraft")){
                is =this.getResources().openRawResource(R.raw.d4);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Delilik - Charles Bukowski")){
                is =this.getResources().openRawResource(R.raw.d5);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Denemeler - Montaigne")){
                is =this.getResources().openRawResource(R.raw.d6);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Devlet - Platon")){
                is =this.getResources().openRawResource(R.raw.d7);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Devlet ve Devrim - Vladimir Ilyic Lenin")){
                is =this.getResources().openRawResource(R.raw.d8);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Dogudaki Hayelet - Pierre Loti")){
                is =this.getResources().openRawResource(R.raw.d9);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Doğu Ekspresinde Cinayet - Agatha Christie")){
                is =this.getResources().openRawResource(R.raw.d10);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Dokuz Kehanet - James Redfield")){
                is =this.getResources().openRawResource(R.raw.d11);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Don Kisot - Cervantes Saavedra")){
                is =this.getResources().openRawResource(R.raw.d12);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Donusum - Franz Kafka")){
                is =this.getResources().openRawResource(R.raw.d13);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Dövüş Kulübü - Chuck Palahniuk")){
                is =this.getResources().openRawResource(R.raw.d14);
            }
            //3 FFFFFFFFFFFFFFFFFFF
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Fahrenheit 451 - Ray Bradbury")){
                is =this.getResources().openRawResource(R.raw.f1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Fareler ve İnsanlar - John Steinbeck")){
                is =this.getResources().openRawResource(R.raw.f2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Faust - Goethe")){
                is =this.getResources().openRawResource(R.raw.f3);
            }
            //3 GGGGGGGGGGG
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Garih Öldüren Sır - Abdullah Muradoğlu")){
                is =this.getResources().openRawResource(R.raw.g1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Genc Wertherin Acilari - Johann Wolfgang Goethe")){
                is =this.getResources().openRawResource(R.raw.g2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Göz - Stephen King")){
                is =this.getResources().openRawResource(R.raw.g3);
            }
            //5 HHHHHHHHHHHHHHHHHHHHHHH
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Hastalık Hastası - Moliere")){
                is =this.getResources().openRawResource(R.raw.h1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Hayvan Çiftliği - George Orwell")){
                is =this.getResources().openRawResource(R.raw.h2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Hikayeler I - Turgenyev")){
                is =this.getResources().openRawResource(R.raw.h3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Hikayeler II - Turgenyev")){
                is =this.getResources().openRawResource(R.raw.h4);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Hikayeler III - Turgenyev")){
                is =this.getResources().openRawResource(R.raw.h5);
            }
            //1 IIIIIIIIIIIIIIIII
            if(bundle.getString("BookName").toString().equalsIgnoreCase("İçimizdeki Şeytan - Sabahattin Ali")){
                is =this.getResources().openRawResource(R.raw.i1);
            }
            //13 KKKKKKKKKKKKKKKK
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kar Tatili - Emmanuel Carrere")){
                is =this.getResources().openRawResource(R.raw.k1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Karanlikta Sabah Kuslari - Ahmet Altan")){
                is =this.getResources().openRawResource(R.raw.k2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kin ve Sevgi - Solohov")){
                is =this.getResources().openRawResource(R.raw.k3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kiralik Konak - Yakup Kadri Karaosmanoglu")){
                is =this.getResources().openRawResource(R.raw.k4);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kitabi Ask - Iskender Pala")){
                is =this.getResources().openRawResource(R.raw.k5);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kiz Kulesi ndeki Kizilderili - Sunay Akin")){
                is =this.getResources().openRawResource(R.raw.k6);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Knulp - Hermann Hesse")){
                is =this.getResources().openRawResource(R.raw.k7);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Korkunc Bir Gece - Anton Cehov")){
                is =this.getResources().openRawResource(R.raw.k8);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Korluk - Jose Saramago")){
                is =this.getResources().openRawResource(R.raw.k9);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Koyluler - Anton Cehov")){
                is =this.getResources().openRawResource(R.raw.k10);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kucuk Tragedyalar - Aleksandr Puskin")){
                is =this.getResources().openRawResource(R.raw.k11);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kumarbaz - Dostoyevski")){
                is =this.getResources().openRawResource(R.raw.k12);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Kurk Mantolu Madonna - Sabahattin Ali")){
                is =this.getResources().openRawResource(R.raw.k13);
            }
            //4 MMMMMMMMMMMMMMMMMMMMM
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Madame Bovary - Gustave Flaubert")){
                is =this.getResources().openRawResource(R.raw.m1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Matrix ve Felsefe - William Irwin")){
                is =this.getResources().openRawResource(R.raw.m2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Mavi Oktav Defterleri - Franz Kafka")){
                is =this.getResources().openRawResource(R.raw.m3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Melekler ve Seytanlar - Dan Brown")){
                is =this.getResources().openRawResource(R.raw.m4);
            }
            //1 NNNNNNNNNNNNNNNNNN
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Nietzsche ve Felsefe - Deleuze")){
                is =this.getResources().openRawResource(R.raw.n1);
            }
            //4 OOOOOOOOOOOOOOOOOO
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Olu Ozanlar Dernegi - N. H. Kleinbaum")){
                is =this.getResources().openRawResource(R.raw.o3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Oteki - Dostoyevski")){
                is =this.getResources().openRawResource(R.raw.o2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Otorite - Richard Sennett")){
                is =this.getResources().openRawResource(R.raw.o3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Otuz Bes Yas - Cahit Sitki Taranci")){
                is =this.getResources().openRawResource(R.raw.o4);
            }
            //2 RRRRRRRRRRRRRRRRRR
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Riza Beyin Polisiye Oykuleri - Cetin Altan")){
                is =this.getResources().openRawResource(R.raw.r1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Robinson Crouse - Daniel Defoe")){
                is =this.getResources().openRawResource(R.raw.r2);
            }
            //15 SSSSSSSSSSSSSSSSS
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Saatleri Ayarlama Enstitüsü - Ahmet Hamdi Tanpınar")){
                is =this.getResources().openRawResource(R.raw.s1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Sakin Yatagin Altina Bakma - Millas")){
                is =this.getResources().openRawResource(R.raw.s2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Sari Benizli Adam - Abdullah Ziya Kozanoglu")){
                is =this.getResources().openRawResource(R.raw.s3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Satranc ve Sovalye - Erol Celik")){
                is =this.getResources().openRawResource(R.raw.s4);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Savas Sanati - Sun Tzu")){
                is =this.getResources().openRawResource(R.raw.s5);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Savci Bey - Abdullah Ziya Kozanoglu")){
                is =this.getResources().openRawResource(R.raw.s6);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Secme Oykuler - Guy De Maupassant")){
                is =this.getResources().openRawResource(R.raw.s7);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Sefiller - Victor Hugo")){
                is =this.getResources().openRawResource(R.raw.s8);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Seker Portakali - Jose Mauro De Vasconcelos")){
                is =this.getResources().openRawResource(R.raw.s9);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Sezar Ve Kleopatra - Bernard Shaw")){
                is =this.getResources().openRawResource(R.raw.s10);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Silahşör - Stephen King")){
                is =this.getResources().openRawResource(R.raw.s11);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Simyacı - Paulo Coelho")){
                is =this.getResources().openRawResource(R.raw.s12);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Siradan Delilik Oykuleri - Charles Bukowski")){
                is =this.getResources().openRawResource(R.raw.s13);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Sonsuzluğun Sonu - Isaac Asimov")){
                is =this.getResources().openRawResource(R.raw.s14);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Sonuncu Kurban - Agatha Christie")){
                is =this.getResources().openRawResource(R.raw.s15);
            }
            //2 TTTTTTTTTTTTT
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Toprak Ana - Cengiz Aytmatov")){
                is =this.getResources().openRawResource(R.raw.t1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Totem ve Tabu - Sigmund Freud")){
                is =this.getResources().openRawResource(R.raw.t2);
            }
            //2 UUUUUUUUUUUUUU
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Uc Kisa Oyun - Luigi Pirandello")){
                is =this.getResources().openRawResource(R.raw.u1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Uc Oyku - Nikolay Gogol")){
                is =this.getResources().openRawResource(R.raw.u2);
            }
            //3 VVVVVVVVVVVVVVV
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Ve Ayna Kirildi - Agatha Christie")){
                is =this.getResources().openRawResource(R.raw.v1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Visne Bahcesi - Anton Cehov")){
                is =this.getResources().openRawResource(R.raw.v2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Vulcanın Çekici - Philip K. Dick")){
                is =this.getResources().openRawResource(R.raw.v3);
            }
            // 10 YYYYYYYYYYYYY
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yabancı - Albert Camus")){
                is =this.getResources().openRawResource(R.raw.y1);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yasak Iliski - Barbara Taylor")){
                is =this.getResources().openRawResource(R.raw.y2);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yasamim ve Psikanaliz - Sigmund Freud")){
                is =this.getResources().openRawResource(R.raw.y3);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yaslilik ve Dostluk - Cicero")){
                is =this.getResources().openRawResource(R.raw.y4);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yatmadan Once Yuz Firca Darbesi - Melissa P_")){
                is =this.getResources().openRawResource(R.raw.y5);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yavrunu Bilinclendir Hanim - Yilmaz Erdogan")){
                is =this.getResources().openRawResource(R.raw.y6);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yeni atlantis - Fancis Bacon")){
                is =this.getResources().openRawResource(R.raw.y7);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yeraltından Notlar - Dostoyevski")){
                is =this.getResources().openRawResource(R.raw.y8);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yerdeniz buyucusu - Ursula K. Le Guin")){
                is =this.getResources().openRawResource(R.raw.y9);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yolculuk Nereye Kardesim - Gulse Birsel")){
                is =this.getResources().openRawResource(R.raw.y10);
            }
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Yüzbaşının Kızı - Aleksandr Puşkin")){
                is =this.getResources().openRawResource(R.raw.y11);
            }
            //1 ZZZZZZZZZZZZZZZZ
            if(bundle.getString("BookName").toString().equalsIgnoreCase("Zaman ve Varlik Uzerine - Heidegger")){
                is =this.getResources().openRawResource(R.raw.z1);
            }





            if(reader==null){
                reader = new BufferedReader(new InputStreamReader(is));
            }
            if(is != null) {
                try {
                    while ((data = reader.readLine()) != null) {
                        sbuffer.append(data + "\n  ");
                    }
                    mTextView.setText(sbuffer);
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if (status != TextToSpeech.ERROR) {
                        tts.setLanguage(new Locale("tr","TR"));
                    }
                    else { Log.e("HATA","Okuma Hatası Oluştu"); }
                }
            });
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s = sbuffer.toString();

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        tts.speak(s.substring(0,700).toString(),TextToSpeech.QUEUE_FLUSH,null,null);
                    }
                }
            });
        }
    }

    public void onPause(){
        if(tts!=null){
            tts.stop();
            tts.shutdown();
        }
        super.onPause();
    }
}
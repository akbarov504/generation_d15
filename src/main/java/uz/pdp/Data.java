package uz.pdp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {
    public static HashMap<String, List<Answer>> getQuestionFrontend() {
        HashMap<String, List<Answer>> question = new HashMap<>();

        List<Answer> answers1 = new ArrayList<>();
        Answer a1 = new Answer("1995", true);
        Answer b1 = new Answer("1996", false);
        Answer c1 = new Answer("1997", false);
        Answer d1 = new Answer("2007", false);
        answers1.add(a1);
        answers1.add(b1);
        answers1.add(c1);
        answers1.add(d1);
        question.put("JavaScript qaysi yilda yaratilgan?", answers1);

        List<Answer> answers2 = new ArrayList<>();
        Answer a2 = new Answer("Jav", false);
        Answer b2 = new Answer("JavaC", false);
        Answer c2 = new Answer("JS", true);
        Answer d2 = new Answer("JScript", false);
        answers2.add(a2);
        answers2.add(b2);
        answers2.add(c2);
        answers2.add(d2);
        question.put("JavaScript ning qisqartirma shakli qanday?", answers2);

        List<Answer> answers3 = new ArrayList<>();
        Answer a3 = new Answer("2", false);
        Answer b3 = new Answer("3", false);
        Answer c3 = new Answer("4", true);
        Answer d3 = new Answer("1", false);
        answers3.add(a3);
        answers3.add(b3);
        answers3.add(c3);
        answers3.add(d3);
        question.put("JavaScript nechta usulda ulanadi?", answers3);

        List<Answer> answers4 = new ArrayList<>();
        Answer a4 = new Answer("HTMLga kir ", false);
        Answer b4 = new Answer("alert()", false);
        Answer c4 = new Answer("console.log", false);
        Answer d4 = new Answer("document", true);
        answers4.add(a4);
        answers4.add(b4);
        answers4.add(c4);
        answers4.add(d4);
        question.put(" Biz JS faylida turib, HTML ga kirishimiz uchun qanday kod yozamiz?", answers4);

        List<Answer> answers5 = new ArrayList<>();
        Answer a5 = new Answer("getElementById(\"\")", true);
        Answer b5 = new Answer("setElementById(\"\")", false);
        Answer c5 = new Answer("write(\"\")", false);
        Answer d5 = new Answer("alert.ById(\"\")", false);
        answers5.add(a5);
        answers5.add(b5);
        answers5.add(c5);
        answers5.add(d5);
        question.put("JS faylida turib HTML dagi id ni qaysi kod yordamida topamiz?", answers5);

        List<Answer> answers6 = new ArrayList<>();
        Answer a6 = new Answer("CSS", false);
        Answer b6 = new Answer("style", true);
        Answer c6 = new Answer("stil", false);
        Answer d6 = new Answer("dizayn", false);
        answers6.add(a6);
        answers6.add(b6);
        answers6.add(c6);
        answers6.add(d6);
        question.put("JS faylida turib CSS ni o'zgartiruvchi kodni toping.", answers6);

        List<Answer> answers7 = new ArrayList<>();
        Answer a7 = new Answer("object", false);
        Answer b7 = new Answer("undefined ", false);
        Answer c7 = new Answer("string", true);
        Answer d7 = new Answer("null", false);
        answers7.add(a7);
        answers7.add(b7);
        answers7.add(c7);
        answers7.add(d7);
        question.put("JS da matnlar qaysi ma'lumot turiga kiradi?", answers7);

        List<Answer> answers8 = new ArrayList<>();
        Answer a8 = new Answer("sichqonchaning bosilishi", true);
        Answer b8 = new Answer("sichqonchaning elementga borishi ", false);
        Answer c8 = new Answer("sichqonchaning elementdan ketishi", false);
        Answer d8 = new Answer("to'g'ri javob yo'q", false);
        answers8.add(a8);
        answers8.add(b8);
        answers8.add(c8);
        answers8.add(d8);
        question.put("onclick bu...", answers8);

        List<Answer> answers9 = new ArrayList<>();
        Answer a9 = new Answer("tab", false);
        Answer b9 = new Answer("id", false);
        Answer c9 = new Answer("let", true);
        answers9.add(a9);
        answers9.add(b9);
        answers9.add(c9);
        question.put("JS da o'zgaruvchi e'lon qilmoqchi bo'lsak, o'zgaruvchi nomidan oldin qanday kalit so'zini qo'yamiz?", answers9);

        List<Answer> answers10 = new ArrayList<>();
        Answer a10 = new Answer("/", false);
        Answer b10 = new Answer("%", true);
        Answer c10 = new Answer("&&", false);
        answers10.add(a10);
        answers10.add(b10);
        answers10.add(c10);
        question.put(" JS da qoldiqli bo'lish qaysi amal bilan bajariladi?", answers10);

        return question;
    }

    public static HashMap<String, List<Answer>> getQuestionPython() {
        HashMap<String, List<Answer>> question = new HashMap<>();

        List<Answer> answers1 = new ArrayList<>();
        Answer a1 = new Answer("print(\"Salom dunyo\")", true);
        Answer b1 = new Answer("p(\"Salom dunyo\")", false);
        Answer c1 = new Answer("echo (\"Salom dunyo\");", false);
        Answer d1 = new Answer("sout (\"Salom dunyo\");", false);
        answers1.add(a1);
        answers1.add(b1);
        answers1.add(c1);
        answers1.add(d1);
        question.put("Pythonda \"Salom dunyo\"ni chiqarish uchun to'g'ri sintaksis nima?", answers1);

        List<Answer> answers2 = new ArrayList<>();
        Answer a2 = new Answer("//Bu izoh", false);
        Answer b2 = new Answer("#Bu izoh", true);
        Answer c2 = new Answer("/*Bu sharh", false);
        Answer d2 = new Answer("/Bu sharh", false);
        answers2.add(a2);
        answers2.add(b2);
        answers2.add(c2);
        answers2.add(d2);
        question.put("Python kodiga Izohlarni qanday kiritasiz?", answers2);

        List<Answer> answers3 = new ArrayList<>();
        Answer a3 = new Answer("my-var", false);
        Answer b3 = new Answer("Myvar", false);
        Answer c3 = new Answer("my_var", true);
        Answer d3 = new Answer("1", false);
        answers3.add(a3);
        answers3.add(b3);
        answers3.add(c3);
        answers3.add(d3);
        question.put("Qaysi biri yuridik o‘zgaruvchining nomi EMAS?", answers3);

        List<Answer> answers4 = new ArrayList<>();
        Answer a4 = new Answer("x = 5", true);
        Answer b4 = new Answer("Boshqa ikkala javob ham to'g'ri", false);
        Answer c4 = new Answer("x = int(5)", false);
        Answer d4 = new Answer("x = float(5)", false);
        answers4.add(a4);
        answers4.add(b4);
        answers4.add(c4);
        answers4.add(d4);
        question.put(" Raqamli qiymati 5 bo'lgan o'zgaruvchini qanday yaratasiz?", answers4);

        List<Answer> answers5 = new ArrayList<>();
        Answer a5 = new Answer(".pyth", false);
        Answer b5 = new Answer(".pyt", false);
        Answer c5 = new Answer(".py", true);
        Answer d5 = new Answer(".p", false);
        answers5.add(a5);
        answers5.add(b5);
        answers5.add(c5);
        answers5.add(d5);
        question.put("Python fayllari uchun to'g'ri fayl kengaytmasi nima?", answers5);

        List<Answer> answers6 = new ArrayList<>();
        Answer a6 = new Answer("x = float (2.8)", false);
        Answer b6 = new Answer("x = 2.8", true);
        Answer c6 = new Answer("Boshqa ikkala javob ham to'g'ri", false);
        Answer d6 = new Answer("x = f21", false);
        answers6.add(a6);
        answers6.add(b6);
        answers6.add(c6);
        answers6.add(d6);
        question.put("2.8 suzuvchi raqam bilan o'zgaruvchini qanday yaratasiz?", answers6);

        List<Answer> answers7 = new ArrayList<>();
        Answer a7 = new Answer("print(type(x))", true);
        Answer b7 = new Answer("chop etish (turiOf(x)) ", false);
        Answer c7 = new Answer("chop etish (x turi)", false);
        Answer d7 = new Answer("chop etish (x)", false);
        answers7.add(a7);
        answers7.add(b7);
        answers7.add(c7);
        answers7.add(d7);
        question.put("Python-da o'zgaruvchi yoki ob'ekt turini chiqarish uchun to'g'ri sintaksis qanday?", answers7);

        List<Answer> answers8 = new ArrayList<>();
        Answer a8 = new Answer("def myFunction();", true);
        Answer b8 = new Answer("funktsiya myfunction(); ", false);
        Answer c8 = new Answer("myFunction() yarating ; ", false);
        Answer d8 = new Answer("myFunction(); ", false);
        answers8.add(a8);
        answers8.add(b8);
        answers8.add(c8);
        answers8.add(d8);
        question.put("Pythonda funksiya yaratishning to'g'ri yo'li qanday?", answers8);

        List<Answer> answers9 = new ArrayList<>();
        Answer a9 = new Answer("x = \"Salom\"[0]", false);
        Answer b9 = new Answer("x = \"Salom\".sub(0, 1)", false);
        Answer c9 = new Answer("x = sub(\"Salom\", 0, 1)", true);
        Answer d9 = new Answer("x = trim(\"Salom\", 0, 1)", false);
        answers9.add(a9);
        answers9.add(b9);
        answers9.add(c9);
        answers9.add(d9);
        question.put("Satrdagi birinchi belgini qaytarish uchun to'g'ri sintaksis nima?", answers9);

        List<Answer> answers10 = new ArrayList<>();
        Answer a10 = new Answer("len()", false);
        Answer b10 = new Answer("trim()", false);
        Answer c10 = new Answer("strip()", true);
        Answer d10 = new Answer("upper()", false);
        answers10.add(a10);
        answers10.add(b10);
        answers10.add(c10);
        answers10.add(d10);
        question.put("Satrning boshidan va oxiridagi har qanday bo'shliqni qanday usul bilan olib tashlash mumkin?", answers10);

        return question;
    }

    public static HashMap<String, List<Answer>> getQuestionJava() {
        HashMap<String, List<Answer>> question = new HashMap<>();

        List<Answer> answers1 = new ArrayList<>();
        Answer a1 = new Answer("ma'lum bir dasturlash tilida yozilgan biror dastur yoki uning bir qismini, u dastlab yozilgan muhitdan farqli ravishda, maksimal darajada boshqa muhitda ishlashi uchun moslash qobiliyati.", false);
        Answer b1 = new Answer("foydalanuvchi xususiyatlarini saqlab qolish;", false);
        Answer c1 = new Answer("dasturni (yoki uning qismlarini) boshqa muhitda/muhitda ishga tushirish qobiliyati. Bu turli xil operatsion tizimlarda ishlash qobiliyatini va oddiygina bir xil operatsion tizimga ega, ammo turli xil sozlamalar bilan turli xil kompyuterlarga o'tkazish qobiliyatini anglatishi mumkin;", true);
        Answer d1 = new Answer("dasturiy ta'minotning bir nechta apparat platformalari yoki operatsion tizimlar bilan ishlash qobiliyati", false);
        answers1.add(a1);
        answers1.add(b1);
        answers1.add(c1);
        answers1.add(d1);
        question.put("Java haqida umumiy ma'lumot. Muayyan dasturlash tilida yozilgan dasturiy ta'minot uchun portativlik nimani anglatadi?", answers1);

        List<Answer> answers2 = new ArrayList<>();
        Answer a2 = new Answer("ma'lum bir dasturlash tilida yozilgan biror dastur yoki uning bir qismini, u dastlab yozilgan muhitdan farqli ravishda, maksimal darajada boshqa muhitda ishlashi uchun moslash qobiliyati. foydalanuvchi xususiyatlarini saqlab qolish;", false);
        Answer b2 = new Answer("dasturni (yoki uning qismlarini) boshqa muhitda/muhitda ishga tushirish qobiliyati. Bu turli xil operatsion tizimlarda ishlash qobiliyatini va oddiygina bir xil operatsion tizimga ega, ammo turli xil sozlamalar bilan turli xil kompyuterlarga o'tkazish qobiliyatini anglatishi mumkin;", false);
        Answer c2 = new Answer("dasturiy ta'minotning bir nechta apparat platformalari yoki operatsion tizimlar bilan ishlash qobiliyati.", true);
        Answer d2 = new Answer("ma'lum bir dasturlash tilida yozilgan biror dastur yoki uning bir qismini, u dastlab yozilgan muhitdan farqli ravishda, maksimal darajada boshqa muhitda ishlashi uchun moslash qobiliyati. foydalanuvchi xususiyatlarini saqlab qolish;", false);
        answers2.add(a2);
        answers2.add(b2);
        answers2.add(c2);
        answers2.add(d2);
        question.put("Java haqida umumiy ma'lumot. Muayyan dasturlash tilida yozilgan dasturiy ta'minot o'zaro faoliyat platforma ekanligini nimani anglatadi?", answers2);

        List<Answer> answers3 = new ArrayList<>();
        Answer a3 = new Answer("veb-ilovalar;", false);
        Answer b3 = new Answer("savdo ilovalari;", false);
        Answer c3 = new Answer("ba'zi server ilovalari;", true);
        Answer d3 = new Answer("Barchasi", false);
        answers3.add(a3);
        answers3.add(b3);
        answers3.add(c3);
        answers3.add(d3);
        question.put("Java haqida umumiy ma'lumot. Odatda Java yordamida qanday ilovalar ishlab chiqiladi?", answers3);

        List<Answer> answers4 = new ArrayList<>();
        Answer a4 = new Answer("faqat tuzilgan;", false);
        Answer b4 = new Answer("faqat talqin qilinishi mumkin;", false);
        Answer c4 = new Answer("ham tuzilgan, ham talqin qilingan.", true);
        Answer d4 = new Answer("talqin qilingan.", false);
        answers4.add(a4);
        answers4.add(b4);
        answers4.add(c4);
        answers4.add(d4);
        question.put("Java haqida umumiy ma'lumot. Java kompilyatsiya qilingan va/yoki talqin qilingan tilmi?", answers4);

        List<Answer> answers5 = new ArrayList<>();
        Answer a5 = new Answer("o‘zgaruvchi o‘zgaruvchi e’lon qilingan vaqtda emas, balki qiymat berilgan vaqtda tur bilan bog‘lanadi;", false);
        Answer b5 = new Answer("o‘zgaruvchi deklaratsiya vaqtida tur bilan bog‘lanadi va keyinchalik turini o‘zgartirib bo‘lmaydi;", true);
        Answer c5 = new Answer("o'zgaruvchining turi dasturning ishlashi davomida o'zgarishi mumkin;", false);
        Answer d5 = new Answer("o'zgaruvchi kompilyatsiya vaqtida ma'lum bo'lgan turga ega.", false);
        answers5.add(a5);
        answers5.add(b5);
        answers5.add(c5);
        answers5.add(d5);
        question.put("Java haqida umumiy ma'lumot. \"Statik yozish\" atamasi nimani anglatadi?", answers5);

        List<Answer> answers6 = new ArrayList<>();
        Answer a6 = new Answer("Java ob'ekt bo'lmagan asosiy ma'lumotlar turlariga ega;", false);
        Answer b6 = new Answer("Java-da barcha ma'lumotlar turlari ob'ektlardir;", true);
        Answer c6 = new Answer("asosiy turlari ob'ektlardir;", false);
        Answer d6 = new Answer("mos yozuvlar turlari ob'ektlardir.", false);
        answers6.add(a6);
        answers6.add(b6);
        answers6.add(c6);
        answers6.add(d6);
        question.put("Java haqida umumiy ma'lumot. Quyidagi fikrlardan qaysi biri to‘g‘ri?", answers6);

        List<Answer> answers7 = new ArrayList<>();
        Answer a7 = new Answer("Java-da amalga oshirishning bir nechta merosini ishlatishingiz mumkin;", false);
        Answer b7 = new Answer("Java-da faqat oddiy merosdan foydalanish mumkin;", false);
        Answer c7 = new Answer("Java-da siz ko'p tarmoqli ilovalar yaratishingiz mumkin;", true);
        Answer d7 = new Answer("Java-da ob'ektlar uchun ajratilgan xotirani qo'lda bo'shatish mumkin.", false);
        answers7.add(a7);
        answers7.add(b7);
        answers7.add(c7);
        answers7.add(d7);
        question.put("Java haqida umumiy ma'lumot. Quyidagi fikrlardan qaysi biri to‘g‘ri?", answers7);

        List<Answer> answers8 = new ArrayList<>();
        Answer a8 = new Answer("Java dasturlarini bajarish, shuningdek, ilovalarning bajarilishi xavfsizligini nazorat qilish;", true);
        Answer b8 = new Answer("Java dasturlarini bajarish, shuningdek, ilovalarning bajarilishi xavfsizligini nazorat qilish; ", false);
        Answer c8 = new Answer("ishlab chiquvchilarga bajariladigan va ishga tushiriladigan dasturlarni yaratish imkonini beradi.", false);
        Answer d8 = new Answer("ishlab chiquvchilarga bajariladigan", false);
        answers8.add(a8);
        answers8.add(b8);
        answers8.add(c8);
        answers8.add(d8);
        question.put(" Java haqida umumiy ma'lumot. Java virtual mashinasining (JVM) maqsadi?", answers8);

        List<Answer> answers9 = new ArrayList<>();
        Answer a9 = new Answer("Java dasturlarini bajarish;", true);
        Answer b9 = new Answer("Java dasturlarini kompilyatsiya qiladi va bajarish uchun ishga tushiradi;", false);
        Answer c9 = new Answer("Ishlab chiquvchilarga bajariladigan va ishga tushiriladigan dasturlarni yaratish imkonini beradi.", false);
        Answer d9 = new Answer("ishga tushiriladigan dasturlarni yaratish imkonini beradi.", false);
        answers9.add(a9);
        answers9.add(b9);
        answers9.add(c9);
        answers9.add(d9);
        question.put(" Java haqida umumiy ma'lumot. Java Runtime Environment (JRE) ning maqsadi?", answers9);

        List<Answer> answers10 = new ArrayList<>();
        Answer a10 = new Answer("Java dasturlarini bajarish;", false);
        Answer b10 = new Answer("Java dasturlarini kompilyatsiya qiladi va bajarish uchun ishga tushiradi;", false);
        Answer c10 = new Answer("ishlab chiquvchilarga dasturlar yaratish, ularni kompilyatsiya qilish va ishga tushirish imkonini beradi.", true);
        Answer d10 = new Answer("ularni kompilyatsiya qilish", false);
        answers10.add(a10);
        answers10.add(b10);
        answers10.add(c10);
        answers10.add(d10);
        question.put("Java haqida umumiy ma'lumot. Java Development Kit (JDK) maqsadi?", answers10);

        return question;
    }
}

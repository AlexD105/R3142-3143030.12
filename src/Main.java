public class Main {
    public static void main(String[] args) {
        Human telbol = new Human("Телерепортер Болтик");
        Human telzril = new Human("Телезрители");
        TVthings screen = new TVthings("экран");
        TVthings flash = new TVthings("мелькание");
        Mouth mouth = new Mouth("рот");
        Arm arm = new Arm("рука");
        Eye eye = new Eye("взор");
        Picture earth = new Picture("земля");
        Picture trees = new Picture("деревья");
        Picture house = new Picture("дом");
        Picture sky = new Picture("небо");
        Picture cloud = new Picture("облака");
        Picture police = new Picture("фигура полицейского");
        Picture air = new Picture("воздух");
        Picture face = new Picture("физиономия");
        Timelaps moment = new Timelaps("миг");
        Words words = new Words("слова");
        Sounds crackle = new Sounds("треск");
        Timelaps instantly = new Timelaps("мгновенно");
        Timelaps sec = new Timelaps("Через несколько секунд");
        Picture stripes = new Picture("полосы");
        Human dictor = new Human("дикторша");
        Human lunat = new Human("лунатики");
        Expectations expect = new Expectations("своих ожиданиях");
        Timelaps days = new Timelaps("те дни");
        News news = new News("новости");
        News cosm = new News("о космонавтах");
        News plant = new News("о гигантских растениях");
        News nevesom = new News("о невесомости");
        News spolice = new News("рассказ о полицейском Хныгле");
        Narech osob = new Narech("Особенно");
        Weapon vintovka = new Weapon("дальнобойная крупнокалиберная винтовка");
        State sneves = new State("состояние невесомости");
        Human policeman = new Human("полицейский Хныгл");

        try {
            policeman.setName();
        } catch(DoPersonHaveNameOrNot doPersonHaveNameOrNot){
            System.out.println("ERROR "+ doPersonHaveNameOrNot.getMessage());
        }

        Strengths react = new Strengths("Реактивная сила");
        Timelaps polchasa = new Timelaps("полчаса");
        Travel krugput = new Travel("кругосветное путешествие");
        Movement golfly = new Movement("Головокружительный полет");
        TVthings telstud = new TVthings("телестудии");
        FacialExpressions virlic = new FacialExpressions("идиотское выражение лица");
        Face vanya = new Face("Лицо");
        FacialExpressions virosm = new FacialExpressions("осмысленное выражение");
        Human oleg = new Human("диктор");
        Weapon vint = new Weapon("винтовкa");
        Furniture stol = new Furniture("стол");
        Weapon ruzhe = new Weapon("ружь");
        Eye eyes = new Eye("глаза");
        Emotion radost = new Emotion ();
        Timelaps kktlk = new Timelaps("Как только");
        Timelaps peremena = new Timelaps("перемена");
        telbol.close(mouth.getName(), arm.getName());
        System.out.print(", ");
        telbol.cough("LITE");
        System.out.print(", ");
        telbol.lookaround("PAST");
        telbol.continues(PredlogUSSR.AND);
        System.out.println();
        telzril.see("THIS_TIME");
        screen.own(PredlogUSSR.NA, "MY");
        flash.course("POR");
        System.out.print(". ");
        System.out.println();
        eye.whose(PredlogUSSR.PERED, "THEM");
        earth.arice("SUDDENLY");
        trees.together(PredlogUSSR.S, "TOGETHER");
        house.soyuz(PredlogUSSR.I);
        System.out.print(", ");
        System.out.println();
        sky.flashed("COATED", cloud.getName());
        System.out.print(", ");
        moment.sometimes(PredlogUSSR.NA);
        police.appear(PredlogUSSR.IN, air.getName());
        face.distorted(PredlogUSSR.S);
        System.out.print(". ");

        System.out.println();
        telbol.nthtimetosay(words.getName());
        crackle.heard(PredlogUSSR.AND);
        System.out.print(". ");
        screen.gout(instantly.getName());
        System.out.print(". ");
        stripes.flash(sec.getName());
        System.out.print(", ");
        System.out.println();
        dictor.say(PredlogUSSR.AND);
        lunat.ntdeceived(PredlogUSSR.AND, expect.getName());
        System.out.print(". ");
        news.conveyed(PredlogUSSR.IN, days.getName(), cosm.getName());
        System.out.print(", " + plant.getName() + ", " + nevesom.getName());
        System.out.println(". ");
        spolice.amazed(osob.getName());
        System.out.print(". ");
        policeman.fire(policeman.ended(sneves.getName()), vintovka.getName(), Boolean.TRUE);
        System.out.println(". ");
        react.suffered("его");
        policeman.committed(PredlogUSSR.AND, polchasa.getName(), krugput.getName());
        policeman.fell(PredlogUSSR.AND, "том же месте, откуда вылетел");
        System.out.println(". ");
        golfly.msimpression(policeman.getName());
        System.out.println(". ");
        policeman.couldnt(telstud.getName());
        policeman.twist(PredlogUSSR.AND);
        System.out.print(", ");
        virlic.ntexit();
        System.out.println(". ");
        vanya.sthave(virosm.getName());
        System.out.print(", ");
        oleg.announced(vintovka.getName());
        System.out.println(". ");
        telzril.saw(policeman.listened(words.getName())+"м " + oleg.getName() + "a");
        System.out.print(", а когда ");
        telzril.brought(vint.getName());
        System.out.print(", ");
        policeman.popped(stol.getName() + "а");
        System.out.println(", ");
        policeman.stretched(ruzhe.getName());
        System.out.print(", ");
        eyes.light("радость");
        System.out.print(". ");
        vint.found("у него в " + arm.getName()+"x", kktlk.getName());
        System.out.print(", ");
        peremena.proizoshlo();
        System.out.println(". ");
    }
}
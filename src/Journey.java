public class Journey {
    int chapterResult, chapterNum = 1, itemNum = 0;
    Chapters chapter;

    public Journey() {
        chapter = new Chapters(chapterNum, itemNum);
    }

    public void getProlog(){
        System.out.println("***You are beginning your journey!***");
        System.out.println("You had always dreamt of becoming a royal knight in the kingdom.");
        System.out.println("However, a fearsome dragon named Elden Dragon suddenly appeared, threatening the kingdom.");
        System.out.println("To prove your worth and earn the title of a royal knight,");
        System.out.println("you embarked on a challenging journey to defeat the dragon and fulfill your destiny.");

        ItemHolder itemHolder = new ItemHolder(); // Create single ItemHolder instance
        itemNum = 0;
        chapterNum = 1;

        do {
            chapter = new Chapters(chapterNum, itemNum);
            chapterResult = chapter.Chapter();
            if (chapterResult != -1) {
                chapterNum = chapterResult;
                itemNum = chapter.itemNumber;
                itemHolder.addItem(itemNum); // Track items globally
            }
        } while (chapterResult != -1);
    }
}
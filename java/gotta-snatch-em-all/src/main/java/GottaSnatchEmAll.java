import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> mySet = new HashSet<>();
        mySet.addAll(cards);

        return mySet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iCan = false;
        boolean theirCan = false;

        for(String a : theirCollection){
            if(!myCollection.contains(a)){
                iCan =true;
                break;
            }
        }

        for(String b : myCollection){
            if(!theirCollection.contains(b)){
                theirCan =true;
                break;
            }
        }

        return iCan && theirCan;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCards = new HashSet<>();
        Set<String> commonCardsAux = new HashSet<>();

        for (Set<String> set : collections){
            commonCards.addAll(set);
            commonCardsAux.addAll(set);
        }

        for (String card : commonCardsAux){
            for (Set<String> set :  collections){
                if(!set.contains(card)){
                    commonCards.remove(card);
                }
            }
        }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();

        for (Set<String> set : collections){
            allCards.addAll(set);
        }

        return allCards;
    }
}

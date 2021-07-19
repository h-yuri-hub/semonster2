package semonster2;

import java.util.List;

public class Monster {
    private String name;
    private int rare;

    public void toString() {
        System.out.println(name+":レア度["+rare+"]");
    }

    public String summonMonster(int x) {
        String[] monsterList={"ドラゴン","デュラハン","スライム","スケルトン","ドードリオ"};
        
        return monsterList[x];
    

    }
        
    Monster(int n,int r){
        this.name=n;
        this.rare=r;
        this.toString();
    }

}
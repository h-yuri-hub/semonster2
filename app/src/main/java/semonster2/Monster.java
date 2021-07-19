package semonster2;

import java.util.List;

public class Monster {
    private String name;
    private int rare;

    public void to_String() {
        System.out.println(name+":レア度["+rare+"]");
    }

    public String summonMonster(int x) {
        String[] monsterList={"ドラゴン","デュラハン","スライム","スケルトン","ドードリオ"};
        
        return monsterList[x];
    }

    public void evolution(int x){
        if(this.rare>3){
            this.name = "Furutetsu";
        }
    }
        
    Monster(int n,int r){
        this.name=this.summonMonster(n);
        this.rare=r;
        this.to_String();
    }

}
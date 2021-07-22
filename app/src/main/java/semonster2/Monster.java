package semonster2;

import java.util.List;

public class Monster {
  private String name;
  private int rare;

  public String to_String() {
    return name + ":レア度[" + rare + "]";

  }

  public String summonMonster(int x) {
    String[] monsterList = { "ドラゴン", "デュラハン", "スライム", "スケルトン", "ドードリオ" };

    return monsterList[x];
  }

  public void evolution(int x) {
    if (this.rare > 3) {
      this.name = "Furutetsu";
    }
  }

  public void rank_up() {
    if (this.rare < 4) {
      this.rare += 1;
    }
  }

  Monster(int n, int r) {
    this.name = this.summonMonster(n);
    this.rare = r;
    System.out.println(this.to_String());

  }

}

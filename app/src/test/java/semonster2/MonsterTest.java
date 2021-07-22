package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest{
  @Test
  public void testSummonMonster() {
    Monster monster = new Monster(0,1);
    assertEquals("ドラゴン", monster.summonMonster(0));
  }

  @Test
  public void testTo_String() {
    Monster monster = new Monster(0,1);
    assertEquals("ドラゴン:レア度[1]", monster.to_String());
  }

  @Test
  public void testRank_up() {
    Monster monster = new Monster(0,1);
    assertEquals("ドラゴン:レア度[1]", monster.to_String());
    monster.rank_up();
    assertEquals("ドラゴン:レア度[2]", monster.to_String());
  }

  @Test
  public void testEvolution() {
    Monster monster = new Monster(0,1);
    assertEquals("ドラゴン:レア度[1]", monster.to_String());
    monster.rank_up();
    monster.rank_up();
    monster.rank_up();
    monster.evolution(4);
    assertEquals("Furutetsu:レア度[4]", monster.to_String());
  }
}

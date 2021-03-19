package strategy;

public class King implements Character{

    @Override
    public void fight(WeaponBehavior weaponBehavior) {
        weaponBehavior.useWeapon();
    }
}

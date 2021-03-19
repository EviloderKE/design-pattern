package strategy;

public class Queue implements Character{
    @Override
    public void fight(WeaponBehavior weaponBehavior) {
        weaponBehavior.useWeapon();
    }
}

class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        Arrays.sort(enemyEnergies);
        if (currentEnergy < enemyEnergies[0])
            return 0;
// 2,2,3
        //2
    //    5, - 7- 9
        
        long totalEnergy = currentEnergy;
        for (int j = enemyEnergies.length - 1; j > 0; --j){
             totalEnergy = totalEnergy + enemyEnergies[j];
             System.out.println(totalEnergy);
        }

           

        return totalEnergy / enemyEnergies[0];
    }
}
public class Place {
    private int[] districts;

    Place(int[] districts) {
        this.districts = districts;
    }

    public int getNumberOfCastle() {
        if (districts.length == 0) return 0; // if input is empty

        int answer = 1; //always build a castle at the start of the array
        boolean isFlat = true;
        int twoPrevGroupValue = 0;
        int onePrevGroupValue = 0;

        for (int district : districts) {
            if (onePrevGroupValue == district) continue;
            if (onePrevGroupValue != 0 && isFlat) isFlat = false;

            // Peaks and Valleys require three group of value
            if (twoPrevGroupValue != 0 && onePrevGroupValue != 0) {
                // Valleys
                if (twoPrevGroupValue > onePrevGroupValue && onePrevGroupValue < district) {
                    answer++;
                }

                // Peaks
                if (twoPrevGroupValue < onePrevGroupValue && onePrevGroupValue > district) {
                    answer++;
                }
            }

            twoPrevGroupValue = onePrevGroupValue;
            onePrevGroupValue = district;
        }
        return isFlat ? answer : ++answer;
    }
}

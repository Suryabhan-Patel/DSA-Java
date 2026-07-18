class code254 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows - 1;
        int row = -1;

        // Find the row
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target > matrix[mid][cols - 1]) {
                low = mid + 1;
            }
            else if (target < matrix[mid][0]) {
                high = mid - 1;
            }
            else {
                row = mid;
                break;
            }
        }

        if (row == -1) {
            return false;
        }

        // Binary Search inside the row
        low = 0;
        high = cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[row][mid] < target) {
                low = mid + 1;
            }
            else if (matrix[row][mid] > target) {
                high = mid - 1;
            }
            else {
                return true;
            }
        }

        return false;
    }
}
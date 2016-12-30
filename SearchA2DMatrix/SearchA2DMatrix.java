package SearchA2DMatrix;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        
        int start = 0;
        int end = matrix.length - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            
            if (matrix[mid][0] < target) {
                start = mid;
            } else if (matrix[mid][0] > target) {
                end = mid;
            } else {
                return true;
            }
        }
        
        int row = 0;
        if (matrix[end][0] <= target) {
            row = end;
        } else if (matrix[start][0] <= target) {
            row = start;
        } else {
            return false;
        }
        
        start = 0;
        end = matrix[0].length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] < target) {
                start = mid;
            } else if (matrix[row][mid] > target) {
                end = mid;
            } else {
                return true;
            }
        }
        
        if (matrix[row][start] == target) {
            return true;
        } else if (matrix[row][end] == target) {
            return true;
        } else {
            return false;
        }
    }
}

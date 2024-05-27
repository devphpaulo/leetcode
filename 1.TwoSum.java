import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Cria um HashMap para mapear números a seus índices
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Itera pelos números do array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // Obtém o número atual
            int complement = target - num; // Calcula o complemento necessário para alcançar o alvo

            // Verifica se o complemento já está no HashMap
            if (numToIndex.containsKey(complement)) {
                // Se o complemento existe no HashMap, retorna os índices do par que soma ao alvo
                return new int[] { numToIndex.get(complement), i };
            }
    
            // Adiciona o número atual e seu índice ao HashMap
            numToIndex.put(num, i);
        }

        // Se nenhum par que soma ao alvo for encontrado, lança uma exceção
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        Solution solution = new Solution(); // Cria uma instância da classe Solution
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target); // Chama o método twoSum na instância solution
        System.out.println(result[0] + "," + result[1]); // Imprime os índices do par que soma ao alvo
    }
}

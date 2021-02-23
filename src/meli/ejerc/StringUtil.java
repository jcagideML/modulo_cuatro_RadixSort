package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		StringBuilder aux = new StringBuilder();
		while(aux.length()< n){
			aux.append(c);
		}
		return aux.toString();
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		if(s.length() < n){
			return replicate(c, n - s.length()) + s;
		}else{
			return s;
		}
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int[] arr)
	{
		String[] sArr = new String[arr.length];

		for(int i = 0; i<arr.length;i++){
			sArr[i] = String.valueOf(arr[i]);
		}

		return sArr;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String[] sArr)
	{
		int[] iArr = new int[sArr.length];

		for(int i = 0; i<sArr.length;i++){
			iArr[i] = Integer.parseInt(sArr[i]);
		}

		return iArr;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String[] arr)
	{
		int max = 0;

		for (String s : arr) {
			if (s.length() > max) {
				max = s.length();
			}
		}

		return max;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String[] arr, char c)
	{
		int max = maxLength(arr);

		for(int i = 0; i<arr.length;i++){
			arr[i] = lpad(arr[i],max,c);
		}
	}
}

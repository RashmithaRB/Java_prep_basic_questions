# Character Frequency Counter in a City Name

This Java program calculates the frequency of each unique character present in a city name entered by the user. It demonstrates two approaches:
1. Using a `HashMap` (commented out for now)
2. Using an integer array for lowercase English characters (`a` to `z`)

## 📁 Package Structure

- **Package Name:** `placement`
- **Class Name:** `frequencies_of_each_character`

## 🚀 How It Works

1. The user is prompted to input the name of a city.
2. The program processes the string and counts how many times each lowercase character appears.
3. The frequencies are printed in the format: `character:count`

### 🔢 Array-Based Approach (Active)

This approach assumes the city name consists of lowercase English letters (`a`–`z`). It uses an integer array of size 26 to track character counts:

```java
int[] arr = new int[26];
for (int i = 0; i < city.length(); i++) {
    arr[city.charAt(i) - 'a']++;
}
```

### Frequency counting using hashmap
```java
HashMap<Character,Integer> hp=new HashMap<>();
for(char ch:city.toCharArray()) {
    hp.put(ch,hp.getOrDefault(ch, 0)+1);
}
for(Entry<Character,Integer> entry:hp.entrySet()) {
     System.out.println(entry.getKey()+":"+entry.getValue());
	}
```

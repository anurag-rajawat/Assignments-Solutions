package medium;

import java.util.HashMap;

// Problem 12: https://leetcode.com/problems/encode-and-decode-tinyurl/submissions/
public class EncDecodeTinyURL {

    // First approach, not a right way to do it, just of curiosity I've done it like this.
    class Codec {
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            return longUrl;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return shortUrl;
        }
    }

    // Second approach using HashMap, not so optimized
    class Codec2 {
        HashMap<String, String> map = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String small = "https://tinyurl.com/" + longUrl.hashCode();
            map.put(small, longUrl);
            return small;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl);
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
}

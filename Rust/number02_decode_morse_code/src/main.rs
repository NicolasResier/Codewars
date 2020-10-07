use std::collections::HashMap;

fn main() {
    println!("Hello, world!");
    let decoder = MorseDecoder::new();
    assert_eq!(decoder.decode_morse(""), "");
    assert_eq!(decoder.decode_morse(".-"), "A");
    assert_eq!(decoder.decode_morse("."), "E");
    assert_eq!(decoder.decode_morse(".."), "I");
    assert_eq!(decoder.decode_morse(". ."), "EE");
    assert_eq!(decoder.decode_morse(".   ."), "E E");
    assert_eq!(decoder.decode_morse("...---..."), "SOS");
    assert_eq!(decoder.decode_morse("... --- ..."), "SOS");
    assert_eq!(decoder.decode_morse("...   ---   ..."), "S O S");
}

pub struct MorseDecoder {
    pub morse_code: HashMap<String, String>,
}

impl MorseDecoder {

    fn decode_morse(&self, encoded: &str) -> String {
        let mut answer = String::new();
        for x in encoded.split("   "){
            for y in x.split_whitespace() {
                match &self.morse_code.get::<str>(&y) {
                    Some(a) => answer.push_str(a),
                    None => return "Code not found".to_string(),
                }
            };
            answer.push(' ');
        };
        answer.trim().to_string()
    }
    
}

impl MorseDecoder {

    pub fn new() -> MorseDecoder {
        MorseDecoder {
            morse_code: [
                  (".-",     "A"),  ("-...",    "B"), ("-.-.",   "C"), ("-..",       "D"),  (".",      "E"), ("..-.", "F"),
                  ("--.",    "G"),  ("....",    "H"), ("..",     "I"), (".---",      "J"),  ("-.-",    "K"), (".-..", "L"),
                  ("--",     "M"),  ("-.",      "N"), ("---",    "O"), (".--.",      "P"),  ("--.-",   "Q"), (".-.",  "R"),
                  ("...",    "S"),  ("-",       "T"), ("..-",    "U"), ("...-",      "V"),  (".--",    "W"), ("-..-", "X"),
                  ("-.--",   "Y"),  ("--..",    "Z"),
                  ("-----",  "0"),  (".----",   "1"), ("..---",  "2"), ("...--",     "3"),  ("....-",  "4"),
                  (".....",  "5"),  ("-....",   "6"), ("--...",  "7"), ("---..",     "8"),  ("----.",  "9"),
                  (".-.-.-", "."),  ("--..--",  ","), ("..--..", "?"), (".----.",    "\'"), ("-.-.--", "!"),
                  ("-..-.",  "/"),  ("-.--.",   "("), ("-.--.-", ")"), (".-...",     "&"),  ("---...", ","),
                  ("-.-.-.", ";"),  ("-...-",   "="), (".-.-.",  "+"), ("-....-",    "-"),  ("..--.-", "_"),
                  (".-..-.", "\""), ("...-..-", "$"), (".--.-.", "@"), ("...---...", "SOS"),
              ].iter()
              .map( |&(from, to)| (from.to_string(), to.to_string()) )
              .collect(),
        }
    }

}
fn main() {
    println!("Hello, world!");

    assert_eq!(good_vs_evil("0 0 0 0 0 10", "0 0 0 0 0 0 0"), "Battle Result: Good triumphs over Evil");
    assert_eq!(good_vs_evil("0 0 0 0 0 0", "0 0 0 0 0 0 10"), "Battle Result: Evil eradicates all trace of Good");
    assert_eq!(good_vs_evil("0 0 0 0 0 10", "0 0 0 0 0 0 10"), "Battle Result: No victor on this battle field");
}

fn good_vs_evil(good: &str, evil: &str) -> String {
    let good_vec: Vec<u32> = good
                    .split_whitespace()
                    .map(|x| x.parse::<u32>().unwrap())
                    .collect();
    let evil_vec: Vec<u32> = evil
                    .split_whitespace()
                    .map(|x| x.parse::<u32>().unwrap())
                    .collect();
    let good_calc: [u32; 6] = [1, 2, 3, 3, 4, 10];
    let evil_calc: [u32; 7] = [1, 2, 2, 2, 3, 5, 10];
    let mut good_points: u32 = 0;
    let mut evil_points: u32 = 0;
    
    if good_calc.len() == good_vec.len() {
        for x in 0..6 {
            *&mut good_points += &good_vec[x] * &good_calc[x];
        };
    };
    if evil_vec.len() == evil_calc.len() {
        for x in 0..7 {
            *&mut evil_points += &evil_vec[x] * &evil_calc[x];
        }
    }
    
    if good_points > evil_points {
        return String::from("Battle Result: Good triumphs over Evil")
    } else if evil_points > good_points {
        return String::from("Battle Result: Evil eradicates all trace of Good")
    } else if good_points == evil_points {
        return String::from("Battle Result: No victor on this battle field")
    } else {
        return String::from("Problem with battle calculations")
    };
  }

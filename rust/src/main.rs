use github_actions_sample::calc::Calc;

fn main() {
    let calc = Calc {};
    let answer = calc.add(1, 2);
    println!("answer = {:?}", answer);
}

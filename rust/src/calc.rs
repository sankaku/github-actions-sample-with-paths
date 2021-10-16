pub struct Calc;

impl Calc {
    pub fn add(self, x: i64, y: i64) -> i64 {
        x + y
    }
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test_add() {
        let x = 1;
        let y = 2;

        let calc = Calc {};
        let actual = calc.add(x, y);
        let expected = 3;

        panic!("intentional failure")
        // assert_eq!(actual, expected)
    }
}

package dev.practice.ota.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/****
 * Given a number 1-100
 * if divisible by 3 return "fizz"
 * if divisible by 5 return "buzz"
 * if divisible by 3 & 5 return "fizzbuzz"
 *
 * else return number as a string (ie: 1=="1")
 *
 */

public class FizzBuzzTests
{
    @Test
    public void should_return1_whenPassed1()
    {
        final FizzBuzz fizzbuzz = new FizzBuzz(1);
        assertThat(fizzbuzz.convert()).isEqualTo("1");
    }

}

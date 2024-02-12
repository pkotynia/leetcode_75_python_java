import unittest
from kids_with_the_greatest_number_of_candies import kids_with_the_greatest_number_of_candies


l = [([2, 3, 5, 1, 3], 3, [True, True, True, False, True]),
     ([4, 2, 1, 1, 2], 1, [True, False, False, False, False])]


class TestSequence(unittest.TestCase):
    pass


def test_generator(candies, additional_candies, expected):
    return test(self):
        self.assertEqual(kids_with_the_greatest_number_of_candies(
            candies, additional_candies), expected)


if __name__ == "__main__":
    for idx, t in enumerate(l):
        test_name = 'test_%s' % idx
        test = test_generator(t[0], t[1], t[2])
        setattr(TestSequence, test_name, test)
    unittest.main()

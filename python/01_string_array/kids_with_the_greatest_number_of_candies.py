def kids_with_the_greatest_number_of_candies(candies_per_kid, extra_candie):

    print(max(candies_per_kid))
    max_candies = max(candies_per_kid)

    return list(
        map(
            lambda numberOfCandies: (
                True if (numberOfCandies + extra_candie >= max_candies) else False
            ),
            candies_per_kid,
        )
    )

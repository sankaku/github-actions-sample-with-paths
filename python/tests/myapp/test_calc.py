from myapp.calc import add

import pytest

def test_add():
    x, y = 1, 2

    actual = add(x, y)
    expected = 3

    # assert actual == expected
    pytest.fail()

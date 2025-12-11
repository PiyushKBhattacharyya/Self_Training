#!/bin/bash
myvar=5

calc() {
    local myvar=5
    ((myvar = myvar * 5))
    echo $myvar
}

calc       # prints 25
echo $myvar  # prints 5
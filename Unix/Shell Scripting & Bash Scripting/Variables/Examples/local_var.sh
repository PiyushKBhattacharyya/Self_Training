#!/bin/sh

getName() {
    NAME=HELLO   # local variable
    echo "$NAME (from function)"   # valid inside function
}

echo "$NAME - (outside function)"   # invalid here
getName
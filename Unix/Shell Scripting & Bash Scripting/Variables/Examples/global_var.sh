#!/bin/sh

NAME=HELLO   # global variable

getName() {
    echo "$NAME (from function)"
}

echo "$NAME - (outside function)"
getName

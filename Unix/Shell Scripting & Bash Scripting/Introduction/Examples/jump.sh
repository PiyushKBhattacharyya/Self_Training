#!/bin/bash

# A simple bash script to move up to desired directory level directly

function jump()
{
    # original value of Internal Field Separator
    OLDIFS=$IFS

    # setting field separator to "/"
    IFS=/

    # converting working path into array of directories
    path_arr=($PWD)

    # restoring IFS
    IFS=$OLDIFS

    local pos=-1

    for dir in "${path_arr[@]}"
    do
        pos=$[$pos+1]
        if [ "$1" = "$dir" ]; then
            dir_in_path=${#path_arr[@]}
            cwd=$PWD
            limit=$[$dir_in_path-$pos-1]

            for ((i=0; i<limit; i++))
            do
                cwd=$cwd/..
            done

            cd $cwd
            break
        fi
    done
}
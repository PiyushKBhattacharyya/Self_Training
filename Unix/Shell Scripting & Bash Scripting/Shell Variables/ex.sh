#!/bin/bash

# variable definitions
Var_name="Devil"
Var_age=23

# accessing variables
echo "Name is $Var_name, and age is $Var_age."

# read-only variables
var_blood_group="O-"
readonly var_blood_group
echo "Blood group is $var_blood_group and read only."
echo "Trying to modify read-only variable now:"
var_blood_group="B+"     # error

# unsetting variables
unset Var_age
echo "After unsetting var_age..."
echo "Name is $Var_name, blood group is $var_blood_group and age is $Var_age..."
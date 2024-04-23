#!/bin/bash

in_dir="$1"
out_dir="$2"

find "$in_dir" -type f | while IFS= read -r f; do
    fn=$(basename -- "$f")
    tgt="$out_dir/$fn"

    cnt=0
    while [[ -e "$tgt" ]]; do
        ext="${fn##*.}"
        base="${fn%.*}"
        tgt="$out_dir/${base}_${cnt}.${ext}"
        cnt=$((cnt+1))
    done

    cp -- "$f" "$tgt"
done

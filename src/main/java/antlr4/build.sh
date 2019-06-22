#!/bin/bash
set -x

antlr4 WavelusLexer.g4 WavelusParser.g4 -o generated -package antlr4.generated -visitor

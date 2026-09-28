# Interface Eradication

## Purpose

This directory contains a project that violates clean architecture; specifically, it demonstrates the edge case in which there are no interfaces integrated into the architecture.

## Legend

Throughout the files, I have left comments that explain how the removal of the interfaces negatively impacts the structure of the code. In the comment blocks, I will use the following symbols to make it explicitly clear which interface removal has led to the issue manifesting:

- (IBI): The Input Boundary Interface  
- (OBI): The Output Boundary Interface
- (DAI): The Data Access Interface  

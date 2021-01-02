# About

This game is a clone of an old iPhone game I used to play called Theseus by Jason Fieldman for the TI-84 Plus. The name is based upon the story "Theseus and the Minotaur". While this is a clone of the [older version of the game from 2008](https://www.fieldman.org/theseus) and apparantly he came out with a [newer version of it in 2015](https://www.fieldman.org/theseus-plus)! You can see the source code of the original [here](https://github.com/jmfieldman/Theseus). All of the level designs are copied from Jason Fieldman's game.

![](theseus-demo.gif)

The Level Maker is a graphical tool to easily generate the needed representation that is used to store levels.


The Pre Compiler is used to take the nicely formatted for human eyes text file and remove all unecessary things before converting to .8xp.
This step actually makes the program run a lot faster, and take up less space, since the program is not actually compiled. TI BASIC is interpreted.

---
# Installation

### Requirements

- Computer
- TI-84 Plus Calculator
- USB-A to USB-B male-to-male connector
- Confidence (you can do it!)

### Instructions

1. Clone this repository, or just copy the `LEVELS.8xp` and `THESEUS.8xp` files in the `TI_84_PROGRAMS` folder from github.

2. Install TI Connect:
  - This is to let your computer talk to you calculator
  - [Link](https://education.ti.com/en/software/details/en/B59F6C83468C4574ABFEE93D2BC3F807/swticonnectsoftware)
  - Install
  - Plug in your USB-B cable to the calculator and computer.
  - Click `Send To Device`
  - Click `Select Device` and your calculator should show up. Make sure it is on.
  - Click on `Browse` and select the `LEVELS.8xp` and `THESEUS.8xp` files.
  - Click `Send to Device`

3. Play! Go to the programs on the calculator and press on `THESEUS`.

---

# Note

If you get this game running on different versions of calculator, please let me know. Also if you have tips on how to make the game run faster let me know as well.


# Other helpful tools

* IDE for making the .8xp files to send to the calculator [TokenIDE](http://merthsoft.com/Tokens.zip)  

* Emulator: [TI SmartView](https://education.ti.com/en/software/details/en/FFEA90EE7F9B4C24A6EC427622C77D09/sda-ti-smartview-ti-84-plus)

# Future Endeavors

Use machine code instead of the interpreted TI-BASIC language. This is necessary to get any decetly fast (and responsive) game.

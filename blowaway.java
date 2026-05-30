let col = 0
let row = 0
let hand = 0
basic.showIcon(IconNames.Skull)
loops.everyInterval(1000, function () {
    hand = randint(0, 5)
    if (hand == 1) {
        basic.showLeds(`
            . . # . .
            . # # . .
            . . # . .
            . . # . .
            . . # . .
            `)
        music._playDefaultBackground(music.builtInPlayableMelody(Melodies.Entertainer), music.PlaybackMode.UntilDone)
    } else if (hand == 2) {
        basic.showLeds(`
            . # # # .
            # . . . #
            . . . # .
            . . # . .
            # # # # #
            `)
        music._playDefaultBackground(music.builtInPlayableMelody(Melodies.Baddy), music.PlaybackMode.UntilDone)
    } else if (hand == 3) {
        basic.showLeds(`
            . # # # .
            # . . . #
            . . # # .
            # . . . #
            . # # # .
            `)
        music._playDefaultBackground(music.builtInPlayableMelody(Melodies.Chase), music.PlaybackMode.UntilDone)
    } else if (hand == 4) {
        basic.showLeds(`
            # . . # .
            # . . # .
            # # # # #
            . . . # .
            . . . # .
            `)
        music._playDefaultBackground(music.builtInPlayableMelody(Melodies.JumpUp), music.PlaybackMode.UntilDone)
    } else {
        basic.showLeds(`
            # # # # #
            # . . . .
            # # # # .
            . . . . #
            # # # # .
            `)
        music._playDefaultBackground(music.builtInPlayableMelody(Melodies.PowerUp), music.PlaybackMode.UntilDone)
    }
})
basic.forever(function () {
    for (let index = 0; index < 4; index++) {
        if (input.soundLevel() > 128) {
            row = randint(0, 4)
            col = randint(0, 4)
        }
        if (led.point(col, row)) {
            led.unplot(col, row)
            led.plot(col + 1, row)
        }
    }
})

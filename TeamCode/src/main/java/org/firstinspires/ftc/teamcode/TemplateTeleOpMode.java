package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "BasicTestOpMode (Blocks to Java)")
public class TemplateTeleOpMode extends LinearOpMode {

    /**
     * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
     * Comment Blocks show where to place Initialization code (runs once, after touching the
     * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
     * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
     * Stopped).
     */
    @Override
    public void runOpMode() {
        // Put initialization blocks here.
        /**
         * Any programming blocks or comment placed here(and before the “waitForStart()” command)
         * will be executed when the op mode is first selected by a user at the DRIVER STATION.
         */
        waitForStart();
        /**
         * When the Robot Controller reaches the “waitForStart()”, it will
         * stop and wait until it receives a Start command from the DRIVER STATION.
         * A Start command will not be sent until the user pushes the Start button on the DRIVER STATION.
         * Any code after the “waitForStart()” block will get executed after the Start button has been
         * pressed.
         */
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                // Put loop blocks here.
                telemetry.update();
            }
        }
    }
}
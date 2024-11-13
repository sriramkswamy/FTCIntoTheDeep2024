package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "BasicTestOpMode (Blocks to Java)")
public class TemplateTelemetryAfterPower extends LinearOpMode {

    private DcMotor armMotor;

    /**
     * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
     * Comment Blocks show where to place Initialization code (runs once, after touching the
     * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
     * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
     * Stopped).
     */
    @Override
    public void runOpMode() {
        float tgtPower;

        armMotor = hardwareMap.get(DcMotor.class, "armMotor");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                // Put loop blocks here.
                tgtPower = gamepad1.left_stick_y;
                armMotor.setPower(tgtPower);
                telemetry.addData("TargetPower", tgtPower);
                telemetry.addData("MotorPower", armMotor.getPower());
                telemetry.update();
            }
        }
    }
}
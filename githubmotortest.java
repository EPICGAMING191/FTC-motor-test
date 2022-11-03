package org.firstinspires.ftc.teamcode.util;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.Servo;
//Ideas
//If gamepad a pressed set motor speed to 10 and if y pressed change speed to 0

@TeleOp
public class GithubMotorTest extends OpMode {
    private DcMotor motor1;

    @Override
    public void init() {
        //Variables are set here
        //int teamnum = 11111;
        //Telemetry
       
        telemetry.addData("Team Number =", teamnum);
        //Motor
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    @Override
    public void loop() {
        double speed = 10;
        telemetry.addData("Motor", "Started");
        boolean sleepvar = false;
        if (sleepvar = false) {
            speed = 7.5;
            telemetry.addData("Motor", "Started");
        }
        motor1.setPower(speed);
        if (sleepvar == true) {
            motor1.setPower(0);
            telemetry.addData("Motor", "Stopped");
        }
    }
    @Override
    public void stop(){
            telemetry.addData("Motor", "Stopped");
            telemetry.addData("Robot", "Off");

        }
}

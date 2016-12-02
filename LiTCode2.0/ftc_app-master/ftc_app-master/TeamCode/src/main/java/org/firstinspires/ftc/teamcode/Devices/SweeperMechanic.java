package org.firstinspires.ftc.teamcode.Devices;

/**
 * Created by Eamonn on 10/27/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class SweeperMechanic
{
    private DcMotor[] axelRotation;

    public SweeperMechanic(HardwareMap hardwareMap)
    {
        axelRotation = new DcMotor[1];
        axelRotation[0] = hardwareMap.dcMotor.get("sweeperMechanicMotor");

    }
    public static synchronized void setPower(double power)
    {
        axelRotation[0].setPower(power);
    }
}

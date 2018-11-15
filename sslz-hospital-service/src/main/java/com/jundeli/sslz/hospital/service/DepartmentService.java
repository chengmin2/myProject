package com.jundeli.sslz.hospital.service;

import com.jundeli.sslz.hospital.model.Dpartment;
import com.jundeli.sslz.hospital.model.HospitalDpartment;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

import java.math.BigInteger;

public interface DepartmentService {
    ResultProtocol queryByHospitalName(String name);

    ResultProtocol insertHospitalDepartment(BigInteger hplId, Dpartment dpartment);

    ResultProtocol deleteHospitalDepartment(HospitalDpartment hospitalDpartment);
}

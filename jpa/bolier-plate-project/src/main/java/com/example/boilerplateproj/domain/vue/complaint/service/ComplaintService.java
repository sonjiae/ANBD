package com.example.boilerplateproj.domain.vue.complaint.service;

import com.example.boilerplateproj.domain.vue.complaint.controller.request.ComplaintRequest;
import com.example.boilerplateproj.domain.vue.complaint.entity.Complaint;

import java.util.List;

public interface ComplaintService {

    public List<Complaint> list();
    public List<Complaint> joblist(String board_type);

    public void deleteByParameters(String board_type, long c_bno);
}

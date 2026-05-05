package org.example.fullstackexam.services;

import org.example.fullstackexam.model.Notice;
import org.example.fullstackexam.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    private NoticeRepository repo;

    public Notice addNotice(Notice n) {
        return repo.save(n);
    }

    public List<Notice> getAllNotices() {
        return repo.findAll();
    }
}

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

    public Notice addNotice(Notice notice) {
        return repo.save(notice);
    }

    public List<Notice> getAllNotices() {
        return repo.findAll();
    }

    public void deleteNotice(String id) {
        repo.deleteById(id);
    }
}

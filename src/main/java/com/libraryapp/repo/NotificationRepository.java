package com.libraryapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.libraryapp.model.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {

}

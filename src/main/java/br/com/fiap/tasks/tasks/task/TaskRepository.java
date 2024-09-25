package br.com.fiap.tasks.tasks.task;

import br.com.fiap.tasks.tasks.user.User;

import java.time.LocalDate;

import org.eclipse.angus.mail.imap.protocol.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByUserAndStatus(User user, Status status, Pageable pageable);
    Page<Task> findByUserAndDueDateBetween(User user, LocalDate start, LocalDate end, Pageable pageable);
}


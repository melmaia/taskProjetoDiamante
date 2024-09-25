package br.com.fiap.tasks.tasks.task;


import br.com.fiap.tasks.tasks.user.User;


import java.time.LocalDate;

import org.eclipse.angus.mail.imap.protocol.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Page<Task> getTasksByStatus(User user, Status status, Pageable pageable) {
        return taskRepository.findByUserAndStatus(user, status, pageable);
    }

    public Page<Task> getTasksByDueDate(User user, LocalDate start, LocalDate end, Pageable pageable) {
        return taskRepository.findByUserAndDueDateBetween(user, start, end, pageable);
    }
}
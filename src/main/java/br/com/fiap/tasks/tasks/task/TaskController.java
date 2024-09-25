package br.com.fiap.tasks.tasks.task;


import br.com.fiap.tasks.tasks.user.User;

import org.eclipse.angus.mail.imap.protocol.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task savedTask = taskService.saveTask(task);
        return ResponseEntity.ok(savedTask);
    }

    @GetMapping
    public ResponseEntity<Page<Task>> getTasks(
        @RequestParam Status status,
        @RequestParam int page,
        @RequestParam int size,
        @AuthenticationPrincipal User user) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Task> tasks = taskService.getTasksByStatus(user, status, pageable);
        return ResponseEntity.ok(tasks);
    }
}

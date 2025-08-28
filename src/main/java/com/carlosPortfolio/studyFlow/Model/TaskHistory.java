package com.carlosPortfolio.studyFlow.Model;

import com.carlosPortfolio.studyFlow.Enum.Priotity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ElementCollection
    private List<String> category;

    @Enumerated(EnumType.STRING)
    private Priotity priority;

    private LocalDateTime createdAt;
    private LocalDateTime deadline;


    private LocalDateTime startTime; // Begin the task
    private LocalDateTime finishedAt; // Finish the task

}

package com.carlosPortfolio.studyFlow.Model;

import com.carlosPortfolio.studyFlow.Enum.Mood;
import com.carlosPortfolio.studyFlow.Enum.Priotity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private String title;
    private String description;

    @ElementCollection
    private List<String> category;

    @NotNull(message = "Priority is required")
    @Enumerated(EnumType.STRING)
    private Priotity priority;

    private LocalDateTime createdAt;

    @Future(message = "DeadLine must be in the future")
    private LocalDateTime deadline;


    private LocalDateTime startTime; // Begin the task
    private LocalDateTime finishedAt; // Finish the task
    private Long estimatedDuration;
    private Long effectiveTime;


    private Integer distractionsCount;
    private Long distractionTime;

    @ElementCollection
    private List<String> distractionReason;

    private Mood moodStart;
    private Mood moodEnd;
}

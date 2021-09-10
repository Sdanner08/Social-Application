package com.ocean.models;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="likes")
public class Like {

    @Id
    @Column(name="likeId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;

    @ManyToOne
    @JoinColumn(name="userId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="postId", nullable = false)
    private Post post;
}

package com.revature.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="like")
public class Like {
    @EmbeddedId
    private Integer likeId;

    @OneToMany
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("postId")
    private Post post;
}

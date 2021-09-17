package com.ocean.models;

import lombok.*;
import javax.persistence.*;
/*
 *    @author
 *      Front End:
 *        -Angel Walker
 *       -Trevor Drury
 *       Back End:
 *        -David Burton
 *        -Shane Danner
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="comments")
public class Comment {

    @Id
    @Column(name="commentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name="commText")
    private String commText;

    @ManyToOne
    @JoinColumn(name="postId", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name="userId", nullable = false)
    private User user;

    //Modified Constructor
    public Comment(String commText) {
        this.commText = commText;
    }

}

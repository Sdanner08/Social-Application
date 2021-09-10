package com.revature.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="comment")
public class Comment {
    @Id
    @Column(name="commentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name="commText")
    private String commText;

    @ManyToOne
    @MapsId("postId")
    private Post post;

    @ManyToOne
    @MapsId("userId")
    private User user;

    //Modified Constructor
    public Comment(String commText) {
        this.commText = commText;
    }

}

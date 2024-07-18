package dev.rushikeshj.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="feedbackdetails")
public class FeedbackEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "feedbackSequenceGenerator")
    @SequenceGenerator(name = "feedbackSequenceGenerator", sequenceName = "feedback_seq", allocationSize = 1)
    public Integer id;

    @Column(name="rating")
    public Integer rating;

    @Column(name="comments")
    public String comments;

    @Column(name="submittedate")
    public LocalDate submittedate;

    @Column(name="customerId")
    public Integer customerId;

}

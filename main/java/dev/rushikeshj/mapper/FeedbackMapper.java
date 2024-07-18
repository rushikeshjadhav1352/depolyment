package dev.rushikeshj.mapper;

import com.feedback.api.model.Feedback;
import dev.rushikeshj.entity.FeedbackEntity;

import java.util.Optional;

public class FeedbackMapper {

    private FeedbackMapper() {
        // Nothing to be initialized
    }

    public static Feedback feedbackEntityToFeedback(final FeedbackEntity entity) {
        return Feedback.builder()
                .id(entity.getId())
                .comments(entity.getComments())
                .rating(entity.getRating())
                .customerId(entity.getCustomerId())
                .submittedate(entity.getSubmittedate())
                .build();
    }

    public static FeedbackEntity feedbackEntityToFeedback(final Feedback feedback) {
        return FeedbackEntity.builder()
                .id(feedback.getId())
                .comments(feedback.getComments())
                .rating(feedback.getRating())
                .submittedate(feedback.getSubmittedate())
                .customerId(feedback.getCustomerId())
                .build();
    }

}

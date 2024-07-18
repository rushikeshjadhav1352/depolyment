package dev.rushikeshj.controller;

import com.feedback.api.controller.FeedbackApi;
import com.feedback.api.model.Feedback;
import dev.rushikeshj.entity.FeedbackEntity;
import dev.rushikeshj.service.FeedbackService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

public class FeedbackController implements FeedbackApi {

    private final FeedbackService feedbackService;

    @Inject
    public FeedbackController(final FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    public Response getAllFeedback() {
        return feedbackService.getAllFeedback();
    }

    @Override
    public Response getFeedbackById(final Integer id) {
        return feedbackService.getFeedbackById(id);
    }

    @Override
    public Response storeFeedback(final Feedback feedback) {
        return feedbackService.storeFeedback(feedback);
    }

    @Override
    public Response updateFeedbackById(final Integer id, final Feedback feedback) {
        return feedbackService.updateFeedback(id, feedback);
    }

}

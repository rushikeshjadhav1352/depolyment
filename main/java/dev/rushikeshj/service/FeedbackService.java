package dev.rushikeshj.service;

import com.feedback.api.model.Feedback;
import dev.rushikeshj.entity.FeedbackEntity;
import jakarta.ws.rs.core.Response;

import java.util.List;

public interface FeedbackService {

    Response getAllFeedback();

    Response getFeedbackById(Integer id);

    Response storeFeedback(Feedback feedback);

    Response updateFeedback(Integer id, Feedback feedback);

}


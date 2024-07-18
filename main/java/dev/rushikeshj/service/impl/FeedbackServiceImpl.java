package dev.rushikeshj.service.impl;

import com.feedback.api.model.Feedback;
import dev.rushikeshj.entity.FeedbackEntity;
import dev.rushikeshj.mapper.FeedbackMapper;
import dev.rushikeshj.service.FeedbackService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@SuppressWarnings("squid:S3252")
public class FeedbackServiceImpl implements FeedbackService {

    @Override
    @Transactional
    public Response getAllFeedback() {
        final var feedbacks = FeedbackEntity.listAll();
        if (null == feedbacks || feedbacks.isEmpty()) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.ok(feedbacks).build();
    }

    @Override
    @Transactional
    public Response getFeedbackById(final Integer id) {
        final var feedbackEntity = (FeedbackEntity) FeedbackEntity.findById(Long.valueOf(id));
        if (null == feedbackEntity) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.ok(FeedbackMapper.feedbackEntityToFeedback(feedbackEntity)).build();
    }

    @Override
    @Transactional
    public Response storeFeedback(final Feedback feedback) {
        final var entity = FeedbackMapper.feedbackEntityToFeedback(feedback);
        FeedbackEntity.persist(entity);
        return getFeedbackById(entity.getId());
    }

    @Override
    public Response updateFeedback(final Integer id, final Feedback feedback) {
        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }
}

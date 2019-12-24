package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

//import com.diviso.graeshoppe.customerappgateway.client.store.domain.RatingReview;
import com.diviso.graeshoppe.customerappgateway.client.store.model.ReplyDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.ReviewDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingReviewDTO;

public interface StoreCommandService {
	public ResponseEntity<ReplyDTO> createReply( ReplyDTO replyDTO);
	public ResponseEntity<ReplyDTO> updateReply( ReplyDTO replyDTO);
	public ResponseEntity<Void> deleteReply(Long id);
	/*public ResponseEntity<UserRatingDTO> createUserRating( UserRatingDTO userRatingDTO);
	public ResponseEntity<UserRatingDTO> updateUserRating(UserRatingDTO userRatingDTO);
	public ResponseEntity<Void> deleteUserRating( Long id);*/
	/*public ResponseEntity<Page<RatingReview>> createRatingAndReview( RatingReview ratingReview,
			Pageable pageable) ;*/
	/*public ResponseEntity<ReviewDTO> createUserReview(ReviewDTO reviewDTO);
	public ResponseEntity<ReviewDTO> updateReview(ReviewDTO reviewDTO) ;
	public ResponseEntity<Void> deleteReview(Long id) ;*/
	public	ResponseEntity<UserRatingReviewDTO> createUserRatingReview(UserRatingReviewDTO userRatingReviewDTO);
	public ResponseEntity<Void> deleteUserRatingReview( Long id);
	public ResponseEntity<UserRatingReviewDTO> updateUserRatingReview(UserRatingReviewDTO userRatingReviewDTO);
}

package com.github.rudroid.issueorpullrequest;

import com.github.service.models.response.IssueOrPullRequest;
import com.github.service.models.response.type.PullRequestReviewDecision;

/* loaded from: /home/user/work/p/classes.dex */
public final class s1 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15801a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15802b;

        static {
            int[] iArr = new int[PullRequestReviewDecision.values().length];
            try {
                iArr[PullRequestReviewDecision.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestReviewDecision.CHANGES_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullRequestReviewDecision.REVIEW_REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15801a = iArr;
            int[] iArr2 = new int[IssueOrPullRequest.ReviewerReviewState.values().length];
            try {
                iArr2[IssueOrPullRequest.ReviewerReviewState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IssueOrPullRequest.ReviewerReviewState.APPROVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f15802b = iArr2;
        }
    }
}

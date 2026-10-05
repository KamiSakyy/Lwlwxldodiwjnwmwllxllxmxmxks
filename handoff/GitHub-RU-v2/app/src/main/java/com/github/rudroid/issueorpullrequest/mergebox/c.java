package com.github.rudroid.issueorpullrequest.mergebox;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeRequirementsState;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15603a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15604b;

        static {
            int[] iArr = new int[PullRequestMergeRequirementsState.values().length];
            try {
                iArr[PullRequestMergeRequirementsState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestMergeRequirementsState.MERGEABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullRequestMergeRequirementsState.UNMERGEABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PullRequestMergeRequirementsState.UNKNOWN__.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15603a = iArr;
            int[] iArr2 = new int[IssueOrPullRequestState.values().length];
            try {
                iArr2[IssueOrPullRequestState.PULL_REQUEST_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IssueOrPullRequestState.PULL_REQUEST_DRAFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IssueOrPullRequestState.PULL_REQUEST_MERGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IssueOrPullRequestState.PULL_REQUEST_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IssueOrPullRequestState.ISSUE_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[IssueOrPullRequestState.ISSUE_CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[IssueOrPullRequestState.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f15604b = iArr2;
        }
    }
}

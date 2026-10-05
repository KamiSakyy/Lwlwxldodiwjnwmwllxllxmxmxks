package com.github.rudroid.issueorpullrequest;

import com.github.service.models.response.IssueOrPullRequestState;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15585a;

        static {
            int[] iArr = new int[IssueOrPullRequestState.values().length];
            try {
                iArr[IssueOrPullRequestState.ISSUE_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_DRAFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IssueOrPullRequestState.ISSUE_CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f15585a = iArr;
        }
    }
}

package com.github.rudroid.issueorpullrequest.mergebox;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.type.MergeStateStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: com.github.rudroid.issueorpullrequest.mergebox.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0042a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15593a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15594b;

        static {
            int[] iArr = new int[IssueOrPullRequestState.values().length];
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_MERGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_DRAFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IssueOrPullRequestState.ISSUE_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IssueOrPullRequestState.ISSUE_CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IssueOrPullRequestState.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f15593a = iArr;
            int[] iArr2 = new int[MergeStateStatus.values().length];
            try {
                iArr2[MergeStateStatus.BEHIND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MergeStateStatus.DIRTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MergeStateStatus.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MergeStateStatus.HAS_HOOKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MergeStateStatus.UNSTABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MergeStateStatus.CLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f15594b = iArr2;
        }
    }
}

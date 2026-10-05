package vl0;

import com.github.service.models.response.type.PullRequestReviewEvent;
import gn0.qm;
import gn0.rm;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestReviewEvent.values().length];
        try {
            iArr[PullRequestReviewEvent.UNKNOWN__.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestReviewEvent.COMMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PullRequestReviewEvent.APPROVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PullRequestReviewEvent.REQUEST_CHANGES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PullRequestReviewEvent.DISMISS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[rm.values().length];
        try {
            qm qmVar = rm.Companion;
            iArr2[4] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            qm qmVar2 = rm.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            qm qmVar3 = rm.Companion;
            iArr2[0] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            qm qmVar4 = rm.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            qm qmVar5 = rm.Companion;
            iArr2[2] = 5;
        } catch (NoSuchFieldError unused10) {
        }
    }
}

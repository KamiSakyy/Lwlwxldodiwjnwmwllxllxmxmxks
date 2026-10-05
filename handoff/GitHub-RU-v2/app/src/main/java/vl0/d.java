package vl0;

import com.github.service.models.HideCommentReason;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HideCommentReason.values().length];
        try {
            iArr[HideCommentReason.Spam.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HideCommentReason.Abuse.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HideCommentReason.OffTopic.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HideCommentReason.Outdated.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HideCommentReason.Duplicate.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[HideCommentReason.Resolved.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}

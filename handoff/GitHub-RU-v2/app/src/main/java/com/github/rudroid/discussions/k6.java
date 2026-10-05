package com.github.rudroid.discussions;

import com.github.service.models.response.discussions.type.DiscussionStateReason;

/* loaded from: /home/user/work/p/classes.dex */
public final class k6 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11445a;

        static {
            int[] iArr = new int[DiscussionStateReason.values().length];
            try {
                iArr[DiscussionStateReason.DUPLICATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscussionStateReason.OUTDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscussionStateReason.RESOLVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11445a = iArr;
        }
    }

    public static final int a(DiscussionStateReason discussionStateReason) {
        int i = discussionStateReason == null ? -1 : a.f11445a[discussionStateReason.ordinal()];
        if (i == 1) {
            return 2131953678;
        }
        if (i != 2) {
            return i != 3 ? 2131953931 : 2131953680;
        }
        return 2131953679;
    }

    public static final int b(DiscussionStateReason discussionStateReason) {
        int i = discussionStateReason == null ? -1 : a.f11445a[discussionStateReason.ordinal()];
        if (i == 1) {
            return 2131231226;
        }
        if (i != 2) {
            return i != 3 ? 2131231201 : 2131231223;
        }
        return 2131231229;
    }
}

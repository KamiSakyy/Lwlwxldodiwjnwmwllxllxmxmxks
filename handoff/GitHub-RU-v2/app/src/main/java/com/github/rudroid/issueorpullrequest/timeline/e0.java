package com.github.rudroid.issueorpullrequest.timeline;

import com.github.service.models.response.TimelineItem;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16147a;

        static {
            int[] iArr = new int[TimelineItem.TimelineLockedEvent.Reason.values().length];
            try {
                iArr[TimelineItem.TimelineLockedEvent.Reason.TOO_HEATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineItem.TimelineLockedEvent.Reason.SPAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineItem.TimelineLockedEvent.Reason.OFF_TOPIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimelineItem.TimelineLockedEvent.Reason.RESOLVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16147a = iArr;
        }
    }
}

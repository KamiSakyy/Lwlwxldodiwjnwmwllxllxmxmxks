package com.github.rudroid.widget.pullrequests;

import com.github.service.models.response.PullsWidgetFilter;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PullsWidgetFilter.values().length];
            try {
                iArr[PullsWidgetFilter.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullsWidgetFilter.REVIEW_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullsWidgetFilter.ASSIGNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PullsWidgetFilter.MENTIONED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final int a(PullsWidgetFilter pullsWidgetFilter) {
        k71.k.g(pullsWidgetFilter, "<this>");
        int i = a.a[pullsWidgetFilter.ordinal()];
        if (i == 1) {
            return 2131953484;
        }
        if (i == 2) {
            return 2131953487;
        }
        if (i == 3) {
            return 2131953483;
        }
        if (i == 4) {
            return 2131953485;
        }
        throw new NoWhenBranchMatchedException();
    }
}

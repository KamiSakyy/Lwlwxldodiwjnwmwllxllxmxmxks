package com.github.rudroid.utilities;

import android.content.Context;
import com.github.service.models.response.type.PullRequestMergeMethod;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PullRequestMergeMethod.values().length];
            try {
                iArr[PullRequestMergeMethod.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestMergeMethod.UNKNOWN__.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullRequestMergeMethod.REBASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PullRequestMergeMethod.SQUASH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final int a(PullRequestMergeMethod pullRequestMergeMethod, boolean z) {
        k71.k.g(pullRequestMergeMethod, "<this>");
        if (z) {
            int i = a.a[pullRequestMergeMethod.ordinal()];
            if (i == 1 || i == 2) {
                return 2131954794;
            }
            if (i == 3) {
                return 2131954795;
            }
            if (i == 4) {
                return 2131954796;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = a.a[pullRequestMergeMethod.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 2131954815;
        }
        if (i2 == 3) {
            return 2131954830;
        }
        if (i2 == 4) {
            return 2131954831;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(PullRequestMergeMethod pullRequestMergeMethod, Context context) {
        k71.k.g(pullRequestMergeMethod, "<this>");
        int i = a.a[pullRequestMergeMethod.ordinal()];
        if (i == 1 || i == 2) {
            String string = context.getString(2131954815);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (i == 3) {
            String string2 = context.getString(2131954830);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = context.getString(2131954831);
        k71.k.f(string3, "getString(...)");
        return string3;
    }
    public Object d(Object p1, Object p2) { return null; }
    public Object d(Object p1, Object p2) { return null; }
}

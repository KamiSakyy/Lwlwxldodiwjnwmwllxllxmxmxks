package rl0;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import gn0.f9;
import gn0.g9;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiscussionCloseReason.values().length];
        try {
            iArr[DiscussionCloseReason.DUPLICATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscussionCloseReason.OUTDATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiscussionCloseReason.RESOLVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DiscussionCloseReason.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[g9.values().length];
        try {
            f9 f9Var = g9.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9 f9Var2 = g9.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f9 f9Var3 = g9.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f9 f9Var4 = g9.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

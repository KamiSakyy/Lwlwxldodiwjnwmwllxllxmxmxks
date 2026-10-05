package dz;

import com.github.service.models.response.type.SubscriptionState;
import m10.xa0;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class r {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SubscriptionState.values().length];
        try {
            iArr[SubscriptionState.UNKNOWN__.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionState.UNSUBSCRIBED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionState.RELEASES_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SubscriptionState.SUBSCRIBED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SubscriptionState.IGNORED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SubscriptionState.CUSTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[ya0.values().length];
        try {
            xa0 xa0Var = ya0.Companion;
            iArr2[4] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            xa0 xa0Var2 = ya0.Companion;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            xa0 xa0Var3 = ya0.Companion;
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            xa0 xa0Var4 = ya0.Companion;
            iArr2[1] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            xa0 xa0Var5 = ya0.Companion;
            iArr2[0] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            xa0 xa0Var6 = ya0.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}

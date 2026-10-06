package kx0;

import com.github.service.models.response.type.SubscriptionState;
import pz0.ql;
import pz0.rl;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class kShadow {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rl.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ql qlVar = rl.Companion;
            iArr[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ql qlVar2 = rl.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ql qlVar3 = rl.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ql qlVar4 = rl.Companion;
            iArr[3] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ql qlVar5 = rl.Companion;
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[SubscriptionState.values().length];
        try {
            iArr2[SubscriptionState.SUBSCRIBED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr2;
    }
}

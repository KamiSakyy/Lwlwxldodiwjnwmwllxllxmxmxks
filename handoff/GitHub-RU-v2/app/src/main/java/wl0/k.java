package wl0;

import com.github.service.models.response.type.SubscriptionState;
import gn0.si;
import gn0.ti;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ti.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            si siVar = ti.Companion;
            iArr[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            si siVar2 = ti.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            si siVar3 = ti.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            si siVar4 = ti.Companion;
            iArr[3] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            si siVar5 = ti.Companion;
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

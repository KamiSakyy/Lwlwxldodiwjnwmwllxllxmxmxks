package fz;

import com.github.service.models.response.type.SubscriptionState;
import m10.tq;
import m10.uq;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[uq.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            tq tqVar = uq.Companion;
            iArr[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            tq tqVar2 = uq.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            tq tqVar3 = uq.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            tq tqVar4 = uq.Companion;
            iArr[3] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            tq tqVar5 = uq.Companion;
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

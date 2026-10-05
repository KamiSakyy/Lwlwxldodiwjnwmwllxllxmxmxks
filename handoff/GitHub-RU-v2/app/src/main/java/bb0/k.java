package bb0;

import com.github.service.models.response.type.SubscriptionState;
import hc0.sh;
import hc0.th;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[th.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            sh shVar = th.Companion;
            iArr[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            sh shVar2 = th.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            sh shVar3 = th.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            sh shVar4 = th.Companion;
            iArr[3] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            sh shVar5 = th.Companion;
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

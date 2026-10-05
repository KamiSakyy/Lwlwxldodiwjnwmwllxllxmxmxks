package ab0;

import com.github.service.models.response.type.SubscriptionState;
import hc0.dv;
import hc0.ev;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class o {
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
        int[] iArr2 = new int[ev.values().length];
        try {
            dv dvVar = ev.Companion;
            iArr2[4] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            dv dvVar2 = ev.Companion;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            dv dvVar3 = ev.Companion;
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            dv dvVar4 = ev.Companion;
            iArr2[1] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            dv dvVar5 = ev.Companion;
            iArr2[0] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            dv dvVar6 = ev.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}

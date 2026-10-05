package pl0;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import gn0.wc;
import gn0.xc;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class o {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[xc.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            wc wcVar = xc.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            wc wcVar2 = xc.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[CloseReason.values().length];
        try {
            iArr2[CloseReason.Completed.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CloseReason.NotPlanned.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CloseReason.Duplicate.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr2;
    }
}

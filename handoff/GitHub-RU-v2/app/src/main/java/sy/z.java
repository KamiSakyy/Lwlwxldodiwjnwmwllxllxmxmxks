package sy;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import m10.vi;
import m10.wi;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class z {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[wi.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            vi viVar = wi.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            vi viVar2 = wi.Companion;
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

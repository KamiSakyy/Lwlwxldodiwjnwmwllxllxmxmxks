package dx0;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import pz0.ga;
import pz0.ha;

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
        int[] iArr2 = new int[ha.values().length];
        try {
            ga gaVar = ha.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ga gaVar2 = ha.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            ga gaVar3 = ha.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            ga gaVar4 = ha.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

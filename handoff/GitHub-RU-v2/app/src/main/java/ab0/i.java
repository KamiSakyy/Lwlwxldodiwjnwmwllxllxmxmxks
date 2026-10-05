package ab0;

import com.github.service.models.response.PullRequestState;
import hc0.em;
import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestState.values().length];
        try {
            iArr[PullRequestState.OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestState.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PullRequestState.MERGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PullRequestState.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[fm.values().length];
        try {
            em emVar = fm.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            em emVar2 = fm.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            em emVar3 = fm.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            em emVar4 = fm.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr2;
    }
}

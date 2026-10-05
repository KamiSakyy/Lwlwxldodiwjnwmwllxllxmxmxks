package vl0;

import com.github.service.models.response.PullRequestState;
import gn0.gn;
import gn0.hn;

/* loaded from: /home/user/work/p/classes4.dex */
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
        int[] iArr2 = new int[hn.values().length];
        try {
            gn gnVar = hn.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            gn gnVar2 = hn.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            gn gnVar3 = hn.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            gn gnVar4 = hn.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr2;
    }
}

package jx0;

import com.github.service.models.response.PullRequestState;
import pz0.fu;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class j {
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
        int[] iArr2 = new int[gu.values().length];
        try {
            fu fuVar = gu.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            fu fuVar2 = gu.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            fu fuVar3 = gu.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            fu fuVar4 = gu.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr2;
    }
}

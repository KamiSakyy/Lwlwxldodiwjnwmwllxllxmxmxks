package vl0;

import com.github.service.models.response.type.PullRequestMergeMethod;
import gn0.am;
import gn0.bm;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestMergeMethod.values().length];
        try {
            iArr[PullRequestMergeMethod.UNKNOWN__.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestMergeMethod.MERGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PullRequestMergeMethod.SQUASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PullRequestMergeMethod.REBASE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[bm.values().length];
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            am amVar = bm.Companion;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            am amVar2 = bm.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            am amVar3 = bm.Companion;
            iArr2[1] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

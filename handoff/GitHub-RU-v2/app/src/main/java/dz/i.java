package dz;

import com.github.service.models.response.type.PullRequestMergeMethod;
import m10.oy;
import m10.py;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class i {
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
        int[] iArr2 = new int[py.values().length];
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            oy oyVar = py.Companion;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            oy oyVar2 = py.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            oy oyVar3 = py.Companion;
            iArr2[1] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

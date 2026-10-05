package ab0;

import com.github.service.models.response.type.PullRequestMergeMethod;
import hc0.yk;
import hc0.zk;

/* loaded from: /home/user/work/p/classes3.dex */
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
        int[] iArr2 = new int[zk.values().length];
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            yk ykVar = zk.Companion;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            yk ykVar2 = zk.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            yk ykVar3 = zk.Companion;
            iArr2[1] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

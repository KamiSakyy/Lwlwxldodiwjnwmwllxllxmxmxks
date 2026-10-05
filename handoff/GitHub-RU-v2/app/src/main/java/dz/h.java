package dz;

import com.github.service.models.response.issueorpullrequest.PullRequestMergeAction;
import m10.my;
import m10.ny;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestMergeAction.values().length];
        try {
            iArr[PullRequestMergeAction.UNKNOWN__.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestMergeAction.MERGE_QUEUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PullRequestMergeAction.DIRECT_MERGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ny.values().length];
        try {
            my myVar = ny.Companion;
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            my myVar2 = ny.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            my myVar3 = ny.Companion;
            iArr2[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

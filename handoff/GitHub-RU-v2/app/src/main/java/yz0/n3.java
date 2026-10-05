package yz0;

import com.github.service.models.response.PullRequestState;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class n3 {
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
        a = iArr;
    }
}

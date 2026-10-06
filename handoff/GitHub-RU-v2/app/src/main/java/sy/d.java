package sy;

import com.github.service.models.response.type.PullRequestMergeMethod;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestMergeMethod.values().length];
        try {
            iArr[PullRequestMergeMethod.MERGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestMergeMethod.UNKNOWN__.ordinal()] = 2;
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
    }
    public Object a(Object p1) { return null; }
    public Object startsWith(Object p1) { return null; }
    public static final Object a = null;
    public Object a(Object) { return null; }
    public Object startsWith(Object) { return null; }
}

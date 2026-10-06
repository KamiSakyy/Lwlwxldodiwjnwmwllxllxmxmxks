package sy;

import com.github.service.models.response.type.DiffLineType;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiffLineType.values().length];
        try {
            iArr[DiffLineType.DELETION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiffLineType.ADDITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiffLineType.CONTEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DiffLineType.INJECTED_CONTEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DiffLineType.HUNK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DiffLineType.UNKNOWN__.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
    public Object h0(Object p1, Object p2) { return null; }
    public static final Object a = null;
}

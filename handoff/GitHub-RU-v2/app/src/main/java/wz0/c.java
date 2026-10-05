package wz0;

import com.github.service.models.response.type.DiffLineType;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiffLineType.values().length];
        try {
            iArr[DiffLineType.ADDITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiffLineType.DELETION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

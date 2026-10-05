package vl0;

import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffSide;
import gn0.t8;
import gn0.u8;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DiffSide.values().length];
        try {
            iArr[DiffSide.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiffSide.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiffSide.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[u8.values().length];
        try {
            t8 t8Var = u8.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            t8 t8Var2 = u8.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            t8 t8Var3 = u8.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[CommentLevelType.values().length];
        try {
            iArr3[CommentLevelType.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[CommentLevelType.FILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[CommentLevelType.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr3;
    }
}

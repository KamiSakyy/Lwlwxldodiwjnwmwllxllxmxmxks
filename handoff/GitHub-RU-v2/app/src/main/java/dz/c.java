package dz;

import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffSide;
import m10.yc;
import m10.zc;

/* loaded from: /home/user/work/p/classes3.dex */
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
        int[] iArr2 = new int[zc.values().length];
        try {
            yc ycVar = zc.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            yc ycVar2 = zc.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            yc ycVar3 = zc.Companion;
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

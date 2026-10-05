package dz;

import com.github.service.models.response.shortcuts.ShortcutType;
import m10.x70;
import m10.y70;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ShortcutType.values().length];
        try {
            iArr[ShortcutType.ISSUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShortcutType.PULL_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShortcutType.DISCUSSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShortcutType.REPOSITORIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[y70.values().length];
        try {
            x70 x70Var = y70.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            x70 x70Var2 = y70.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            x70 x70Var3 = y70.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            x70 x70Var4 = y70.Companion;
            iArr2[4] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            x70 x70Var5 = y70.Companion;
            iArr2[3] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}

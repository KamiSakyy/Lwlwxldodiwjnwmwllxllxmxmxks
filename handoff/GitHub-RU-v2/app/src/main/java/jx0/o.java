package jx0;

import com.github.service.models.response.shortcuts.ShortcutType;
import pz0.x10;
import pz0.y10;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class o {
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
        int[] iArr2 = new int[y10.values().length];
        try {
            x10 x10Var = y10.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            x10 x10Var2 = y10.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            x10 x10Var3 = y10.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            x10 x10Var4 = y10.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}

package ab0;

import com.github.service.models.response.shortcuts.ShortcutType;
import hc0.kt;
import hc0.lt;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class m {
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
        int[] iArr2 = new int[lt.values().length];
        try {
            kt ktVar = lt.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            kt ktVar2 = lt.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            kt ktVar3 = lt.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            kt ktVar4 = lt.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}

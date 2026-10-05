package vl0;

import com.github.service.models.response.shortcuts.ShortcutColor;
import gn0.ht;
import gn0.jt;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ShortcutColor.values().length];
        try {
            iArr[ShortcutColor.GRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShortcutColor.BLUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ShortcutColor.GREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ShortcutColor.ORANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ShortcutColor.RED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ShortcutColor.PINK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ShortcutColor.PURPLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[jt.values().length];
        try {
            ht htVar = jt.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            ht htVar2 = jt.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            ht htVar3 = jt.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            ht htVar4 = jt.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            ht htVar5 = jt.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            ht htVar6 = jt.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            ht htVar7 = jt.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            ht htVar8 = jt.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}

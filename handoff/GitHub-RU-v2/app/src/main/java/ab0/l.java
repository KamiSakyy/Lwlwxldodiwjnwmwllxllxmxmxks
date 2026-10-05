package ab0;

import com.github.service.models.response.shortcuts.ShortcutColor;
import hc0.ds;
import hc0.es;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class l {
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
        int[] iArr2 = new int[es.values().length];
        try {
            ds dsVar = es.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            ds dsVar2 = es.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            ds dsVar3 = es.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            ds dsVar4 = es.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            ds dsVar5 = es.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            ds dsVar6 = es.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            ds dsVar7 = es.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            ds dsVar8 = es.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}

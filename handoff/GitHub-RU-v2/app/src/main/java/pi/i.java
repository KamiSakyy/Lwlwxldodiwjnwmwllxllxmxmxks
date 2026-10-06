package pi;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final h Companion;
    public static final i s;
    public static final i t;
    public static final i u;
    public static final i v;
    public static final i w;
    public static final i x;
    public static final /* synthetic */ i[] y;
    public int r;

    static {
        i iVar = new i(0, "BLACK", 0);
        i iVar2 = new i(1, "RED", 1);
        s = iVar2;
        i iVar3 = new i(2, "GREEN", 2);
        t = iVar3;
        i iVar4 = new i(3, "YELLOW", 3);
        u = iVar4;
        i iVar5 = new i(4, "BLUE", 4);
        v = iVar5;
        i iVar6 = new i(5, "MAGENTA", 5);
        w = iVar6;
        i iVar7 = new i(6, "CYAN", 6);
        i iVar8 = new i(7, "WHITE", 7);
        x = iVar8;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8};
        y = iVarArr;
        l0.t(iVarArr);
        Companion = new h();
    }

    public i(int i, String str, int i2) {
        this.r = i2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) y.clone();
    }
}

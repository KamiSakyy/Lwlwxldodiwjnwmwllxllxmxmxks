package pi;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final c Companion;
    public static final d s;
    public static final d t;
    public static final /* synthetic */ d[] u;
    public int r;

    static {
        d dVar = new d(0, "RESET", 0);
        d dVar2 = new d(1, "BOLD", 1);
        d dVar3 = new d(2, "ITALIC", 3);
        d dVar4 = new d(3, "UNDERLINE", 4);
        d dVar5 = new d(4, "NOT_BOLD", 22);
        d dVar6 = new d(5, "NOT_ITALIC", 23);
        d dVar7 = new d(6, "NOT_UNDERLINE", 24);
        d dVar8 = new d(7, "SET_FOREGROUND", 38);
        s = dVar8;
        d dVar9 = new d(8, "DEFAULT_FOREGROUND", 39);
        d dVar10 = new d(9, "SET_BACKGROUND", 48);
        t = dVar10;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, new d(10, "DEFAULT_BACKGROUND", 49)};
        u = dVarArr;
        l0.t(dVarArr);
        Companion = new c();
    }

    public d(int i, String str, int i2) {
        this.r = i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) u.clone();
    }
}

package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class jt {
    public static final jt A;
    public static final /* synthetic */ jt[] B;
    public static final /* synthetic */ d71.b C;
    public static final ht Companion;
    public static final aa.a0 s;
    public static final jt t;
    public static final jt u;
    public static final jt v;
    public static final jt w;
    public static final jt x;
    public static final jt y;
    public static final jt z;
    public final String r;

    static {
        jt jtVar = new jt("BLUE", 0, "BLUE");
        t = jtVar;
        jt jtVar2 = new jt("GRAY", 1, "GRAY");
        u = jtVar2;
        jt jtVar3 = new jt("GREEN", 2, "GREEN");
        v = jtVar3;
        jt jtVar4 = new jt("ORANGE", 3, "ORANGE");
        w = jtVar4;
        jt jtVar5 = new jt("PINK", 4, "PINK");
        x = jtVar5;
        jt jtVar6 = new jt("PURPLE", 5, "PURPLE");
        y = jtVar6;
        jt jtVar7 = new jt("RED", 6, "RED");
        z = jtVar7;
        jt jtVar8 = new jt("UNKNOWN__", 7, "UNKNOWN__");
        A = jtVar8;
        jt[] jtVarArr = {jtVar, jtVar2, jtVar3, jtVar4, jtVar5, jtVar6, jtVar7, jtVar8};
        B = jtVarArr;
        C = v8.l0.t(jtVarArr);
        Companion = new ht();
        x61.l.r(new String[]{"BLUE", "GRAY", "GREEN", "ORANGE", "PINK", "PURPLE", "RED"});
        s = new aa.a0("SearchShortcutColor");
    }

    public jt(String str, int i, String str2) {
        this.r = str2;
    }

    public static jt valueOf(String str) {
        return (jt) Enum.valueOf(jt.class, str);
    }

    public static jt[] values() {
        return (jt[]) B.clone();
    }
}

package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class xl {
    public static final wl Companion;
    public static final aa.a0 s;
    public static final xl t;
    public static final xl u;
    public static final xl v;
    public static final /* synthetic */ xl[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        xl xlVar = new xl("ASC", 0, "ASC");
        t = xlVar;
        xl xlVar2 = new xl("DESC", 1, "DESC");
        u = xlVar2;
        xl xlVar3 = new xl("UNKNOWN__", 2, "UNKNOWN__");
        v = xlVar3;
        xl[] xlVarArr = {xlVar, xlVar2, xlVar3};
        w = xlVarArr;
        x = v8.l0.t(xlVarArr);
        Companion = new wl();
        x61.l.r(new String[]{"ASC", "DESC"});
        s = new aa.a0("OrderDirection");
    }

    public xl(String str, int i, String str2) {
        this.r = str2;
    }

    public static xl valueOf(String str) {
        return (xl) Enum.valueOf(xl.class, str);
    }

    public static xl[] values() {
        return (xl[]) w.clone();
    }
}

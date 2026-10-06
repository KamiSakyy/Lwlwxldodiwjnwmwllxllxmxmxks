package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class xo {
    public static final wo Companion;
    public static final xo s;
    public static final xo t;
    public static final /* synthetic */ xo[] u;
    public final String r;

    static {
        xo xoVar = new xo("AUTH", 0, "AUTH");
        s = xoVar;
        xo xoVar2 = new xo("RECOVERY", 1, "RECOVERY");
        t = xoVar2;
        xo[] xoVarArr = {xoVar, xoVar2, new xo("UNKNOWN__", 2, "UNKNOWN__")};
        u = xoVarArr;
        v8.l0.t(xoVarArr);
        Companion = new wo();
        sy.d0.o("AUTH", "RECOVERY");
    }

    public xo(String str, int i, String str2) {
        this.r = str2;
    }

    public static xo valueOf(String str) {
        return (xo) Enum.valueOf(xo.class, str);
    }

    public static xo[] values() {
        return (xo[]) u.clone();
    }
}

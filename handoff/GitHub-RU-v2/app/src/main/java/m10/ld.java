package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ld {
    public static final kd Companion;
    public static final ld s;
    public static final ld t;
    public static final ld u;
    public static final ld v;
    public static final /* synthetic */ ld[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        ld ldVar = new ld("DUPLICATE", 0, "DUPLICATE");
        s = ldVar;
        ld ldVar2 = new ld("OUTDATED", 1, "OUTDATED");
        t = ldVar2;
        ld ldVar3 = new ld("RESOLVED", 2, "RESOLVED");
        u = ldVar3;
        ld ldVar4 = new ld("UNKNOWN__", 3, "UNKNOWN__");
        v = ldVar4;
        ld[] ldVarArr = {ldVar, ldVar2, ldVar3, ldVar4};
        w = ldVarArr;
        x = v8.l0.t(ldVarArr);
        Companion = new kd();
        sy.d0.o("DUPLICATE", "OUTDATED", "RESOLVED");
    }

    public ld(String str, int i, String str2) {
        this.r = str2;
    }

    public static ld valueOf(String str) {
        return (ld) Enum.valueOf(ld.class, str);
    }

    public static ld[] values() {
        return (ld[]) w.clone();
    }
}

package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class yv {
    public static final xv Companion;
    public static final aa.a0 s;
    public static final yv t;
    public static final /* synthetic */ yv[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        yv yvVar = new yv("ERROR", 0, "ERROR");
        yv yvVar2 = new yv("EXPECTED", 1, "EXPECTED");
        yv yvVar3 = new yv("FAILURE", 2, "FAILURE");
        yv yvVar4 = new yv("PENDING", 3, "PENDING");
        yv yvVar5 = new yv("SUCCESS", 4, "SUCCESS");
        yv yvVar6 = new yv("UNKNOWN__", 5, "UNKNOWN__");
        t = yvVar6;
        yv[] yvVarArr = {yvVar, yvVar2, yvVar3, yvVar4, yvVar5, yvVar6};
        u = yvVarArr;
        v = v8.l0.t(yvVarArr);
        Companion = new xv();
        x61.l.r(new String[]{"ERROR", "EXPECTED", "FAILURE", "PENDING", "SUCCESS"});
        s = new aa.a0("StatusState");
    }

    public yv(String str, int i, String str2) {
        this.r = str2;
    }

    public static yv valueOf(String str) {
        return (yv) Enum.valueOf(yv.class, str);
    }

    public static yv[] values() {
        return (yv[]) u.clone();
    }
}

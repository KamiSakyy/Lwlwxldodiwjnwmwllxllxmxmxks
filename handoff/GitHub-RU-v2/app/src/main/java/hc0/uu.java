package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class uu {
    public static final tu Companion;
    public static final aa.a0 s;
    public static final uu t;
    public static final /* synthetic */ uu[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        uu uuVar = new uu("ERROR", 0, "ERROR");
        uu uuVar2 = new uu("EXPECTED", 1, "EXPECTED");
        uu uuVar3 = new uu("FAILURE", 2, "FAILURE");
        uu uuVar4 = new uu("PENDING", 3, "PENDING");
        uu uuVar5 = new uu("SUCCESS", 4, "SUCCESS");
        uu uuVar6 = new uu("UNKNOWN__", 5, "UNKNOWN__");
        t = uuVar6;
        uu[] uuVarArr = {uuVar, uuVar2, uuVar3, uuVar4, uuVar5, uuVar6};
        u = uuVarArr;
        v = v8.l0.t(uuVarArr);
        Companion = new tu();
        x61.l.r(new String[]{"ERROR", "EXPECTED", "FAILURE", "PENDING", "SUCCESS"});
        s = new aa.a0("StatusState");
    }

    public uu(String str, int i, String str2) {
        this.r = str2;
    }

    public static uu valueOf(String str) {
        return (uu) Enum.valueOf(uu.class, str);
    }

    public static uu[] values() {
        return (uu[]) u.clone();
    }
    public Object ordinal() { return null; }
}

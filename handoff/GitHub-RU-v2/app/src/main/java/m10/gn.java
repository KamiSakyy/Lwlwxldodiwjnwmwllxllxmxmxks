package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class gn {
    public static final fn Companion;
    public static final aa.a0 s;
    public static final gn t;
    public static final /* synthetic */ gn[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        gn gnVar = new gn("CLOSED", 0, "CLOSED");
        gn gnVar2 = new gn("OPEN", 1, "OPEN");
        gn gnVar3 = new gn("UNKNOWN__", 2, "UNKNOWN__");
        t = gnVar3;
        gn[] gnVarArr = {gnVar, gnVar2, gnVar3};
        u = gnVarArr;
        v = v8.l0.t(gnVarArr);
        Companion = new fn();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("MilestoneState");
    }

    public gn(String str, int i, String str2) {
        this.r = str2;
    }

    public static gn valueOf(String str) {
        return (gn) Enum.valueOf(gn.class, str);
    }

    public static gn[] values() {
        return (gn[]) u.clone();
    }
}

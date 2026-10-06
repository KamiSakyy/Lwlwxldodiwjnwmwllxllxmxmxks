package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class og {
    public static final ng Companion;
    public static final aa.a0 s;
    public static final og t;
    public static final /* synthetic */ og[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        og ogVar = new og("CLOSED", 0, "CLOSED");
        og ogVar2 = new og("OPEN", 1, "OPEN");
        og ogVar3 = new og("UNKNOWN__", 2, "UNKNOWN__");
        t = ogVar3;
        og[] ogVarArr = {ogVar, ogVar2, ogVar3};
        u = ogVarArr;
        v = v8.l0.t(ogVarArr);
        Companion = new ng();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("MilestoneState");
    }

    public og(String str, int i, String str2) {
        this.r = str2;
    }

    public static og valueOf(String str) {
        return (og) Enum.valueOf(og.class, str);
    }

    public static og[] values() {
        return (og[]) u.clone();
    }
    public Object ordinal() { return null; }
}

package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class of {
    public static final nf Companion;
    public static final aa.a0 s;
    public static final of t;
    public static final /* synthetic */ of[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        of ofVar = new of("CLOSED", 0, "CLOSED");
        of ofVar2 = new of("OPEN", 1, "OPEN");
        of ofVar3 = new of("UNKNOWN__", 2, "UNKNOWN__");
        t = ofVar3;
        of[] ofVarArr = {ofVar, ofVar2, ofVar3};
        u = ofVarArr;
        v = v8.l0.t(ofVarArr);
        Companion = new nf();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("MilestoneState");
    }

    public of(String str, int i, String str2) {
        this.r = str2;
    }

    public static of valueOf(String str) {
        return (of) Enum.valueOf(of.class, str);
    }

    public static of[] values() {
        return (of[]) u.clone();
    }
}

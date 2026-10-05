package pz0;

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
        of ofVar = new of("BLUE", 0, "BLUE");
        of ofVar2 = new of("GRAY", 1, "GRAY");
        of ofVar3 = new of("GREEN", 2, "GREEN");
        of ofVar4 = new of("ORANGE", 3, "ORANGE");
        of ofVar5 = new of("PINK", 4, "PINK");
        of ofVar6 = new of("PURPLE", 5, "PURPLE");
        of ofVar7 = new of("RED", 6, "RED");
        of ofVar8 = new of("YELLOW", 7, "YELLOW");
        of ofVar9 = new of("UNKNOWN__", 8, "UNKNOWN__");
        t = ofVar9;
        of[] ofVarArr = {ofVar, ofVar2, ofVar3, ofVar4, ofVar5, ofVar6, ofVar7, ofVar8, ofVar9};
        u = ofVarArr;
        v = v8.l0.t(ofVarArr);
        Companion = new nf();
        x61.l.r(new String[]{"BLUE", "GRAY", "GREEN", "ORANGE", "PINK", "PURPLE", "RED", "YELLOW"});
        s = new aa.a0("IssueTypeColor");
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

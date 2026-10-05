package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class lc {
    public static final kc Companion;
    public static final aa.a0 s;
    public static final lc t;
    public static final lc u;
    public static final lc v;
    public static final lc w;
    public static final /* synthetic */ lc[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        lc lcVar = new lc("COMPLETED", 0, "COMPLETED");
        t = lcVar;
        lc lcVar2 = new lc("NOT_PLANNED", 1, "NOT_PLANNED");
        u = lcVar2;
        lc lcVar3 = new lc("REOPENED", 2, "REOPENED");
        v = lcVar3;
        lc lcVar4 = new lc("UNKNOWN__", 3, "UNKNOWN__");
        w = lcVar4;
        lc[] lcVarArr = {lcVar, lcVar2, lcVar3, lcVar4};
        x = lcVarArr;
        y = v8.l0.t(lcVarArr);
        Companion = new kc();
        x61.l.r(new String[]{"COMPLETED", "NOT_PLANNED", "REOPENED"});
        s = new aa.a0("IssueStateReason");
    }

    public lc(String str, int i, String str2) {
        this.r = str2;
    }

    public static lc valueOf(String str) {
        return (lc) Enum.valueOf(lc.class, str);
    }

    public static lc[] values() {
        return (lc[]) x.clone();
    }
}

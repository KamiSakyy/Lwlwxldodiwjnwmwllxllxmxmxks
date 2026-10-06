package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class tq {
    public static final sq Companion;
    public static final aa.a0 s;
    public static final tq t;
    public static final tq u;
    public static final /* synthetic */ tq[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        tq tqVar = new tq("DRAFT_ISSUE", 0, "DRAFT_ISSUE");
        tq tqVar2 = new tq("ISSUE", 1, "ISSUE");
        tq tqVar3 = new tq("PULL_REQUEST", 2, "PULL_REQUEST");
        tq tqVar4 = new tq("REDACTED", 3, "REDACTED");
        t = tqVar4;
        tq tqVar5 = new tq("UNKNOWN__", 4, "UNKNOWN__");
        u = tqVar5;
        tq[] tqVarArr = {tqVar, tqVar2, tqVar3, tqVar4, tqVar5};
        v = tqVarArr;
        w = v8.l0.t(tqVarArr);
        Companion = new sq();
        x61.l.r(new String[]{"DRAFT_ISSUE", "ISSUE", "PULL_REQUEST", "REDACTED"});
        s = new aa.a0("ProjectV2ItemType");
    }

    public tq(String str, int i, String str2) {
        this.r = str2;
    }

    public static tq valueOf(String str) {
        return (tq) Enum.valueOf(tq.class, str);
    }

    public static tq[] values() {
        return (tq[]) v.clone();
    }
}

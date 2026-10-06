package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ew {
    public static final dw Companion;
    public static final aa.a0 s;
    public static final ew t;
    public static final ew u;
    public static final /* synthetic */ ew[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        ew ewVar = new ew("DRAFT_ISSUE", 0, "DRAFT_ISSUE");
        ew ewVar2 = new ew("ISSUE", 1, "ISSUE");
        ew ewVar3 = new ew("PULL_REQUEST", 2, "PULL_REQUEST");
        ew ewVar4 = new ew("REDACTED", 3, "REDACTED");
        t = ewVar4;
        ew ewVar5 = new ew("UNKNOWN__", 4, "UNKNOWN__");
        u = ewVar5;
        ew[] ewVarArr = {ewVar, ewVar2, ewVar3, ewVar4, ewVar5};
        v = ewVarArr;
        w = v8.l0.t(ewVarArr);
        Companion = new dw();
        x61.l.r(new String[]{"DRAFT_ISSUE", "ISSUE", "PULL_REQUEST", "REDACTED"});
        s = new aa.a0("ProjectV2ItemType");
    }

    public ew(String str, int i, String str2) {
        this.r = str2;
    }

    public static ew valueOf(String str) {
        return (ew) Enum.valueOf(ew.class, str);
    }

    public static ew[] values() {
        return (ew[]) v.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ry {
    public static final qy Companion;
    public static final aa.a0 s;
    public static final ry t;
    public static final /* synthetic */ ry[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        ry ryVar = new ry("ALLOWED", 0, "ALLOWED");
        ry ryVar2 = new ry("ALLOWED_WITH_BYPASS", 1, "ALLOWED_WITH_BYPASS");
        ry ryVar3 = new ry("BLOCKED", 2, "BLOCKED");
        ry ryVar4 = new ry("UNKNOWN__", 3, "UNKNOWN__");
        t = ryVar4;
        ry[] ryVarArr = {ryVar, ryVar2, ryVar3, ryVar4};
        u = ryVarArr;
        v = v8.l0.t(ryVarArr);
        Companion = new qy();
        x61.l.r(new String[]{"ALLOWED", "ALLOWED_WITH_BYPASS", "BLOCKED"});
        s = new aa.a0("PullRequestMergeMethodStatus");
    }

    public ry(String str, int i, String str2) {
        this.r = str2;
    }

    public static ry valueOf(String str) {
        return (ry) Enum.valueOf(ry.class, str);
    }

    public static ry[] values() {
        return (ry[]) u.clone();
    }
}

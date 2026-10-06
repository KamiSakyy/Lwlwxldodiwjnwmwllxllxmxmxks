package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class vy {
    public static final uy Companion;
    public static final aa.a0 s;
    public static final vy t;
    public static final /* synthetic */ vy[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        vy vyVar = new vy("MERGEABLE", 0, "MERGEABLE");
        vy vyVar2 = new vy("UNKNOWN", 1, "UNKNOWN");
        vy vyVar3 = new vy("UNMERGEABLE", 2, "UNMERGEABLE");
        vy vyVar4 = new vy("UNKNOWN__", 3, "UNKNOWN__");
        t = vyVar4;
        vy[] vyVarArr = {vyVar, vyVar2, vyVar3, vyVar4};
        u = vyVarArr;
        v = v8.l0.t(vyVarArr);
        Companion = new uy();
        x61.l.r(new String[]{"MERGEABLE", "UNKNOWN", "UNMERGEABLE"});
        s = new aa.a0("PullRequestMergeRequirementsState");
    }

    public vy(String str, int i, String str2) {
        this.r = str2;
    }

    public static vy valueOf(String str) {
        return (vy) Enum.valueOf(vy.class, str);
    }

    public static vy[] values() {
        return (vy[]) u.clone();
    }
}

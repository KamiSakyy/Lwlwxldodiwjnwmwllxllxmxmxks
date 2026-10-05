package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ff {
    public static final ef Companion;
    public static final aa.a0 s;
    public static final ff t;
    public static final ff u;
    public static final /* synthetic */ ff[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        ff ffVar = new ff("BEHIND", 0, "BEHIND");
        t = ffVar;
        ff ffVar2 = new ff("BLOCKED", 1, "BLOCKED");
        ff ffVar3 = new ff("CLEAN", 2, "CLEAN");
        ff ffVar4 = new ff("DIRTY", 3, "DIRTY");
        ff ffVar5 = new ff("DRAFT", 4, "DRAFT");
        ff ffVar6 = new ff("HAS_HOOKS", 5, "HAS_HOOKS");
        ff ffVar7 = new ff("UNKNOWN", 6, "UNKNOWN");
        ff ffVar8 = new ff("UNSTABLE", 7, "UNSTABLE");
        ff ffVar9 = new ff("UNKNOWN__", 8, "UNKNOWN__");
        u = ffVar9;
        ff[] ffVarArr = {ffVar, ffVar2, ffVar3, ffVar4, ffVar5, ffVar6, ffVar7, ffVar8, ffVar9};
        v = ffVarArr;
        w = v8.l0.t(ffVarArr);
        Companion = new ef();
        x61.l.r(new String[]{"BEHIND", "BLOCKED", "CLEAN", "DIRTY", "DRAFT", "HAS_HOOKS", "UNKNOWN", "UNSTABLE"});
        s = new aa.a0("MergeStateStatus");
    }

    public ff(String str, int i, String str2) {
        this.r = str2;
    }

    public static ff valueOf(String str) {
        return (ff) Enum.valueOf(ff.class, str);
    }

    public static ff[] values() {
        return (ff[]) v.clone();
    }
}

package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class gg {
    public static final fg Companion;
    public static final aa.a0 s;
    public static final gg t;
    public static final /* synthetic */ gg[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        gg ggVar = new gg("BEHIND", 0, "BEHIND");
        gg ggVar2 = new gg("BLOCKED", 1, "BLOCKED");
        gg ggVar3 = new gg("CLEAN", 2, "CLEAN");
        gg ggVar4 = new gg("DIRTY", 3, "DIRTY");
        gg ggVar5 = new gg("DRAFT", 4, "DRAFT");
        gg ggVar6 = new gg("HAS_HOOKS", 5, "HAS_HOOKS");
        gg ggVar7 = new gg("UNKNOWN", 6, "UNKNOWN");
        gg ggVar8 = new gg("UNSTABLE", 7, "UNSTABLE");
        gg ggVar9 = new gg("UNKNOWN__", 8, "UNKNOWN__");
        t = ggVar9;
        gg[] ggVarArr = {ggVar, ggVar2, ggVar3, ggVar4, ggVar5, ggVar6, ggVar7, ggVar8, ggVar9};
        u = ggVarArr;
        v = v8.l0.t(ggVarArr);
        Companion = new fg();
        x61.l.r(new String[]{"BEHIND", "BLOCKED", "CLEAN", "DIRTY", "DRAFT", "HAS_HOOKS", "UNKNOWN", "UNSTABLE"});
        s = new aa.a0("MergeStateStatus");
    }

    public gg(String str, int i, String str2) {
        this.r = str2;
    }

    public static gg valueOf(String str) {
        return (gg) Enum.valueOf(gg.class, str);
    }

    public static gg[] values() {
        return (gg[]) u.clone();
    }
    public Object ordinal() { return null; }
}

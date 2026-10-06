package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class si {
    public static final ri Companion;
    public static final aa.a0 s;
    public static final si t;
    public static final /* synthetic */ si[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        si siVar = new si("BEHIND", 0, "BEHIND");
        si siVar2 = new si("BLOCKED", 1, "BLOCKED");
        si siVar3 = new si("CLEAN", 2, "CLEAN");
        si siVar4 = new si("DIRTY", 3, "DIRTY");
        si siVar5 = new si("DRAFT", 4, "DRAFT");
        si siVar6 = new si("HAS_HOOKS", 5, "HAS_HOOKS");
        si siVar7 = new si("UNKNOWN", 6, "UNKNOWN");
        si siVar8 = new si("UNSTABLE", 7, "UNSTABLE");
        si siVar9 = new si("UNKNOWN__", 8, "UNKNOWN__");
        t = siVar9;
        si[] siVarArr = {siVar, siVar2, siVar3, siVar4, siVar5, siVar6, siVar7, siVar8, siVar9};
        u = siVarArr;
        v = v8.l0.t(siVarArr);
        Companion = new ri();
        x61.l.r(new String[]{"BEHIND", "BLOCKED", "CLEAN", "DIRTY", "DRAFT", "HAS_HOOKS", "UNKNOWN", "UNSTABLE"});
        s = new aa.a0("MergeStateStatus");
    }

    public si(String str, int i, String str2) {
        this.r = str2;
    }

    public static si valueOf(String str) {
        return (si) Enum.valueOf(si.class, str);
    }

    public static si[] values() {
        return (si[]) u.clone();
    }
}

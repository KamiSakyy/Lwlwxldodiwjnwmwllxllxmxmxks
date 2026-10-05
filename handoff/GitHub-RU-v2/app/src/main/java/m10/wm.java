package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class wm {
    public static final vm Companion;
    public static final aa.a0 s;
    public static final wm t;
    public static final /* synthetic */ wm[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        wm wmVar = new wm("BEHIND", 0, "BEHIND");
        wm wmVar2 = new wm("BLOCKED", 1, "BLOCKED");
        wm wmVar3 = new wm("CLEAN", 2, "CLEAN");
        wm wmVar4 = new wm("DIRTY", 3, "DIRTY");
        wm wmVar5 = new wm("DRAFT", 4, "DRAFT");
        wm wmVar6 = new wm("HAS_HOOKS", 5, "HAS_HOOKS");
        wm wmVar7 = new wm("UNKNOWN", 6, "UNKNOWN");
        wm wmVar8 = new wm("UNSTABLE", 7, "UNSTABLE");
        wm wmVar9 = new wm("UNKNOWN__", 8, "UNKNOWN__");
        t = wmVar9;
        wm[] wmVarArr = {wmVar, wmVar2, wmVar3, wmVar4, wmVar5, wmVar6, wmVar7, wmVar8, wmVar9};
        u = wmVarArr;
        v = v8.l0.t(wmVarArr);
        Companion = new vm();
        x61.l.r(new String[]{"BEHIND", "BLOCKED", "CLEAN", "DIRTY", "DRAFT", "HAS_HOOKS", "UNKNOWN", "UNSTABLE"});
        s = new aa.a0("MergeStateStatus");
    }

    public wm(String str, int i, String str2) {
        this.r = str2;
    }

    public static wm valueOf(String str) {
        return (wm) Enum.valueOf(wm.class, str);
    }

    public static wm[] values() {
        return (wm[]) u.clone();
    }
}

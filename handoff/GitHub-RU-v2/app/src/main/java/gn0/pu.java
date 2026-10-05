package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class pu {
    public static final ou Companion;
    public static final aa.a0 s;
    public static final pu t;
    public static final pu u;
    public static final pu v;
    public static final pu w;
    public static final /* synthetic */ pu[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        pu puVar = new pu("DISCUSSIONS", 0, "DISCUSSIONS");
        t = puVar;
        pu puVar2 = new pu("ISSUES", 1, "ISSUES");
        u = puVar2;
        pu puVar3 = new pu("PULL_REQUESTS", 2, "PULL_REQUESTS");
        v = puVar3;
        pu puVar4 = new pu("UNKNOWN__", 3, "UNKNOWN__");
        w = puVar4;
        pu[] puVarArr = {puVar, puVar2, puVar3, puVar4};
        x = puVarArr;
        y = v8.l0.t(puVarArr);
        Companion = new ou();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS"});
        s = new aa.a0("SearchShortcutType");
    }

    public pu(String str, int i, String str2) {
        this.r = str2;
    }

    public static pu valueOf(String str) {
        return (pu) Enum.valueOf(pu.class, str);
    }

    public static pu[] values() {
        return (pu[]) x.clone();
    }
}

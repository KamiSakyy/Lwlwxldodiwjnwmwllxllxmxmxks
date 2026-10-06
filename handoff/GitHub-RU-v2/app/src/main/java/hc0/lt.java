package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class lt {
    public static final kt Companion;
    public static final aa.a0 s;
    public static final lt t;
    public static final lt u;
    public static final lt v;
    public static final lt w;
    public static final /* synthetic */ lt[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        lt ltVar = new lt("DISCUSSIONS", 0, "DISCUSSIONS");
        t = ltVar;
        lt ltVar2 = new lt("ISSUES", 1, "ISSUES");
        u = ltVar2;
        lt ltVar3 = new lt("PULL_REQUESTS", 2, "PULL_REQUESTS");
        v = ltVar3;
        lt ltVar4 = new lt("UNKNOWN__", 3, "UNKNOWN__");
        w = ltVar4;
        lt[] ltVarArr = {ltVar, ltVar2, ltVar3, ltVar4};
        x = ltVarArr;
        y = v8.l0.t(ltVarArr);
        Companion = new kt();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS"});
        s = new aa.a0("SearchShortcutType");
    }

    public lt(String str, int i, String str2) {
        this.r = str2;
    }

    public static lt valueOf(String str) {
        return (lt) Enum.valueOf(lt.class, str);
    }

    public static lt[] values() {
        return (lt[]) x.clone();
    }
}

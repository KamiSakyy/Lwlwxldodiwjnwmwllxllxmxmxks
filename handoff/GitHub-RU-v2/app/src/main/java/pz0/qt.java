package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class qt {
    public static final pt Companion;
    public static final qt s;
    public static final qt t;
    public static final qt u;
    public static final qt v;
    public static final qt w;
    public static final /* synthetic */ qt[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        qt qtVar = new qt("APPROVE", 0, "APPROVE");
        s = qtVar;
        qt qtVar2 = new qt("COMMENT", 1, "COMMENT");
        t = qtVar2;
        qt qtVar3 = new qt("DISMISS", 2, "DISMISS");
        u = qtVar3;
        qt qtVar4 = new qt("REQUEST_CHANGES", 3, "REQUEST_CHANGES");
        v = qtVar4;
        qt qtVar5 = new qt("UNKNOWN__", 4, "UNKNOWN__");
        w = qtVar5;
        qt[] qtVarArr = {qtVar, qtVar2, qtVar3, qtVar4, qtVar5};
        x = qtVarArr;
        y = v8.l0.t(qtVarArr);
        Companion = new pt();
        sy.d0Shadow.o(new String[]{"APPROVE", "COMMENT", "DISMISS", "REQUEST_CHANGES"});
    }

    public qt(String str, int i, String str2) {
        this.r = str2;
    }

    public static qt valueOf(String str) {
        return (qt) Enum.valueOf(qt.class, str);
    }

    public static qt[] values() {
        return (qt[]) x.clone();
    }
}

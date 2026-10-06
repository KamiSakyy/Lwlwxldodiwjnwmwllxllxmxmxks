package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class xc {
    public static final wc Companion;
    public static final aa.a0 s;
    public static final xc t;
    public static final xc u;
    public static final xc v;
    public static final xc w;
    public static final /* synthetic */ xc[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        xc xcVar = new xc("ADDITION", 0, "ADDITION");
        t = xcVar;
        xc xcVar2 = new xc("CONTEXT", 1, "CONTEXT");
        xc xcVar3 = new xc("DELETION", 2, "DELETION");
        u = xcVar3;
        xc xcVar4 = new xc("HUNK", 3, "HUNK");
        xc xcVar5 = new xc("INJECTED_CONTEXT", 4, "INJECTED_CONTEXT");
        v = xcVar5;
        xc xcVar6 = new xc("UNKNOWN__", 5, "UNKNOWN__");
        w = xcVar6;
        xc[] xcVarArr = {xcVar, xcVar2, xcVar3, xcVar4, xcVar5, xcVar6};
        x = xcVarArr;
        y = v8.l0.t(xcVarArr);
        Companion = new wc();
        x61.l.r(new String[]{"ADDITION", "CONTEXT", "DELETION", "HUNK", "INJECTED_CONTEXT"});
        s = new aa.a0("DiffLineType");
    }

    public xc(String str, int i, String str2) {
        this.r = str2;
    }

    public static xc valueOf(String str) {
        return (xc) Enum.valueOf(xc.class, str);
    }

    public static xc[] values() {
        return (xc[]) x.clone();
    }
    public Object ordinal() { return null; }
}

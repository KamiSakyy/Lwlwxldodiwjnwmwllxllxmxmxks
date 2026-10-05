package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class xc {
    public static final wc Companion;
    public static final aa.a0 s;
    public static final xc t;
    public static final xc u;
    public static final xc v;
    public static final /* synthetic */ xc[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        xc xcVar = new xc("CLOSED", 0, "CLOSED");
        t = xcVar;
        xc xcVar2 = new xc("OPEN", 1, "OPEN");
        u = xcVar2;
        xc xcVar3 = new xc("UNKNOWN__", 2, "UNKNOWN__");
        v = xcVar3;
        xc[] xcVarArr = {xcVar, xcVar2, xcVar3};
        w = xcVarArr;
        x = v8.l0.t(xcVarArr);
        Companion = new wc();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("IssueState");
    }

    public xc(String str, int i, String str2) {
        this.r = str2;
    }

    public static xc valueOf(String str) {
        return (xc) Enum.valueOf(xc.class, str);
    }

    public static xc[] values() {
        return (xc[]) w.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class wi {
    public static final vi Companion;
    public static final aa.a0 s;
    public static final wi t;
    public static final wi u;
    public static final wi v;
    public static final /* synthetic */ wi[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        wi wiVar = new wi("CLOSED", 0, "CLOSED");
        t = wiVar;
        wi wiVar2 = new wi("OPEN", 1, "OPEN");
        u = wiVar2;
        wi wiVar3 = new wi("UNKNOWN__", 2, "UNKNOWN__");
        v = wiVar3;
        wi[] wiVarArr = {wiVar, wiVar2, wiVar3};
        w = wiVarArr;
        x = v8.l0.t(wiVarArr);
        Companion = new vi();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("IssueState");
    }

    public wi(String str, int i, String str2) {
        this.r = str2;
    }

    public static wi valueOf(String str) {
        return (wi) Enum.valueOf(wi.class, str);
    }

    public static wi[] values() {
        return (wi[]) w.clone();
    }
}

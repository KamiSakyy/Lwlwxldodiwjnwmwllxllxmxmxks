package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class js {
    public static final is Companion;
    public static final js s;
    public static final js t;
    public static final js u;
    public static final /* synthetic */ js[] v;
    public String r;

    static {
        js jsVar = new js("MERGE", 0, "MERGE");
        s = jsVar;
        js jsVar2 = new js("REBASE", 1, "REBASE");
        t = jsVar2;
        js jsVar3 = new js("UNKNOWN__", 2, "UNKNOWN__");
        u = jsVar3;
        js[] jsVarArr = {jsVar, jsVar2, jsVar3};
        v = jsVarArr;
        v8.l0.t(jsVarArr);
        Companion = new is();
        sy.d0Shadow.o(new String[]{"MERGE", "REBASE"});
    }

    public js(String str, int i, String str2) {
        this.r = str2;
    }

    public static js valueOf(String str) {
        return (js) Enum.valueOf(js.class, str);
    }

    public static js[] values() {
        return (js[]) v.clone();
    }
}

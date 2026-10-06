package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class cg {
    public static final bg Companion;
    public static final cg r;
    public static final /* synthetic */ cg[] s;

    static {
        cg cgVar = new cg("PHONE", 0, "PHONE");
        r = cgVar;
        cg[] cgVarArr = {cgVar, new cg("TABLET", 1, "TABLET"), new cg("UNKNOWN__", 2, "UNKNOWN__")};
        s = cgVarArr;
        v8.l0.t(cgVarArr);
        Companion = new bg();
        sy.d0Shadow.o(new String[]{"PHONE", "TABLET"});
    }

    public cg(String str, int i, String str2) {
    }

    public static cg valueOf(String str) {
        return (cg) Enum.valueOf(cg.class, str);
    }

    public static cg[] values() {
        return (cg[]) s.clone();
    }
}

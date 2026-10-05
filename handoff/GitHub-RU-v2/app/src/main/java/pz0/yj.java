package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class yj {
    public static final xj Companion;
    public static final yj r;
    public static final /* synthetic */ yj[] s;

    static {
        yj yjVar = new yj("PHONE", 0, "PHONE");
        r = yjVar;
        yj[] yjVarArr = {yjVar, new yj("TABLET", 1, "TABLET"), new yj("UNKNOWN__", 2, "UNKNOWN__")};
        s = yjVarArr;
        v8.l0.t(yjVarArr);
        Companion = new xj();
        sy.d0.o(new String[]{"PHONE", "TABLET"});
    }

    public yj(String str, int i, String str2) {
    }

    public static yj valueOf(String str) {
        return (yj) Enum.valueOf(yj.class, str);
    }

    public static yj[] values() {
        return (yj[]) s.clone();
    }
}

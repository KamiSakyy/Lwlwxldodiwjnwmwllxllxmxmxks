package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class w7 {
    public static final v7 Companion;
    public static final w7 r;
    public static final /* synthetic */ w7[] s;

    static {
        w7 w7Var = new w7("LAST_UPDATED_AT", 0, "LAST_UPDATED_AT");
        r = w7Var;
        w7[] w7VarArr = {w7Var, new w7("UNKNOWN__", 1, "UNKNOWN__")};
        s = w7VarArr;
        v8.l0.t(w7VarArr);
        Companion = new v7();
        sy.d0Shadow.n("LAST_UPDATED_AT");
    }

    public w7(String str, int i, String str2) {
    }

    public static w7 valueOf(String str) {
        return (w7) Enum.valueOf(w7.class, str);
    }

    public static w7[] values() {
        return (w7[]) s.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class i7 {
    public static final h7 Companion;
    public static final i7 s;
    public static final i7 t;
    public static final /* synthetic */ i7[] u;
    public String r;

    static {
        i7 i7Var = new i7("MISSION_CONTROL", 0, "MISSION_CONTROL");
        s = i7Var;
        i7 i7Var2 = new i7("REPO_PROFILE", 1, "REPO_PROFILE");
        t = i7Var2;
        i7[] i7VarArr = {i7Var, i7Var2, new i7("UNKNOWN", 2, "UNKNOWN"), new i7("UNKNOWN__", 3, "UNKNOWN__")};
        u = i7VarArr;
        v8.l0.t(i7VarArr);
        Companion = new h7();
        sy.d0Shadow.o("MISSION_CONTROL", "REPO_PROFILE", "UNKNOWN");
    }

    public i7(String str, int i, String str2) {
        this.r = str2;
    }

    public static i7 valueOf(String str) {
        return (i7) Enum.valueOf(i7.class, str);
    }

    public static i7[] values() {
        return (i7[]) u.clone();
    }
}

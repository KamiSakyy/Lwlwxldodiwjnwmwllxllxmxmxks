package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class n40 {
    public static final m40 Companion;
    public static final aa.a0 s;
    public static final n40 t;
    public static final /* synthetic */ n40[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        n40 n40Var = new n40("ADMIN", 0, "ADMIN");
        n40 n40Var2 = new n40("MAINTAIN", 1, "MAINTAIN");
        n40 n40Var3 = new n40("READ", 2, "READ");
        n40 n40Var4 = new n40("TRIAGE", 3, "TRIAGE");
        n40 n40Var5 = new n40("WRITE", 4, "WRITE");
        n40 n40Var6 = new n40("UNKNOWN__", 5, "UNKNOWN__");
        t = n40Var6;
        n40[] n40VarArr = {n40Var, n40Var2, n40Var3, n40Var4, n40Var5, n40Var6};
        u = n40VarArr;
        v = v8.l0.t(n40VarArr);
        Companion = new m40();
        x61.l.r(new String[]{"ADMIN", "MAINTAIN", "READ", "TRIAGE", "WRITE"});
        s = new aa.a0("RepositoryPermission");
    }

    public n40(String str, int i, String str2) {
        this.r = str2;
    }

    public static n40 valueOf(String str) {
        return (n40) Enum.valueOf(n40.class, str);
    }

    public static n40[] values() {
        return (n40[]) u.clone();
    }
    public Object ordinal() { return null; }
}

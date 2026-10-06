package q81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class e0 {
    public static final b s;
    public static final e0 t;
    public static final e0 u;
    public static final e0 v;
    public static final e0 w;
    public static final e0 x;
    public static final /* synthetic */ e0[] y;
    public String r;

    static {
        e0 e0Var = new e0("TLS_1_3", 0, "TLSv1.3");
        t = e0Var;
        e0 e0Var2 = new e0("TLS_1_2", 1, "TLSv1.2");
        u = e0Var2;
        e0 e0Var3 = new e0("TLS_1_1", 2, "TLSv1.1");
        v = e0Var3;
        e0 e0Var4 = new e0("TLS_1_0", 3, "TLSv1");
        w = e0Var4;
        e0 e0Var5 = new e0("SSL_3_0", 4, "SSLv3");
        x = e0Var5;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5};
        y = e0VarArr;
        l0.t(e0VarArr);
        s = new b();
    }

    public e0(String str, int i, String str2) {
        this.r = str2;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) y.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class qw {
    public static final pw Companion;
    public static final qw s;
    public static final qw t;
    public static final /* synthetic */ qw[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        qw qwVar = new qw("ADMIN", 0, "ADMIN");
        qw qwVar2 = new qw("READ", 1, "READ");
        qw qwVar3 = new qw("WRITE", 2, "WRITE");
        s = qwVar3;
        qw qwVar4 = new qw("UNKNOWN__", 3, "UNKNOWN__");
        t = qwVar4;
        qw[] qwVarArr = {qwVar, qwVar2, qwVar3, qwVar4};
        u = qwVarArr;
        v = v8.l0.t(qwVarArr);
        Companion = new pw();
        sy.d0.o("ADMIN", "READ", "WRITE");
    }

    public qw(String str, int i, String str2) {
        this.r = str2;
    }

    public static qw valueOf(String str) {
        return (qw) Enum.valueOf(qw.class, str);
    }

    public static qw[] values() {
        return (qw[]) u.clone();
    }
}

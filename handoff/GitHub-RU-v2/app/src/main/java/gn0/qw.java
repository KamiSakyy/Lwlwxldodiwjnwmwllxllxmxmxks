package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class qw {
    public static final pw Companion;
    public static final aa.a0 s;
    public static final qw t;
    public static final qw u;
    public static final /* synthetic */ qw[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        qw qwVar = new qw("EMAIL", 0, "EMAIL");
        t = qwVar;
        qw qwVar2 = new qw("URL", 1, "URL");
        qw qwVar3 = new qw("UNKNOWN__", 2, "UNKNOWN__");
        u = qwVar3;
        qw[] qwVarArr = {qwVar, qwVar2, qwVar3};
        v = qwVarArr;
        w = v8.l0.t(qwVarArr);
        Companion = new pw();
        x61.l.r(new String[]{"EMAIL", "URL"});
        s = new aa.a0("SupportLinkType");
    }

    public qw(String str, int i, String str2) {
        this.r = str2;
    }

    public static qw valueOf(String str) {
        return (qw) Enum.valueOf(qw.class, str);
    }

    public static qw[] values() {
        return (qw[]) v.clone();
    }
}

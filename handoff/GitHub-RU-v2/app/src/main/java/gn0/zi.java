package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class zi {
    public static final yi Companion;
    public static final zi s;
    public static final zi t;
    public static final zi u;
    public static final /* synthetic */ zi[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        zi ziVar = new zi("ASC", 0, "ASC");
        s = ziVar;
        zi ziVar2 = new zi("DESC", 1, "DESC");
        t = ziVar2;
        zi ziVar3 = new zi("UNKNOWN__", 2, "UNKNOWN__");
        u = ziVar3;
        zi[] ziVarArr = {ziVar, ziVar2, ziVar3};
        v = ziVarArr;
        w = v8.l0.t(ziVarArr);
        Companion = new yi();
        sy.d0.o(new String[]{"ASC", "DESC"});
    }

    public zi(String str, int i, String str2) {
        this.r = str2;
    }

    public static zi valueOf(String str) {
        return (zi) Enum.valueOf(zi.class, str);
    }

    public static zi[] values() {
        return (zi[]) v.clone();
    }
}

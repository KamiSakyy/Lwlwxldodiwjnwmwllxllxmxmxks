package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class cr {
    public static final br Companion;
    public static final aa.a0 s;
    public static final cr t;
    public static final cr u;
    public static final cr v;
    public static final /* synthetic */ cr[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        cr crVar = new cr("ASC", 0, "ASC");
        t = crVar;
        cr crVar2 = new cr("DESC", 1, "DESC");
        u = crVar2;
        cr crVar3 = new cr("UNKNOWN__", 2, "UNKNOWN__");
        v = crVar3;
        cr[] crVarArr = {crVar, crVar2, crVar3};
        w = crVarArr;
        x = v8.l0.t(crVarArr);
        Companion = new br();
        x61.l.r(new String[]{"ASC", "DESC"});
        s = new aa.a0("OrderDirection");
    }

    public cr(String str, int i, String str2) {
        this.r = str2;
    }

    public static cr valueOf(String str) {
        return (cr) Enum.valueOf(cr.class, str);
    }

    public static cr[] values() {
        return (cr[]) w.clone();
    }
}

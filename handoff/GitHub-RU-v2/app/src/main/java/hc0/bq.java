package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bq {
    public static final aq Companion;
    public static final bq s;
    public static final bq t;
    public static final bq u;
    public static final bq v;
    public static final bq w;
    public static final bq x;
    public static final /* synthetic */ bq[] y;
    public static final /* synthetic */ d71.b z;
    public String r;

    static {
        bq bqVar = new bq("CREATED_AT", 0, "CREATED_AT");
        s = bqVar;
        bq bqVar2 = new bq("NAME", 1, "NAME");
        t = bqVar2;
        bq bqVar3 = new bq("PUSHED_AT", 2, "PUSHED_AT");
        u = bqVar3;
        bq bqVar4 = new bq("STARGAZERS", 3, "STARGAZERS");
        v = bqVar4;
        bq bqVar5 = new bq("UPDATED_AT", 4, "UPDATED_AT");
        w = bqVar5;
        bq bqVar6 = new bq("UNKNOWN__", 5, "UNKNOWN__");
        x = bqVar6;
        bq[] bqVarArr = {bqVar, bqVar2, bqVar3, bqVar4, bqVar5, bqVar6};
        y = bqVarArr;
        z = v8.l0.t(bqVarArr);
        Companion = new aq();
        sy.d0.o(new String[]{"CREATED_AT", "NAME", "PUSHED_AT", "STARGAZERS", "UPDATED_AT"});
    }

    public bq(String str, int i, String str2) {
        this.r = str2;
    }

    public static bq valueOf(String str) {
        return (bq) Enum.valueOf(bq.class, str);
    }

    public static bq[] values() {
        return (bq[]) y.clone();
    }
}

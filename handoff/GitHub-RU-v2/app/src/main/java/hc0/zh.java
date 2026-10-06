package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class zh {
    public static final yh Companion;
    public static final zh s;
    public static final zh t;
    public static final zh u;
    public static final /* synthetic */ zh[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        zh zhVar = new zh("ASC", 0, "ASC");
        s = zhVar;
        zh zhVar2 = new zh("DESC", 1, "DESC");
        t = zhVar2;
        zh zhVar3 = new zh("UNKNOWN__", 2, "UNKNOWN__");
        u = zhVar3;
        zh[] zhVarArr = {zhVar, zhVar2, zhVar3};
        v = zhVarArr;
        w = v8.l0.t(zhVarArr);
        Companion = new yh();
        sy.d0Shadow.o(new String[]{"ASC", "DESC"});
    }

    public zh(String str, int i, String str2) {
        this.r = str2;
    }

    public static zh valueOf(String str) {
        return (zh) Enum.valueOf(zh.class, str);
    }

    public static zh[] values() {
        return (zh[]) v.clone();
    }
}

package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class tr {
    public static final sr Companion;
    public static final tr s;
    public static final tr t;
    public static final tr u;
    public static final /* synthetic */ tr[] v;
    public String r;

    static {
        tr trVar = new tr("INTERNAL", 0, "INTERNAL");
        s = trVar;
        tr trVar2 = new tr("PRIVATE", 1, "PRIVATE");
        t = trVar2;
        tr trVar3 = new tr("PUBLIC", 2, "PUBLIC");
        u = trVar3;
        tr[] trVarArr = {trVar, trVar2, trVar3, new tr("UNKNOWN__", 3, "UNKNOWN__")};
        v = trVarArr;
        v8.l0.t(trVarArr);
        Companion = new sr();
        sy.d0Shadow.o(new String[]{"INTERNAL", "PRIVATE", "PUBLIC"});
    }

    public tr(String str, int i, String str2) {
        this.r = str2;
    }

    public static tr valueOf(String str) {
        return (tr) Enum.valueOf(tr.class, str);
    }

    public static tr[] values() {
        return (tr[]) v.clone();
    }
}

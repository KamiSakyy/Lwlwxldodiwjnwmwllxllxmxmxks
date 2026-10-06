package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ne {
    public static final me Companion;
    public static final ne s;
    public static final ne t;
    public static final ne u;
    public static final /* synthetic */ ne[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        ne neVar = new ne("COMPLETED", 0, "COMPLETED");
        s = neVar;
        ne neVar2 = new ne("DUPLICATE", 1, "DUPLICATE");
        ne neVar3 = new ne("NOT_PLANNED", 2, "NOT_PLANNED");
        t = neVar3;
        ne neVar4 = new ne("UNKNOWN__", 3, "UNKNOWN__");
        u = neVar4;
        ne[] neVarArr = {neVar, neVar2, neVar3, neVar4};
        v = neVarArr;
        w = v8.l0.t(neVarArr);
        Companion = new me();
        sy.d0Shadow.o(new String[]{"COMPLETED", "DUPLICATE", "NOT_PLANNED"});
    }

    public ne(String str, int i, String str2) {
        this.r = str2;
    }

    public static ne valueOf(String str) {
        return (ne) Enum.valueOf(ne.class, str);
    }

    public static ne[] values() {
        return (ne[]) v.clone();
    }
}

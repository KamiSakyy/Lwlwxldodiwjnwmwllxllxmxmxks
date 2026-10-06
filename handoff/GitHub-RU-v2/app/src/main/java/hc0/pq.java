package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class pq {
    public static final oq Companion;
    public static final pq s;
    public static final pq t;
    public static final pq u;
    public static final /* synthetic */ pq[] v;
    public String r;

    static {
        pq pqVar = new pq("INTERNAL", 0, "INTERNAL");
        s = pqVar;
        pq pqVar2 = new pq("PRIVATE", 1, "PRIVATE");
        t = pqVar2;
        pq pqVar3 = new pq("PUBLIC", 2, "PUBLIC");
        u = pqVar3;
        pq[] pqVarArr = {pqVar, pqVar2, pqVar3, new pq("UNKNOWN__", 3, "UNKNOWN__")};
        v = pqVarArr;
        v8.l0.t(pqVarArr);
        Companion = new oq();
        sy.d0.o(new String[]{"INTERNAL", "PRIVATE", "PUBLIC"});
    }

    public pq(String str, int i, String str2) {
        this.r = str2;
    }

    public static pq valueOf(String str) {
        return (pq) Enum.valueOf(pq.class, str);
    }

    public static pq[] values() {
        return (pq[]) v.clone();
    }
}

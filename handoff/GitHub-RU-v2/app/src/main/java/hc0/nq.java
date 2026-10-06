package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class nq {
    public static final /* synthetic */ nq[] A;
    public static final /* synthetic */ d71.b B;
    public static final mq Companion;
    public static final nq s;
    public static final nq t;
    public static final nq u;
    public static final nq v;
    public static final nq w;
    public static final nq x;
    public static final nq y;
    public static final nq z;
    public String r;

    static {
        nq nqVar = new nq("ARCHIVED", 0, "ARCHIVED");
        s = nqVar;
        nq nqVar2 = new nq("FORK", 1, "FORK");
        t = nqVar2;
        nq nqVar3 = new nq("MIRROR", 2, "MIRROR");
        u = nqVar3;
        nq nqVar4 = new nq("PRIVATE", 3, "PRIVATE");
        v = nqVar4;
        nq nqVar5 = new nq("PUBLIC", 4, "PUBLIC");
        w = nqVar5;
        nq nqVar6 = new nq("SOURCE", 5, "SOURCE");
        x = nqVar6;
        nq nqVar7 = new nq("SPONSORABLE", 6, "SPONSORABLE");
        nq nqVar8 = new nq("TEMPLATE", 7, "TEMPLATE");
        y = nqVar8;
        nq nqVar9 = new nq("UNKNOWN__", 8, "UNKNOWN__");
        z = nqVar9;
        nq[] nqVarArr = {nqVar, nqVar2, nqVar3, nqVar4, nqVar5, nqVar6, nqVar7, nqVar8, nqVar9};
        A = nqVarArr;
        B = v8.l0.t(nqVarArr);
        Companion = new mq();
        sy.d0Shadow.o(new String[]{"ARCHIVED", "FORK", "MIRROR", "PRIVATE", "PUBLIC", "SOURCE", "SPONSORABLE", "TEMPLATE"});
    }

    public nq(String str, int i, String str2) {
        this.r = str2;
    }

    public static nq valueOf(String str) {
        return (nq) Enum.valueOf(nq.class, str);
    }

    public static nq[] values() {
        return (nq[]) A.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class nq {
    public static final mq Companion;
    public static final nq s;
    public static final nq t;
    public static final /* synthetic */ nq[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        nq nqVar = new nq("ARCHIVED", 0, "ARCHIVED");
        nq nqVar2 = new nq("DONE", 1, "DONE");
        nq nqVar3 = new nq("READ", 2, "READ");
        nq nqVar4 = new nq("UNREAD", 3, "UNREAD");
        s = nqVar4;
        nq nqVar5 = new nq("UNKNOWN__", 4, "UNKNOWN__");
        t = nqVar5;
        nq[] nqVarArr = {nqVar, nqVar2, nqVar3, nqVar4, nqVar5};
        u = nqVarArr;
        v = v8.l0.t(nqVarArr);
        Companion = new mq();
        sy.d0Shadow.o("ARCHIVED", "DONE", "READ", "UNREAD");
    }

    public nq(String str, int i, String str2) {
        this.r = str2;
    }

    public static nq valueOf(String str) {
        return (nq) Enum.valueOf(nq.class, str);
    }

    public static nq[] values() {
        return (nq[]) u.clone();
    }
}

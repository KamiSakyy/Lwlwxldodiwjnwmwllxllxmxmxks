package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class cq {
    public static final bq Companion;
    public static final cq s;
    public static final cq t;
    public static final cq u;
    public static final cq v;
    public static final cq w;
    public static final /* synthetic */ cq[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        cq cqVar = new cq("DUPLICATE", 0, "DUPLICATE");
        s = cqVar;
        cq cqVar2 = new cq("OFF_TOPIC", 1, "OFF_TOPIC");
        t = cqVar2;
        cq cqVar3 = new cq("OUTDATED", 2, "OUTDATED");
        u = cqVar3;
        cq cqVar4 = new cq("RESOLVED", 3, "RESOLVED");
        v = cqVar4;
        cq cqVar5 = new cq("UNKNOWN__", 4, "UNKNOWN__");
        w = cqVar5;
        cq[] cqVarArr = {cqVar, cqVar2, cqVar3, cqVar4, cqVar5};
        x = cqVarArr;
        y = v8.l0.t(cqVarArr);
        Companion = new bq();
        sy.d0Shadow.o(new String[]{"DUPLICATE", "OFF_TOPIC", "OUTDATED", "RESOLVED"});
    }

    public cq(String str, int i, String str2) {
        this.r = str2;
    }

    public static cq valueOf(String str) {
        return (cq) Enum.valueOf(cq.class, str);
    }

    public static cq[] values() {
        return (cq[]) x.clone();
    }
}

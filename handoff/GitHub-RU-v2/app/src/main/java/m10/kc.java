package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class kc {
    public static final jc Companion;
    public static final aa.a0 s;
    public static final kc t;
    public static final /* synthetic */ kc[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        kc kcVar = new kc("ABANDONED", 0, "ABANDONED");
        kc kcVar2 = new kc("ACTIVE", 1, "ACTIVE");
        kc kcVar3 = new kc("DESTROYED", 2, "DESTROYED");
        kc kcVar4 = new kc("ERROR", 3, "ERROR");
        kc kcVar5 = new kc("FAILURE", 4, "FAILURE");
        kc kcVar6 = new kc("INACTIVE", 5, "INACTIVE");
        kc kcVar7 = new kc("IN_PROGRESS", 6, "IN_PROGRESS");
        kc kcVar8 = new kc("PENDING", 7, "PENDING");
        kc kcVar9 = new kc("QUEUED", 8, "QUEUED");
        kc kcVar10 = new kc("SUCCESS", 9, "SUCCESS");
        kc kcVar11 = new kc("WAITING", 10, "WAITING");
        kc kcVar12 = new kc("UNKNOWN__", 11, "UNKNOWN__");
        t = kcVar12;
        kc[] kcVarArr = {kcVar, kcVar2, kcVar3, kcVar4, kcVar5, kcVar6, kcVar7, kcVar8, kcVar9, kcVar10, kcVar11, kcVar12};
        u = kcVarArr;
        v = v8.l0.t(kcVarArr);
        Companion = new jc();
        x61.l.r(new String[]{"ABANDONED", "ACTIVE", "DESTROYED", "ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentState");
    }

    public kc(String str, int i, String str2) {
        this.r = str2;
    }

    public static kc valueOf(String str) {
        return (kc) Enum.valueOf(kc.class, str);
    }

    public static kc[] values() {
        return (kc[]) u.clone();
    }
}

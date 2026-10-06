package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class oc {
    public static final nc Companion;
    public static final aa.a0 s;
    public static final oc t;
    public static final /* synthetic */ oc[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        oc ocVar = new oc("ERROR", 0, "ERROR");
        oc ocVar2 = new oc("FAILURE", 1, "FAILURE");
        oc ocVar3 = new oc("INACTIVE", 2, "INACTIVE");
        oc ocVar4 = new oc("IN_PROGRESS", 3, "IN_PROGRESS");
        oc ocVar5 = new oc("PENDING", 4, "PENDING");
        oc ocVar6 = new oc("QUEUED", 5, "QUEUED");
        oc ocVar7 = new oc("SUCCESS", 6, "SUCCESS");
        oc ocVar8 = new oc("WAITING", 7, "WAITING");
        oc ocVar9 = new oc("UNKNOWN__", 8, "UNKNOWN__");
        t = ocVar9;
        oc[] ocVarArr = {ocVar, ocVar2, ocVar3, ocVar4, ocVar5, ocVar6, ocVar7, ocVar8, ocVar9};
        u = ocVarArr;
        v = v8.l0.t(ocVarArr);
        Companion = new nc();
        x61.l.r(new String[]{"ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentStatusState");
    }

    public oc(String str, int i, String str2) {
        this.r = str2;
    }

    public static oc valueOf(String str) {
        return (oc) Enum.valueOf(oc.class, str);
    }

    public static oc[] values() {
        return (oc[]) u.clone();
    }
}

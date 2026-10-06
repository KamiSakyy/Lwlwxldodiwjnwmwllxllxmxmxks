package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class rz {
    public static final qz Companion;
    public static final aa.a0 s;
    public static final rz t;
    public static final /* synthetic */ rz[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        rz rzVar = new rz("APPROVED", 0, "APPROVED");
        rz rzVar2 = new rz("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        rz rzVar3 = new rz("COMMENTED", 2, "COMMENTED");
        rz rzVar4 = new rz("DISMISSED", 3, "DISMISSED");
        rz rzVar5 = new rz("PENDING", 4, "PENDING");
        rz rzVar6 = new rz("UNKNOWN__", 5, "UNKNOWN__");
        t = rzVar6;
        rz[] rzVarArr = {rzVar, rzVar2, rzVar3, rzVar4, rzVar5, rzVar6};
        u = rzVarArr;
        v = v8.l0.t(rzVarArr);
        Companion = new qz();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "COMMENTED", "DISMISSED", "PENDING"});
        s = new aa.a0("PullRequestReviewState");
    }

    public rz(String str, int i, String str2) {
        this.r = str2;
    }

    public static rz valueOf(String str) {
        return (rz) Enum.valueOf(rz.class, str);
    }

    public static rz[] values() {
        return (rz[]) u.clone();
    }

    public static  ordinal(Object... a) {
        return null;
    }
    public Object ordinal() { return null; }
}

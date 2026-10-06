package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class uh {
    public static final th Companion;
    public static final aa.a0 s;
    public static final uh t;
    public static final /* synthetic */ uh[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        uh uhVar = new uh("ASSIGNED", 0, "ASSIGNED");
        uh uhVar2 = new uh("AUTHORED", 1, "AUTHORED");
        uh uhVar3 = new uh("COMMENTED", 2, "COMMENTED");
        uh uhVar4 = new uh("COMMENT_EDITED", 3, "COMMENT_EDITED");
        uh uhVar5 = new uh("DEPLOYED", 4, "DEPLOYED");
        uh uhVar6 = new uh("RECEIVED_COMMENT", 5, "RECEIVED_COMMENT");
        uh uhVar7 = new uh("RECEIVED_COMMENT_EDITED", 6, "RECEIVED_COMMENT_EDITED");
        uh uhVar8 = new uh("REFERENCED", 7, "REFERENCED");
        uh uhVar9 = new uh("REOPENED", 8, "REOPENED");
        uh uhVar10 = new uh("REVIEW_COMMENTED", 9, "REVIEW_COMMENTED");
        uh uhVar11 = new uh("REVIEW_RECEIVED", 10, "REVIEW_RECEIVED");
        uh uhVar12 = new uh("REVIEW_REQUESTED", 11, "REVIEW_REQUESTED");
        uh uhVar13 = new uh("UNKNOWN__", 12, "UNKNOWN__");
        t = uhVar13;
        uh[] uhVarArr = {uhVar, uhVar2, uhVar3, uhVar4, uhVar5, uhVar6, uhVar7, uhVar8, uhVar9, uhVar10, uhVar11, uhVar12, uhVar13};
        u = uhVarArr;
        v = v8.l0.t(uhVarArr);
        Companion = new th();
        x61.l.r(new String[]{"ASSIGNED", "AUTHORED", "COMMENTED", "COMMENT_EDITED", "DEPLOYED", "RECEIVED_COMMENT", "RECEIVED_COMMENT_EDITED", "REFERENCED", "REOPENED", "REVIEW_COMMENTED", "REVIEW_RECEIVED", "REVIEW_REQUESTED"});
        s = new aa.a0("InteractionType");
    }

    public uh(String str, int i, String str2) {
        this.r = str2;
    }

    public static uh valueOf(String str) {
        return (uh) Enum.valueOf(uh.class, str);
    }

    public static uh[] values() {
        return (uh[]) u.clone();
    }
}

package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class rb {
    public static final qb Companion;
    public static final aa.a0 s;
    public static final rb t;
    public static final /* synthetic */ rb[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        rb rbVar = new rb("ASSIGNED", 0, "ASSIGNED");
        rb rbVar2 = new rb("AUTHORED", 1, "AUTHORED");
        rb rbVar3 = new rb("COMMENTED", 2, "COMMENTED");
        rb rbVar4 = new rb("COMMENT_EDITED", 3, "COMMENT_EDITED");
        rb rbVar5 = new rb("DEPLOYED", 4, "DEPLOYED");
        rb rbVar6 = new rb("RECEIVED_COMMENT", 5, "RECEIVED_COMMENT");
        rb rbVar7 = new rb("RECEIVED_COMMENT_EDITED", 6, "RECEIVED_COMMENT_EDITED");
        rb rbVar8 = new rb("REFERENCED", 7, "REFERENCED");
        rb rbVar9 = new rb("REOPENED", 8, "REOPENED");
        rb rbVar10 = new rb("REVIEW_COMMENTED", 9, "REVIEW_COMMENTED");
        rb rbVar11 = new rb("REVIEW_RECEIVED", 10, "REVIEW_RECEIVED");
        rb rbVar12 = new rb("REVIEW_REQUESTED", 11, "REVIEW_REQUESTED");
        rb rbVar13 = new rb("UNKNOWN__", 12, "UNKNOWN__");
        t = rbVar13;
        rb[] rbVarArr = {rbVar, rbVar2, rbVar3, rbVar4, rbVar5, rbVar6, rbVar7, rbVar8, rbVar9, rbVar10, rbVar11, rbVar12, rbVar13};
        u = rbVarArr;
        v = v8.l0.t(rbVarArr);
        Companion = new qb();
        x61.l.r(new String[]{"ASSIGNED", "AUTHORED", "COMMENTED", "COMMENT_EDITED", "DEPLOYED", "RECEIVED_COMMENT", "RECEIVED_COMMENT_EDITED", "REFERENCED", "REOPENED", "REVIEW_COMMENTED", "REVIEW_RECEIVED", "REVIEW_REQUESTED"});
        s = new aa.a0("InteractionType");
    }

    public rb(String str, int i, String str2) {
        this.r = str2;
    }

    public static rb valueOf(String str) {
        return (rb) Enum.valueOf(rb.class, str);
    }

    public static rb[] values() {
        return (rb[]) u.clone();
    }
}

package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class fc {
    public static final ec Companion;
    public static final aa.a0 s;
    public static final fc t;
    public static final /* synthetic */ fc[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        fc fcVar = new fc("ASSIGNED", 0, "ASSIGNED");
        fc fcVar2 = new fc("AUTHORED", 1, "AUTHORED");
        fc fcVar3 = new fc("COMMENTED", 2, "COMMENTED");
        fc fcVar4 = new fc("COMMENT_EDITED", 3, "COMMENT_EDITED");
        fc fcVar5 = new fc("DEPLOYED", 4, "DEPLOYED");
        fc fcVar6 = new fc("RECEIVED_COMMENT", 5, "RECEIVED_COMMENT");
        fc fcVar7 = new fc("RECEIVED_COMMENT_EDITED", 6, "RECEIVED_COMMENT_EDITED");
        fc fcVar8 = new fc("REFERENCED", 7, "REFERENCED");
        fc fcVar9 = new fc("REOPENED", 8, "REOPENED");
        fc fcVar10 = new fc("REVIEW_COMMENTED", 9, "REVIEW_COMMENTED");
        fc fcVar11 = new fc("REVIEW_RECEIVED", 10, "REVIEW_RECEIVED");
        fc fcVar12 = new fc("REVIEW_REQUESTED", 11, "REVIEW_REQUESTED");
        fc fcVar13 = new fc("UNKNOWN__", 12, "UNKNOWN__");
        t = fcVar13;
        fc[] fcVarArr = {fcVar, fcVar2, fcVar3, fcVar4, fcVar5, fcVar6, fcVar7, fcVar8, fcVar9, fcVar10, fcVar11, fcVar12, fcVar13};
        u = fcVarArr;
        v = v8.l0.t(fcVarArr);
        Companion = new ec();
        x61.l.r(new String[]{"ASSIGNED", "AUTHORED", "COMMENTED", "COMMENT_EDITED", "DEPLOYED", "RECEIVED_COMMENT", "RECEIVED_COMMENT_EDITED", "REFERENCED", "REOPENED", "REVIEW_COMMENTED", "REVIEW_RECEIVED", "REVIEW_REQUESTED"});
        s = new aa.a0("InteractionType");
    }

    public fc(String str, int i, String str2) {
        this.r = str2;
    }

    public static fc valueOf(String str) {
        return (fc) Enum.valueOf(fc.class, str);
    }

    public static fc[] values() {
        return (fc[]) u.clone();
    }
}

package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class je {
    public static final ie Companion;
    public static final aa.a0 s;
    public static final je t;
    public static final /* synthetic */ je[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        je jeVar = new je("ASSIGNED", 0, "ASSIGNED");
        je jeVar2 = new je("AUTHORED", 1, "AUTHORED");
        je jeVar3 = new je("COMMENTED", 2, "COMMENTED");
        je jeVar4 = new je("COMMENT_EDITED", 3, "COMMENT_EDITED");
        je jeVar5 = new je("DEPLOYED", 4, "DEPLOYED");
        je jeVar6 = new je("RECEIVED_COMMENT", 5, "RECEIVED_COMMENT");
        je jeVar7 = new je("RECEIVED_COMMENT_EDITED", 6, "RECEIVED_COMMENT_EDITED");
        je jeVar8 = new je("REFERENCED", 7, "REFERENCED");
        je jeVar9 = new je("REOPENED", 8, "REOPENED");
        je jeVar10 = new je("REVIEW_COMMENTED", 9, "REVIEW_COMMENTED");
        je jeVar11 = new je("REVIEW_RECEIVED", 10, "REVIEW_RECEIVED");
        je jeVar12 = new je("REVIEW_REQUESTED", 11, "REVIEW_REQUESTED");
        je jeVar13 = new je("UNKNOWN__", 12, "UNKNOWN__");
        t = jeVar13;
        je[] jeVarArr = {jeVar, jeVar2, jeVar3, jeVar4, jeVar5, jeVar6, jeVar7, jeVar8, jeVar9, jeVar10, jeVar11, jeVar12, jeVar13};
        u = jeVarArr;
        v = v8.l0.t(jeVarArr);
        Companion = new ie();
        x61.l.r(new String[]{"ASSIGNED", "AUTHORED", "COMMENTED", "COMMENT_EDITED", "DEPLOYED", "RECEIVED_COMMENT", "RECEIVED_COMMENT_EDITED", "REFERENCED", "REOPENED", "REVIEW_COMMENTED", "REVIEW_RECEIVED", "REVIEW_REQUESTED"});
        s = new aa.a0("InteractionType");
    }

    public je(String str, int i, String str2) {
        this.r = str2;
    }

    public static je valueOf(String str) {
        return (je) Enum.valueOf(je.class, str);
    }

    public static je[] values() {
        return (je[]) u.clone();
    }
}

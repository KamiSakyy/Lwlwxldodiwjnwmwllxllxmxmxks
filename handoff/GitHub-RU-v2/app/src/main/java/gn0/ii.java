package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ii {
    public static final ii A;
    public static final ii B;
    public static final ii C;
    public static final hi Companion;
    public static final ii D;
    public static final ii E;
    public static final ii F;
    public static final ii G;
    public static final ii H;
    public static final ii I;
    public static final ii J;
    public static final /* synthetic */ ii[] K;
    public static final /* synthetic */ d71.b L;
    public static final aa.a0 s;
    public static final ii t;
    public static final ii u;
    public static final ii v;
    public static final ii w;
    public static final ii x;
    public static final ii y;
    public static final ii z;
    public String r;

    static {
        ii iiVar = new ii("APPROVAL_REQUESTED", 0, "APPROVAL_REQUESTED");
        t = iiVar;
        ii iiVar2 = new ii("ASSIGN", 1, "ASSIGN");
        u = iiVar2;
        ii iiVar3 = new ii("AUTHOR", 2, "AUTHOR");
        v = iiVar3;
        ii iiVar4 = new ii("CI_ACTIVITY", 3, "CI_ACTIVITY");
        w = iiVar4;
        ii iiVar5 = new ii("COMMENT", 4, "COMMENT");
        x = iiVar5;
        ii iiVar6 = new ii("INVITATION", 5, "INVITATION");
        y = iiVar6;
        ii iiVar7 = new ii("MANUAL", 6, "MANUAL");
        z = iiVar7;
        ii iiVar8 = new ii("MEMBER_FEATURE_REQUESTED", 7, "MEMBER_FEATURE_REQUESTED");
        ii iiVar9 = new ii("MENTION", 8, "MENTION");
        A = iiVar9;
        ii iiVar10 = new ii("READY_FOR_REVIEW", 9, "READY_FOR_REVIEW");
        B = iiVar10;
        ii iiVar11 = new ii("REVIEW_REQUESTED", 10, "REVIEW_REQUESTED");
        C = iiVar11;
        ii iiVar12 = new ii("SAVED", 11, "SAVED");
        D = iiVar12;
        ii iiVar13 = new ii("SECURITY_ADVISORY_CREDIT", 12, "SECURITY_ADVISORY_CREDIT");
        E = iiVar13;
        ii iiVar14 = new ii("SECURITY_ALERT", 13, "SECURITY_ALERT");
        F = iiVar14;
        ii iiVar15 = new ii("STATE_CHANGE", 14, "STATE_CHANGE");
        G = iiVar15;
        ii iiVar16 = new ii("SUBSCRIBED", 15, "SUBSCRIBED");
        H = iiVar16;
        ii iiVar17 = new ii("TEAM_MENTION", 16, "TEAM_MENTION");
        I = iiVar17;
        ii iiVar18 = new ii("UNKNOWN__", 17, "UNKNOWN__");
        J = iiVar18;
        ii[] iiVarArr = {iiVar, iiVar2, iiVar3, iiVar4, iiVar5, iiVar6, iiVar7, iiVar8, iiVar9, iiVar10, iiVar11, iiVar12, iiVar13, iiVar14, iiVar15, iiVar16, iiVar17, iiVar18};
        K = iiVarArr;
        L = v8.l0.t(iiVarArr);
        Companion = new hi();
        x61.l.r(new String[]{"APPROVAL_REQUESTED", "ASSIGN", "AUTHOR", "CI_ACTIVITY", "COMMENT", "INVITATION", "MANUAL", "MEMBER_FEATURE_REQUESTED", "MENTION", "READY_FOR_REVIEW", "REVIEW_REQUESTED", "SAVED", "SECURITY_ADVISORY_CREDIT", "SECURITY_ALERT", "STATE_CHANGE", "SUBSCRIBED", "TEAM_MENTION"});
        s = new aa.a0("NotificationReason");
    }

    public ii(String str, int i, String str2) {
        this.r = str2;
    }

    public static ii valueOf(String str) {
        return (ii) Enum.valueOf(ii.class, str);
    }

    public static ii[] values() {
        return (ii[]) K.clone();
    }
    public Object ordinal() { return null; }
}

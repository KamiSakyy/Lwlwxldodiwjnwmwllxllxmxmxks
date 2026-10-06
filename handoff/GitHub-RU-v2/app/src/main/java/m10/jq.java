package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class jq {
    public static final jq A;
    public static final jq B;
    public static final jq C;
    public static final iq Companion;
    public static final jq D;
    public static final jq E;
    public static final jq F;
    public static final jq G;
    public static final jq H;
    public static final jq I;
    public static final jq J;
    public static final /* synthetic */ jq[] K;
    public static final /* synthetic */ d71.b L;
    public static final aa.a0 s;
    public static final jq t;
    public static final jq u;
    public static final jq v;
    public static final jq w;
    public static final jq x;
    public static final jq y;
    public static final jq z;
    public String r;

    static {
        jq jqVar = new jq("AGENT_SESSION_FINISHED", 0, "AGENT_SESSION_FINISHED");
        jq jqVar2 = new jq("APPROVAL_REQUESTED", 1, "APPROVAL_REQUESTED");
        t = jqVar2;
        jq jqVar3 = new jq("ASSIGN", 2, "ASSIGN");
        u = jqVar3;
        jq jqVar4 = new jq("AUTHOR", 3, "AUTHOR");
        v = jqVar4;
        jq jqVar5 = new jq("CI_ACTIVITY", 4, "CI_ACTIVITY");
        w = jqVar5;
        jq jqVar6 = new jq("COMMENT", 5, "COMMENT");
        x = jqVar6;
        jq jqVar7 = new jq("INVITATION", 6, "INVITATION");
        y = jqVar7;
        jq jqVar8 = new jq("MANUAL", 7, "MANUAL");
        z = jqVar8;
        jq jqVar9 = new jq("MEMBER_FEATURE_REQUESTED", 8, "MEMBER_FEATURE_REQUESTED");
        jq jqVar10 = new jq("MENTION", 9, "MENTION");
        A = jqVar10;
        jq jqVar11 = new jq("READY_FOR_REVIEW", 10, "READY_FOR_REVIEW");
        B = jqVar11;
        jq jqVar12 = new jq("REVIEW_REQUESTED", 11, "REVIEW_REQUESTED");
        C = jqVar12;
        jq jqVar13 = new jq("SAVED", 12, "SAVED");
        D = jqVar13;
        jq jqVar14 = new jq("SECURITY_ADVISORY_CREDIT", 13, "SECURITY_ADVISORY_CREDIT");
        E = jqVar14;
        jq jqVar15 = new jq("SECURITY_ALERT", 14, "SECURITY_ALERT");
        F = jqVar15;
        jq jqVar16 = new jq("STATE_CHANGE", 15, "STATE_CHANGE");
        G = jqVar16;
        jq jqVar17 = new jq("SUBSCRIBED", 16, "SUBSCRIBED");
        H = jqVar17;
        jq jqVar18 = new jq("TEAM_MENTION", 17, "TEAM_MENTION");
        I = jqVar18;
        jq jqVar19 = new jq("UNKNOWN__", 18, "UNKNOWN__");
        J = jqVar19;
        jq[] jqVarArr = {jqVar, jqVar2, jqVar3, jqVar4, jqVar5, jqVar6, jqVar7, jqVar8, jqVar9, jqVar10, jqVar11, jqVar12, jqVar13, jqVar14, jqVar15, jqVar16, jqVar17, jqVar18, jqVar19};
        K = jqVarArr;
        L = v8.l0.t(jqVarArr);
        Companion = new iq();
        x61.l.r(new String[]{"AGENT_SESSION_FINISHED", "APPROVAL_REQUESTED", "ASSIGN", "AUTHOR", "CI_ACTIVITY", "COMMENT", "INVITATION", "MANUAL", "MEMBER_FEATURE_REQUESTED", "MENTION", "READY_FOR_REVIEW", "REVIEW_REQUESTED", "SAVED", "SECURITY_ADVISORY_CREDIT", "SECURITY_ALERT", "STATE_CHANGE", "SUBSCRIBED", "TEAM_MENTION"});
        s = new aa.a0("NotificationReason");
    }

    public jq(String str, int i, String str2) {
        this.r = str2;
    }

    public static jq valueOf(String str) {
        return (jq) Enum.valueOf(jq.class, str);
    }

    public static jq[] values() {
        return (jq[]) K.clone();
    }
    public Object ordinal() { return null; }
}

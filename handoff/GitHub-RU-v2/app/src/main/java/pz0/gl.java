package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class gl {
    public static final gl A;
    public static final gl B;
    public static final gl C;
    public static final fl Companion;
    public static final gl D;
    public static final gl E;
    public static final gl F;
    public static final gl G;
    public static final gl H;
    public static final gl I;
    public static final gl J;
    public static final /* synthetic */ gl[] K;
    public static final /* synthetic */ d71.b L;
    public static final aa.a0 s;
    public static final gl t;
    public static final gl u;
    public static final gl v;
    public static final gl w;
    public static final gl x;
    public static final gl y;
    public static final gl z;
    public final String r;

    static {
        gl glVar = new gl("APPROVAL_REQUESTED", 0, "APPROVAL_REQUESTED");
        t = glVar;
        gl glVar2 = new gl("ASSIGN", 1, "ASSIGN");
        u = glVar2;
        gl glVar3 = new gl("AUTHOR", 2, "AUTHOR");
        v = glVar3;
        gl glVar4 = new gl("CI_ACTIVITY", 3, "CI_ACTIVITY");
        w = glVar4;
        gl glVar5 = new gl("COMMENT", 4, "COMMENT");
        x = glVar5;
        gl glVar6 = new gl("INVITATION", 5, "INVITATION");
        y = glVar6;
        gl glVar7 = new gl("MANUAL", 6, "MANUAL");
        z = glVar7;
        gl glVar8 = new gl("MEMBER_FEATURE_REQUESTED", 7, "MEMBER_FEATURE_REQUESTED");
        gl glVar9 = new gl("MENTION", 8, "MENTION");
        A = glVar9;
        gl glVar10 = new gl("READY_FOR_REVIEW", 9, "READY_FOR_REVIEW");
        B = glVar10;
        gl glVar11 = new gl("REVIEW_REQUESTED", 10, "REVIEW_REQUESTED");
        C = glVar11;
        gl glVar12 = new gl("SAVED", 11, "SAVED");
        D = glVar12;
        gl glVar13 = new gl("SECURITY_ADVISORY_CREDIT", 12, "SECURITY_ADVISORY_CREDIT");
        E = glVar13;
        gl glVar14 = new gl("SECURITY_ALERT", 13, "SECURITY_ALERT");
        F = glVar14;
        gl glVar15 = new gl("STATE_CHANGE", 14, "STATE_CHANGE");
        G = glVar15;
        gl glVar16 = new gl("SUBSCRIBED", 15, "SUBSCRIBED");
        H = glVar16;
        gl glVar17 = new gl("TEAM_MENTION", 16, "TEAM_MENTION");
        I = glVar17;
        gl glVar18 = new gl("UNKNOWN__", 17, "UNKNOWN__");
        J = glVar18;
        gl[] glVarArr = {glVar, glVar2, glVar3, glVar4, glVar5, glVar6, glVar7, glVar8, glVar9, glVar10, glVar11, glVar12, glVar13, glVar14, glVar15, glVar16, glVar17, glVar18};
        K = glVarArr;
        L = v8.l0.t(glVarArr);
        Companion = new fl();
        x61.l.r(new String[]{"APPROVAL_REQUESTED", "ASSIGN", "AUTHOR", "CI_ACTIVITY", "COMMENT", "INVITATION", "MANUAL", "MEMBER_FEATURE_REQUESTED", "MENTION", "READY_FOR_REVIEW", "REVIEW_REQUESTED", "SAVED", "SECURITY_ADVISORY_CREDIT", "SECURITY_ALERT", "STATE_CHANGE", "SUBSCRIBED", "TEAM_MENTION"});
        s = new aa.a0("NotificationReason");
    }

    public gl(String str, int i, String str2) {
        this.r = str2;
    }

    public static gl valueOf(String str) {
        return (gl) Enum.valueOf(gl.class, str);
    }

    public static gl[] values() {
        return (gl[]) K.clone();
    }
    public Object ordinal() { return null; }
}

package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ih {
    public static final ih A;
    public static final ih B;
    public static final ih C;
    public static final hh Companion;
    public static final ih D;
    public static final ih E;
    public static final ih F;
    public static final ih G;
    public static final ih H;
    public static final ih I;
    public static final ih J;
    public static final /* synthetic */ ih[] K;
    public static final /* synthetic */ d71.b L;
    public static final aa.a0 s;
    public static final ih t;
    public static final ih u;
    public static final ih v;
    public static final ih w;
    public static final ih x;
    public static final ih y;
    public static final ih z;
    public String r;

    static {
        ih ihVar = new ih("APPROVAL_REQUESTED", 0, "APPROVAL_REQUESTED");
        t = ihVar;
        ih ihVar2 = new ih("ASSIGN", 1, "ASSIGN");
        u = ihVar2;
        ih ihVar3 = new ih("AUTHOR", 2, "AUTHOR");
        v = ihVar3;
        ih ihVar4 = new ih("CI_ACTIVITY", 3, "CI_ACTIVITY");
        w = ihVar4;
        ih ihVar5 = new ih("COMMENT", 4, "COMMENT");
        x = ihVar5;
        ih ihVar6 = new ih("INVITATION", 5, "INVITATION");
        y = ihVar6;
        ih ihVar7 = new ih("MANUAL", 6, "MANUAL");
        z = ihVar7;
        ih ihVar8 = new ih("MENTION", 7, "MENTION");
        A = ihVar8;
        ih ihVar9 = new ih("READY_FOR_REVIEW", 8, "READY_FOR_REVIEW");
        B = ihVar9;
        ih ihVar10 = new ih("REVIEW_REQUESTED", 9, "REVIEW_REQUESTED");
        C = ihVar10;
        ih ihVar11 = new ih("SAVED", 10, "SAVED");
        D = ihVar11;
        ih ihVar12 = new ih("SECURITY_ADVISORY_CREDIT", 11, "SECURITY_ADVISORY_CREDIT");
        E = ihVar12;
        ih ihVar13 = new ih("SECURITY_ALERT", 12, "SECURITY_ALERT");
        F = ihVar13;
        ih ihVar14 = new ih("STATE_CHANGE", 13, "STATE_CHANGE");
        G = ihVar14;
        ih ihVar15 = new ih("SUBSCRIBED", 14, "SUBSCRIBED");
        H = ihVar15;
        ih ihVar16 = new ih("TEAM_MENTION", 15, "TEAM_MENTION");
        I = ihVar16;
        ih ihVar17 = new ih("UNKNOWN__", 16, "UNKNOWN__");
        J = ihVar17;
        ih[] ihVarArr = {ihVar, ihVar2, ihVar3, ihVar4, ihVar5, ihVar6, ihVar7, ihVar8, ihVar9, ihVar10, ihVar11, ihVar12, ihVar13, ihVar14, ihVar15, ihVar16, ihVar17};
        K = ihVarArr;
        L = v8.l0.t(ihVarArr);
        Companion = new hh();
        x61.l.r(new String[]{"APPROVAL_REQUESTED", "ASSIGN", "AUTHOR", "CI_ACTIVITY", "COMMENT", "INVITATION", "MANUAL", "MENTION", "READY_FOR_REVIEW", "REVIEW_REQUESTED", "SAVED", "SECURITY_ADVISORY_CREDIT", "SECURITY_ALERT", "STATE_CHANGE", "SUBSCRIBED", "TEAM_MENTION"});
        s = new aa.a0("NotificationReason");
    }

    public ih(String str, int i, String str2) {
        this.r = str2;
    }

    public static ih valueOf(String str) {
        return (ih) Enum.valueOf(ih.class, str);
    }

    public static ih[] values() {
        return (ih[]) K.clone();
    }
    public Object ordinal() { return null; }
}

package ei;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements a {
    public static final g A;
    public static final g B;
    public static final g C;
    public static final g D;
    public static final g E;
    public static final g F;
    public static final g G;
    public static final g H;
    public static final /* synthetic */ g[] I;
    public static final /* synthetic */ d71.b J;
    public static final g t;
    public static final g u;
    public static final g v;
    public static final g w;
    public static final g x;
    public static final g y;
    public static final g z;
    public final String r;
    public final String s;

    static {
        d dVar = d.s;
        g gVar = new g(0, "GHES_DEPRECATION_BANNER_ENABLED", "ghes_deprecation_banner_enabled", "Testing: Enable GHES deprecation banner");
        t = gVar;
        g gVar2 = new g(1, "IN_APP_UPDATES_ENABLED", "testing_in_app_updates_enabled", "Testing: Enable in-app updates");
        u = gVar2;
        g gVar3 = new g(2, "COPILOT_UPSELL_BANNER_ENABLED", "testing_copilot_upsell_enabled", "Testing: Enable Copilot upsell banner");
        g gVar4 = new g(3, "RESET_NOTIFICATIONS_ONBOARDING", "testing_notifications_onboarding_reset", "Testing: Reset Notifications onboarding state");
        v = gVar4;
        g gVar5 = new g(4, "RESET_NOTIFICATION_BANNER_COUNTDOWN", "reset_notification_banner_countdown", "Testing: Reset notification banner countdown to show next banner");
        w = gVar5;
        g gVar6 = new g(5, "NOTIFICATION_ONBOARDING_LEGACY_REVIEW", "notification_onboarding_legacy_review", "Testing: Notifications - review configuration state");
        x = gVar6;
        g gVar7 = new g(6, "NOTIFICATION_ONBOARDING_CONTINUE_SETUP", "notification_onboarding_continue_setup", "Testing: Notifications - continue setup state");
        y = gVar7;
        g gVar8 = new g(7, "RESET_FCM_TOKEN", "reset_fcm_token", "Testing: reset FCM token");
        z = gVar8;
        g gVar9 = new g(8, "RESET_EXPIRED_AUTH_BANNER", "reset_expired_auth_banner", "Reset expired auth request banner");
        A = gVar9;
        g gVar10 = new g(9, "RESET_COPILOT_REVIEW_BANNER", "reset_copilot_review_banner", "Reset copilot review banner");
        B = gVar10;
        g gVar11 = new g(10, "RESET_COPILOT_CODING_AGENT_BANNER", "reset_copilot_coding_agent_banner", "Reset Copilot cloud agent banner");
        C = gVar11;
        g gVar12 = new g(11, "RESET_DRAFT_ONBOARDING_BANNER", "reset_draft_onboarding_banner", "Reset draft onboarding banner");
        D = gVar12;
        g gVar13 = new g(12, "RESET_CREATE_NEW_ISSUE_TOOLTIPS", "reset_create_new_issue_tooltips", "Reset create new issue tooltips");
        E = gVar13;
        g gVar14 = new g(13, "RESET_COPILOT_HOME_TOOLTIPS", "reset_copilot_home_tooltips", "Reset copilot home tooltips");
        F = gVar14;
        g gVar15 = new g(14, "RESET_AGENT_TASK_SKIP_PR_BANNER", "reset_agent_task_skip_pr_banner", "Reset agent task skip PR banner");
        G = gVar15;
        g gVar16 = new g(15, "RESET_VSCODE_SESSION_BANNER", "reset_vscode_session_banner", "Reset VS Code session preview banner");
        H = gVar16;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16};
        I = gVarArr;
        J = l0.t(gVarArr);
    }

    public g(int i, String str, String str2, String str3) {
        d dVar = d.s;
        this.r = str2;
        this.s = str3;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) I.clone();
    }
}

package ei;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements a {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;
    public static final c I;
    public static final c J;
    public static final c K;
    public static final c L;
    public static final c M;
    public static final c N;
    public static final c O;
    public static final c P;
    public static final c Q;
    public static final c R;
    public static final c S;
    public static final c T;
    public static final c U;
    public static final c V;
    public static final c W;
    public static final c X;
    public static final c Y;
    public static final c Z;
    public static final c a0;
    public static final c b0;
    public static final c c0;
    public static final /* synthetic */ c[] d0;
    public static final /* synthetic */ d71.b e0;
    public static final c v;
    public static final c w;
    public static final c x;
    public static final c y;
    public static final c z;
    public final String r;
    public final String s;
    public final d t;
    public final String u;

    static {
        d dVar = d.w;
        c cVar = new c("NAVIGATION_REVAMP_MY_WORK", 0, "navigation_revamp", "Navigation: Use the new graph oriented navigation model in Home MyWork", dVar, null);
        v = cVar;
        c cVar2 = new c("NAV_REVAMP", 1, "nav_revamp", "Navigation: Use the new graph oriented navigation model", dVar, null);
        w = cVar2;
        c cVar3 = new c("NAV_REVAMP_DEEP_LINKS", 2, "nav_revamp_deep_links", "Navigation: Use the new graph oriented navigation model for deep links.", dVar, null);
        x = cVar3;
        d dVar2 = d.s;
        c cVar4 = new c("SHAKE_GESTURE", 3, "shake_gesture", "Enable shake to open developer settings", dVar2, null);
        y = cVar4;
        c cVar5 = new c("DEVELOPER_SETTINGS_NOTIFICATION", 4, "developer_settings_notification", "Enable persistent notification for developer settings access", dVar2, null);
        z = cVar5;
        c cVar6 = new c("TWO_FACTOR_AUTH", 5, "two_factor_auth", "Enable App 2FA", dVar, null);
        A = cVar6;
        d dVar3 = d.t;
        c cVar7 = new c("MERGE_QUEUE_NOTIFICATIONS", 6, "merge_queue_notifications", "Show and handle merge queue notification related features", dVar3, null);
        B = cVar7;
        c cVar8 = new c("RICH_IMAGE_DIFF", 7, "rich_image_diff", "Enable rich image diff", dVar3, null);
        C = cVar8;
        c cVar9 = new c("REPOSITORY_FILTER_EXTENDED", 8, "repository_filter_extended", "Repository filters extended", dVar2, null);
        D = cVar9;
        c cVar10 = new c("CODE_EDITING_CODE_OPTIONS", 9, "code_editing_code_options", "Enable code options for code editor", dVar3, null);
        E = cVar10;
        c cVar11 = new c("MULTI_ACCOUNT_HEURISTICS", 10, "multi_account_heuristics", "Enable multi account deep link heuristics", dVar3, null);
        F = cVar11;
        d dVar4 = d.u;
        c cVar12 = new c("RELEASES_PUSH_NOTIFICATIONS", 11, "releases_push_notifications", "Enables the setting for controlling if you want push notifications for releases on a repo", dVar4, null);
        G = cVar12;
        c cVar13 = new c("FEED_ITEMS_DEMO", 12, "feed_items_demo", "Enables feed items demo to show all feed items behind a hidden tap action.", dVar4, null);
        H = cVar13;
        c cVar14 = new c("PROJECTS_PWL_ALIVE", 13, "projects_without_limits_alive", "Use Alive to update projects", dVar2, null);
        I = cVar14;
        c cVar15 = new c("SHOW_GHES_VERSION", 14, "show_ghes_version", "Show GHES version in accounts fragment", dVar2, null);
        J = cVar15;
        c cVar16 = new c("AGENTS_HOME_LIST", 15, "agents_home_list", "Enable Agents Home List", dVar, null);
        K = cVar16;
        c cVar17 = new c("COMPOSE_TRIAGE_ASSIGNEES", 16, "compose_triage_assignees", "Enable Compose triage assignees picker", dVar, null);
        L = cVar17;
        c cVar18 = new c("COPILOT_MAX", 17, "copilot_max", "Enable Copilot Max IAP and license handling", dVar2, null);
        M = cVar18;
        c cVar19 = new c("COPILOT_SERVER_DRIVEN_PAYWALL", 18, "copilot_server_driven_paywall", "Enable server driven Copilot paywall", dVar, "https://github.com/github/client-apps-platform/discussions/910");
        N = cVar19;
        c cVar20 = new c("REPOSITORY_SHORTCUTS", 19, "repository_shortcuts", "Enable Repository Shortcuts", dVar2, null);
        O = cVar20;
        c cVar21 = new c("DRAFT_FILTER", 20, "draft_filter", "Enable pull request draft filter", d.v, null);
        P = cVar21;
        c cVar22 = new c("LIVE_NOTIFICATIONS_CCA", 21, "live_notifications_cca", "Enable live notifications for CCA events", dVar, null);
        Q = cVar22;
        c cVar23 = new c("DELETE_FILE", 22, "delete_file", "Enable deleting files in the code editor", dVar, null);
        R = cVar23;
        c cVar24 = new c("CREATE_TASK_FROM_URLS", 23, "create_task_from_urls", "Enable task creation from components which share a URL", dVar, null);
        S = cVar24;
        c cVar25 = new c("CERT_BACKGROUND_WORKER", 24, "cert_background_worker", "Enable background worker to periodically check certificate validity", dVar4, null);
        T = cVar25;
        c cVar26 = new c("MC_COPILOT_HOME", 25, "mc_copilot_home", "Enable the new Copilot Home experience", dVar, "https://github.com/github/mobile-android/issues/17144");
        U = cVar26;
        c cVar27 = new c("AGENT_THIRD_PARTY_PICKER", 26, "agent_third_party_picker", "Enable the third party agent picker", dVar, "https://github.com/github/mobile-android/issues/16977");
        V = cVar27;
        c cVar28 = new c("CONSOLIDATED_STATUS_CHECKS", 27, "consolidated_status_checks", "Enable consolidated status checks in PRs", dVar, "https://github.com/github/mobile-android/issues/16632");
        W = cVar28;
        c cVar29 = new c("NAV_TABS_V2", 28, "nav_tabs_v2", "Enable the new bottom navigation tabs experience", dVar, "https://github.com/github/mobile-android/issues/17272");
        X = cVar29;
        c cVar30 = new c("CCA_ISSUES", 29, "cca_issues", "Enable Copilot assignment and custom instructions in issues", dVar, "https://github.com/github/mobile-android/issues/17529");
        Y = cVar30;
        c cVar31 = new c("NATIVE_SESSION_LOGS", 30, "native_session_logs", "Enable native session logs for agent sessions", dVar, "https://github.com/github/mobile-android/issues/17664");
        Z = cVar31;
        c cVar32 = new c("AGENT_TASK_SKIP_PR_CREATION", 31, "agent_task_skip_pr_creation", "Disable automatic PR creation for agent tasks", dVar, null);
        a0 = cVar32;
        c cVar33 = new c("CREATE_REPOSITORY", 32, "create_repository", "Enable repository creation flow", dVar, "https://github.com/github/mobile-android/issues/18001");
        b0 = cVar33;
        c cVar34 = new c("RC_M2_SESSION_STEERING", 33, "rc_m2_session_steering", "Enable session steering", dVar, "https://github.com/github/mobile-android/issues/18037");
        c0 = cVar34;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, new c("IMPROVE_REPOSITORY_SEARCH", 34, "improve_repository_search", "Use viewerRelevantRepositories for top repository search", dVar3, "https://github.com/github/mobile-android/issues/18326"), new c("INLINE_TOOL_CALLS", 35, "inline_tool_calls", "Show tool calls inline in session transcript", dVar, "https://github.com/github/mobile-android/issues/18392")};
        d0 = cVarArr;
        e0 = l0.t(cVarArr);
    }

    public c(String str, int i, String str2, String str3, d dVar, String str4) {
        this.r = str2;
        this.s = str3;
        this.t = dVar;
        this.u = str4;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d0.clone();
    }
}

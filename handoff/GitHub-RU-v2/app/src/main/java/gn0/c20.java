package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class c20 {
    public static final b20 Companion;
    public static final aa.a0 s;
    public static final c20 t;
    public static final /* synthetic */ c20[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        c20 c20Var = new c20("BRANCH_PROTECTION_RULE", 0, "BRANCH_PROTECTION_RULE");
        c20 c20Var2 = new c20("CHECK_RUN", 1, "CHECK_RUN");
        c20 c20Var3 = new c20("CHECK_SUITE", 2, "CHECK_SUITE");
        c20 c20Var4 = new c20("CREATE", 3, "CREATE");
        c20 c20Var5 = new c20("DELETE", 4, "DELETE");
        c20 c20Var6 = new c20("DEPLOYMENT", 5, "DEPLOYMENT");
        c20 c20Var7 = new c20("DEPLOYMENT_STATUS", 6, "DEPLOYMENT_STATUS");
        c20 c20Var8 = new c20("DISCUSSION", 7, "DISCUSSION");
        c20 c20Var9 = new c20("DISCUSSION_COMMENT", 8, "DISCUSSION_COMMENT");
        c20 c20Var10 = new c20("DYNAMIC", 9, "DYNAMIC");
        c20 c20Var11 = new c20("FORK", 10, "FORK");
        c20 c20Var12 = new c20("GOLLUM", 11, "GOLLUM");
        c20 c20Var13 = new c20("ISSUES", 12, "ISSUES");
        c20 c20Var14 = new c20("ISSUE_COMMENT", 13, "ISSUE_COMMENT");
        c20 c20Var15 = new c20("LABEL", 14, "LABEL");
        c20 c20Var16 = new c20("MERGE_GROUP", 15, "MERGE_GROUP");
        c20 c20Var17 = new c20("MILESTONE", 16, "MILESTONE");
        c20 c20Var18 = new c20("PAGE_BUILD", 17, "PAGE_BUILD");
        c20 c20Var19 = new c20("PROJECT", 18, "PROJECT");
        c20 c20Var20 = new c20("PROJECT_CARD", 19, "PROJECT_CARD");
        c20 c20Var21 = new c20("PROJECT_COLUMN", 20, "PROJECT_COLUMN");
        c20 c20Var22 = new c20("PUBLIC", 21, "PUBLIC");
        c20 c20Var23 = new c20("PULL_REQUEST", 22, "PULL_REQUEST");
        c20 c20Var24 = new c20("PULL_REQUEST_REVIEW", 23, "PULL_REQUEST_REVIEW");
        c20 c20Var25 = new c20("PULL_REQUEST_REVIEW_COMMENT", 24, "PULL_REQUEST_REVIEW_COMMENT");
        c20 c20Var26 = new c20("PULL_REQUEST_TARGET", 25, "PULL_REQUEST_TARGET");
        c20 c20Var27 = new c20("PUSH", 26, "PUSH");
        c20 c20Var28 = new c20("REGISTRY_PACKAGE", 27, "REGISTRY_PACKAGE");
        c20 c20Var29 = new c20("RELEASE", 28, "RELEASE");
        c20 c20Var30 = new c20("REPOSITORY_DISPATCH", 29, "REPOSITORY_DISPATCH");
        c20 c20Var31 = new c20("SCHEDULE", 30, "SCHEDULE");
        c20 c20Var32 = new c20("STATUS", 31, "STATUS");
        c20 c20Var33 = new c20("WATCH", 32, "WATCH");
        c20 c20Var34 = new c20("WORKFLOW_DISPATCH", 33, "WORKFLOW_DISPATCH");
        c20 c20Var35 = new c20("WORKFLOW_RUN", 34, "WORKFLOW_RUN");
        c20 c20Var36 = new c20("UNKNOWN__", 35, "UNKNOWN__");
        t = c20Var36;
        c20[] c20VarArr = {c20Var, c20Var2, c20Var3, c20Var4, c20Var5, c20Var6, c20Var7, c20Var8, c20Var9, c20Var10, c20Var11, c20Var12, c20Var13, c20Var14, c20Var15, c20Var16, c20Var17, c20Var18, c20Var19, c20Var20, c20Var21, c20Var22, c20Var23, c20Var24, c20Var25, c20Var26, c20Var27, c20Var28, c20Var29, c20Var30, c20Var31, c20Var32, c20Var33, c20Var34, c20Var35, c20Var36};
        u = c20VarArr;
        v = v8.l0.t(c20VarArr);
        Companion = new b20();
        x61.l.r(new String[]{"BRANCH_PROTECTION_RULE", "CHECK_RUN", "CHECK_SUITE", "CREATE", "DELETE", "DEPLOYMENT", "DEPLOYMENT_STATUS", "DISCUSSION", "DISCUSSION_COMMENT", "DYNAMIC", "FORK", "GOLLUM", "ISSUES", "ISSUE_COMMENT", "LABEL", "MERGE_GROUP", "MILESTONE", "PAGE_BUILD", "PROJECT", "PROJECT_CARD", "PROJECT_COLUMN", "PUBLIC", "PULL_REQUEST", "PULL_REQUEST_REVIEW", "PULL_REQUEST_REVIEW_COMMENT", "PULL_REQUEST_TARGET", "PUSH", "REGISTRY_PACKAGE", "RELEASE", "REPOSITORY_DISPATCH", "SCHEDULE", "STATUS", "WATCH", "WORKFLOW_DISPATCH", "WORKFLOW_RUN"});
        s = new aa.a0("WorkflowRunEvent");
    }

    public c20(String str, int i, String str2) {
        this.r = str2;
    }

    public static c20 valueOf(String str) {
        return (c20) Enum.valueOf(c20.class, str);
    }

    public static c20[] values() {
        return (c20[]) u.clone();
    }
    public Object ordinal() { return null; }
}

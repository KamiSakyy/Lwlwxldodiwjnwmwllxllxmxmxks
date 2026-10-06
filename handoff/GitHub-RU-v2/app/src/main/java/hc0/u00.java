package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class u00 {
    public static final t00 Companion;
    public static final aa.a0 s;
    public static final u00 t;
    public static final /* synthetic */ u00[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        u00 u00Var = new u00("BRANCH_PROTECTION_RULE", 0, "BRANCH_PROTECTION_RULE");
        u00 u00Var2 = new u00("CHECK_RUN", 1, "CHECK_RUN");
        u00 u00Var3 = new u00("CHECK_SUITE", 2, "CHECK_SUITE");
        u00 u00Var4 = new u00("CREATE", 3, "CREATE");
        u00 u00Var5 = new u00("DELETE", 4, "DELETE");
        u00 u00Var6 = new u00("DEPLOYMENT", 5, "DEPLOYMENT");
        u00 u00Var7 = new u00("DEPLOYMENT_STATUS", 6, "DEPLOYMENT_STATUS");
        u00 u00Var8 = new u00("DISCUSSION", 7, "DISCUSSION");
        u00 u00Var9 = new u00("DISCUSSION_COMMENT", 8, "DISCUSSION_COMMENT");
        u00 u00Var10 = new u00("DYNAMIC", 9, "DYNAMIC");
        u00 u00Var11 = new u00("FORK", 10, "FORK");
        u00 u00Var12 = new u00("GOLLUM", 11, "GOLLUM");
        u00 u00Var13 = new u00("ISSUES", 12, "ISSUES");
        u00 u00Var14 = new u00("ISSUE_COMMENT", 13, "ISSUE_COMMENT");
        u00 u00Var15 = new u00("LABEL", 14, "LABEL");
        u00 u00Var16 = new u00("MERGE_GROUP", 15, "MERGE_GROUP");
        u00 u00Var17 = new u00("MILESTONE", 16, "MILESTONE");
        u00 u00Var18 = new u00("PAGE_BUILD", 17, "PAGE_BUILD");
        u00 u00Var19 = new u00("PROJECT", 18, "PROJECT");
        u00 u00Var20 = new u00("PROJECT_CARD", 19, "PROJECT_CARD");
        u00 u00Var21 = new u00("PROJECT_COLUMN", 20, "PROJECT_COLUMN");
        u00 u00Var22 = new u00("PUBLIC", 21, "PUBLIC");
        u00 u00Var23 = new u00("PULL_REQUEST", 22, "PULL_REQUEST");
        u00 u00Var24 = new u00("PULL_REQUEST_REVIEW", 23, "PULL_REQUEST_REVIEW");
        u00 u00Var25 = new u00("PULL_REQUEST_REVIEW_COMMENT", 24, "PULL_REQUEST_REVIEW_COMMENT");
        u00 u00Var26 = new u00("PULL_REQUEST_TARGET", 25, "PULL_REQUEST_TARGET");
        u00 u00Var27 = new u00("PUSH", 26, "PUSH");
        u00 u00Var28 = new u00("REGISTRY_PACKAGE", 27, "REGISTRY_PACKAGE");
        u00 u00Var29 = new u00("RELEASE", 28, "RELEASE");
        u00 u00Var30 = new u00("REPOSITORY_DISPATCH", 29, "REPOSITORY_DISPATCH");
        u00 u00Var31 = new u00("SCHEDULE", 30, "SCHEDULE");
        u00 u00Var32 = new u00("STATUS", 31, "STATUS");
        u00 u00Var33 = new u00("WATCH", 32, "WATCH");
        u00 u00Var34 = new u00("WORKFLOW_DISPATCH", 33, "WORKFLOW_DISPATCH");
        u00 u00Var35 = new u00("WORKFLOW_RUN", 34, "WORKFLOW_RUN");
        u00 u00Var36 = new u00("UNKNOWN__", 35, "UNKNOWN__");
        t = u00Var36;
        u00[] u00VarArr = {u00Var, u00Var2, u00Var3, u00Var4, u00Var5, u00Var6, u00Var7, u00Var8, u00Var9, u00Var10, u00Var11, u00Var12, u00Var13, u00Var14, u00Var15, u00Var16, u00Var17, u00Var18, u00Var19, u00Var20, u00Var21, u00Var22, u00Var23, u00Var24, u00Var25, u00Var26, u00Var27, u00Var28, u00Var29, u00Var30, u00Var31, u00Var32, u00Var33, u00Var34, u00Var35, u00Var36};
        u = u00VarArr;
        v = v8.l0.t(u00VarArr);
        Companion = new t00();
        x61.l.r(new String[]{"BRANCH_PROTECTION_RULE", "CHECK_RUN", "CHECK_SUITE", "CREATE", "DELETE", "DEPLOYMENT", "DEPLOYMENT_STATUS", "DISCUSSION", "DISCUSSION_COMMENT", "DYNAMIC", "FORK", "GOLLUM", "ISSUES", "ISSUE_COMMENT", "LABEL", "MERGE_GROUP", "MILESTONE", "PAGE_BUILD", "PROJECT", "PROJECT_CARD", "PROJECT_COLUMN", "PUBLIC", "PULL_REQUEST", "PULL_REQUEST_REVIEW", "PULL_REQUEST_REVIEW_COMMENT", "PULL_REQUEST_TARGET", "PUSH", "REGISTRY_PACKAGE", "RELEASE", "REPOSITORY_DISPATCH", "SCHEDULE", "STATUS", "WATCH", "WORKFLOW_DISPATCH", "WORKFLOW_RUN"});
        s = new aa.a0("WorkflowRunEvent");
    }

    public u00(String str, int i, String str2) {
        this.r = str2;
    }

    public static u00 valueOf(String str) {
        return (u00) Enum.valueOf(u00.class, str);
    }

    public static u00[] values() {
        return (u00[]) u.clone();
    }
    public Object ordinal() { return null; }
}

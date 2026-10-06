package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class gh0 {
    public static final fh0 Companion;
    public static final aa.a0 s;
    public static final gh0 t;
    public static final /* synthetic */ gh0[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        gh0 gh0Var = new gh0("BRANCH_PROTECTION_RULE", 0, "BRANCH_PROTECTION_RULE");
        gh0 gh0Var2 = new gh0("CHECK_RUN", 1, "CHECK_RUN");
        gh0 gh0Var3 = new gh0("CHECK_SUITE", 2, "CHECK_SUITE");
        gh0 gh0Var4 = new gh0("CREATE", 3, "CREATE");
        gh0 gh0Var5 = new gh0("DELETE", 4, "DELETE");
        gh0 gh0Var6 = new gh0("DEPLOYMENT", 5, "DEPLOYMENT");
        gh0 gh0Var7 = new gh0("DEPLOYMENT_STATUS", 6, "DEPLOYMENT_STATUS");
        gh0 gh0Var8 = new gh0("DISCUSSION", 7, "DISCUSSION");
        gh0 gh0Var9 = new gh0("DISCUSSION_COMMENT", 8, "DISCUSSION_COMMENT");
        gh0 gh0Var10 = new gh0("DYNAMIC", 9, "DYNAMIC");
        gh0 gh0Var11 = new gh0("FORK", 10, "FORK");
        gh0 gh0Var12 = new gh0("GOLLUM", 11, "GOLLUM");
        gh0 gh0Var13 = new gh0("IMAGE_VERSION", 12, "IMAGE_VERSION");
        gh0 gh0Var14 = new gh0("ISSUES", 13, "ISSUES");
        gh0 gh0Var15 = new gh0("ISSUE_COMMENT", 14, "ISSUE_COMMENT");
        gh0 gh0Var16 = new gh0("LABEL", 15, "LABEL");
        gh0 gh0Var17 = new gh0("MERGE_GROUP", 16, "MERGE_GROUP");
        gh0 gh0Var18 = new gh0("MILESTONE", 17, "MILESTONE");
        gh0 gh0Var19 = new gh0("PAGE_BUILD", 18, "PAGE_BUILD");
        gh0 gh0Var20 = new gh0("PROJECT", 19, "PROJECT");
        gh0 gh0Var21 = new gh0("PROJECT_CARD", 20, "PROJECT_CARD");
        gh0 gh0Var22 = new gh0("PROJECT_COLUMN", 21, "PROJECT_COLUMN");
        gh0 gh0Var23 = new gh0("PUBLIC", 22, "PUBLIC");
        gh0 gh0Var24 = new gh0("PULL_REQUEST", 23, "PULL_REQUEST");
        gh0 gh0Var25 = new gh0("PULL_REQUEST_REVIEW", 24, "PULL_REQUEST_REVIEW");
        gh0 gh0Var26 = new gh0("PULL_REQUEST_REVIEW_COMMENT", 25, "PULL_REQUEST_REVIEW_COMMENT");
        gh0 gh0Var27 = new gh0("PULL_REQUEST_TARGET", 26, "PULL_REQUEST_TARGET");
        gh0 gh0Var28 = new gh0("PUSH", 27, "PUSH");
        gh0 gh0Var29 = new gh0("REGISTRY_PACKAGE", 28, "REGISTRY_PACKAGE");
        gh0 gh0Var30 = new gh0("RELEASE", 29, "RELEASE");
        gh0 gh0Var31 = new gh0("REPOSITORY_DISPATCH", 30, "REPOSITORY_DISPATCH");
        gh0 gh0Var32 = new gh0("SCHEDULE", 31, "SCHEDULE");
        gh0 gh0Var33 = new gh0("STATUS", 32, "STATUS");
        gh0 gh0Var34 = new gh0("WATCH", 33, "WATCH");
        gh0 gh0Var35 = new gh0("WORKFLOW_CALL", 34, "WORKFLOW_CALL");
        gh0 gh0Var36 = new gh0("WORKFLOW_DISPATCH", 35, "WORKFLOW_DISPATCH");
        gh0 gh0Var37 = new gh0("WORKFLOW_RUN", 36, "WORKFLOW_RUN");
        gh0 gh0Var38 = new gh0("UNKNOWN__", 37, "UNKNOWN__");
        t = gh0Var38;
        gh0[] gh0VarArr = {gh0Var, gh0Var2, gh0Var3, gh0Var4, gh0Var5, gh0Var6, gh0Var7, gh0Var8, gh0Var9, gh0Var10, gh0Var11, gh0Var12, gh0Var13, gh0Var14, gh0Var15, gh0Var16, gh0Var17, gh0Var18, gh0Var19, gh0Var20, gh0Var21, gh0Var22, gh0Var23, gh0Var24, gh0Var25, gh0Var26, gh0Var27, gh0Var28, gh0Var29, gh0Var30, gh0Var31, gh0Var32, gh0Var33, gh0Var34, gh0Var35, gh0Var36, gh0Var37, gh0Var38};
        u = gh0VarArr;
        v = v8.l0.t(gh0VarArr);
        Companion = new fh0();
        x61.l.r(new String[]{"BRANCH_PROTECTION_RULE", "CHECK_RUN", "CHECK_SUITE", "CREATE", "DELETE", "DEPLOYMENT", "DEPLOYMENT_STATUS", "DISCUSSION", "DISCUSSION_COMMENT", "DYNAMIC", "FORK", "GOLLUM", "IMAGE_VERSION", "ISSUES", "ISSUE_COMMENT", "LABEL", "MERGE_GROUP", "MILESTONE", "PAGE_BUILD", "PROJECT", "PROJECT_CARD", "PROJECT_COLUMN", "PUBLIC", "PULL_REQUEST", "PULL_REQUEST_REVIEW", "PULL_REQUEST_REVIEW_COMMENT", "PULL_REQUEST_TARGET", "PUSH", "REGISTRY_PACKAGE", "RELEASE", "REPOSITORY_DISPATCH", "SCHEDULE", "STATUS", "WATCH", "WORKFLOW_CALL", "WORKFLOW_DISPATCH", "WORKFLOW_RUN"});
        s = new aa.a0("WorkflowRunEvent");
    }

    public gh0(String str, int i, String str2) {
        this.r = str2;
    }

    public static gh0 valueOf(String str) {
        return (gh0) Enum.valueOf(gh0.class, str);
    }

    public static gh0[] values() {
        return (gh0[]) u.clone();
    }
    public Object ordinal() { return null; }
}

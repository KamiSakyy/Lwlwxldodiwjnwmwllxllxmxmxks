package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class la0 {
    public static final ka0 Companion;
    public static final aa.a0 s;
    public static final la0 t;
    public static final /* synthetic */ la0[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        la0 la0Var = new la0("BRANCH_PROTECTION_RULE", 0, "BRANCH_PROTECTION_RULE");
        la0 la0Var2 = new la0("CHECK_RUN", 1, "CHECK_RUN");
        la0 la0Var3 = new la0("CHECK_SUITE", 2, "CHECK_SUITE");
        la0 la0Var4 = new la0("CREATE", 3, "CREATE");
        la0 la0Var5 = new la0("DELETE", 4, "DELETE");
        la0 la0Var6 = new la0("DEPLOYMENT", 5, "DEPLOYMENT");
        la0 la0Var7 = new la0("DEPLOYMENT_STATUS", 6, "DEPLOYMENT_STATUS");
        la0 la0Var8 = new la0("DISCUSSION", 7, "DISCUSSION");
        la0 la0Var9 = new la0("DISCUSSION_COMMENT", 8, "DISCUSSION_COMMENT");
        la0 la0Var10 = new la0("DYNAMIC", 9, "DYNAMIC");
        la0 la0Var11 = new la0("FORK", 10, "FORK");
        la0 la0Var12 = new la0("GOLLUM", 11, "GOLLUM");
        la0 la0Var13 = new la0("ISSUES", 12, "ISSUES");
        la0 la0Var14 = new la0("ISSUE_COMMENT", 13, "ISSUE_COMMENT");
        la0 la0Var15 = new la0("LABEL", 14, "LABEL");
        la0 la0Var16 = new la0("MERGE_GROUP", 15, "MERGE_GROUP");
        la0 la0Var17 = new la0("MILESTONE", 16, "MILESTONE");
        la0 la0Var18 = new la0("PAGE_BUILD", 17, "PAGE_BUILD");
        la0 la0Var19 = new la0("PROJECT", 18, "PROJECT");
        la0 la0Var20 = new la0("PROJECT_CARD", 19, "PROJECT_CARD");
        la0 la0Var21 = new la0("PROJECT_COLUMN", 20, "PROJECT_COLUMN");
        la0 la0Var22 = new la0("PUBLIC", 21, "PUBLIC");
        la0 la0Var23 = new la0("PULL_REQUEST", 22, "PULL_REQUEST");
        la0 la0Var24 = new la0("PULL_REQUEST_REVIEW", 23, "PULL_REQUEST_REVIEW");
        la0 la0Var25 = new la0("PULL_REQUEST_REVIEW_COMMENT", 24, "PULL_REQUEST_REVIEW_COMMENT");
        la0 la0Var26 = new la0("PULL_REQUEST_TARGET", 25, "PULL_REQUEST_TARGET");
        la0 la0Var27 = new la0("PUSH", 26, "PUSH");
        la0 la0Var28 = new la0("REGISTRY_PACKAGE", 27, "REGISTRY_PACKAGE");
        la0 la0Var29 = new la0("RELEASE", 28, "RELEASE");
        la0 la0Var30 = new la0("REPOSITORY_DISPATCH", 29, "REPOSITORY_DISPATCH");
        la0 la0Var31 = new la0("SCHEDULE", 30, "SCHEDULE");
        la0 la0Var32 = new la0("STATUS", 31, "STATUS");
        la0 la0Var33 = new la0("WATCH", 32, "WATCH");
        la0 la0Var34 = new la0("WORKFLOW_DISPATCH", 33, "WORKFLOW_DISPATCH");
        la0 la0Var35 = new la0("WORKFLOW_RUN", 34, "WORKFLOW_RUN");
        la0 la0Var36 = new la0("UNKNOWN__", 35, "UNKNOWN__");
        t = la0Var36;
        la0[] la0VarArr = {la0Var, la0Var2, la0Var3, la0Var4, la0Var5, la0Var6, la0Var7, la0Var8, la0Var9, la0Var10, la0Var11, la0Var12, la0Var13, la0Var14, la0Var15, la0Var16, la0Var17, la0Var18, la0Var19, la0Var20, la0Var21, la0Var22, la0Var23, la0Var24, la0Var25, la0Var26, la0Var27, la0Var28, la0Var29, la0Var30, la0Var31, la0Var32, la0Var33, la0Var34, la0Var35, la0Var36};
        u = la0VarArr;
        v = v8.l0.t(la0VarArr);
        Companion = new ka0();
        x61.l.r(new String[]{"BRANCH_PROTECTION_RULE", "CHECK_RUN", "CHECK_SUITE", "CREATE", "DELETE", "DEPLOYMENT", "DEPLOYMENT_STATUS", "DISCUSSION", "DISCUSSION_COMMENT", "DYNAMIC", "FORK", "GOLLUM", "ISSUES", "ISSUE_COMMENT", "LABEL", "MERGE_GROUP", "MILESTONE", "PAGE_BUILD", "PROJECT", "PROJECT_CARD", "PROJECT_COLUMN", "PUBLIC", "PULL_REQUEST", "PULL_REQUEST_REVIEW", "PULL_REQUEST_REVIEW_COMMENT", "PULL_REQUEST_TARGET", "PUSH", "REGISTRY_PACKAGE", "RELEASE", "REPOSITORY_DISPATCH", "SCHEDULE", "STATUS", "WATCH", "WORKFLOW_DISPATCH", "WORKFLOW_RUN"});
        s = new aa.a0("WorkflowRunEvent");
    }

    public la0(String str, int i, String str2) {
        this.r = str2;
    }

    public static la0 valueOf(String str) {
        return (la0) Enum.valueOf(la0.class, str);
    }

    public static la0[] values() {
        return (la0[]) u.clone();
    }
    public Object ordinal() { return null; }
}

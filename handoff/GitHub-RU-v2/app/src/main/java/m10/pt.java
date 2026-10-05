package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class pt {
    public static final ot Companion;
    public static final aa.a0 s;
    public static final pt t;
    public static final pt u;
    public static final /* synthetic */ pt[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        pt ptVar = new pt("ASSIGNEES", 0, "ASSIGNEES");
        pt ptVar2 = new pt("DATE", 1, "DATE");
        pt ptVar3 = new pt("ISSUE_TYPE", 2, "ISSUE_TYPE");
        pt ptVar4 = new pt("ITERATION", 3, "ITERATION");
        pt ptVar5 = new pt("LABELS", 4, "LABELS");
        pt ptVar6 = new pt("LINKED_PULL_REQUESTS", 5, "LINKED_PULL_REQUESTS");
        pt ptVar7 = new pt("MILESTONE", 6, "MILESTONE");
        pt ptVar8 = new pt("NUMBER", 7, "NUMBER");
        pt ptVar9 = new pt("PARENT_ISSUE", 8, "PARENT_ISSUE");
        pt ptVar10 = new pt("REPOSITORY", 9, "REPOSITORY");
        pt ptVar11 = new pt("REVIEWERS", 10, "REVIEWERS");
        pt ptVar12 = new pt("SINGLE_SELECT", 11, "SINGLE_SELECT");
        pt ptVar13 = new pt("SUB_ISSUES_PROGRESS", 12, "SUB_ISSUES_PROGRESS");
        pt ptVar14 = new pt("TEXT", 13, "TEXT");
        pt ptVar15 = new pt("TITLE", 14, "TITLE");
        t = ptVar15;
        pt ptVar16 = new pt("TRACKED_BY", 15, "TRACKED_BY");
        pt ptVar17 = new pt("TRACKS", 16, "TRACKS");
        pt ptVar18 = new pt("UNKNOWN__", 17, "UNKNOWN__");
        u = ptVar18;
        pt[] ptVarArr = {ptVar, ptVar2, ptVar3, ptVar4, ptVar5, ptVar6, ptVar7, ptVar8, ptVar9, ptVar10, ptVar11, ptVar12, ptVar13, ptVar14, ptVar15, ptVar16, ptVar17, ptVar18};
        v = ptVarArr;
        w = v8.l0.t(ptVarArr);
        Companion = new ot();
        x61.l.r(new String[]{"ASSIGNEES", "DATE", "ISSUE_TYPE", "ITERATION", "LABELS", "LINKED_PULL_REQUESTS", "MILESTONE", "NUMBER", "PARENT_ISSUE", "REPOSITORY", "REVIEWERS", "SINGLE_SELECT", "SUB_ISSUES_PROGRESS", "TEXT", "TITLE", "TRACKED_BY", "TRACKS"});
        s = new aa.a0("ProjectV2FieldType");
    }

    public pt(String str, int i, String str2) {
        this.r = str2;
    }

    public static pt valueOf(String str) {
        return (pt) Enum.valueOf(pt.class, str);
    }

    public static pt[] values() {
        return (pt[]) v.clone();
    }
}

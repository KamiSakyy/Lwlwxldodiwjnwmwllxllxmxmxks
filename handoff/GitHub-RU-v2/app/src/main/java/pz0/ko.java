package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ko {
    public static final jo Companion;
    public static final aa.a0 s;
    public static final ko t;
    public static final ko u;
    public static final /* synthetic */ ko[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        ko koVar = new ko("ASSIGNEES", 0, "ASSIGNEES");
        ko koVar2 = new ko("DATE", 1, "DATE");
        ko koVar3 = new ko("ISSUE_TYPE", 2, "ISSUE_TYPE");
        ko koVar4 = new ko("ITERATION", 3, "ITERATION");
        ko koVar5 = new ko("LABELS", 4, "LABELS");
        ko koVar6 = new ko("LINKED_PULL_REQUESTS", 5, "LINKED_PULL_REQUESTS");
        ko koVar7 = new ko("MILESTONE", 6, "MILESTONE");
        ko koVar8 = new ko("NUMBER", 7, "NUMBER");
        ko koVar9 = new ko("PARENT_ISSUE", 8, "PARENT_ISSUE");
        ko koVar10 = new ko("REPOSITORY", 9, "REPOSITORY");
        ko koVar11 = new ko("REVIEWERS", 10, "REVIEWERS");
        ko koVar12 = new ko("SINGLE_SELECT", 11, "SINGLE_SELECT");
        ko koVar13 = new ko("SUB_ISSUES_PROGRESS", 12, "SUB_ISSUES_PROGRESS");
        ko koVar14 = new ko("TEXT", 13, "TEXT");
        ko koVar15 = new ko("TITLE", 14, "TITLE");
        t = koVar15;
        ko koVar16 = new ko("TRACKED_BY", 15, "TRACKED_BY");
        ko koVar17 = new ko("TRACKS", 16, "TRACKS");
        ko koVar18 = new ko("UNKNOWN__", 17, "UNKNOWN__");
        u = koVar18;
        ko[] koVarArr = {koVar, koVar2, koVar3, koVar4, koVar5, koVar6, koVar7, koVar8, koVar9, koVar10, koVar11, koVar12, koVar13, koVar14, koVar15, koVar16, koVar17, koVar18};
        v = koVarArr;
        w = v8.l0.t(koVarArr);
        Companion = new jo();
        x61.l.r(new String[]{"ASSIGNEES", "DATE", "ISSUE_TYPE", "ITERATION", "LABELS", "LINKED_PULL_REQUESTS", "MILESTONE", "NUMBER", "PARENT_ISSUE", "REPOSITORY", "REVIEWERS", "SINGLE_SELECT", "SUB_ISSUES_PROGRESS", "TEXT", "TITLE", "TRACKED_BY", "TRACKS"});
        s = new aa.a0("ProjectV2FieldType");
    }

    public ko(String str, int i, String str2) {
        this.r = str2;
    }

    public static ko valueOf(String str) {
        return (ko) Enum.valueOf(ko.class, str);
    }

    public static ko[] values() {
        return (ko[]) v.clone();
    }
}

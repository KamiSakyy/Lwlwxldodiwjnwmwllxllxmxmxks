package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class wz {
    public static final wz A;
    public static final /* synthetic */ wz[] B;
    public static final /* synthetic */ d71.b C;
    public static final vz Companion;
    public static final aa.a0 s;
    public static final wz t;
    public static final wz u;
    public static final wz v;
    public static final wz w;
    public static final wz x;
    public static final wz y;
    public static final wz z;
    public final String r;

    static {
        wz wzVar = new wz("DISCUSSIONS", 0, "DISCUSSIONS");
        t = wzVar;
        wz wzVar2 = new wz("ISSUES", 1, "ISSUES");
        u = wzVar2;
        wz wzVar3 = new wz("ORGANIZATIONS", 2, "ORGANIZATIONS");
        v = wzVar3;
        wz wzVar4 = new wz("PROJECTS", 3, "PROJECTS");
        w = wzVar4;
        wz wzVar5 = new wz("PULL_REQUESTS", 4, "PULL_REQUESTS");
        x = wzVar5;
        wz wzVar6 = new wz("REPOSITORIES", 5, "REPOSITORIES");
        y = wzVar6;
        wz wzVar7 = new wz("STARRED", 6, "STARRED");
        z = wzVar7;
        wz wzVar8 = new wz("UNKNOWN__", 7, "UNKNOWN__");
        A = wzVar8;
        wz[] wzVarArr = {wzVar, wzVar2, wzVar3, wzVar4, wzVar5, wzVar6, wzVar7, wzVar8};
        B = wzVarArr;
        C = v8.l0.t(wzVarArr);
        Companion = new vz();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "ORGANIZATIONS", "PROJECTS", "PULL_REQUESTS", "REPOSITORIES", "STARRED"});
        s = new aa.a0("UserDashboardNavLinkIdentifier");
    }

    public wz(String str, int i, String str2) {
        this.r = str2;
    }

    public static wz valueOf(String str) {
        return (wz) Enum.valueOf(wz.class, str);
    }

    public static wz[] values() {
        return (wz[]) B.clone();
    }
    public Object ordinal() { return null; }
}

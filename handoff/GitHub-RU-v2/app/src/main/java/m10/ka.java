package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ka {
    public static final ka A;
    public static final ka B;
    public static final /* synthetic */ ka[] C;
    public static final ja Companion;
    public static final /* synthetic */ d71.b D;
    public static final aa.a0 s;
    public static final ka t;
    public static final ka u;
    public static final ka v;
    public static final ka w;
    public static final ka x;
    public static final ka y;
    public static final ka z;
    public final String r;

    static {
        ka kaVar = new ka("ANNOUNCEMENTS", 0, "ANNOUNCEMENTS");
        t = kaVar;
        ka kaVar2 = new ka("EXPLICITONLY", 1, "EXPLICITONLY");
        ka kaVar3 = new ka("FOLLOWS", 2, "FOLLOWS");
        u = kaVar3;
        ka kaVar4 = new ka("POSTS", 3, "POSTS");
        v = kaVar4;
        ka kaVar5 = new ka("RECOMMENDATIONS", 4, "RECOMMENDATIONS");
        w = kaVar5;
        ka kaVar6 = new ka("RELEASES", 5, "RELEASES");
        x = kaVar6;
        ka kaVar7 = new ka("REPOSITORIES", 6, "REPOSITORIES");
        y = kaVar7;
        ka kaVar8 = new ka("REPOSITORYACTIVITY", 7, "REPOSITORYACTIVITY");
        ka kaVar9 = new ka("SPONSORS", 8, "SPONSORS");
        z = kaVar9;
        ka kaVar10 = new ka("STARREDRELATIONSHIPS", 9, "STARREDRELATIONSHIPS");
        ka kaVar11 = new ka("STARS", 10, "STARS");
        A = kaVar11;
        ka kaVar12 = new ka("UNKNOWN__", 11, "UNKNOWN__");
        B = kaVar12;
        ka[] kaVarArr = {kaVar, kaVar2, kaVar3, kaVar4, kaVar5, kaVar6, kaVar7, kaVar8, kaVar9, kaVar10, kaVar11, kaVar12};
        C = kaVarArr;
        D = v8.l0.t(kaVarArr);
        Companion = new ja();
        x61.l.r(new String[]{"ANNOUNCEMENTS", "EXPLICITONLY", "FOLLOWS", "POSTS", "RECOMMENDATIONS", "RELEASES", "REPOSITORIES", "REPOSITORYACTIVITY", "SPONSORS", "STARREDRELATIONSHIPS", "STARS"});
        s = new aa.a0("DashboardFeedFilterGroup");
    }

    public ka(String str, int i, String str2) {
        this.r = str2;
    }

    public static ka valueOf(String str) {
        return (ka) Enum.valueOf(ka.class, str);
    }

    public static ka[] values() {
        return (ka[]) C.clone();
    }
    public Object ordinal() { return null; }
}

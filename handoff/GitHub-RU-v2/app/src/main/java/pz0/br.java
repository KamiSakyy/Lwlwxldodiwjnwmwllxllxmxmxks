package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class br {
    public static final ar Companion;
    public static final br s;
    public static final br t;
    public static final br u;
    public static final br v;
    public static final br w;
    public static final br x;
    public static final /* synthetic */ br[] y;
    public String r;

    static {
        br brVar = new br("CREATED_AT", 0, "CREATED_AT");
        s = brVar;
        br brVar2 = new br("NUMBER", 1, "NUMBER");
        t = brVar2;
        br brVar3 = new br("RECENTLY_VIEWED", 2, "RECENTLY_VIEWED");
        u = brVar3;
        br brVar4 = new br("RELEVANCE", 3, "RELEVANCE");
        v = brVar4;
        br brVar5 = new br("TITLE", 4, "TITLE");
        w = brVar5;
        br brVar6 = new br("UPDATED_AT", 5, "UPDATED_AT");
        x = brVar6;
        br[] brVarArr = {brVar, brVar2, brVar3, brVar4, brVar5, brVar6, new br("UNKNOWN__", 6, "UNKNOWN__")};
        y = brVarArr;
        v8.l0.t(brVarArr);
        Companion = new ar();
        sy.d0Shadow.o(new String[]{"CREATED_AT", "NUMBER", "RECENTLY_VIEWED", "RELEVANCE", "TITLE", "UPDATED_AT"});
    }

    public br(String str, int i, String str2) {
        this.r = str2;
    }

    public static br valueOf(String str) {
        return (br) Enum.valueOf(br.class, str);
    }

    public static br[] values() {
        return (br[]) y.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class xz {
    public static final wz Companion;
    public static final aa.a0 s;
    public static final xz t;
    public static final xz u;
    public static final xz v;
    public static final /* synthetic */ xz[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        xz xzVar = new xz("FILE", 0, "FILE");
        t = xzVar;
        xz xzVar2 = new xz("LINE", 1, "LINE");
        u = xzVar2;
        xz xzVar3 = new xz("UNKNOWN__", 2, "UNKNOWN__");
        v = xzVar3;
        xz[] xzVarArr = {xzVar, xzVar2, xzVar3};
        w = xzVarArr;
        x = v8.l0.t(xzVarArr);
        Companion = new wz();
        x61.l.r(new String[]{"FILE", "LINE"});
        s = new aa.a0("PullRequestReviewThreadSubjectType");
    }

    public xz(String str, int i, String str2) {
        this.r = str2;
    }

    public static xz valueOf(String str) {
        return (xz) Enum.valueOf(xz.class, str);
    }

    public static xz[] values() {
        return (xz[]) w.clone();
    }

    public static  ordinal(Object... a) {
        return null;
    }
    public Object ordinal() { return null; }
    public Object r = null;
}

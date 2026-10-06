package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class jl {
    public static final il Companion;
    public static final aa.a0 s;
    public static final jl t;
    public static final /* synthetic */ jl[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        jl jlVar = new jl("PENDING", 0, "PENDING");
        jl jlVar2 = new jl("SUBMITTED", 1, "SUBMITTED");
        jl jlVar3 = new jl("UNKNOWN__", 2, "UNKNOWN__");
        t = jlVar3;
        jl[] jlVarArr = {jlVar, jlVar2, jlVar3};
        u = jlVarArr;
        v = v8.l0.t(jlVarArr);
        Companion = new il();
        x61.l.r(new String[]{"PENDING", "SUBMITTED"});
        s = new aa.a0("PullRequestReviewCommentState");
    }

    public jl(String str, int i, String str2) {
        this.r = str2;
    }

    public static jl valueOf(String str) {
        return (jl) Enum.valueOf(jl.class, str);
    }

    public static jl[] values() {
        return (jl[]) u.clone();
    }
    public Object ordinal() { return null; }
}

package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class y1 {

    /* renamed from: r, reason: collision with root package name */
    public static final y1 f32637r;

    /* renamed from: s, reason: collision with root package name */
    public static final y1 f32638s;

    /* renamed from: t, reason: collision with root package name */
    public static final y1 f32639t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y1[] f32640u;

    static {
        y1 y1Var = new y1("ContinueTraversal", 0);
        f32637r = y1Var;
        y1 y1Var2 = new y1("SkipSubtreeAndContinueTraversal", 1);
        f32638s = y1Var2;
        y1 y1Var3 = new y1("CancelTraversal", 2);
        f32639t = y1Var3;
        y1[] y1VarArr = {y1Var, y1Var2, y1Var3};
        f32640u = y1VarArr;
        v8.l0.t(y1VarArr);
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) f32640u.clone();
    }
}

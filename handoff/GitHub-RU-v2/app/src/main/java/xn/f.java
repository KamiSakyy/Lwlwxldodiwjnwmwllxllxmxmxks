package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public static final f r;
    public static final f s;
    public static final f t;
    public static final f u;
    public static final /* synthetic */ f[] v;

    static {
        f fVar = new f("CLI", 0);
        r = fVar;
        f fVar2 = new f("CCA", 1);
        s = fVar2;
        f fVar3 = new f("VS_CODE", 2);
        t = fVar3;
        f fVar4 = new f("UNKNOWN", 3);
        u = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        v = fVarArr;
        v8.l0.t(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) v.clone();
    }

    public f(Object... a) {
    }
}

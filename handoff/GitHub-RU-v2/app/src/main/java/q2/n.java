package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: r, reason: collision with root package name */
    public static final n f30879r;

    /* renamed from: s, reason: collision with root package name */
    public static final n f30880s;

    /* renamed from: t, reason: collision with root package name */
    public static final n f30881t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ n[] f30882u;

    static {
        n nVar = new n("Initial", 0);
        f30879r = nVar;
        n nVar2 = new n("Main", 1);
        f30880s = nVar2;
        n nVar3 = new n("Final", 2);
        f30881t = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        f30882u = nVarArr;
        v8.l0.t(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f30882u.clone();
    }
}

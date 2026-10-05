package k3;

/* loaded from: /home/user/work/p/classes.dex */
public final class s implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public static final s f27690s;

    /* renamed from: t, reason: collision with root package name */
    public static final s f27691t;

    /* renamed from: u, reason: collision with root package name */
    public static final s f27692u;

    /* renamed from: v, reason: collision with root package name */
    public static final s f27693v;

    /* renamed from: w, reason: collision with root package name */
    public static final s f27694w;

    /* renamed from: x, reason: collision with root package name */
    public static final s f27695x;

    /* renamed from: y, reason: collision with root package name */
    public static final s f27696y;

    /* renamed from: z, reason: collision with root package name */
    public static final s f27697z;

    /* renamed from: r, reason: collision with root package name */
    public final int f27698r;

    static {
        s sVar = new s(100);
        s sVar2 = new s(200);
        s sVar3 = new s(300);
        s sVar4 = new s(400);
        f27690s = sVar4;
        s sVar5 = new s(500);
        f27691t = sVar5;
        s sVar6 = new s(600);
        f27692u = sVar6;
        s sVar7 = new s(700);
        f27693v = sVar7;
        s sVar8 = new s(800);
        s sVar9 = new s(900);
        f27694w = sVar4;
        f27695x = sVar5;
        f27696y = sVar6;
        f27697z = sVar7;
        sy.d0.o(new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9});
    }

    public s(int i) {
        this.f27698r = i;
        boolean z10 = false;
        if (1 <= i && i < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        m3.a.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return k71.k.h(this.f27698r, sVar.f27698r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f27698r == ((s) obj).f27698r;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27698r;
    }

    public final String toString() {
        return x.i.j(new StringBuilder("FontWeight(weight="), this.f27698r, ')');
    }
}

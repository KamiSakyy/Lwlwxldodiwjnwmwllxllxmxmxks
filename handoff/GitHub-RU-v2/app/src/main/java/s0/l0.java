package s0;

/* loaded from: /home/user/work/p/classes.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f31521d = new l0(null, null, null, 63);

    /* renamed from: a, reason: collision with root package name */
    public final j71.c f31522a;

    /* renamed from: b, reason: collision with root package name */
    public final j71.c f31523b;

    /* renamed from: c, reason: collision with root package name */
    public final j71.c f31524c;

    public l0(j71.c cVar, j71.c cVar2, j71.c cVar3, int i) {
        cVar = (i & 1) != 0 ? null : cVar;
        cVar2 = (i & 16) != 0 ? null : cVar2;
        cVar3 = (i & 32) != 0 ? null : cVar3;
        this.f31522a = cVar;
        this.f31523b = cVar2;
        this.f31524c = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f31522a == l0Var.f31522a && this.f31523b == l0Var.f31523b && this.f31524c == l0Var.f31524c;
    }

    public final int hashCode() {
        j71.c cVar = this.f31522a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 923521;
        j71.c cVar2 = this.f31523b;
        int hashCode2 = (hashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        j71.c cVar3 = this.f31524c;
        return hashCode2 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    public static Object d;
    public Object t(Object p1) { return null; }
}

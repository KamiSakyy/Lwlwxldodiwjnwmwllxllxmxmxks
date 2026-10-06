package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class e implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public w1.i f25311a;

    /* renamed from: b, reason: collision with root package name */
    public w1.i f25312b;

    /* renamed from: c, reason: collision with root package name */
    public int f25313c;

    public e(w1.i iVar, w1.i iVar2, int i) {
        this.f25311a = iVar;
        this.f25312b = iVar2;
        this.f25313c = i;
    }

    @Override // h1.x0
    public final int a(s3.k kVar, long j10, int i) {
        int a10 = this.f25312b.a(0, kVar.b());
        return kVar.f31700b + a10 + (-this.f25311a.a(0, i)) + this.f25313c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f25311a.equals(eVar.f25311a) && this.f25312b.equals(eVar.f25312b) && this.f25313c == eVar.f25313c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25313c) + x.i.b(Float.hashCode(this.f25311a.f32938a) * 31, this.f25312b.f32938a, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f25311a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f25312b);
        sb2.append(", offset=");
        return x.i.j(sb2, this.f25313c, ')');
    }
}

package w3;

/* loaded from: /home/user/work/p/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33298a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33299b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f33300c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33301d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33302e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33303f;

    public t(int i) {
        boolean z10 = (i & 2) != 0;
        boolean z11 = (i & 4) != 0;
        b0 b0Var = b0.f33248r;
        this.f33298a = true;
        this.f33299b = z10;
        this.f33300c = b0Var;
        this.f33301d = z11;
        this.f33302e = true;
        this.f33303f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f33298a == tVar.f33298a && this.f33299b == tVar.f33299b && this.f33300c == tVar.f33300c && this.f33301d == tVar.f33301d && this.f33302e == tVar.f33302e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33302e) + x.i.e((this.f33300c.hashCode() + x.i.e(Boolean.hashCode(this.f33298a) * 31, 31, this.f33299b)) * 31, 31, this.f33301d);
    }
}

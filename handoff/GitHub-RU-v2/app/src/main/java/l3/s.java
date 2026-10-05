package l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class s implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f27970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27971b;

    public s(int i, int i10) {
        this.f27970a = i;
        this.f27971b = i10;
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.l lVar) {
        boolean z10 = lVar.u != -1;
        i3.e eVar = (i3.e) lVar.w;
        if (z10) {
            lVar.u = -1;
            lVar.v = -1;
        }
        int v4 = aa1.b.v(this.f27970a, 0, eVar.b());
        int v10 = aa1.b.v(this.f27971b, 0, eVar.b());
        if (v4 != v10) {
            if (v4 < v10) {
                lVar.e(v4, v10);
            } else {
                lVar.e(v10, v4);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f27970a == sVar.f27970a && this.f27971b == sVar.f27971b;
    }

    public final int hashCode() {
        return (this.f27970a * 31) + this.f27971b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f27970a);
        sb2.append(", end=");
        return x.i.j(sb2, this.f27971b, ')');
    }
}

package l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class u implements g {

    /* renamed from: a, reason: collision with root package name */
    public int f27974a;

    /* renamed from: b, reason: collision with root package name */
    public int f27975b;

    public u(int i, int i10) {
        this.f27974a = i;
        this.f27975b = i10;
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.l lVar) {
        int v4 = aa1.b.v(this.f27974a, 0, ((i3.e) lVar.w).b());
        int v10 = aa1.b.v(this.f27975b, 0, ((i3.e) lVar.w).b());
        if (v4 < v10) {
            lVar.f(v4, v10);
        } else {
            lVar.f(v10, v4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f27974a == uVar.f27974a && this.f27975b == uVar.f27975b;
    }

    public final int hashCode() {
        return (this.f27974a * 31) + this.f27975b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f27974a);
        sb2.append(", end=");
        return x.i.j(sb2, this.f27975b, ')');
    }
}

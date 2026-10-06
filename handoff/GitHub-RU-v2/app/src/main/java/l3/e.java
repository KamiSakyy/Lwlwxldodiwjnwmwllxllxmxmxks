package l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f27945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27946b;

    public e(int i, int i10) {
        this.f27945a = i;
        this.f27946b = i10;
        if (i >= 0 && i10 >= 0) {
            return;
        }
        m3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i10 + " respectively.");
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.l lVar) {
        int i = lVar.t;
        i3.e eVar = (i3.e) lVar.w;
        int i10 = this.f27946b;
        int i11 = i + i10;
        if (((i ^ i11) & (i10 ^ i11)) < 0) {
            i11 = eVar.b();
        }
        lVar.a(lVar.t, Math.min(i11, eVar.b()));
        int i12 = lVar.s;
        int i13 = this.f27945a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        lVar.a(Math.max(0, i14), lVar.s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f27945a == eVar.f27945a && this.f27946b == eVar.f27946b;
    }

    public final int hashCode() {
        return (this.f27945a * 31) + this.f27946b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f27945a);
        sb2.append(", lengthAfterCursor=");
        return x.i.j(sb2, this.f27946b, ')');
    }
}

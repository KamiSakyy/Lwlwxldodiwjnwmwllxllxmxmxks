package l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public int f27947a;

    /* renamed from: b, reason: collision with root package name */
    public int f27948b;

    public f(int i, int i10) {
        this.f27947a = i;
        this.f27948b = i10;
        if (i >= 0 && i10 >= 0) {
            return;
        }
        m3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i10 + " respectively.");
    }

    @Override // l3.g
    public final void a(com.google.android.material.datepicker.l lVar) {
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < this.f27947a) {
                int i12 = i11 + 1;
                int i13 = lVar.s;
                if (i13 <= i12) {
                    i11 = i13;
                    break;
                } else {
                    i11 = (Character.isHighSurrogate(lVar.b((i13 - i12) + (-1))) && Character.isLowSurrogate(lVar.b(lVar.s - i12))) ? i11 + 2 : i12;
                    i10++;
                }
            } else {
                break;
            }
        }
        int i14 = 0;
        while (true) {
            if (i >= this.f27948b) {
                break;
            }
            int i15 = i14 + 1;
            int i16 = lVar.t;
            i3.e eVar = (i3.e) lVar.w;
            if (i16 + i15 >= eVar.b()) {
                i14 = eVar.b() - lVar.t;
                break;
            } else {
                i14 = (Character.isHighSurrogate(lVar.b((lVar.t + i15) + (-1))) && Character.isLowSurrogate(lVar.b(lVar.t + i15))) ? i14 + 2 : i15;
                i++;
            }
        }
        int i17 = lVar.t;
        lVar.a(i17, i14 + i17);
        int i18 = lVar.s;
        lVar.a(i18 - i11, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f27947a == fVar.f27947a && this.f27948b == fVar.f27948b;
    }

    public final int hashCode() {
        return (this.f27947a * 31) + this.f27948b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f27947a);
        sb2.append(", lengthAfterCursor=");
        return x.i.j(sb2, this.f27948b, ')');
    }
    public static final Object J = null;
}

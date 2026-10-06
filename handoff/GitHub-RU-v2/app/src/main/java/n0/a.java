package n0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f29239a;

    public a(float f6) {
        this.f29239a = f6;
        if (s3.f.a(f6, 0) > 0) {
            return;
        }
        k0.b.a("Provided min size should be larger than zero.");
    }

    @Override // n0.c
    public final ArrayList a(s3.c cVar, int i, int i10) {
        return aa1.b.b(i, Math.max((i + i10) / (cVar.i0(this.f29239a) + i10), 1), i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return s3.f.b(this.f29239a, ((a) obj).f29239a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29239a);
    }
}

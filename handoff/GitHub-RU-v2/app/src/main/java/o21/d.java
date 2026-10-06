package o21;

import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends e {
    public transient int t;
    public transient int u;
    public final /* synthetic */ e v;

    public d(e eVar, int i, int i2) {
        this.v = eVar;
        this.t = i;
        this.u = i2;
    }

    @Override // o21.a
    public final Object[] a() {
        return this.v.a();
    }

    @Override // o21.a
    public final int b() {
        return this.v.b() + this.t;
    }

    @Override // o21.a
    public final int d() {
        return this.v.b() + this.t + this.u;
    }

    @Override // o21.e, java.util.List
    /* renamed from: g */
    public final e subList(int i, int i2) {
        z3.Z(i, i2, this.u);
        int i3 = this.t;
        return this.v.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        z3.Y(i, this.u);
        return this.v.get(i + this.t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.u;
    }
}

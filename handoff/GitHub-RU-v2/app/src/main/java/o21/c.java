package o21;

import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends e {
    public transient e t;

    public c(e eVar) {
        this.t = eVar;
    }

    @Override // o21.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.t.contains(obj);
    }

    @Override // o21.e
    public final e f() {
        return this.t;
    }

    @Override // o21.e, java.util.List
    /* renamed from: g */
    public final e subList(int i, int i2) {
        e eVar = this.t;
        z3.Z(i, i2, eVar.size());
        return eVar.subList(eVar.size() - i2, eVar.size() - i).f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.t;
        z3.Y(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // o21.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.t.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // o21.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.t.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t.size();
    }
}

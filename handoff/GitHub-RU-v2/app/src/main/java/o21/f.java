package o21;

import com.google.android.gms.internal.measurement.z3;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends e {
    public static final f v = new f(0, new Object[0]);
    public final transient Object[] t;
    public final transient int u;

    public f(int i, Object[] objArr) {
        this.t = objArr;
        this.u = i;
    }

    @Override // o21.a
    public final Object[] a() {
        return this.t;
    }

    @Override // o21.a
    public final int b() {
        return 0;
    }

    @Override // o21.a
    public final int d() {
        return this.u;
    }

    @Override // o21.e, o21.a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.t;
        int i = this.u;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z3.Y(i, this.u);
        Object obj = this.t[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.u;
    }
}

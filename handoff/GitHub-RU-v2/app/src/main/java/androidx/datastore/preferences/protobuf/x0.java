package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j6;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class x0 implements Iterator {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2403r;

    /* renamed from: s, reason: collision with root package name */
    public int f2404s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2405t;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f2406u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f2407v;

    public /* synthetic */ x0(i6 i6Var) {
        this.f2403r = 1;
        Objects.requireNonNull(i6Var);
        this.f2407v = i6Var;
        this.f2404s = -1;
    }

    public Iterator a() {
        if (this.f2406u == null) {
            this.f2406u = ((v0) this.f2407v).f2385s.entrySet().iterator();
        }
        return this.f2406u;
    }

    public Iterator b() {
        if (this.f2406u == null) {
            this.f2406u = this.f2407v.t.entrySet().iterator();
        }
        return this.f2406u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2403r) {
            case k5.f.J /* 0 */:
                int i = this.f2404s + 1;
                v0 v0Var = (v0) this.f2407v;
                if (i >= v0Var.f2384r.size()) {
                    return !v0Var.f2385s.isEmpty() && a().hasNext();
                }
                return true;
            default:
                int i10 = this.f2404s + 1;
                i6 i6Var = this.f2407v;
                if (i10 >= i6Var.s) {
                    return !i6Var.t.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2403r) {
            case k5.f.J /* 0 */:
                this.f2405t = true;
                int i = this.f2404s + 1;
                this.f2404s = i;
                v0 v0Var = (v0) this.f2407v;
                return i < v0Var.f2384r.size() ? (Map.Entry) v0Var.f2384r.get(this.f2404s) : (Map.Entry) a().next();
            default:
                this.f2405t = true;
                int i10 = this.f2404s + 1;
                this.f2404s = i10;
                i6 i6Var = this.f2407v;
                return i10 < i6Var.s ? (j6) i6Var.r[i10] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f2403r;
        i6 i6Var = this.f2407v;
        switch (i) {
            case k5.f.J /* 0 */:
                v0 v0Var = (v0) i6Var;
                if (!this.f2405t) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f2405t = false;
                int i10 = v0.f2383w;
                v0Var.b();
                if (this.f2404s >= v0Var.f2384r.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f2404s;
                this.f2404s = i11 - 1;
                v0Var.h(i11);
                return;
            default:
                if (!this.f2405t) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f2405t = false;
                i6 i6Var2 = i6Var;
                i6Var2.f();
                int i12 = this.f2404s;
                if (i12 >= i6Var2.s) {
                    b().remove();
                    return;
                } else {
                    this.f2404s = i12 - 1;
                    i6Var2.d(i12);
                    return;
                }
        }
    }

    public x0(v0 v0Var) {
        this.f2403r = 0;
        this.f2407v = v0Var;
        this.f2404s = -1;
    }
}

package c4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements Iterator {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4110r;

    /* renamed from: s, reason: collision with root package name */
    public int f4111s;

    /* renamed from: t, reason: collision with root package name */
    public Iterable f4112t;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4110r) {
            case k5.f.J:
                if (this.f4111s < ((g) this.f4112t).f4104v.size()) {
                }
                break;
            default:
                if (this.f4111s < this.f4112t.o()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4110r) {
            case k5.f.J:
                d dVar = (d) ((g) this.f4112t).f4104v.get(this.f4111s);
                this.f4111s++;
                return dVar;
            default:
                com.google.android.gms.internal.measurement.d dVar2 = this.f4112t;
                if (this.f4111s < dVar2.o()) {
                    int i = this.f4111s;
                    this.f4111s = i + 1;
                    return dVar2.p(i);
                }
                int i10 = this.f4111s;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
                sb2.append("Out of bounds index: ");
                sb2.append(i10);
                throw new NoSuchElementException(sb2.toString());
        }
    }

    public f(com.google.android.gms.internal.measurement.d dVar) {
        this.f4110r = 1;
        this.f4112t = dVar;
        this.f4111s = 0;
    }
    public static final Object J = null;
}

package l1;

import java.util.List;
import java.util.ListIterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements ListIterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f27898r;

    /* renamed from: s, reason: collision with root package name */
    public Object f27899s;

    /* renamed from: t, reason: collision with root package name */
    public int f27900t;

    public d(List list, int i, int i10) {
        this.f27898r = i10;
        switch (i10) {
            case 1:
                this.f27899s = list;
                this.f27900t = i - 1;
                break;
            default:
                this.f27899s = list;
                this.f27900t = i;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                this.f27899s.add(this.f27900t, obj);
                this.f27900t++;
                break;
            default:
                int i = this.f27900t + 1;
                this.f27900t = i;
                this.f27899s.add(i, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                return this.f27900t < this.f27899s.size();
            default:
                return this.f27900t < this.f27899s.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                if (this.f27900t > 0) {
                }
                break;
            default:
                if (this.f27900t >= 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                int i = this.f27900t;
                this.f27900t = i + 1;
                return this.f27899s.get(i);
            default:
                int i10 = this.f27900t + 1;
                this.f27900t = i10;
                return this.f27899s.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                return this.f27900t;
            default:
                return this.f27900t + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                int i = this.f27900t - 1;
                this.f27900t = i;
                return this.f27899s.get(i);
            default:
                int i10 = this.f27900t;
                this.f27900t = i10 - 1;
                return this.f27899s.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                return this.f27900t - 1;
            default:
                return this.f27900t;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                int i = this.f27900t - 1;
                this.f27900t = i;
                this.f27899s.remove(i);
                break;
            default:
                this.f27899s.remove(this.f27900t);
                this.f27900t--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f27898r) {
            case k5.f.J /* 0 */:
                this.f27899s.set(this.f27900t, obj);
                break;
            default:
                this.f27899s.set(this.f27900t, obj);
                break;
        }
    }
}

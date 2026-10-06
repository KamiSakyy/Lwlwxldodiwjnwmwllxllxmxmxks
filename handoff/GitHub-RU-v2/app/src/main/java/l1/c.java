package l1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k71.j;
import k71.k;
import x.m0;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements List, l71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f27894r;

    /* renamed from: s, reason: collision with root package name */
    public Object f27895s;

    /* renamed from: t, reason: collision with root package name */
    public int f27896t;

    /* renamed from: u, reason: collision with root package name */
    public int f27897u;

    public /* synthetic */ c(List list, int i, int i10, int i11) {
        this.f27894r = i11;
        this.f27895s = list;
        this.f27896t = i;
        this.f27897u = i10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u;
                this.f27897u = i + 1;
                this.f27895s.add(i, obj);
                break;
            default:
                int i10 = this.f27897u;
                this.f27897u = i10 + 1;
                this.f27895s.add(i10, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f27894r) {
            case k5.f.J:
                this.f27895s.addAll(i + this.f27896t, collection);
                int size = collection.size();
                this.f27897u += size;
                if (size > 0) {
                }
                break;
            default:
                k.g(collection, "elements");
                this.f27895s.addAll(i + this.f27896t, collection);
                this.f27897u = collection.size() + this.f27897u;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u - 1;
                int i10 = this.f27896t;
                if (i10 <= i) {
                    while (true) {
                        this.f27895s.remove(i);
                        if (i != i10) {
                            i--;
                        }
                    }
                }
                this.f27897u = i10;
                break;
            default:
                int i11 = this.f27897u - 1;
                int i12 = this.f27896t;
                if (i12 <= i11) {
                    while (true) {
                        this.f27895s.remove(i11);
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                this.f27897u = i12;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u;
                for (int i10 = this.f27896t; i10 < i; i10++) {
                    if (k.b(this.f27895s.get(i10), obj)) {
                        break;
                    }
                }
                break;
            default:
                int i11 = this.f27897u;
                for (int i12 = this.f27896t; i12 < i11; i12++) {
                    if (k.b(this.f27895s.get(i12), obj)) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f27894r) {
            case k5.f.J:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                k.g(collection, "elements");
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f27894r) {
            case k5.f.J:
                f.a(i, this);
                return this.f27895s.get(i + this.f27896t);
            default:
                m0.a(i, this);
                return this.f27895s.get(i + this.f27896t);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u;
                int i10 = this.f27896t;
                for (int i11 = i10; i11 < i; i11++) {
                    if (k.b(this.f27895s.get(i11), obj)) {
                        return i11 - i10;
                    }
                }
                return -1;
            default:
                int i12 = this.f27897u;
                int i13 = this.f27896t;
                for (int i14 = i13; i14 < i12; i14++) {
                    if (k.b(this.f27895s.get(i14), obj)) {
                        return i14 - i13;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f27894r) {
            case k5.f.J:
                if (this.f27897u == this.f27896t) {
                }
                break;
            default:
                if (this.f27897u == this.f27896t) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f27894r) {
            case k5.f.J:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u - 1;
                int i10 = this.f27896t;
                if (i10 <= i) {
                    while (!k.b(this.f27895s.get(i), obj)) {
                        if (i != i10) {
                            i--;
                        }
                    }
                    return i - i10;
                }
                return -1;
            default:
                int i11 = this.f27897u - 1;
                int i12 = this.f27896t;
                if (i12 <= i11) {
                    while (!k.b(this.f27895s.get(i11), obj)) {
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                    return i11 - i12;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f27894r) {
            case k5.f.J:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u;
                for (int i10 = this.f27896t; i10 < i; i10++) {
                    Object r22 = this.f27895s;
                    if (k.b(r22.get(i10), obj)) {
                        r22.remove(i10);
                        this.f27897u--;
                        break;
                    }
                }
                break;
            default:
                int i11 = this.f27897u;
                for (int i12 = this.f27896t; i12 < i11; i12++) {
                    Object r23 = this.f27895s;
                    if (k.b(r23.get(i12), obj)) {
                        r23.remove(i12);
                        this.f27897u--;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.f27897u) {
                }
                break;
            default:
                k.g(collection, "elements");
                int i10 = this.f27897u;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i10 != this.f27897u) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f27894r) {
            case k5.f.J:
                int i = this.f27897u;
                int i10 = i - 1;
                int i11 = this.f27896t;
                if (i11 <= i10) {
                    while (true) {
                        Object r32 = this.f27895s;
                        if (!collection.contains(r32.get(i10))) {
                            r32.remove(i10);
                            this.f27897u--;
                        }
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                if (i != this.f27897u) {
                }
                break;
            default:
                k.g(collection, "elements");
                int i12 = this.f27897u;
                int i13 = i12 - 1;
                int i14 = this.f27896t;
                if (i14 <= i13) {
                    while (true) {
                        Object r33 = this.f27895s;
                        if (!collection.contains(r33.get(i13))) {
                            r33.remove(i13);
                            this.f27897u--;
                        }
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                }
                if (i12 != this.f27897u) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f27894r) {
            case k5.f.J:
                f.a(i, this);
                return this.f27895s.set(i + this.f27896t, obj);
            default:
                m0.a(i, this);
                return this.f27895s.set(i + this.f27896t, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i10;
        switch (this.f27894r) {
            case k5.f.J:
                i = this.f27897u;
                i10 = this.f27896t;
                break;
            default:
                i = this.f27897u;
                i10 = this.f27896t;
                break;
        }
        return i - i10;
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        switch (this.f27894r) {
            case k5.f.J:
                f.b(this, i, i10);
                return new c(this, i, i10, 0);
            default:
                m0.b(this, i, i10);
                return new c(this, i, i10, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f27894r) {
        }
        return j.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.f27894r) {
            case k5.f.J:
                this.f27895s.add(i + this.f27896t, obj);
                this.f27897u++;
                break;
            default:
                this.f27895s.add(i + this.f27896t, obj);
                this.f27897u++;
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f27894r) {
            case k5.f.J:
                return new d(this, i, 0);
            default:
                return new d(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f27894r) {
            case k5.f.J:
                break;
            default:
                k.g(objArr, "array");
                break;
        }
        return j.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f27894r) {
            case k5.f.J:
                this.f27895s.addAll(this.f27897u, collection);
                int size = collection.size();
                this.f27897u += size;
                if (size > 0) {
                }
                break;
            default:
                k.g(collection, "elements");
                this.f27895s.addAll(this.f27897u, collection);
                this.f27897u = collection.size() + this.f27897u;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f27894r) {
            case k5.f.J:
                f.a(i, this);
                this.f27897u--;
                return this.f27895s.remove(i + this.f27896t);
            default:
                m0.a(i, this);
                this.f27897u--;
                return this.f27895s.remove(i + this.f27896t);
        }
    }
    public Object v(Object p1) { return null; }
}

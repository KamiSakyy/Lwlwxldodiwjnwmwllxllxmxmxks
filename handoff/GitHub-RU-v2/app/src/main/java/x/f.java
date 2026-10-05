package x;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements Collection, Set, l71.b, l71.f {

    /* renamed from: r, reason: collision with root package name */
    public int[] f33554r = y.a.f34139a;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f33555s = y.a.f34141c;

    /* renamed from: t, reason: collision with root package name */
    public int f33556t;

    public f(int i) {
        if (i > 0) {
            s.b(this, i);
        }
    }

    public final Object a(int i) {
        int i10 = this.f33556t;
        Object[] objArr = this.f33555s;
        Object obj = objArr[i];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f33554r;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i11) {
                int i12 = i + 1;
                x61.l.w(i, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f33555s;
                x61.l.x(i, i12, i10, objArr2, objArr2);
            }
            this.f33555s[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.f33554r = iArr2;
            this.f33555s = new Object[i13];
            if (i > 0) {
                x61.l.A(0, i, 6, iArr, iArr2);
                x61.l.B(0, i, 6, objArr, this.f33555s);
            }
            if (i < i11) {
                int i14 = i + 1;
                x61.l.w(i, i14, i10, iArr, this.f33554r);
                x61.l.x(i, i14, i10, objArr, this.f33555s);
            }
        }
        if (i10 != this.f33556t) {
            throw new ConcurrentModificationException();
        }
        this.f33556t = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int c10;
        int i10 = this.f33556t;
        if (obj == null) {
            c10 = s.c(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            c10 = s.c(this, obj, hashCode);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        int[] iArr = this.f33554r;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f33555s;
            int[] iArr2 = new int[i12];
            this.f33554r = iArr2;
            this.f33555s = new Object[i12];
            if (i10 != this.f33556t) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                x61.l.A(0, iArr.length, 6, iArr, iArr2);
                x61.l.B(0, objArr.length, 6, objArr, this.f33555s);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f33554r;
            int i13 = i11 + 1;
            x61.l.w(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f33555s;
            x61.l.x(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f33556t;
        if (i10 == i14) {
            int[] iArr4 = this.f33554r;
            if (i11 < iArr4.length) {
                iArr4[i11] = i;
                this.f33555s[i11] = obj;
                this.f33556t = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        k71.k.g(collection, "elements");
        int size = collection.size() + this.f33556t;
        int i = this.f33556t;
        int[] iArr = this.f33554r;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f33555s;
            int[] iArr2 = new int[size];
            this.f33554r = iArr2;
            this.f33555s = new Object[size];
            if (i > 0) {
                x61.l.A(0, i, 6, iArr, iArr2);
                x61.l.B(0, this.f33556t, 6, objArr, this.f33555s);
            }
        }
        if (this.f33556t != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f33556t != 0) {
            this.f33554r = y.a.f34139a;
            this.f33555s = y.a.f34141c;
            this.f33556t = 0;
        }
        if (this.f33556t != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? s.c(this, null, 0) : s.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        k71.k.g(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f33556t != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f33556t;
            for (int i10 = 0; i10 < i; i10++) {
                if (!((Set) obj).contains(this.f33555s[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f33554r;
        int i = this.f33556t;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f33556t <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c10 = obj == null ? s.c(this, null, 0) : s.c(this, obj, obj.hashCode());
        if (c10 < 0) {
            return false;
        }
        a(c10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        k71.k.g(collection, "elements");
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        k71.k.g(collection, "elements");
        boolean z10 = false;
        for (int i = this.f33556t - 1; -1 < i; i--) {
            if (!x61.m.N(collection, this.f33555s[i])) {
                a(i);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f33556t;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return x61.l.D(this.f33555s, 0, this.f33556t);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f33556t * 14);
        sb2.append('{');
        int i = this.f33556t;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f33555s[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        k71.k.g(objArr, "array");
        int i = this.f33556t;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        x61.l.x(0, 0, this.f33556t, this.f33555s, objArr);
        return objArr;
    }
}

package x;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public class q0 {

    /* renamed from: r, reason: collision with root package name */
    public int[] f33608r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f33609s;

    /* renamed from: t, reason: collision with root package name */
    public int f33610t;

    public q0(int i) {
        this.f33608r = i == 0 ? y.a.f34139a : new int[i];
        this.f33609s = i == 0 ? y.a.f34141c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f33610t * 2;
        Object[] objArr = this.f33609s;
        if (obj == null) {
            for (int i10 = 1; i10 < i; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i10 = this.f33610t;
        int[] iArr = this.f33608r;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.f33608r = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33609s, i * 2);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f33609s = copyOf2;
        }
        if (this.f33610t != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i10 = this.f33610t;
        if (i10 == 0) {
            return -1;
        }
        int a10 = y.a.a(i10, i, this.f33608r);
        if (a10 < 0 || k71.k.b(obj, this.f33609s[a10 << 1])) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f33608r[i11] == i) {
            if (k71.k.b(obj, this.f33609s[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f33608r[i12] == i; i12--) {
            if (k71.k.b(obj, this.f33609s[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f33610t > 0) {
            this.f33608r = y.a.f34139a;
            this.f33609s = y.a.f34141c;
            this.f33610t = 0;
        }
        if (this.f33610t > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f33610t;
        if (i == 0) {
            return -1;
        }
        int a10 = y.a.a(i, 0, this.f33608r);
        if (a10 < 0 || this.f33609s[a10 << 1] == null) {
            return a10;
        }
        int i10 = a10 + 1;
        while (i10 < i && this.f33608r[i10] == 0) {
            if (this.f33609s[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a10 - 1; i11 >= 0 && this.f33608r[i11] == 0; i11--) {
            if (this.f33609s[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof q0) {
                int i = this.f33610t;
                if (i != ((q0) obj).f33610t) {
                    return false;
                }
                q0 q0Var = (q0) obj;
                for (int i10 = 0; i10 < i; i10++) {
                    Object f6 = f(i10);
                    Object i11 = i(i10);
                    Object obj2 = q0Var.get(f6);
                    if (i11 == null) {
                        if (obj2 != null || !q0Var.containsKey(f6)) {
                            return false;
                        }
                    } else if (!i11.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f33610t != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f33610t;
            for (int i13 = 0; i13 < i12; i13++) {
                Object f10 = f(i13);
                Object i14 = i(i13);
                Object obj3 = ((Map) obj).get(f10);
                if (i14 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f10)) {
                        return false;
                    }
                } else if (!i14.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z10 = false;
        if (i >= 0 && i < this.f33610t) {
            z10 = true;
        }
        if (z10) {
            return this.f33609s[i << 1];
        }
        y.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object g(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f33610t)) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f33609s;
        int i11 = i << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f33608r;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i12) {
                int i13 = i + 1;
                x61.l.w(i, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f33609s;
                x61.l.x(i11, i13 << 1, i10 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f33609s;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i15);
            k71.k.f(copyOf, "copyOf(...)");
            this.f33608r = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33609s, i15 << 1);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f33609s = copyOf2;
            if (i10 != this.f33610t) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                x61.l.w(0, 0, i, iArr, this.f33608r);
                x61.l.x(0, 0, i11, objArr, this.f33609s);
            }
            if (i < i12) {
                int i16 = i + 1;
                x61.l.w(i, i16, i10, iArr, this.f33608r);
                x61.l.x(i11, i16 << 1, i10 << 1, objArr, this.f33609s);
            }
        }
        if (i10 != this.f33610t) {
            throw new ConcurrentModificationException();
        }
        this.f33610t = i12;
        return obj;
    }

    public Object get(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f33609s[(d10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d10 = d(obj);
        return d10 >= 0 ? this.f33609s[(d10 << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z10 = false;
        if (i >= 0 && i < this.f33610t) {
            z10 = true;
        }
        if (!z10) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i10 = (i << 1) + 1;
        Object[] objArr = this.f33609s;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f33608r;
        Object[] objArr = this.f33609s;
        int i = this.f33610t;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final Object i(int i) {
        boolean z10 = false;
        if (i >= 0 && i < this.f33610t) {
            z10 = true;
        }
        if (z10) {
            return this.f33609s[(i << 1) + 1];
        }
        y.a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f33610t <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f33610t;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c10 = obj != null ? c(hashCode, obj) : e();
        if (c10 >= 0) {
            int i10 = (c10 << 1) + 1;
            Object[] objArr = this.f33609s;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~c10;
        int[] iArr = this.f33608r;
        if (i >= iArr.length) {
            int i12 = 8;
            if (i >= 8) {
                i12 = (i >> 1) + i;
            } else if (i < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            k71.k.f(copyOf, "copyOf(...)");
            this.f33608r = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f33609s, i12 << 1);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f33609s = copyOf2;
            if (i != this.f33610t) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i) {
            int[] iArr2 = this.f33608r;
            int i13 = i11 + 1;
            x61.l.w(i13, i11, i, iArr2, iArr2);
            Object[] objArr2 = this.f33609s;
            x61.l.x(i13 << 1, i11 << 1, this.f33610t << 1, objArr2, objArr2);
        }
        int i14 = this.f33610t;
        if (i == i14) {
            int[] iArr3 = this.f33608r;
            if (i11 < iArr3.length) {
                iArr3[i11] = hashCode;
                Object[] objArr3 = this.f33609s;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f33610t = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return g(d10);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return h(d10, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f33610t;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f33610t * 28);
        sb2.append('{');
        int i = this.f33610t;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object f6 = f(i10);
            if (f6 != sb2) {
                sb2.append(f6);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != sb2) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 < 0 || !k71.k.b(obj2, i(d10))) {
            return false;
        }
        g(d10);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d10 = d(obj);
        if (d10 < 0 || !k71.k.b(obj2, i(d10))) {
            return false;
        }
        h(d10, obj3);
        return true;
    }

    public static Object get(Object... a) {
        return null;
    }

    public static Object put(Object... a) {
        return null;
    }
    public Object t = null;
}

package y61;

import a5.q0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k71.k;
import o1.i;
import sy.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements Map, Serializable, l71.e {
    public static final e E;
    public f A;
    public i B;
    public f C;
    public boolean D;
    public Object[] r;
    public Object[] s;
    public int[] t;
    public int[] u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    static {
        e eVar = new e(0);
        eVar.D = true;
        E = eVar;
    }

    public e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j = j(obj);
            int i = this.v * 2;
            int length = this.u.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.u;
                int i3 = iArr[j];
                if (i3 <= 0) {
                    int i4 = this.w;
                    Object[] objArr = this.r;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.w = i5;
                        objArr[i4] = obj;
                        this.t[i4] = j;
                        iArr[j] = i5;
                        this.z++;
                        this.y++;
                        if (i2 > this.v) {
                            this.v = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (k.b(this.r[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.u.length * 2);
                        break;
                    }
                    j = j == 0 ? this.u.length - 1 : j - 1;
                }
            }
        }
    }

    public final e b() {
        c();
        this.D = true;
        if (this.z > 0) {
            return this;
        }
        e eVar = E;
        k.e(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.D) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.w - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.t;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.u[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        p.q(this.r, 0, this.w);
        Object[] objArr = this.s;
        if (objArr != null) {
            p.q(objArr, 0, this.w);
        }
        this.z = 0;
        this.w = 0;
        this.y++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.s;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.w;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.t;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.r;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.u[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        p.q(this.r, i3, i);
        if (objArr != null) {
            p.q(objArr, i3, this.w);
        }
        this.w = i3;
    }

    public final boolean e(Collection collection) {
        k.g(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.C;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.C = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.z == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        k.g(entry, "entry");
        int h = h(entry.getKey());
        if (h < 0) {
            return false;
        }
        Object[] objArr = this.s;
        k.d(objArr);
        return k.b(objArr[h], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArr;
        Object[] objArr2 = this.r;
        int length = objArr2.length;
        int i2 = this.w;
        int i3 = length - i2;
        int i4 = i2 - this.z;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr2.length) {
            int length2 = objArr2.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i6);
            k.f(copyOf, "copyOf(...)");
            this.r = copyOf;
            Object[] objArr3 = this.s;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i6);
                k.f(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.s = objArr;
            int[] copyOf2 = Arrays.copyOf(this.t, i6);
            k.f(copyOf2, "copyOf(...)");
            this.t = copyOf2;
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.u.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.s;
        k.d(objArr);
        return objArr[h];
    }

    public final int h(Object obj) {
        int j = j(obj);
        int i = this.v;
        while (true) {
            int i2 = this.u[j];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (k.b(this.r[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j = j == 0 ? this.u.length - 1 : j - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i = 0;
        while (cVar.hasNext()) {
            int i2 = ((q0) cVar).r;
            e eVar = (e) ((q0) cVar).u;
            if (i2 >= eVar.w) {
                throw new NoSuchElementException();
            }
            ((q0) cVar).r = i2 + 1;
            ((q0) cVar).s = i2;
            Object obj = eVar.r[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.s;
            k.d(objArr);
            Object obj2 = objArr[((q0) cVar).s];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.w;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.t[i] >= 0) {
                Object[] objArr = this.s;
                k.d(objArr);
                if (k.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.z == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.t[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        this.y++;
        int i2 = 0;
        if (this.w > this.z) {
            d(false);
        }
        this.u = new int[i];
        this.x = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.w) {
            int i3 = i2 + 1;
            int j = j(this.r[i2]);
            int i4 = this.v;
            while (true) {
                int[] iArr = this.u;
                if (iArr[j] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                j = j == 0 ? iArr.length - 1 : j - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.A;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.A = fVar2;
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        Object[] objArr = this.r;
        k.g(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.s;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.t[i];
        int i3 = this.v * 2;
        int length = this.u.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.u.length - 1 : i2 - 1;
            i5++;
            if (i5 > this.v) {
                this.u[i6] = 0;
                break;
            }
            int[] iArr = this.u;
            int i7 = iArr[i2];
            if (i7 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i7 < 0) {
                iArr[i6] = -1;
            } else {
                int i8 = i7 - 1;
                int j = j(this.r[i8]) - i2;
                int[] iArr2 = this.u;
                if ((j & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i7;
                    this.t[i8] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.u[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.t[i] = -1;
        this.z--;
        this.y++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.s;
        if (objArr == null) {
            int length = this.r.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.s = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k.g(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.s;
            if (objArr == null) {
                int length = this.r.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.s = objArr;
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!k.b(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.s;
        k.d(objArr);
        Object obj2 = objArr[h];
        l(h);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.z * 3) + 2);
        sb.append("{");
        int i = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = ((q0) cVar).r;
            e eVar = (e) ((q0) cVar).u;
            if (i2 >= eVar.w) {
                throw new NoSuchElementException();
            }
            ((q0) cVar).r = i2 + 1;
            ((q0) cVar).s = i2;
            Object obj = eVar.r[i2];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.s;
            k.d(objArr);
            Object obj2 = objArr[((q0) cVar).s];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.e();
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        k.f(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.B;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(1, this);
        this.B = iVar2;
        return iVar2;
    }

    public e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.r = objArr;
        this.s = null;
        this.t = iArr;
        this.u = new int[highestOneBit];
        this.v = 2;
        this.w = 0;
        this.x = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

}

package com.google.common.collect;

import androidx.compose.foundation.lazy.layout.o1;
import com.google.android.gms.internal.play_billing.b0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m7.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements Map, Serializable {
    public static final m x = new m(0, null, new Object[0]);
    public transient j r;
    public transient k s;
    public transient l t;
    public transient Object u;
    public transient Object[] v;
    public transient int w;

    public m(int i, Object obj, Object[] objArr) {
        this.u = obj;
        this.v = objArr;
        this.w = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m a(int i, Object[] objArr, o1 o1Var) {
        boolean z;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        Object r16;
        boolean z3;
        boolean z4;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return x;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new m(1, null, objArr2);
        }
        aa1.b.r(i4, objArr2.length >> 1);
        int i6 = f.i(i4);
        char c3 = 2;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z4 = false;
            i2 = 1;
        } else {
            int i7 = i6 - 1;
            if (i6 <= 128) {
                byte[] bArr = new byte[i6];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i4) {
                    int i10 = i8 * 2;
                    int i12 = i9 * 2;
                    Object obj3 = objArr2[i10];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i10 ^ i5];
                    Objects.requireNonNull(obj4);
                    int d0 = m71.a.d0(obj3.hashCode());
                    while (true) {
                        int i13 = d0 & i7;
                        z2 = z5;
                        i3 = i5;
                        int i14 = bArr[i13] & 255;
                        if (i14 == 255) {
                            bArr[i13] = (byte) i12;
                            if (i9 < i8) {
                                objArr2[i12] = obj3;
                                objArr2[i12 ^ 1] = obj4;
                            }
                            i9++;
                        } else {
                            if (obj3.equals(objArr2[i14])) {
                                int i15 = i14 ^ 1;
                                Object obj5 = objArr2[i15];
                                Objects.requireNonNull(obj5);
                                obj2 = new e(obj3, obj4, obj5);
                                objArr2[i15] = obj4;
                                break;
                            }
                            d0 = i13 + 1;
                            z5 = z2;
                            i5 = i3;
                        }
                    }
                    i8++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i9 == i4) {
                    obj2 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i9);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (i6 > 32768) {
                    int[] iArr = new int[i6];
                    Arrays.fill(iArr, -1);
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < i4) {
                        int i18 = i16 * 2;
                        int i19 = i17 * 2;
                        Object obj6 = objArr2[i18];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i18 ^ 1];
                        Objects.requireNonNull(obj7);
                        int d02 = m71.a.d0(obj6.hashCode());
                        while (true) {
                            int i20 = d02 & i7;
                            int i22 = iArr[i20];
                            if (i22 == -1) {
                                iArr[i20] = i19;
                                if (i17 < i16) {
                                    objArr2[i19] = obj6;
                                    objArr2[i19 ^ 1] = obj7;
                                }
                                i17++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj6.equals(objArr2[i22])) {
                                    int i23 = i22 ^ 1;
                                    Object obj8 = objArr2[i23];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new e(obj6, obj7, obj8);
                                    objArr2[i23] = obj7;
                                    break;
                                }
                                d02 = i20 + 1;
                                c3 = c2;
                            }
                        }
                        i16++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i17 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i17);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z3) {
                        Object[] objArr4 = (Object[]) obj;
                        e eVar = (e) objArr4[c];
                        if (o1Var == null) {
                            throw eVar.a();
                        }
                        o1Var.d = eVar;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i4 = intValue;
                    }
                    return new m(i4, obj9, objArr2);
                }
                sArr = new short[i6];
                Arrays.fill(sArr, (short) -1);
                int i24 = 0;
                for (int i25 = 0; i25 < i4; i25++) {
                    int i26 = i25 * 2;
                    int i27 = i24 * 2;
                    Object obj11 = objArr2[i26];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i26 ^ 1];
                    Objects.requireNonNull(obj12);
                    int d03 = m71.a.d0(obj11.hashCode());
                    while (true) {
                        int i28 = d03 & i7;
                        int i29 = sArr[i28] & 65535;
                        if (i29 == 65535) {
                            sArr[i28] = (short) i27;
                            if (i24 < i25) {
                                objArr2[i27] = obj11;
                                objArr2[i27 ^ 1] = obj12;
                            }
                            i24++;
                        } else {
                            if (obj11.equals(objArr2[i29])) {
                                int i30 = i29 ^ 1;
                                Object obj13 = objArr2[i30];
                                Objects.requireNonNull(obj13);
                                obj2 = new e(obj11, obj12, obj13);
                                objArr2[i30] = obj12;
                                break;
                            }
                            d03 = i28 + 1;
                        }
                    }
                }
                if (i24 != i4) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i24), obj2};
                    z4 = z;
                }
                obj2 = sArr;
                z4 = z;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj92 = obj;
        if (z3) {
        }
        return new m(i4, obj92, objArr2);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        l lVar = this.t;
        if (lVar == null) {
            lVar = new l(this.v, 1, this.w);
            this.t = lVar;
        }
        return lVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.r;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, this.v, this.w);
        this.r = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((f) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.v;
            if (this.w == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.u;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int d0 = m71.a.d0(obj.hashCode());
                        while (true) {
                            int i = d0 & length;
                            int i2 = bArr[i] & 255;
                            if (i2 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i2])) {
                                obj2 = objArr[i2 ^ 1];
                                break;
                            }
                            d0 = i + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int d02 = m71.a.d0(obj.hashCode());
                        while (true) {
                            int i3 = d02 & length2;
                            int i4 = sArr[i3] & 65535;
                            if (i4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i4])) {
                                obj2 = objArr[i4 ^ 1];
                                break;
                            }
                            d02 = i3 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int d03 = m71.a.d0(obj.hashCode());
                        while (true) {
                            int i5 = d03 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            d03 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        j jVar = this.r;
        if (jVar == null) {
            jVar = new j(this, this.v, this.w);
            this.r = jVar;
        }
        Iterator it = jVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        k kVar = this.s;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, new l(this.v, 0, this.w));
        this.s = kVar2;
        return kVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.w;
    }

    public final String toString() {
        int i = this.w;
        y.q("size", i);
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        b0 it = ((j) entrySet()).iterator();
        boolean z = true;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.t;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.v, 1, this.w);
        this.t = lVar2;
        return lVar2;
    }

}

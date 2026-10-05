package x61;

import a0.s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import sy.c0;
import sy.d0;
import sy.f0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l extends c0 {
    public static /* synthetic */ void A(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        w(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void B(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        x(0, i, i2, objArr, objArr2);
    }

    public static byte[] C(byte[] bArr, int i, int i2) {
        k71.k.g(bArr, "<this>");
        c0.g(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        k71.k.f(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] D(Object[] objArr, int i, int i2) {
        k71.k.g(objArr, "<this>");
        c0.g(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        k71.k.f(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static List E(byte[] bArr) {
        int length = bArr.length - 1;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(s0.i("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            return r.r;
        }
        int length2 = bArr.length;
        if (length >= length2) {
            return b0(bArr);
        }
        if (length == 1) {
            return d0.n(Byte.valueOf(bArr[length2 - 1]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = length2 - length; i < length2; i++) {
            arrayList.add(Byte.valueOf(bArr[i]));
        }
        return arrayList;
    }

    public static List F(byte[] bArr) {
        int length = bArr.length - 32;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(s0.i("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            return r.r;
        }
        if (length >= bArr.length) {
            return b0(bArr);
        }
        if (length == 1) {
            return d0.n(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
            i++;
            if (i == length) {
                break;
            }
        }
        return arrayList;
    }

    public static void G(int i, int i2, Object obj, Object[] objArr) {
        k71.k.g(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void H(int[] iArr, int i) {
        int length = iArr.length;
        k71.k.g(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i);
    }

    public static void I(long[] jArr, long j) {
        int length = jArr.length;
        k71.k.g(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList K(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object L(Object[] objArr) {
        k71.k.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Float M(float[] fArr) {
        k71.k.g(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static q71.g N(int[] iArr) {
        return new q71.g(0, iArr.length - 1, 1);
    }

    public static int O(long[] jArr) {
        k71.k.g(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Object P(int i, Object[] objArr) {
        k71.k.g(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int Q(Object[] objArr, Object obj) {
        k71.k.g(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String R(int i, Object[] objArr) {
        String str = (i & 1) != 0 ? ", " : ",";
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        k71.k.g(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            sy.u.b(sb, obj, (j71.c) null);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static Character S(char[] cArr) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static Float T(float[] fArr) {
        k71.k.g(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static Object U(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static byte[] V(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        k71.k.d(copyOf);
        return copyOf;
    }

    public static Object[] W(Object[] objArr, Object[] objArr2) {
        k71.k.g(objArr, "<this>");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        k71.k.d(copyOf);
        return copyOf;
    }

    public static Object X(Object[] objArr) {
        o71.a aVar = o71.d.r;
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[o71.d.r.b(objArr.length)];
    }

    public static char Y(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void Z(Object[] objArr, Comparator comparator, int i, int i2) {
        k71.k.g(objArr, "<this>");
        k71.k.g(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }

    public static final void a0(Object[] objArr, HashSet hashSet) {
        k71.k.g(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static final List b0(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return r.r;
        }
        if (length == 1) {
            return d0.n(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static List c0(double[] dArr) {
        k71.k.g(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return r.r;
        }
        if (length == 1) {
            return d0.n(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List d0(float[] fArr) {
        k71.k.g(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return r.r;
        }
        if (length == 1) {
            return d0.n(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List e0(int[] iArr) {
        k71.k.g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? i0(iArr) : d0.n(Integer.valueOf(iArr[0])) : r.r;
    }

    public static List f0(long[] jArr) {
        k71.k.g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return r.r;
        }
        if (length == 1) {
            return d0.n(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List g0(Object[] objArr) {
        k71.k.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new j(objArr, false)) : d0.n(objArr[0]) : r.r;
    }

    public static List h0(boolean[] zArr) {
        k71.k.g(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return r.r;
        }
        if (length == 1) {
            return d0.n(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList i0(int[] iArr) {
        k71.k.g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static Set j0(Object[] objArr) {
        k71.k.g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return t.r;
        }
        if (length == 1) {
            return f0.r(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.s(objArr.length));
        a0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static List r(Object[] objArr) {
        k71.k.g(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        k71.k.f(asList, "asList(...)");
        return asList;
    }

    public static boolean s(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean t(Object[] objArr, Object obj) {
        k71.k.g(objArr, "<this>");
        return Q(objArr, obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean u(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!u((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof w61.s) && (obj2 instanceof w61.s)) {
                    byte[] bArr = ((w61.s) obj).r;
                    byte[] bArr2 = ((w61.s) obj2).r;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof w61.z) && (obj2 instanceof w61.z)) {
                    short[] sArr = ((w61.z) obj).r;
                    short[] r5 = (short[]) (((w61.z) obj2).r);
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, (short[]) (r5 != 0 ? r5 : null))) {
                        return false;
                    }
                } else if ((obj instanceof w61.u) && (obj2 instanceof w61.u)) {
                    int[] iArr = ((w61.u) obj).r;
                    Object r52 = ((w61.u) obj2).r;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, (int[]) (r52 != 0 ? r52 : null))) {
                        return false;
                    }
                } else if ((obj instanceof w61.w) && (obj2 instanceof w61.w)) {
                    long[] jArr = ((w61.w) obj).r;
                    Object r53 = ((w61.w) obj2).r;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, (long[]) (r53 != 0 ? r53 : null))) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void v(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        k71.k.g(bArr, "<this>");
        k71.k.g(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void w(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        k71.k.g(iArr, "<this>");
        k71.k.g(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void x(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        k71.k.g(objArr, "<this>");
        k71.k.g(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void y(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        k71.k.g(cArr, "<this>");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void z(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        k71.k.g(jArr, "<this>");
        k71.k.g(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }
}

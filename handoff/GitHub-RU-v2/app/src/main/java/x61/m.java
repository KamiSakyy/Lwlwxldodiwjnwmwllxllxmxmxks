package x61;

import a0.s0;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import sy.d0Shadow;
import sy.f0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m extends p {
    public static byte[] A0(List list) {
        byte[] bArr = new byte[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void B0(Iterable iterable, AbstractCollection abstractCollection) {
        k71.k.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] C0(Collection collection) {
        k71.k.g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet D0(ArrayList arrayList) {
        k71.k.g(arrayList, "<this>");
        HashSet hashSet = new HashSet(x.s(n.F(arrayList, 12)));
        B0(arrayList, hashSet);
        return hashSet;
    }

    public static int[] E0(List list) {
        k71.k.g(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List F0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d0.t(I0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.r;
        }
        if (size != 1) {
            return H0(collection);
        }
        return d0.n(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] G0(List list) {
        k71.k.g(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList H0(Collection collection) {
        k71.k.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static List I0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return H0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        B0(iterable, arrayList);
        return arrayList;
    }

    public static void J(Collection collection, Iterable iterable) {
        k71.k.g(collection, "<this>");
        k71.k.g(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static Set J0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        B0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static kotlin.io.k K(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        return new kotlin.io.k(4, iterable);
    }

    public static Set K0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return f0.r(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(x.s(collection.size()));
                B0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            B0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : f0.r(linkedHashSet2.iterator().next());
            }
        }
        return t.r;
    }

    public static double L(ArrayList arrayList) {
        int size = arrayList.size();
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d += ((Number) obj).floatValue();
            i++;
            if (i < 0) {
                d0.w();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static ArrayList M(Iterable iterable, int i) {
        k71.k.g(iterable, "<this>");
        if (i <= 0 || i <= 0) {
            throw new IllegalArgumentException(s0.i("size ", i, " must be greater than zero.").toString());
        }
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            k71.k.g(it, "iterator");
            q z = !it.hasNext() ? q.r : i21.a.z(new a0(i, i, it, null));
            while (z.hasNext()) {
                arrayList.add((List) z.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean N(Iterable iterable, Object obj) {
        k71.k.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : Y(iterable, obj) >= 0;
    }

    public static final Collection O(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : F0(iterable);
    }

    public static List P(int i, List list) {
        k71.k.g(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return F0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return r.r;
        }
        if (size == 1) {
            return d0.n(d0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List Q(int i, List list) {
        k71.k.g(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Requested element count ", i, " is less than zero.").toString());
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return x0(list, size);
    }

    public static ArrayList R(Iterable iterable, Class cls) {
        k71.k.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList S(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object T(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if (iterable instanceof List) {
            return U((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object U(List list) {
        k71.k.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object V(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object W(List list) {
        k71.k.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object X(int i, List list) {
        k71.k.g(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int Y(Iterable iterable, Object obj) {
        k71.k.g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                d0.x();
                throw null;
            }
            if (k71.k.b(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Set Z(Iterable iterable, Iterable iterable2) {
        k71.k.g(iterable, "<this>");
        k71.k.g(iterable2, "other");
        Set J0 = J0(iterable);
        J0.retainAll(O(iterable2));
        return J0;
    }

    public static final void a0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, j71.c cVar) {
        k71.k.g(iterable, "<this>");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                sy.u.b(sb, obj, cVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void b0(List list, StringBuilder sb, h1.rShadow rVar, int i) {
        if ((i & 64) != 0) {
            rVar = null;
        }
        a0(list, sb, "\n", "", "", -1, "...", rVar);
    }

    public static String c0(Iterable iterable, String str, String str2, String str3, int i, j71.c cVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        String str7 = (i2 & 16) != 0 ? "..." : "";
        if ((i2 & 32) != 0) {
            cVar = null;
        }
        k71.k.g(iterable, "<this>");
        k71.k.g(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        a0(iterable, sb, str4, str5, str6, i3, str7, cVar);
        return sb.toString();
    }

    public static Object d0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if (iterable instanceof List) {
            return e0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object e0(List list) {
        k71.k.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(d0.m(list));
    }

    public static Object f0(List list) {
        k71.k.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable g0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float h0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Float i0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static ArrayList j0(Iterable iterable, Object obj) {
        k71.k.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(n.F(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && k71.k.b(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List k0(Iterable iterable, Iterable iterable2) {
        k71.k.g(iterable, "<this>");
        Collection O = O(iterable2);
        if (O.isEmpty()) {
            return F0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!O.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList l0(Collection collection, Iterable iterable) {
        k71.k.g(collection, "<this>");
        k71.k.g(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            J(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList m0(Collection collection, Object obj) {
        k71.k.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static boolean n0(List list, j71.c cVar) {
        int i;
        k71.k.g(list, "<this>");
        k71.k.g(cVar, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof l71.a) && !(list instanceof l71.b)) {
                k71.z.h(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((Boolean) cVar.k(it.next())).booleanValue()) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        int m = d0.m(list);
        if (m >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) cVar.k(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == m) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int m2 = d0.m(list);
        if (i <= m2) {
            while (true) {
                list.remove(m2);
                if (m2 == i) {
                    break;
                }
                m2--;
            }
        }
        return true;
    }

    public static Object o0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object p0(List list) {
        k71.k.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(d0.m(list));
    }

    public static Object q0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(d0.m(abstractList));
    }

    public static List r0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return F0(iterable);
        }
        List I0 = I0(iterable);
        Collections.reverse(I0);
        return I0;
    }

    public static Object s0(List list) {
        k71.k.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List t0(List list, q71.g gVar) {
        return gVar.isEmpty() ? r.r : F0(list.subList(((q71.e) gVar).r, ((q71.e) gVar).s + 1));
    }

    public static List u0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List I0 = I0(iterable);
            p.H(I0);
            return I0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return F0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        k71.k.g(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return l.r(array);
    }

    public static List v0(Iterable iterable, Comparator comparator) {
        k71.k.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List I0 = I0(iterable);
            p.I(I0, comparator);
            return I0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return F0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        k71.k.g(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return l.r(array);
    }

    public static int w0(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static List x0(Iterable iterable, int i) {
        k71.k.g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return r.r;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return F0(iterable);
            }
            if (i == 1) {
                return d0.n(T(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return d0.t(arrayList);
    }

    public static List y0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return r.r;
        }
        int size = list.size();
        if (i >= size) {
            return F0(list);
        }
        if (i == 1) {
            return d0.n(e0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] z0(List list) {
        k71.k.g(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }
    public Object e() { return null; }
}

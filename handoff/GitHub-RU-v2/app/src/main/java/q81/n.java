package q81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n implements Iterable, l71.a {
    public static final n s = new n(new String[0]);
    public final String[] r;

    public n(String[] strArr) {
        k71.k.g(strArr, "namesAndValues");
        this.r = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.r;
        k71.k.g(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int x = k41.b.x(length, 0, -2);
        if (x > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == x) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        String str = (String) x61.l.P(i * 2, this.r);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(no.a.l("name[", i, ']'));
    }

    public final ia.d d() {
        ia.d dVar = new ia.d(4);
        ArrayList arrayList = dVar.a;
        k71.k.g(arrayList, "<this>");
        String[] strArr = this.r;
        k71.k.g(strArr, "elements");
        arrayList.addAll(x61.l.r(strArr));
        return dVar;
    }

    public final String e(int i) {
        String str = (String) x61.l.P((i * 2) + 1, this.r);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(no.a.l("value[", i, ']'));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Arrays.equals(this.r, ((n) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.r);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        w61.k[] kVarArr = new w61.k[size];
        for (int i = 0; i < size; i++) {
            kVarArr[i] = new w61.k(b(i), e(i));
        }
        return k71.k.k(kVarArr);
    }

    public final int size() {
        return this.r.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = b(i);
            String e = e(i);
            sb.append(b);
            sb.append(": ");
            if (r81.e.k(b)) {
                e = "██";
            }
            sb.append(e);
            sb.append("\n");
        }
        return sb.toString();
    }
}

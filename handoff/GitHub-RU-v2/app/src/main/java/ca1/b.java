package ca1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.jsoup.helper.ValidationException;

/* loaded from: /home/user/work/p/classes5.dex */
public class b implements Iterable, Cloneable {
    public int r = 0;
    public String[] s = new String[3];
    public Object[] t = new Object[3];

    public static boolean k(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    public final void a(String str, Serializable serializable) {
        b(this.r + 1);
        String[] strArr = this.s;
        int i = this.r;
        strArr[i] = str;
        this.t[i] = serializable;
        this.r = i + 1;
    }

    public final void b(int i) {
        aa1.b.G(i >= this.r);
        String[] strArr = this.s;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.r * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.s = (String[]) Arrays.copyOf(strArr, i);
        this.t = Arrays.copyOf(this.t, i);
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.r = this.r;
            bVar.s = (String[]) Arrays.copyOf(this.s, this.r);
            bVar.t = Arrays.copyOf(this.t, this.r);
            int i = i("/jsoup.userdata");
            if (i != -1) {
                this.t[i] = new HashMap((Map) this.t[i]);
            }
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String e(String str) {
        Object obj;
        int i = i(str);
        return (i == -1 || (obj = this.t[i]) == null) ? "" : (String) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.r != bVar.r) {
            return false;
        }
        for (int i = 0; i < this.r; i++) {
            int i2 = bVar.i(this.s[i]);
            if (i2 == -1 || !Objects.equals(this.t[i], bVar.t[i2])) {
                return false;
            }
        }
        return true;
    }

    public final void g(ba1.a aVar, f fVar) {
        String a;
        int i = this.r;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.s[i2];
            if (!k(str) && (a = a.a(str, fVar.w)) != null) {
                a.b(a, (String) this.t[i2], aVar.a(' '), fVar);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.t) + (((this.r * 31) + Arrays.hashCode(this.s)) * 31);
    }

    public final int i(String str) {
        aa1.b.K(str);
        for (int i = 0; i < this.r; i++) {
            if (str.equals(this.s[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final int j(String str) {
        aa1.b.K(str);
        for (int i = 0; i < this.r; i++) {
            if (str.equalsIgnoreCase(this.s[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void l(String str, String str2) {
        aa1.b.K(str);
        int i = i(str);
        if (i != -1) {
            this.t[i] = str2;
        } else {
            a(str, str2);
        }
    }

    public final void n(int i) {
        int i2 = this.r;
        if (i >= i2) {
            throw new ValidationException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.s;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.t;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.r - 1;
        this.r = i5;
        this.s[i5] = null;
        this.t[i5] = null;
    }

    public final int size() {
        if (this.r == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.r; i2++) {
            if (!k(this.s[i2])) {
                i++;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder a = ba1.h.a();
        g(ba1.a.e(a), new f());
        return ba1.h.k(a);
    }
}

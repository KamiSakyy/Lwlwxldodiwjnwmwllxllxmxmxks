package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes.dex */
public class g implements Iterable, Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final g f2280t = new g(w.f2390b);

    /* renamed from: u, reason: collision with root package name */
    public static final e f2281u;

    /* renamed from: r, reason: collision with root package name */
    public int f2282r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f2283s;

    static {
        f2281u = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f2283s = bArr;
    }

    public static int b(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a0.s0.i("Beginning index: ", i, " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(no.a.j(i, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(no.a.j(i10, i11, "End index: ", " >= "));
    }

    public static g d(byte[] bArr, int i, int i10) {
        byte[] copyOfRange;
        b(i, i + i10, bArr.length);
        switch (f2281u.f2273a) {
            case k5.f.J:
                copyOfRange = Arrays.copyOfRange(bArr, i, i10 + i);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i, copyOfRange, 0, i10);
                break;
        }
        return new g(copyOfRange);
    }

    public byte a(int i) {
        return this.f2283s[i];
    }

    public void e(int i, byte[] bArr) {
        System.arraycopy(this.f2283s, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i = this.f2282r;
        int i10 = gVar.f2282r;
        if (i != 0 && i10 != 0 && i != i10) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder o5 = x.i.o("Ran off end of other: 0, ", size, ", ");
            o5.append(gVar.size());
            throw new IllegalArgumentException(o5.toString());
        }
        byte[] bArr = gVar.f2283s;
        int f6 = f() + size;
        int f10 = f();
        int f11 = gVar.f();
        while (f10 < f6) {
            if (this.f2283s[f10] != bArr[f11]) {
                return false;
            }
            f10++;
            f11++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i) {
        return this.f2283s[i];
    }

    public final int hashCode() {
        int i = this.f2282r;
        if (i != 0) {
            return i;
        }
        int size = size();
        int f6 = f();
        int i10 = size;
        for (int i11 = f6; i11 < f6 + size; i11++) {
            i10 = (i10 * 31) + this.f2283s[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f2282r = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f2283s.length;
    }

    public final String toString() {
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = b31.b.T(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int b10 = b(0, 47, size());
            sb3.append(b31.b.T(b10 == 0 ? f2280t : new f(this.f2283s, f(), b10)));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        return com.github.rudroid.copilot.h1.p(a0.s0.n(size, "<ByteString@", hexString, " size=", " contents=\""), sb2, "\">");
    }
}

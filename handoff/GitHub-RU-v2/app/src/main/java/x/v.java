package x;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public int[] f33634a;

    /* renamed from: b, reason: collision with root package name */
    public int f33635b;

    public v(int i) {
        this.f33634a = i == 0 ? n.f33600a : new int[i];
    }

    public final void a(int i) {
        b(this.f33635b + 1);
        int[] iArr = this.f33634a;
        int i10 = this.f33635b;
        iArr[i10] = i;
        this.f33635b = i10 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.f33634a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            k71.k.f(copyOf, "copyOf(...)");
            this.f33634a = copyOf;
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.f33635b) {
            return this.f33634a[i];
        }
        y.a.d("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i = this.f33635b;
        if (i != 0) {
            return this.f33634a[i - 1];
        }
        y.a.e("IntList is empty.");
        throw null;
    }

    public final void e(int i) {
        int[] iArr = this.f33634a;
        int i10 = this.f33635b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            } else if (i == iArr[i11]) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            f(i11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i = vVar.f33635b;
            int i10 = this.f33635b;
            if (i == i10) {
                int[] iArr = this.f33634a;
                int[] iArr2 = vVar.f33634a;
                q71.g b02 = aa1.b.b0(0, i10);
                int i11 = b02.f30996r;
                int i12 = b02.f30997s;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f33635b)) {
            y.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f33634a;
        int i11 = iArr[i];
        if (i != i10 - 1) {
            x61.l.w(i, i + 1, i10, iArr, iArr);
        }
        this.f33635b--;
    }

    public final void g(int i, int i10) {
        if (i < 0 || i >= this.f33635b) {
            y.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f33634a;
        int i11 = iArr[i];
        iArr[i] = i10;
    }

    public final int hashCode() {
        int[] iArr = this.f33634a;
        int i = this.f33635b;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += Integer.hashCode(iArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f33634a;
        int i = this.f33635b;
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
            i10++;
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ v() {
        this(16);
    }
}

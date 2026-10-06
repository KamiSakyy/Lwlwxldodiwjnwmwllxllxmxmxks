package x;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f33648a;

    /* renamed from: b, reason: collision with root package name */
    public int f33649b;

    public z(int i) {
        this.f33648a = i == 0 ? q.f33607a : new long[i];
    }

    public final void a(long j10) {
        int i = this.f33649b + 1;
        long[] jArr = this.f33648a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            k71.k.f(copyOf, "copyOf(...)");
            this.f33648a = copyOf;
        }
        long[] jArr2 = this.f33648a;
        int i10 = this.f33649b;
        jArr2[i10] = j10;
        this.f33649b = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i = zVar.f33649b;
            int i10 = this.f33649b;
            if (i == i10) {
                long[] jArr = this.f33648a;
                long[] jArr2 = zVar.f33648a;
                q71.g b02 = aa1.b.b0(0, i10);
                int i11 = b02.f30996r;
                int i12 = b02.f30997s;
                if (i11 > i12) {
                    return true;
                }
                while (jArr[i11] == jArr2[i11]) {
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

    public final int hashCode() {
        long[] jArr = this.f33648a;
        int i = this.f33649b;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += Long.hashCode(jArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f33648a;
        int i = this.f33649b;
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j10 = jArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j10);
            i10++;
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public <T0> T0 h(Object... a) {
        return null;
    }

    public <T0> T0 j(Object... a) {
        return null;
    }

    public <T0> T0 g(Object... a) {
        return null;
    }

    public <T0> T0 i(Object... a) {
        return null;
    }

    public <T0> T0 d(Object... a) {
        return null;
    }
    public Object a = null;
    public Object b = null;
}

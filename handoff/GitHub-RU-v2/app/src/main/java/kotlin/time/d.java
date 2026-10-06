package kotlin.time;

import java.io.Serializable;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements Comparable, Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final d f27877t = new d(0, -31557014167219200L);

    /* renamed from: u, reason: collision with root package name */
    public static final d f27878u = new d(999999999, 31556889864403199L);

    /* renamed from: r, reason: collision with root package name */
    public final long f27879r;

    /* renamed from: s, reason: collision with root package name */
    public final int f27880s;

    public d(int i, long j10) {
        this.f27879r = j10;
        this.f27880s = i;
        if (-31557014167219200L > j10 || j10 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        k.g(dVar, "other");
        int i = k.i(this.f27879r, dVar.f27879r);
        return i != 0 ? i : k.h(this.f27880s, dVar.f27880s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f27879r == dVar.f27879r && this.f27880s == dVar.f27880s;
    }

    public final int hashCode() {
        return (this.f27880s * 51) + Long.hashCode(this.f27879r);
    }

    public final String toString() {
        long j10;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f27879r;
        long j12 = j11 / 86400;
        long j13 = 0;
        if ((j11 ^ 86400) < 0 && j12 * 86400 != j11) {
            j12--;
        }
        long j14 = j11 % 86400;
        int i = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
        long j15 = (j12 + 719528) - 60;
        if (j15 < 0) {
            long j16 = 146097;
            long j17 = ((j15 + 1) / j16) - 1;
            j10 = 0;
            j13 = 400 * j17;
            j15 += (-j17) * j16;
        } else {
            j10 = 0;
        }
        long j18 = 400;
        long j19 = ((j18 * j15) + 591) / 146097;
        long j20 = 365;
        long j21 = 4;
        long j22 = 100;
        long j23 = j15 - ((j19 / j18) + (((j19 / j21) + (j20 * j19)) - (j19 / j22)));
        if (j23 < j10) {
            j19--;
            j23 = j15 - ((j19 / j18) + (((j19 / j21) + (j20 * j19)) - (j19 / j22)));
        }
        int i10 = (int) j23;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int i14 = (int) (j19 + j13 + (i11 / 10));
        int i15 = i / 3600;
        int i16 = i - (i15 * 3600);
        int i17 = i16 / 60;
        int i18 = i16 - (i17 * 60);
        int i19 = 0;
        if (Math.abs(i14) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i14 >= 0) {
                sb3.append(i14 + 10000);
                k.f(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(i14 - 10000);
                k.f(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i14 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i14);
        }
        sb2.append('-');
        e.h(sb2, sb2, i12);
        sb2.append('-');
        e.h(sb2, sb2, i13);
        sb2.append('T');
        e.h(sb2, sb2, i15);
        sb2.append(':');
        e.h(sb2, sb2, i17);
        sb2.append(':');
        e.h(sb2, sb2, i18);
        int i20 = this.f27880s;
        if (i20 != 0) {
            sb2.append('.');
            while (true) {
                int i21 = i19 + 1;
                iArr = e.f27881a;
                if (i20 % iArr[i21] != 0) {
                    break;
                }
                i19 = i21;
            }
            int i22 = i19 - (i19 % 3);
            String valueOf = String.valueOf((i20 / iArr[i22]) + iArr[9 - i22]);
            k.e(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            k.f(substring, "substring(...)");
            sb2.append(substring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    public static kotlin.time.d t;
}

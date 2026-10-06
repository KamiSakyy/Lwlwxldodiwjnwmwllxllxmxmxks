package r91;

import c21.h0;
import e50.k;
import java.util.Set;
import n91.c;
import t71.p;
import x61.l;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public static final Set i = l.j0(new h0[]{j91.a.E, j91.a.q0, j91.a.F, j91.a.U, j91.a.l0, j91.a.e0, j91.a.m0, j91.a.n0, j91.a.p0});
    public o91.b a;
    public h0 b;
    public h0 c;
    public CharSequence d = "";
    public int e;
    public int f;
    public int g;
    public int h;

    public a(o91.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h0 a() {
        int i2;
        int i3;
        h0 h0Var;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        j91.b bVar = j91.a.q0;
        h0 h0Var2 = j91.a.b0;
        h0 h0Var3 = j91.a.S;
        h0 h0Var4 = j91.a.E;
        o91.b bVar2 = this.a;
        l1.b bVar3 = bVar2.j;
        o91.a aVar = bVar2.l;
        k kVar = o91.b.m;
        int i8 = bVar2.g;
        CharSequence charSequence = bVar2.c;
        int[] iArr = o91.b.s;
        int[] iArr2 = o91.b.r;
        int[] iArr3 = o91.b.u;
        while (true) {
            int i9 = bVar2.d;
            bVar2.f = i9;
            bVar2.e = i9;
            int i10 = o91.b.n[bVar2.b];
            bVar2.a = i10;
            j91.b bVar4 = bVar;
            h0 h0Var5 = h0Var2;
            if ((iArr3[i10] & 1) == 1) {
                i3 = i10;
                i2 = i9;
            } else {
                i2 = i9;
                i3 = -1;
            }
            while (true) {
                if (i9 < i8) {
                    k71.k.g(charSequence, "seq");
                    char charAt = charSequence.charAt(i9);
                    if (Character.isHighSurrogate(charAt)) {
                        int i11 = i9 + 1;
                        h0Var = h0Var3;
                        if (i11 < charSequence.length()) {
                            char charAt2 = charSequence.charAt(i11);
                            if (Character.isLowSurrogate(charAt2)) {
                                i6 = ((charAt << '\n') + charAt2) - 56613888;
                                i9 += i6 < 65536 ? 2 : 1;
                                i7 = iArr[k.b(i6) + iArr2[bVar2.a]];
                                int i12 = i6;
                                if (i7 == -1) {
                                    bVar2.a = i7;
                                    int i13 = iArr3[i7];
                                    if ((i13 & 1) == 1) {
                                        i2 = i9;
                                        if ((i13 & 8) == 8) {
                                            i4 = i12;
                                            i3 = i7;
                                        } else {
                                            h0Var3 = h0Var;
                                            i3 = i7;
                                        }
                                    } else {
                                        h0Var3 = h0Var;
                                    }
                                } else {
                                    i4 = i12;
                                }
                            }
                        }
                    } else {
                        h0Var = h0Var3;
                    }
                    i6 = charAt;
                    i9 += i6 < 65536 ? 2 : 1;
                    i7 = iArr[k.b(i6) + iArr2[bVar2.a]];
                    int i122 = i6;
                    if (i7 == -1) {
                    }
                } else {
                    h0Var = h0Var3;
                    if (!bVar2.h) {
                        bVar2.e = i9;
                        bVar2.d = i2;
                        charSequence = bVar2.c;
                        i8 = bVar2.g;
                    }
                    i4 = -1;
                }
            }
            bVar2.d = i2;
            if (i4 == -1 && bVar2.f == bVar2.e) {
                bVar2.h = true;
                return null;
            }
            if (i3 >= 0) {
                i3 = o91.b.q[i3];
            }
            int i14 = 6;
            int i15 = 0;
            switch (i3) {
                case 1:
                    bVar2.f(bVar2.e());
                    bVar2.c();
                    break;
                case 2:
                    return j91.a.G;
                case 3:
                    return h0Var4;
                case 4:
                    return bVar4;
                case 5:
                    int R = p.R(bVar2.c.subSequence(bVar2.f, i2).toString(), "\n", 0, false, 6);
                    if (R >= 2) {
                        bVar2.f(bVar2.e() - R);
                        return h0Var;
                    }
                    if (R > 0) {
                        bVar2.f(bVar2.e() - R);
                        return bVar4;
                    }
                    if (bVar2.b == 8) {
                        bVar2.c();
                    }
                    int i16 = 1;
                    while (i16 < bVar2.e() && bVar2.d(i16) != '\n') {
                        i16++;
                    }
                    if (i16 != bVar2.e()) {
                        bVar2.f(bVar2.e() - i16);
                    } else {
                        bVar2.b = 0;
                        bVar2.f(bVar2.e() - 1);
                    }
                    return j91.a.T;
                case 6:
                    return j91.a.R;
                case 7:
                    return k.a(bVar2.d(0));
                case 8:
                    return bVar2.a() ? c.f : aVar.b;
                case 9:
                    return bVar2.a() ? j91.a.a0 : aVar.b;
                case 10:
                    return j91.a.Q;
                case 11:
                    if (!bVar2.a()) {
                        return aVar.b;
                    }
                    bVar2.k = bVar2.e();
                    bVar3.add(Integer.valueOf(bVar2.b));
                    bVar2.b = 8;
                    return h0Var5;
                case 12:
                    return bVar2.a() ? c.a : aVar.b;
                case 13:
                    if (bVar2.d(0) != aVar.a) {
                        return aVar.b;
                    }
                    if (bVar2.b == 8) {
                        bVar3.pop();
                    }
                    bVar2.b = ((Number) bVar3.pop()).intValue();
                    return k.a(bVar2.d(0));
                case 14:
                    if (bVar2.e() == bVar2.k) {
                        bVar2.k = 0;
                        bVar2.c();
                    }
                    return h0Var5;
                case 15:
                    int i17 = bVar2.f;
                    k71.k.g(charSequence, "seq");
                    int length = charSequence.length();
                    if (i17 < 0 || i17 > length) {
                        throw new IndexOutOfBoundsException();
                    }
                    while (i17 < length && i15 < 1) {
                        int i18 = i17 + 1;
                        i17 = (Character.isHighSurrogate(charSequence.charAt(i17)) && i18 < length && Character.isLowSurrogate(charSequence.charAt(i18))) ? i17 + 2 : i18;
                        i15++;
                    }
                    if (i15 < 1) {
                        throw new IndexOutOfBoundsException();
                    }
                    bVar2.d = i17;
                    return h0Var;
                case 16:
                    return bVar2.a() ? h0Var4 : aVar.b;
                case 17:
                    return j91.a.o0;
                case 18:
                    return bVar2.b(j91.a.n0);
                case 19:
                    return bVar2.b(j91.a.m0);
                case 20:
                    int e = bVar2.e();
                    int i19 = e - 1;
                    if (bVar2.d(i19) == '/') {
                        while (bVar2.d(e - 2) == '/') {
                            e--;
                        }
                        bVar2.f(bVar2.e() - e);
                    } else {
                        int i20 = -1;
                        int i21 = -1;
                        for (int i22 = i19; i21 < i22; i22--) {
                            char d = bVar2.d(i22);
                            if (d == ')') {
                                if (i20 == i21) {
                                    int i23 = 0;
                                    int i24 = i22;
                                    while (i21 < i24) {
                                        char d2 = bVar2.d(i24);
                                        if (d2 == ')') {
                                            i23++;
                                        } else if (d2 == '(' && i23 - 1 <= 0) {
                                            i20 = i23;
                                        }
                                        i24--;
                                        i21 = -1;
                                    }
                                    i20 = i23;
                                }
                                if (i20 > 0) {
                                    i20--;
                                    i21 = -1;
                                    e--;
                                } else {
                                    bVar2.f(bVar2.e() - e);
                                }
                            } else {
                                i21 = -1;
                                if (p.Q(".,:;!?\"'*_~]`", d, 0, 6) == -1) {
                                    bVar2.f(bVar2.e() - e);
                                } else {
                                    e--;
                                }
                            }
                        }
                        bVar2.f(bVar2.e() - e);
                    }
                    return c.c;
                case 21:
                    int i25 = bVar2.f;
                    q91.a aVar2 = bVar2.i;
                    if (aVar2 == null || aVar2.r <= charSequence.length()) {
                        bVar2.i = new q91.a(charSequence.length() + 1);
                    }
                    q91.a aVar3 = bVar2.i;
                    k71.k.d(aVar3);
                    int i26 = 5;
                    while (true) {
                        i5 = -1;
                        if (i26 != -1) {
                            if (i25 < bVar2.d) {
                                aVar3.set(i25, (iArr3[i26] & 1) == 1);
                                k71.k.g(charSequence, "seq");
                                char charAt3 = charSequence.charAt(i25);
                                boolean isHighSurrogate = Character.isHighSurrogate(charAt3);
                                int i27 = charAt3;
                                if (isHighSurrogate) {
                                    int i28 = i25 + 1;
                                    i27 = charAt3;
                                    if (i28 < charSequence.length()) {
                                        char charAt4 = charSequence.charAt(i28);
                                        i27 = charAt3;
                                        if (Character.isLowSurrogate(charAt4)) {
                                            i27 = ((charAt3 << 10) + charAt4) - 56613888;
                                        }
                                    }
                                }
                                i25 += i27 >= 65536 ? 2 : 1;
                                i26 = iArr[k.b(i27) + iArr2[i26]];
                            } else {
                                i5 = -1;
                            }
                        }
                    }
                    if (i26 != i5) {
                        int i29 = i25 + 1;
                        aVar3.set(i25, (iArr3[i26] & 1) == 1);
                        i25 = i29;
                    }
                    while (true) {
                        int i30 = bVar2.d;
                        if (i25 <= i30) {
                            aVar3.clear(i25);
                            i25++;
                        } else {
                            while (true) {
                                if (aVar3.get(i30) && (iArr3[i14] & 1) == 1) {
                                    bVar2.d = i30;
                                    return h0Var4;
                                }
                                k71.k.g(charSequence, "seq");
                                int i31 = i30 - 1;
                                char charAt5 = charSequence.charAt(i31);
                                boolean isLowSurrogate = Character.isLowSurrogate(charAt5);
                                int i32 = charAt5;
                                i32 = charAt5;
                                if (isLowSurrogate && i31 > 0) {
                                    char charAt6 = charSequence.charAt(i30 - 2);
                                    i32 = charAt5;
                                    if (Character.isHighSurrogate(charAt6)) {
                                        i32 = ((charAt6 << 10) + charAt5) - 56613888;
                                    }
                                }
                                i30 -= i32 >= 65536 ? 2 : 1;
                                i14 = iArr[k.b(i32) + iArr2[i14]];
                            }
                        }
                    }
                    break;
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    break;
                default:
                    String[] strArr = o91.b.t;
                    try {
                        str = strArr[1];
                    } catch (Exception unused) {
                        str = strArr[0];
                    }
                    throw new Error(str);
            }
            bVar = bVar4;
            h0Var2 = h0Var5;
            h0Var3 = h0Var;
        }
    }

    public final void b() {
        h0 h0Var;
        do {
            o91.b bVar = this.a;
            this.h = bVar.e() + bVar.f;
            h0 a = a();
            this.c = a;
            h0Var = this.b;
            if (!k71.k.b(a, h0Var) || h0Var == null) {
                return;
            }
        } while (i.contains(h0Var));
    }
}

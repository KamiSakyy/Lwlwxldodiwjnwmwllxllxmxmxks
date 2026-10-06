package h91;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final f a = new f();

    public static final boolean a(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        k71.k.g(bArr, "a");
        k71.k.g(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final d0 b(i0Shadow i0Var) {
        k71.k.g(i0Var, "<this>");
        return new d0(i0Var);
    }

    public static final e0 c(k0 k0Var) {
        k71.k.g(k0Var, "<this>");
        return new e0(k0Var);
    }

    public static void d(long j, h hVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((k) arrayList4.get(i8)).d() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        k kVar = (k) arrayList.get(i2);
        k kVar2 = (k) arrayList4.get(i3 - 1);
        if (i7 == kVar.d()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            k kVar3 = (k) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            kVar = kVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (kVar.i(i7) == kVar2.i(i7)) {
            int min = Math.min(kVar.d(), kVar2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < min && kVar.i(i11) == kVar2.i(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (hVar.s / j3) + j + 2 + i10 + 1;
            hVar.M0(-i10);
            hVar.M0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                hVar.M0(kVar.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((k) arrayList4.get(i4)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                hVar.M0(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                h hVar2 = new h();
                hVar.M0(((int) ((hVar2.s / j3) + j4)) * (-1));
                d(j4, hVar2, i12, arrayList4, i4, i3, arrayList5);
                hVar.G(hVar2);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((k) arrayList4.get(i14 - 1)).i(i7) != ((k) arrayList4.get(i14)).i(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (hVar.s / j5) + j + 2 + (i13 * 2);
        hVar.M0(i13);
        hVar.M0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int i16 = ((k) arrayList4.get(i15)).i(i7);
            if (i15 == i4 || i16 != ((k) arrayList4.get(i15 - 1)).i(i7)) {
                hVar.M0(i16 & 255);
            }
        }
        h hVar3 = new h();
        int i17 = i4;
        while (i17 < i3) {
            byte i18 = ((k) arrayList4.get(i17)).i(i7);
            int i19 = i17 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i20 = i3;
                    break;
                } else if (i18 != ((k) arrayList4.get(i20)).i(i7)) {
                    break;
                } else {
                    i20++;
                }
            }
            if (i19 == i20 && i7 + 1 == ((k) arrayList4.get(i17)).d()) {
                hVar.M0(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i20;
            } else {
                hVar.M0(((int) ((hVar3.s / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i20;
                d(j2, hVar3, i7 + 1, arrayList, i17, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i17 = i6;
            arrayList5 = arrayList3;
        }
        hVar.G(hVar3);
    }

    public static final void e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y f(k... kVarArr) {
        if (kVarArr.length == 0) {
            return new y(new k[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList((Collection) new x61.j(kVarArr, false));
        x61.p.H(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = kVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(sy.d0.g(arrayList, kVarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((k) arrayList.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            k kVar = (k) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                k kVar2 = (k) arrayList.get(i6);
                kVar2.getClass();
                k71.k.g(kVar, "prefix");
                if (kVar2.l(0, kVar, kVar.d())) {
                    if (kVar2.d() == kVar.d()) {
                        throw new IllegalArgumentException(("duplicate option: " + kVar2).toString());
                    }
                    if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        ((Number) arrayList2.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        h hVar = new h();
        d(0L, hVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (hVar.s / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = hVar.readInt();
        }
        Object[] copyOf = Arrays.copyOf(kVarArr, kVarArr.length);
        k71.k.f(copyOf, "copyOf(...)");
        return new y((k[]) copyOf, iArr);
    }

    public static final u g(InputStream inputStream) {
        k71.k.g(inputStream, "<this>");
        return new u(inputStream, new m0());
    }

    public static final String h(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = i91.b.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        sy.a0.f(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }
}

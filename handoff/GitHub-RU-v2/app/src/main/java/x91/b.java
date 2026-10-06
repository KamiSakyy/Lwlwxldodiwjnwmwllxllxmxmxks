package x91;

import b21.v;
import c21.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q81.k;
import sy.n;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b implements f {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    @Override // x91.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k a(c cVar, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        a aVar;
        Integer[] numArr;
        int i5;
        int i6;
        int i7;
        h0 r;
        h0 h0Var;
        switch (this.a) {
            case 0:
                n[] nVarArr = (n[]) this.b;
                k kVar = new k(1);
                g gVar = new g(cVar, list);
                ArrayList arrayList = new ArrayList();
                v vVar = gVar;
                while (true) {
                    i = 0;
                    if (vVar.m() != null) {
                        int i8 = 0;
                        for (n nVar : nVarArr) {
                            int z = nVar.z(cVar, vVar, arrayList);
                            i8 += z;
                            for (int i9 = 0; i9 < z; i9++) {
                                if (vVar.m() != null) {
                                    vVar = vVar.c();
                                }
                            }
                        }
                        if (i8 == 0) {
                            vVar = vVar.c();
                        }
                    }
                }
                int size = arrayList.size();
                Integer[] numArr2 = new Integer[size];
                for (int i10 = 0; i10 < size; i10++) {
                    numArr2[i10] = 0;
                }
                HashMap hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                int i11 = 0;
                int i12 = 0;
                int i13 = -2;
                while (it.hasNext()) {
                    int i14 = i11 + 1;
                    a aVar2 = (a) it.next();
                    char c = ((a) arrayList.get(i12)).f;
                    char c2 = aVar2.f;
                    int i15 = aVar2.b;
                    int i16 = aVar2.c;
                    int i17 = (c == c2 && i13 == i15 + (-1)) ? i12 : i11;
                    if (aVar2.e) {
                        if (hashMap.containsKey(Character.valueOf(c2))) {
                            i2 = i16;
                            i3 = i15;
                            i4 = i11;
                            aVar = aVar2;
                            numArr = numArr2;
                        } else {
                            i2 = i16;
                            i4 = i11;
                            i3 = i15;
                            aVar = aVar2;
                            numArr = numArr2;
                            hashMap.put(Character.valueOf(c2), new Integer[]{-1, -1, -1, -1, -1, -1});
                        }
                        Object obj = hashMap.get(Character.valueOf(c2));
                        k71.k.d(obj);
                        int i18 = i2 % 3;
                        int intValue = ((Integer[]) obj)[(aVar.d ? 3 : 0) + i18].intValue();
                        int intValue2 = (i17 - numArr[i17].intValue()) - 1;
                        int i19 = intValue2;
                        while (i19 > intValue) {
                            Object obj2 = arrayList.get(i19);
                            i6 = 3;
                            k71.k.f(obj2, "delimiters[openerIndex]");
                            a aVar3 = (a) obj2;
                            if (aVar3.f != c2) {
                                i19 -= numArr[i19].intValue() + 1;
                            } else {
                                if (aVar3.d && aVar3.g < 0) {
                                    if (aVar3.e || aVar.d) {
                                        int i20 = aVar3.c;
                                        if ((i20 + i2) % 3 == 0) {
                                            if (i20 % 3 == 0 && i18 == 0) {
                                            }
                                        }
                                    }
                                    if (i19 > 0) {
                                        int i21 = i19 - 1;
                                        if (!((a) arrayList.get(i21)).d) {
                                            i7 = numArr[i21].intValue() + 1;
                                            numArr[i19] = Integer.valueOf(i7);
                                            numArr[i4] = Integer.valueOf((i4 - i19) + i7);
                                            i5 = 0;
                                            aVar.d = false;
                                            aVar3.g = i4;
                                            aVar3.e = false;
                                            i3 = -2;
                                            intValue2 = -1;
                                            if (intValue2 != -1) {
                                                Object obj3 = hashMap.get(Character.valueOf(c2));
                                                k71.k.d(obj3);
                                                Integer[] numArr3 = (Integer[]) obj3;
                                                if (!aVar.d) {
                                                    i6 = i5;
                                                }
                                                numArr3[i18 + i6] = Integer.valueOf(intValue2);
                                            }
                                            i = i5;
                                            i11 = i14;
                                            i12 = i17;
                                            i13 = i3;
                                            numArr2 = numArr;
                                        }
                                    }
                                    i7 = 0;
                                    numArr[i19] = Integer.valueOf(i7);
                                    numArr[i4] = Integer.valueOf((i4 - i19) + i7);
                                    i5 = 0;
                                    aVar.d = false;
                                    aVar3.g = i4;
                                    aVar3.e = false;
                                    i3 = -2;
                                    intValue2 = -1;
                                    if (intValue2 != -1) {
                                    }
                                    i = i5;
                                    i11 = i14;
                                    i12 = i17;
                                    i13 = i3;
                                    numArr2 = numArr;
                                }
                                i19 -= numArr[i19].intValue() + 1;
                            }
                        }
                        i5 = 0;
                        i6 = 3;
                        if (intValue2 != -1) {
                        }
                        i = i5;
                        i11 = i14;
                        i12 = i17;
                        i13 = i3;
                        numArr2 = numArr;
                    } else {
                        i13 = i15;
                        i11 = i14;
                        i12 = i17;
                        i = 0;
                    }
                }
                int length = nVarArr.length;
                while (i < length) {
                    nVarArr[i].x(cVar, gVar, arrayList, kVar);
                    i++;
                }
                return kVar;
            default:
                k kVar2 = new k(1);
                ArrayList arrayList2 = new ArrayList();
                g gVar2 = new g(cVar, list);
                int i22 = -239;
                int i23 = -239;
                while (true) {
                    int i24 = ((v) gVar2).s;
                    if (gVar2.m() == null) {
                        if (i23 != -239) {
                            arrayList2.add(new q71.g(i23, i22, 1));
                        }
                        kVar2.b(arrayList2);
                        return kVar2;
                    }
                    if (k71.k.b(gVar2.m(), j91.a.O) && (r = gVar2.r()) != null && ((List) this.b).contains(r)) {
                        while (true) {
                            h0 m = gVar2.m();
                            h0Var = j91.a.P;
                            if (!k71.k.b(m, h0Var) && gVar2.m() != null) {
                                gVar2 = gVar2.c();
                            }
                        }
                        if (k71.k.b(gVar2.m(), h0Var)) {
                            kVar2.a.add(new e(new q71.g(i24, ((v) gVar2).s + 1, 1), j91.a.v));
                        }
                    } else {
                        if (i22 + 1 != i24) {
                            if (i23 != -239) {
                                arrayList2.add(new q71.g(i23, i22, 1));
                            }
                            i23 = i24;
                        }
                        i22 = i24;
                    }
                    gVar2 = gVar2.c();
                }
                break;
        }
    }
}

package p91;

import b21.v;
import c21.h0;
import h0.q1;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import q71.e;
import q71.g;
import s91.f;
import sy.a0;
import sy.d0Shadow;
import sy.n;
import sy.oShadow;
import t71.p;
import t91.d;
import u91.c;
import x61.l;
import x61.m;
import x61.rShadow;
import y41.t1;

/* loaded from: /home/user/work/p/classes5.dex */
public class b implements c {
    public final /* synthetic */ int a;

    public static g c(s91.c cVar) {
        if (cVar.b == -1) {
            return null;
        }
        String b = cVar.b();
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (i < b.length() && b.charAt(i) == ' ') {
                i++;
            }
        }
        if (i >= b.length() || b.charAt(i) != '#') {
            return null;
        }
        int i3 = i;
        for (int i4 = 0; i4 < 6; i4++) {
            if (i3 < b.length() && b.charAt(i3) == '#') {
                i3++;
            }
        }
        if (i3 >= b.length() || l.r(new Character[]{' ', '\t'}).contains(Character.valueOf(b.charAt(i3)))) {
            return new g(i, i3 - 1, 1);
        }
        return null;
    }

    public static boolean d(s91.c cVar, d dVar) {
        k.g(cVar, "pos");
        k.g(dVar, "constraints");
        int i = cVar.b;
        String str = cVar.d;
        if (i == a0.l(dVar, str)) {
            return n.r(i, str);
        }
        return false;
    }

    @Override // u91.c
    public final boolean a(s91.c cVar, d dVar) {
        switch (this.a) {
            case 0:
                k.g(cVar, "pos");
                k.g(dVar, "constraints");
                break;
            case 1:
                k.g(cVar, "pos");
                k.g(dVar, "constraints");
                if (c(cVar) != null) {
                }
                break;
            case 2:
                k.g(cVar, "pos");
                k.g(dVar, "constraints");
                break;
            case 3:
                k.g(cVar, "pos");
                k.g(dVar, "constraints");
                break;
            case 4:
                k.g(cVar, "pos");
                k.g(dVar, "constraints");
                break;
            case 5:
                k.g(cVar, "pos");
                k.g(dVar, "constraints");
                break;
            default:
                k.g(cVar, "pos");
                k.g(dVar, "constraints");
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    @Override // u91.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(s91.c cVar, q1 q1Var, f fVar) {
        int i;
        Character S;
        Integer a;
        s91.c f;
        g gVar;
        int i2;
        int i3;
        int j;
        e gVar2;
        char charAt;
        int i4;
        char charAt2;
        int i5;
        char charAt3;
        int i6;
        e gVar3;
        int i7;
        char c;
        int i8;
        char charAt4;
        ArrayList<g> arrayList;
        char charAt5;
        h0 h0Var;
        switch (this.a) {
            case 0:
                k.g(fVar, "stateInfo");
                d dVar = fVar.a;
                if (k.b(fVar.b, dVar)) {
                    String b = cVar.b();
                    if (p.J(b, '|')) {
                        ArrayList K = t1.K(b);
                        ArrayList arrayList2 = new ArrayList(x61.n.F(K, 10));
                        int size = K.size();
                        int i9 = 0;
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            CharSequence charSequence = null;
                            boolean z = true;
                            if (i11 < size) {
                                Object obj = K.get(i11);
                                i11++;
                                int i12 = i10 + 1;
                                if (i10 < 0) {
                                    d0Shadow.x();
                                    throw null;
                                }
                                String str = (String) obj;
                                if ((i10 <= 0 || i10 >= d0Shadow.m(K)) && p.T(str)) {
                                    z = false;
                                }
                                arrayList2.add(Boolean.valueOf(z));
                                i10 = i12;
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i = 0;
                                } else {
                                    int size2 = arrayList2.size();
                                    i = 0;
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        Object obj2 = arrayList2.get(i13);
                                        i13++;
                                        if (((Boolean) obj2).booleanValue() && (i = i + 1) < 0) {
                                            d0Shadow.w();
                                            throw null;
                                        }
                                    }
                                }
                                if (i != 0) {
                                    int i14 = cVar.a + 1;
                                    List list = (List) cVar.e.t;
                                    String str2 = i14 < list.size() ? (String) list.get(i14) : null;
                                    if (str2 != null) {
                                        t91.c cVar2 = (t91.c) dVar;
                                        t91.c b2 = cVar2.b(cVar.e());
                                        if (a0.j(b2, cVar2)) {
                                            charSequence = a0.i(b2, str2);
                                        }
                                    }
                                    if (charSequence != null) {
                                        int z2 = y9.a.z(0, charSequence);
                                        if (z2 < charSequence.length() && charSequence.charAt(z2) == '|') {
                                            z2++;
                                        }
                                        int i15 = 0;
                                        while (z2 < charSequence.length()) {
                                            int z3 = y9.a.z(z2, charSequence);
                                            if (z3 < charSequence.length() && charSequence.charAt(z3) == ':') {
                                                z3 = y9.a.z(z3 + 1, charSequence);
                                            }
                                            int i16 = 0;
                                            while (z3 < charSequence.length() && charSequence.charAt(z3) == '-') {
                                                z3++;
                                                i16++;
                                            }
                                            if (i16 >= 1) {
                                                i15++;
                                                z2 = y9.a.z(z3, charSequence);
                                                if (z2 < charSequence.length() && charSequence.charAt(z2) == ':') {
                                                    z2 = y9.a.z(z2 + 1, charSequence);
                                                }
                                                if (z2 < charSequence.length() && charSequence.charAt(z2) == '|') {
                                                    z2 = y9.a.z(z2 + 1, charSequence);
                                                }
                                                if (z2 == charSequence.length()) {
                                                    i9 = i15;
                                                }
                                                if (i9 == i) {
                                                }
                                            } else if (i9 == i) {
                                                return d0Shadow.n(new a(cVar, dVar, q1Var, i));
                                            }
                                        }
                                        if (z2 == charSequence.length()) {
                                        }
                                        if (i9 == i) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return rShadow.r;
            case 1:
                k.g(fVar, "stateInfo");
                g c2 = c(cVar);
                if (c2 == null) {
                    return rShadow.r;
                }
                d dVar2 = fVar.a;
                int i17 = ((e) c2).s;
                String b3 = cVar.b();
                int i18 = cVar.c;
                int length = b3.length() - 1;
                while (length > i17 && sy.rShadow.s(b3.charAt(length))) {
                    length--;
                }
                while (length > i17 && b3.charAt(length) == '#' && b3.charAt(length - 1) != '\\') {
                    length--;
                }
                int i19 = length + 1;
                return d0Shadow.n(new v91.a(dVar2, q1Var, c2, (i19 < b3.length() && sy.rShadow.s(b3.charAt(length)) && b3.charAt(i19) == '#') ? i18 + length + 1 : i18 + b3.length(), cVar.d()));
            case 2:
                k.g(fVar, "stateInfo");
                d dVar3 = fVar.a;
                d dVar4 = fVar.b;
                return (cVar.b == a0.l(dVar3, cVar.d) && !k.b(dVar4, dVar3) && (S = l.S(((t91.c) dVar4).b)) != null && S.charValue() == '>') ? d0Shadow.n(new v91.b(dVar4, new v(q1Var), 0)) : rShadow.r;
            case 3:
                k.g(fVar, "stateInfo");
                d dVar5 = fVar.a;
                int l = a0.l(fVar.b, cVar.d);
                int i20 = cVar.b;
                rShadow rVar = rShadow.r;
                if (l > i20 || (a = cVar.a()) == null || (f = cVar.f(a.intValue())) == null) {
                    return rVar;
                }
                k.g(dVar5, "constraints");
                String str3 = f.d;
                int l2 = a0.l(dVar5, str3);
                int i21 = f.b;
                if (i21 < l2 + 4) {
                    if (l2 > i21) {
                        return rVar;
                    }
                    while (str3.charAt(l2) != '\t') {
                        if (l2 == i21) {
                            return rVar;
                        }
                        l2++;
                    }
                }
                return d0Shadow.n(new v91.c(q1Var, cVar, dVar5));
            case 4:
                k.g(fVar, "stateInfo");
                d dVar6 = fVar.a;
                return d(cVar, dVar6) ? d0Shadow.n(new v91.b(dVar6, new v(q1Var), 1)) : rShadow.r;
            case 5:
                int i22 = cVar.c;
                k.g(fVar, "stateInfo");
                d dVar7 = fVar.a;
                k.g(dVar7, "constraints");
                if (cVar.b == a0.l(dVar7, cVar.d)) {
                    CharSequence charSequence2 = (CharSequence) cVar.e.s;
                    k.g(charSequence2, "text");
                    int i23 = i22;
                    int i24 = 0;
                    while (true) {
                        char c3 = ' ';
                        if (i24 < 3) {
                            if (i23 < charSequence2.length() && charSequence2.charAt(i23) == ' ') {
                                i23++;
                            }
                            i24++;
                        } else {
                            int i25 = 1;
                            if (i23 < charSequence2.length() && charSequence2.charAt(i23) == '[') {
                                int i26 = i23 + 1;
                                boolean z4 = false;
                                for (int i27 = 1; i27 < 1000; i27++) {
                                    if (i26 < charSequence2.length()) {
                                        char charAt6 = charSequence2.charAt(i26);
                                        if (charAt6 != '[' && charAt6 != ']') {
                                            if (charAt6 == '\\') {
                                                i26++;
                                                if (i26 < charSequence2.length()) {
                                                    charAt6 = charSequence2.charAt(i26);
                                                }
                                            }
                                            if (!sy.rShadow.s(charAt6)) {
                                                z4 = true;
                                            }
                                            i26++;
                                        }
                                        if (z4 && i26 < charSequence2.length() && charSequence2.charAt(i26) == ']') {
                                            gVar = new g(i23, i26, 1);
                                            if (gVar != null && (i3 = (i2 = ((e) gVar).s) + 1) < charSequence2.length() && charSequence2.charAt(i3) == ':') {
                                                j = oShadow.j(i2 + 2, charSequence2);
                                                if (j < charSequence2.length()) {
                                                    if (charSequence2.charAt(j) == '<') {
                                                        int i28 = j + 1;
                                                        while (i28 < charSequence2.length()) {
                                                            char charAt7 = charSequence2.charAt(i28);
                                                            if (charAt7 == '>') {
                                                                gVar2 = new g(j, i28, 1);
                                                                if (gVar2 != null) {
                                                                    int j2 = oShadow.j(gVar2.s + 1, charSequence2);
                                                                    if (j2 < charSequence2.length()) {
                                                                        char charAt8 = charSequence2.charAt(j2);
                                                                        char c4 = '\'';
                                                                        if (charAt8 != '\'') {
                                                                            c4 = '\"';
                                                                            if (charAt8 != '\"') {
                                                                                if (charAt8 == '(') {
                                                                                    c4 = ')';
                                                                                }
                                                                            }
                                                                        }
                                                                        int i29 = j2 + 1;
                                                                        int i30 = 0;
                                                                        while (i29 < charSequence2.length()) {
                                                                            char charAt9 = charSequence2.charAt(i29);
                                                                            if (charAt9 == c4) {
                                                                                i6 = i25;
                                                                                gVar3 = new g(j2, i29, i25);
                                                                                ArrayList arrayList3 = new ArrayList();
                                                                                arrayList3.add(gVar);
                                                                                arrayList3.add(gVar2);
                                                                                if (gVar3 != null) {
                                                                                    int i31 = gVar3.s;
                                                                                    while (true) {
                                                                                        i31++;
                                                                                        if (i31 >= charSequence2.length() || ((charAt5 = charSequence2.charAt(i31)) != ' ' && charAt5 != '\t')) {
                                                                                        }
                                                                                    }
                                                                                    if (i31 >= charSequence2.length() || charSequence2.charAt(i31) == '\n') {
                                                                                        arrayList3.add(gVar3);
                                                                                    }
                                                                                }
                                                                                arrayList = arrayList3;
                                                                                if (arrayList != null) {
                                                                                    int i32 = 0;
                                                                                    for (g gVar4 : arrayList) {
                                                                                        int i33 = i32 + 1;
                                                                                        k.g(gVar4, "range");
                                                                                        int i34 = i6;
                                                                                        g gVar5 = new g(((e) gVar4).r, ((e) gVar4).s + 1, i34);
                                                                                        if (i32 == 0) {
                                                                                            h0Var = j91.a.n;
                                                                                        } else if (i32 == i34) {
                                                                                            h0Var = j91.a.o;
                                                                                        } else {
                                                                                            if (i32 != 2) {
                                                                                                throw new AssertionError("There are no more than three groups in this regex");
                                                                                            }
                                                                                            h0Var = j91.a.p;
                                                                                        }
                                                                                        q1Var.a(d0Shadow.n(new x91.e(gVar5, h0Var)));
                                                                                        i32 = i33;
                                                                                        i6 = 1;
                                                                                    }
                                                                                    int i35 = (((e) ((g) m.e0(arrayList))).s - i22) + 1;
                                                                                    s91.c f2 = cVar.f(i35);
                                                                                    if (f2 == null || f2.b == -1 || f2.a() == null) {
                                                                                        return d0Shadow.n(new v91.f(dVar7, new v(q1Var), i22 + i35));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (charAt9 != '\n') {
                                                                                    i7 = i25;
                                                                                    if (charAt9 != c3 && charAt9 != '\t') {
                                                                                        c = '\\';
                                                                                        i30 = 0;
                                                                                        if (charAt9 == c && (i8 = i29 + 1) < charSequence2.length() && (charAt4 = charSequence2.charAt(i8)) != c3 && charAt4 != '\t' && charAt4 != '\n') {
                                                                                            i29 = i8;
                                                                                        }
                                                                                        i29++;
                                                                                        i25 = i7;
                                                                                        c3 = ' ';
                                                                                    }
                                                                                } else if (i30 == 0) {
                                                                                    i30 = i25;
                                                                                    i7 = i30;
                                                                                }
                                                                                c = '\\';
                                                                                if (charAt9 == c) {
                                                                                    i29 = i8;
                                                                                }
                                                                                i29++;
                                                                                i25 = i7;
                                                                                c3 = ' ';
                                                                            }
                                                                        }
                                                                    }
                                                                    i6 = i25;
                                                                    gVar3 = null;
                                                                    ArrayList arrayList32 = new ArrayList();
                                                                    arrayList32.add(gVar);
                                                                    arrayList32.add(gVar2);
                                                                    if (gVar3 != null) {
                                                                    }
                                                                    arrayList = arrayList32;
                                                                    if (arrayList != null) {
                                                                    }
                                                                }
                                                            } else if (charAt7 != '<' && charAt7 != '>' && charAt7 != ' ' && charAt7 != '\t' && charAt7 != '\n') {
                                                                if (charAt7 == '\\' && (i5 = i28 + 1) < charSequence2.length() && (charAt3 = charSequence2.charAt(i5)) != ' ' && charAt3 != '\t' && charAt3 != '\n') {
                                                                    i28 = i5;
                                                                }
                                                                i28++;
                                                            }
                                                        }
                                                    } else {
                                                        int i36 = j;
                                                        boolean z5 = false;
                                                        while (i36 < charSequence2.length() && (charAt = charSequence2.charAt(i36)) != ' ' && charAt != '\t' && charAt != '\n' && charAt > 27) {
                                                            if (charAt != '(') {
                                                                if (charAt == ')') {
                                                                    if (!z5) {
                                                                        break;
                                                                    } else {
                                                                        z5 = false;
                                                                    }
                                                                } else if (charAt == '\\' && (i4 = i36 + 1) < charSequence2.length() && (charAt2 = charSequence2.charAt(i4)) != ' ' && charAt2 != '\t' && charAt2 != '\n') {
                                                                    i36 = i4;
                                                                }
                                                                i36++;
                                                            } else if (z5) {
                                                                break;
                                                            } else {
                                                                z5 = true;
                                                                i36++;
                                                            }
                                                        }
                                                        gVar2 = new g(j, i36 - 1, 1);
                                                        if (gVar2 != null) {
                                                        }
                                                    }
                                                }
                                                gVar2 = null;
                                                if (gVar2 != null) {
                                                }
                                            }
                                            i6 = 1;
                                            arrayList = null;
                                            if (arrayList != null) {
                                            }
                                        }
                                    }
                                }
                                if (z4) {
                                    gVar = new g(i23, i26, 1);
                                    if (gVar != null) {
                                        j = oShadow.j(i2 + 2, charSequence2);
                                        if (j < charSequence2.length()) {
                                        }
                                        gVar2 = null;
                                        if (gVar2 != null) {
                                        }
                                    }
                                    i6 = 1;
                                    arrayList = null;
                                    if (arrayList != null) {
                                    }
                                }
                            }
                            gVar = null;
                            if (gVar != null) {
                            }
                            i6 = 1;
                            arrayList = null;
                            if (arrayList != null) {
                            }
                        }
                    }
                }
                return rShadow.r;
            default:
                k.g(fVar, "stateInfo");
                d dVar8 = fVar.a;
                d dVar9 = fVar.b;
                k.g(dVar8, "constraints");
                int i37 = cVar.b;
                int l3 = a0.l(dVar8, cVar.d);
                ArrayList arrayList4 = rShadow.r;
                if (i37 == l3 && !k.b(dVar9, dVar8)) {
                    t91.c cVar3 = (t91.c) dVar9;
                    Character S2 = l.S(cVar3.b);
                    if (S2 == null || S2.charValue() != '>') {
                        boolean[] zArr = cVar3.c;
                        if (k.b(zArr.length == 0 ? null : Boolean.valueOf(zArr[zArr.length - 1]), Boolean.TRUE)) {
                            arrayList4 = new ArrayList();
                            if (!(((u91.b) m.f0(fVar.c)) instanceof v91.g)) {
                                v vVar = new v(q1Var);
                                Character S3 = l.S(cVar3.b);
                                k.d(S3);
                                arrayList4.add(new v91.g(dVar9, vVar, S3.charValue()));
                            }
                            arrayList4.add(new v91.b(dVar9, new v(q1Var), 2));
                        }
                    }
                }
                return arrayList4;
        }
    }
}

package da1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public enum x extends b0 {
    public x() {
        super("InBody", 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(18:83|(2:84|(2:86|(1:89)(1:88))(2:191|192))|90|(16:91|(1:93)(1:190)|(0)(1:(2:98|(3:151|(3:182|183|184)(3:153|154|(2:180|181)(8:156|(1:158)(1:179)|159|(1:161)(1:178)|162|(4:164|(2:165|(2:167|(1:170)(1:169))(2:173|174))|171|172)|175|176))|177)(2:102|103))(1:185))|105|(5:107|(1:109)(1:129)|110|(4:113|(5:122|123|(1:125)|126|127)(5:115|116|(1:118)|119|120)|121|111)|128)|130|(1:132)(1:150)|133|(2:136|134)|137|138|139|140|141|(2:143|144)(2:146|147)|145)|104|105|(0)|130|(0)(0)|133|(1:134)|137|138|139|140|141|(0)(0)|145) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03e4, code lost:
    
        r33.q.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x029a, code lost:
    
        r16 = r3;
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0344, code lost:
    
        r33.k(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0267, code lost:
    
        return r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cb A[LOOP:6: B:134:0x03c5->B:136:0x03cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025c  */
    @Override // da1.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(s0 s0Var, b bVar) {
        char c;
        char c2;
        ca1.j jVar;
        ca1.j jVar2;
        String str;
        char c3;
        char c4;
        ca1.j jVar3;
        ca1.j jVar4;
        int size;
        List unmodifiableList;
        Iterator it;
        int b = y3.a.b(s0Var.a);
        if (b == 0) {
            bVar.k(this);
            return false;
        }
        u uVar = b0.u;
        String[] strArr = a0.i;
        String[] strArr2 = a0.l;
        if (b != 1) {
            boolean z = true;
            String[] strArr3 = a0.p;
            if (b != 2) {
                if (b == 3) {
                    bVar.v((l0) s0Var);
                    return true;
                }
                if (b != 4) {
                    if (b != 6) {
                        throw new IllegalStateException("Unexpected state: ".concat(com.github.rudroid.copilot.h1.G(s0Var.a)));
                    }
                    if (bVar.r.size() > 0) {
                        return b0.I.d(s0Var, bVar);
                    }
                    if (!bVar.D(strArr3)) {
                        return true;
                    }
                    bVar.k(this);
                    return true;
                }
                k0 k0Var = (k0) s0Var;
                if (k0Var.d.G().equals(b0.P)) {
                    bVar.k(this);
                    return false;
                }
                if (bVar.u && b0.a(k0Var)) {
                    bVar.L();
                    bVar.t(k0Var);
                    return true;
                }
                bVar.L();
                bVar.t(k0Var);
                bVar.u = false;
                return true;
            }
            o0 o0Var = (o0) s0Var;
            String l = o0Var.l();
            l.getClass();
            switch (l.hashCode()) {
                case -1321546630:
                    str = "template";
                    if (l.equals(str)) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 112:
                    if (l.equals("p")) {
                        str = "template";
                        c3 = 1;
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3152:
                    if (l.equals("br")) {
                        str = "template";
                        c3 = 2;
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3200:
                    if (l.equals("dd")) {
                        str = "template";
                        c3 = 3;
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3216:
                    if (l.equals("dt")) {
                        str = "template";
                        c3 = 4;
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3273:
                    if (l.equals("h1")) {
                        str = "template";
                        c3 = 5;
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3274:
                    if (l.equals("h2")) {
                        c3 = 6;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3275:
                    if (l.equals("h3")) {
                        str = "template";
                        c3 = 7;
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3276:
                    if (l.equals("h4")) {
                        str = "template";
                        c3 = '\b';
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3277:
                    if (l.equals("h5")) {
                        c4 = '\t';
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3278:
                    if (l.equals("h6")) {
                        c4 = '\n';
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3453:
                    if (l.equals("li")) {
                        c4 = 11;
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3029410:
                    if (l.equals("body")) {
                        c4 = '\f';
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3148996:
                    if (l.equals("form")) {
                        c4 = '\r';
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3213227:
                    if (l.equals("html")) {
                        c4 = 14;
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 3536714:
                    if (l.equals("span")) {
                        c4 = 15;
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                case 1869063452:
                    if (l.equals("sarcasm")) {
                        c4 = 16;
                        c3 = c4;
                        str = "template";
                        break;
                    }
                    str = "template";
                    c3 = 65535;
                    break;
                default:
                    str = "template";
                    c3 = 65535;
                    break;
            }
            String[] strArr4 = b.x;
            l lVar = b0.J;
            switch (c3) {
                case 0:
                    uVar.d(s0Var, bVar);
                    return true;
                case 1:
                    if (!bVar.o(l)) {
                        bVar.k(this);
                        bVar.J(l);
                        return bVar.H(o0Var);
                    }
                    bVar.l(l);
                    if (!bVar.i(l)) {
                        bVar.k(this);
                    }
                    bVar.F(l);
                    return true;
                case 2:
                    bVar.k(this);
                    bVar.J("br");
                    return false;
                case 3:
                case 4:
                    if (!bVar.p(l)) {
                        bVar.k(this);
                        return false;
                    }
                    bVar.l(l);
                    if (!bVar.i(l)) {
                        bVar.k(this);
                    }
                    bVar.F(l);
                    return true;
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                    if (!bVar.r(strArr, strArr4, null)) {
                        bVar.k(this);
                        return false;
                    }
                    bVar.l(l);
                    if (!bVar.i(l)) {
                        bVar.k(this);
                    }
                    for (int size2 = bVar.e.size() - 1; size2 >= 0; size2--) {
                        ca1.j E = bVar.E();
                        if (ba1.h.c(E.u.t, strArr) && "http://www.w3.org/1999/xhtml".equals(E.u.r)) {
                            break;
                        }
                    }
                    break;
                case 11:
                    String[] strArr5 = bVar.w;
                    strArr5[0] = l;
                    if (!bVar.r(strArr5, strArr4, b.A)) {
                        bVar.k(this);
                        return false;
                    }
                    bVar.l(l);
                    if (!bVar.i(l)) {
                        bVar.k(this);
                    }
                    bVar.F(l);
                    return true;
                case '\f':
                    if (!bVar.p("body")) {
                        bVar.k(this);
                        return false;
                    }
                    if (bVar.D(strArr3)) {
                        bVar.k(this);
                    }
                    bVar.n("body");
                    bVar.l = lVar;
                    return true;
                case '\r':
                    if (bVar.B(str)) {
                        if (!bVar.p(l)) {
                            bVar.k(this);
                            return false;
                        }
                        bVar.m(false);
                        if (!bVar.i(l)) {
                            bVar.k(this);
                        }
                        bVar.F(l);
                        return true;
                    }
                    ca1.j jVar5 = bVar.p;
                    bVar.p = null;
                    if (jVar5 == null || !bVar.p(l)) {
                        bVar.k(this);
                        return false;
                    }
                    bVar.m(false);
                    if (!bVar.i(l)) {
                        bVar.k(this);
                    }
                    bVar.N(jVar5);
                    return true;
                case 14:
                    if (!bVar.B("body")) {
                        bVar.k(this);
                        return false;
                    }
                    if (bVar.D(strArr3)) {
                        bVar.k(this);
                    }
                    bVar.l = lVar;
                    return bVar.H(s0Var);
                case 15:
                case 16:
                    return e(s0Var, bVar);
                default:
                    if (ba1.h.c(l, a0.q)) {
                        String str2 = o0Var.e;
                        if (bVar.h().u.t.equals(str2)) {
                            if (!b.C(bVar.q, bVar.h())) {
                                bVar.E();
                                return true;
                            }
                        }
                        int i = 0;
                        while (true) {
                            if (i >= 8) {
                                break;
                            } else {
                                int i2 = i + 1;
                                for (int size3 = bVar.q.size() - 1; size3 >= 0; size3--) {
                                    jVar3 = (ca1.j) bVar.q.get(size3);
                                    if (jVar3 == null) {
                                        jVar3 = null;
                                        if (jVar3 == null) {
                                            return e(s0Var, bVar);
                                        }
                                        if (!b.C(bVar.e, jVar3)) {
                                            bVar.k(this);
                                            bVar.M(jVar3);
                                            break;
                                        } else {
                                            if (!bVar.p(jVar3.u.t)) {
                                                bVar.k(this);
                                                return false;
                                            }
                                            if (bVar.h() != jVar3) {
                                                bVar.k(this);
                                            }
                                            ArrayList arrayList = bVar.e;
                                            int lastIndexOf = arrayList.lastIndexOf(jVar3);
                                            if (lastIndexOf != -1) {
                                                do {
                                                    lastIndexOf++;
                                                    if (lastIndexOf < arrayList.size()) {
                                                        jVar4 = (ca1.j) arrayList.get(lastIndexOf);
                                                    }
                                                } while (!b.A(jVar4));
                                                if (jVar4 != null) {
                                                    while (bVar.h() != jVar3) {
                                                        bVar.E();
                                                    }
                                                    bVar.E();
                                                    bVar.M(jVar3);
                                                    break;
                                                } else {
                                                    ca1.j a = bVar.a(jVar3);
                                                    if (a == null) {
                                                        bVar.k(this);
                                                        break;
                                                    } else {
                                                        int i3 = 0;
                                                        while (true) {
                                                            if (i3 >= bVar.q.size()) {
                                                                i3 = -1;
                                                            } else if (jVar3 != bVar.q.get(i3)) {
                                                                i3++;
                                                            }
                                                        }
                                                        ca1.j jVar6 = jVar4;
                                                        ca1.o oVar = jVar6;
                                                        int i4 = 0;
                                                        while (true) {
                                                            i4++;
                                                            jVar6 = !b.C(bVar.e, jVar6) ? jVar6.r : bVar.a(jVar6);
                                                            if (jVar6 != null && !jVar6.p("body")) {
                                                                if (jVar6 != jVar3) {
                                                                    if (i4 > 3 && b.C(bVar.q, jVar6)) {
                                                                        bVar.M(jVar6);
                                                                    } else if (!b.C(bVar.q, jVar6)) {
                                                                        bVar.N(jVar6);
                                                                    } else if (b.C(bVar.e, jVar6)) {
                                                                        String str3 = str2;
                                                                        int i5 = i2;
                                                                        ca1.j jVar7 = new ca1.j(bVar.i.d(jVar6.s(), jVar6.u.t, "http://www.w3.org/1999/xhtml", z), bVar.f, null);
                                                                        ArrayList arrayList2 = bVar.q;
                                                                        int lastIndexOf2 = arrayList2.lastIndexOf(jVar6);
                                                                        aa1.b.G(lastIndexOf2 != -1);
                                                                        arrayList2.set(lastIndexOf2, jVar7);
                                                                        ArrayList arrayList3 = bVar.e;
                                                                        int lastIndexOf3 = arrayList3.lastIndexOf(jVar6);
                                                                        aa1.b.G(lastIndexOf3 != -1);
                                                                        arrayList3.set(lastIndexOf3, jVar7);
                                                                        if (oVar == jVar4) {
                                                                            int i6 = 0;
                                                                            while (true) {
                                                                                if (i6 >= bVar.q.size()) {
                                                                                    i6 = -1;
                                                                                } else if (jVar7 != bVar.q.get(i6)) {
                                                                                    i6++;
                                                                                }
                                                                            }
                                                                            i3 = i6 + 1;
                                                                        }
                                                                        jVar7.D(oVar);
                                                                        jVar6 = jVar7;
                                                                        oVar = jVar6;
                                                                        str2 = str3;
                                                                        i2 = i5;
                                                                        i4 = i4;
                                                                        z = true;
                                                                    } else {
                                                                        bVar.k(this);
                                                                        bVar.M(jVar6);
                                                                    }
                                                                }
                                                            }
                                                            a.D(oVar);
                                                            ca1.j jVar8 = new ca1.j(jVar3.u, bVar.f, null);
                                                            ca1.b d = jVar8.d();
                                                            ca1.b d2 = jVar3.d();
                                                            d.getClass();
                                                            size = d2.size();
                                                            if (size != 0) {
                                                                d.b(d.r + size);
                                                                boolean z2 = d.r != 0;
                                                                androidx.datastore.preferences.protobuf.d dVar = new androidx.datastore.preferences.protobuf.d(d2);
                                                                while (dVar.hasNext()) {
                                                                    ca1.a aVar = (ca1.a) dVar.next();
                                                                    String str4 = aVar.r;
                                                                    if (z2) {
                                                                        String str5 = aVar.s;
                                                                        d.l(str4, str5 != null ? str5 : "");
                                                                        aVar.t = d;
                                                                    } else {
                                                                        String str6 = aVar.s;
                                                                        d.a(str4, str6 != null ? str6 : "");
                                                                    }
                                                                }
                                                            }
                                                            if (jVar4.v.size() != 0) {
                                                                unmodifiableList = ca1.o.t;
                                                            } else {
                                                                ArrayList arrayList4 = (ArrayList) jVar4.k();
                                                                ArrayList arrayList5 = new ArrayList(arrayList4.size());
                                                                arrayList5.addAll(arrayList4);
                                                                unmodifiableList = Collections.unmodifiableList(arrayList5);
                                                            }
                                                            it = unmodifiableList.iterator();
                                                            while (it.hasNext()) {
                                                                jVar8.D((ca1.o) it.next());
                                                            }
                                                            jVar4.D(jVar8);
                                                            bVar.M(jVar3);
                                                            bVar.b(jVar8);
                                                            bVar.q.add(i3, jVar8);
                                                            bVar.N(jVar3);
                                                            int lastIndexOf4 = bVar.e.lastIndexOf(jVar4);
                                                            aa1.b.G(lastIndexOf4 == -1);
                                                            bVar.e.add(lastIndexOf4 + 1, jVar8);
                                                            str2 = r16;
                                                            i = r17;
                                                            z = true;
                                                        }
                                                        String str7 = str2;
                                                        int i7 = i2;
                                                        a.D(oVar);
                                                        ca1.j jVar82 = new ca1.j(jVar3.u, bVar.f, null);
                                                        ca1.b d3 = jVar82.d();
                                                        ca1.b d22 = jVar3.d();
                                                        d3.getClass();
                                                        size = d22.size();
                                                        if (size != 0) {
                                                        }
                                                        if (jVar4.v.size() != 0) {
                                                        }
                                                        it = unmodifiableList.iterator();
                                                        while (it.hasNext()) {
                                                        }
                                                        jVar4.D(jVar82);
                                                        bVar.M(jVar3);
                                                        bVar.b(jVar82);
                                                        bVar.q.add(i3, jVar82);
                                                        bVar.N(jVar3);
                                                        int lastIndexOf42 = bVar.e.lastIndexOf(jVar4);
                                                        aa1.b.G(lastIndexOf42 == -1);
                                                        bVar.e.add(lastIndexOf42 + 1, jVar82);
                                                        str2 = str7;
                                                        i = i7;
                                                        z = true;
                                                    }
                                                }
                                            }
                                            jVar4 = null;
                                            if (jVar4 != null) {
                                            }
                                        }
                                    } else if (jVar3.u.t.equals(str2)) {
                                        if (jVar3 == null) {
                                        }
                                    }
                                }
                                jVar3 = null;
                                if (jVar3 == null) {
                                }
                            }
                        }
                    } else {
                        if (ba1.h.c(l, a0.o)) {
                            if (!bVar.p(l)) {
                                bVar.k(this);
                                return false;
                            }
                            bVar.m(false);
                            if (!bVar.i(l)) {
                                bVar.k(this);
                            }
                            bVar.F(l);
                            return true;
                        }
                        if (!ba1.h.c(l, strArr2)) {
                            return e(s0Var, bVar);
                        }
                        if (!bVar.p("name")) {
                            if (!bVar.p(l)) {
                                bVar.k(this);
                                return false;
                            }
                            bVar.m(false);
                            if (!bVar.i(l)) {
                                bVar.k(this);
                            }
                            bVar.F(l);
                            bVar.c();
                            return true;
                        }
                    }
                    break;
            }
        } else {
            p0 p0Var = (p0) s0Var;
            String l2 = p0Var.l();
            l2.getClass();
            switch (l2.hashCode()) {
                case -1644953643:
                    if (l2.equals("frameset")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1377687758:
                    if (l2.equals("button")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1191214428:
                    if (l2.equals("iframe")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1134665583:
                    if (l2.equals("keygen")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1010136971:
                    if (l2.equals("option")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1003243718:
                    if (l2.equals("textarea")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -906021636:
                    if (l2.equals("select")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -891985998:
                    if (l2.equals("strike")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -891980137:
                    if (l2.equals("strong")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -80773204:
                    if (l2.equals("optgroup")) {
                        c2 = '\t';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 97:
                    if (l2.equals("a")) {
                        c2 = '\n';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 98:
                    if (l2.equals("b")) {
                        c2 = 11;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 105:
                    if (l2.equals("i")) {
                        c2 = '\f';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (l2.equals("s")) {
                        c2 = '\r';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 117:
                    if (l2.equals("u")) {
                        c2 = 14;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3152:
                    if (l2.equals("br")) {
                        c2 = 15;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3200:
                    if (l2.equals("dd")) {
                        c2 = 16;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3216:
                    if (l2.equals("dt")) {
                        c2 = 17;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3240:
                    if (l2.equals("em")) {
                        c2 = 18;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3273:
                    if (l2.equals("h1")) {
                        c2 = 19;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3274:
                    if (l2.equals("h2")) {
                        c2 = 20;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3275:
                    if (l2.equals("h3")) {
                        c2 = 21;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3276:
                    if (l2.equals("h4")) {
                        c2 = 22;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3277:
                    if (l2.equals("h5")) {
                        c2 = 23;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3278:
                    if (l2.equals("h6")) {
                        c2 = 24;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3338:
                    if (l2.equals("hr")) {
                        c2 = 25;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3453:
                    if (l2.equals("li")) {
                        c2 = 26;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3632:
                    if (l2.equals("rb")) {
                        c2 = 27;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3646:
                    if (l2.equals("rp")) {
                        c2 = 28;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3650:
                    if (l2.equals("rt")) {
                        c2 = 29;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3712:
                    if (l2.equals("tt")) {
                        c2 = 30;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 97536:
                    if (l2.equals("big")) {
                        c2 = 31;
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104387:
                    if (l2.equals("img")) {
                        c2 = ' ';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111267:
                    if (l2.equals("pre")) {
                        c2 = '!';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 113249:
                    if (l2.equals("rtc")) {
                        c2 = '\"';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 114276:
                    if (l2.equals("svg")) {
                        c2 = '#';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 117511:
                    if (l2.equals("wbr")) {
                        c2 = '$';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 118811:
                    if (l2.equals("xmp")) {
                        c2 = '%';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3002509:
                    if (l2.equals("area")) {
                        c2 = '&';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029410:
                    if (l2.equals("body")) {
                        c2 = '\'';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3059181:
                    if (l2.equals("code")) {
                        c2 = '(';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3148879:
                    if (l2.equals("font")) {
                        c2 = ')';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3148996:
                    if (l2.equals("form")) {
                        c2 = '*';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3213227:
                    if (l2.equals("html")) {
                        c2 = '+';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3344136:
                    if (l2.equals("math")) {
                        c2 = ',';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3386833:
                    if (l2.equals("nobr")) {
                        c2 = '-';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536714:
                    if (l2.equals("span")) {
                        c2 = '.';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 96620249:
                    if (l2.equals("embed")) {
                        c2 = '/';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 100313435:
                    if (l2.equals("image")) {
                        c2 = '0';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 100358090:
                    if (l2.equals("input")) {
                        c2 = '1';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109548807:
                    if (l2.equals("small")) {
                        c2 = '2';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 110115790:
                    if (l2.equals("table")) {
                        c2 = '3';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 181975684:
                    if (l2.equals("listing")) {
                        c2 = '4';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1973234167:
                    if (l2.equals("plaintext")) {
                        c2 = '5';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2115613112:
                    if (l2.equals("noembed")) {
                        c2 = '6';
                        c = c2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String[] strArr6 = a0.j;
            z zVar = b0.z;
            switch (c) {
                case 0:
                    bVar.k(this);
                    ArrayList arrayList6 = bVar.e;
                    if (arrayList6.size() == 1) {
                        return false;
                    }
                    if ((arrayList6.size() > 2 && !((ca1.j) arrayList6.get(1)).p("body")) || !bVar.u) {
                        return false;
                    }
                    ca1.j jVar9 = (ca1.j) arrayList6.get(1);
                    ca1.j jVar10 = jVar9.r;
                    if (jVar10 != null && jVar10 != null) {
                        jVar10.B(jVar9);
                    }
                    while (arrayList6.size() > 1) {
                        arrayList6.remove(arrayList6.size() - 1);
                    }
                    bVar.w(p0Var);
                    bVar.l = b0.K;
                    return true;
                case 1:
                    if (bVar.o("button")) {
                        bVar.k(this);
                        bVar.I("button");
                        bVar.H(p0Var);
                        return true;
                    }
                    bVar.L();
                    bVar.w(p0Var);
                    bVar.u = false;
                    return true;
                case 2:
                    bVar.u = false;
                    b0.b(p0Var, bVar, bVar.P(p0Var).e());
                    return true;
                case 3:
                case 15:
                case ' ':
                case '$':
                case '&':
                case '/':
                    bVar.L();
                    bVar.x(p0Var);
                    bVar.u = false;
                    return true;
                case 4:
                case '\t':
                    if (bVar.i("option")) {
                        bVar.I("option");
                    }
                    bVar.L();
                    bVar.w(p0Var);
                    return true;
                case 5:
                    bVar.u = false;
                    b0.b(p0Var, bVar, bVar.P(p0Var).e());
                    return true;
                case 6:
                    bVar.L();
                    bVar.w(p0Var);
                    bVar.u = false;
                    if (p0Var.f) {
                        return true;
                    }
                    b0 b0Var = bVar.l;
                    if (b0Var.equals(zVar) || b0Var.equals(b0.B) || b0Var.equals(b0.D) || b0Var.equals(b0.E) || b0Var.equals(b0.F)) {
                        bVar.l = b0.H;
                        return true;
                    }
                    bVar.l = b0.G;
                    return true;
                case 7:
                case '\b':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 18:
                case 30:
                case 31:
                case '(':
                case ')':
                case '2':
                    bVar.L();
                    ca1.j w = bVar.w(p0Var);
                    bVar.b(w);
                    bVar.q.add(w);
                    return true;
                case '\n':
                    int size4 = bVar.q.size();
                    do {
                        size4--;
                        if (size4 < 0 || (jVar2 = (ca1.j) bVar.q.get(size4)) == null) {
                            jVar = null;
                        }
                        if (jVar != null) {
                            bVar.k(this);
                            bVar.I("a");
                            ca1.j n = bVar.n("a");
                            if (n != null) {
                                bVar.M(n);
                                bVar.N(n);
                            }
                        }
                        bVar.L();
                        ca1.j w2 = bVar.w(p0Var);
                        bVar.b(w2);
                        bVar.q.add(w2);
                        return true;
                    } while (!jVar2.p("a"));
                    jVar = jVar2;
                    if (jVar != null) {
                    }
                    bVar.L();
                    ca1.j w22 = bVar.w(p0Var);
                    bVar.b(w22);
                    bVar.q.add(w22);
                    return true;
                case 16:
                case 17:
                    bVar.u = false;
                    ArrayList arrayList7 = bVar.e;
                    int size5 = arrayList7.size();
                    int i8 = size5 - 1;
                    int i9 = i8 >= 24 ? size5 - 25 : 0;
                    while (true) {
                        if (i8 >= i9) {
                            ca1.j jVar11 = (ca1.j) arrayList7.get(i8);
                            if (ba1.h.c(jVar11.u.t, a0.k)) {
                                bVar.I(jVar11.u.t);
                            } else if (!b.A(jVar11) || ba1.h.c(jVar11.u.t, strArr6)) {
                                i8--;
                            }
                        }
                    }
                    if (bVar.o("p")) {
                        bVar.I("p");
                    }
                    bVar.w(p0Var);
                    return true;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    if (bVar.o("p")) {
                        bVar.I("p");
                    }
                    if (ba1.h.c(bVar.h().u.t, strArr)) {
                        bVar.k(this);
                        bVar.E();
                    }
                    bVar.w(p0Var);
                    return true;
                case 25:
                    if (bVar.o("p")) {
                        bVar.I("p");
                    }
                    bVar.x(p0Var);
                    bVar.u = false;
                    return true;
                case 26:
                    bVar.u = false;
                    ArrayList arrayList8 = bVar.e;
                    int size6 = arrayList8.size() - 1;
                    while (true) {
                        if (size6 > 0) {
                            ca1.j jVar12 = (ca1.j) arrayList8.get(size6);
                            if (jVar12.p("li")) {
                                bVar.I("li");
                            } else if (!b.A(jVar12) || ba1.h.c(jVar12.u.t, strArr6)) {
                                size6--;
                            }
                        }
                    }
                    if (bVar.o("p")) {
                        bVar.I("p");
                    }
                    bVar.w(p0Var);
                    return true;
                case 27:
                case '\"':
                    if (bVar.p("ruby")) {
                        bVar.m(false);
                        if (!bVar.i("ruby")) {
                            bVar.k(this);
                        }
                    }
                    bVar.w(p0Var);
                    return true;
                case 28:
                case 29:
                    if (bVar.p("ruby")) {
                        bVar.l("rtc");
                        if (!bVar.i("rtc") && !bVar.i("ruby")) {
                            bVar.k(this);
                        }
                    }
                    bVar.w(p0Var);
                    return true;
                case '!':
                case '4':
                    if (bVar.o("p")) {
                        bVar.I("p");
                    }
                    bVar.w(p0Var);
                    bVar.b.i0("\n");
                    bVar.u = false;
                    return true;
                case '#':
                    bVar.L();
                    bVar.y(p0Var, "http://www.w3.org/2000/svg");
                    return true;
                case '%':
                    if (bVar.o("p")) {
                        bVar.I("p");
                    }
                    bVar.L();
                    bVar.u = false;
                    b0.b(p0Var, bVar, bVar.P(p0Var).e());
                    return true;
                case '\'':
                    bVar.k(this);
                    ArrayList arrayList9 = bVar.e;
                    if (arrayList9.size() == 1) {
                        return false;
                    }
                    if ((arrayList9.size() > 2 && !((ca1.j) arrayList9.get(1)).p("body")) || bVar.B("template")) {
                        return false;
                    }
                    bVar.u = false;
                    ca1.j n2 = bVar.n("body");
                    if (n2 != null) {
                        b0.c(p0Var, n2);
                        return true;
                    }
                    break;
                case '*':
                    if (bVar.p != null && !bVar.B("template")) {
                        bVar.k(this);
                        return false;
                    }
                    if (bVar.o("p")) {
                        bVar.l("p");
                        if (!"p".equals(bVar.h().u.t)) {
                            bVar.k(bVar.l);
                        }
                        bVar.F("p");
                    }
                    bVar.z(p0Var, true, true);
                    return true;
                case '+':
                    bVar.k(this);
                    if (bVar.B("template")) {
                        return false;
                    }
                    if (bVar.e.size() > 0) {
                        b0.c(p0Var, (ca1.j) bVar.e.get(0));
                        return true;
                    }
                    break;
                case ',':
                    bVar.L();
                    bVar.y(p0Var, "http://www.w3.org/1998/Math/MathML");
                    return true;
                case '-':
                    bVar.L();
                    if (bVar.p("nobr")) {
                        bVar.k(this);
                        bVar.I("nobr");
                        bVar.L();
                    }
                    ca1.j w3 = bVar.w(p0Var);
                    bVar.b(w3);
                    bVar.q.add(w3);
                    return true;
                case '.':
                    bVar.L();
                    bVar.w(p0Var);
                    return true;
                case '0':
                    if (bVar.n("svg") == null) {
                        p0Var.j("img");
                        return bVar.H(p0Var);
                    }
                    bVar.w(p0Var);
                    return true;
                case '1':
                    bVar.L();
                    if (bVar.x(p0Var).b("type").equalsIgnoreCase("hidden")) {
                        return true;
                    }
                    bVar.u = false;
                    return true;
                case '3':
                    if (bVar.d.C != 2 && bVar.o("p")) {
                        bVar.I("p");
                    }
                    bVar.w(p0Var);
                    bVar.u = false;
                    bVar.l = zVar;
                    return true;
                case '5':
                    if (bVar.o("p")) {
                        bVar.I("p");
                    }
                    bVar.w(p0Var);
                    bVar.c.o(l3.x);
                    return true;
                case '6':
                    b0.b(p0Var, bVar, bVar.P(p0Var).e());
                    return true;
                default:
                    g0 P = bVar.P(p0Var);
                    l3 e = P.e();
                    if (e != null) {
                        b0.b(p0Var, bVar, e);
                        return true;
                    }
                    if ((P.u & 1) == 0) {
                        bVar.w(p0Var);
                        return true;
                    }
                    if (ba1.h.c(l2, a0.h)) {
                        if (bVar.o("p")) {
                            bVar.I("p");
                        }
                        bVar.w(p0Var);
                        return true;
                    }
                    if (ba1.h.c(l2, a0.g)) {
                        return uVar.d(s0Var, bVar);
                    }
                    if (ba1.h.c(l2, strArr2)) {
                        bVar.L();
                        bVar.w(p0Var);
                        bVar.q.add(null);
                        bVar.u = false;
                        return true;
                    }
                    if (ba1.h.c(l2, a0.m)) {
                        bVar.x(p0Var);
                        return true;
                    }
                    if (ba1.h.c(l2, a0.n)) {
                        bVar.k(this);
                        return false;
                    }
                    bVar.L();
                    bVar.w(p0Var);
                    return true;
            }
        }
        return true;
    }

    public final boolean e(s0 s0Var, b bVar) {
        s0Var.getClass();
        String str = ((o0) s0Var).e;
        ArrayList arrayList = bVar.e;
        if (bVar.n(str) == null) {
            bVar.k(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ca1.j jVar = (ca1.j) arrayList.get(size);
            if (jVar.p(str)) {
                bVar.l(str);
                if (!bVar.i(str)) {
                    bVar.k(this);
                }
                bVar.F(str);
                return true;
            }
            if (b.A(jVar)) {
                bVar.k(this);
                return false;
            }
        }
        return true;
    }
}

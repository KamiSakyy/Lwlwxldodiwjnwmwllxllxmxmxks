package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public s(int i) {
        this.b = i;
    }

    public static m c(w51.r rVar, List list) {
        w wVar = w.s;
        i21.a.W(2, "FN", list);
        n c = ((t) rVar.t).c(rVar, (n) list.get(0));
        n c2 = ((t) rVar.t).c(rVar, (n) list.get(1));
        if (!(c2 instanceof d)) {
            throw new IllegalArgumentException(f1.e.g("FN requires an ArrayValue of parameter names found ", c2.getClass().getCanonicalName()));
        }
        List m = ((d) c2).m();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new m(c.k(), (ArrayList) m, arrayList, rVar);
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.k());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.k());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            return ((q) nVar).r.compareTo(((q) nVar2).r) < 0;
        }
        double doubleValue = nVar.d().doubleValue();
        double doubleValue2 = nVar2.d().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static n e(v vVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return g(vVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof r) || (nVar instanceof l)) {
                return true;
            }
            return nVar instanceof g ? (Double.isNaN(nVar.d().doubleValue()) || Double.isNaN(nVar2.d().doubleValue()) || nVar.d().doubleValue() != nVar2.d().doubleValue()) ? false : true : nVar instanceof q ? nVar.k().equals(nVar2.k()) : nVar instanceof e ? nVar.a().equals(nVar2.a()) : nVar == nVar2;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z = nVar instanceof g;
        if (z && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.d()));
        }
        boolean z2 = nVar instanceof q;
        if ((!z2 || !(nVar2 instanceof g)) && !(nVar instanceof e)) {
            if (nVar2 instanceof e) {
                return f(nVar, new g(nVar2.d()));
            }
            if ((z2 || z) && (nVar2 instanceof j)) {
                return f(nVar, new q(nVar2.k()));
            }
            if ((nVar instanceof j) && ((nVar2 instanceof q) || (nVar2 instanceof g))) {
                return f(new q(nVar.k()), nVar2);
            }
            return false;
        }
        return f(new g(nVar.d()), nVar2);
    }

    public static n g(v vVar, Iterator it, n nVar) {
        w51.r Z;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.a) {
                    case 0:
                        Z = vVar.b.Z();
                        String str = vVar.c;
                        Z.c0(str, nVar2);
                        ((HashMap) Z.v).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        Z = vVar.b.Z();
                        Z.c0(vVar.c, nVar2);
                        break;
                    default:
                        Z = vVar.b;
                        Z.c0(vVar.c, nVar2);
                        break;
                }
                n X = Z.X((d) nVar);
                if (X instanceof f) {
                    f fVar = (f) X;
                    String str2 = fVar.s;
                    if ("break".equals(str2)) {
                        return n.b;
                    }
                    if ("return".equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.b;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.k());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.k());
        }
        return (((nVar instanceof q) && (nVar2 instanceof q)) || !(Double.isNaN(nVar.d().doubleValue()) || Double.isNaN(nVar2.d().doubleValue()))) && !d(nVar2, nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x090a, code lost:
    
        if ("return".equals(r4) != false) goto L301;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(String str, w51.r rVar, ArrayList arrayList) {
        boolean f;
        boolean f2;
        f fVar;
        n qVar;
        n c;
        n c2;
        String str2;
        int i = 0;
        switch (this.b) {
            case 0:
                w wVar = w.s;
                switch (i21.a.Z(str).ordinal()) {
                    case 4:
                        i21.a.U(2, "BITWISE_AND", arrayList);
                        return new g(Double.valueOf(i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()) & i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue())));
                    case 5:
                        i21.a.U(2, "BITWISE_LEFT_SHIFT", arrayList);
                        return new g(Double.valueOf(i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()) << ((int) (i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()) & 31))));
                    case 6:
                        i21.a.U(1, "BITWISE_NOT", arrayList);
                        return new g(Double.valueOf(~i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue())));
                    case 7:
                        i21.a.U(2, "BITWISE_OR", arrayList);
                        return new g(Double.valueOf(i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()) | i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue())));
                    case 8:
                        i21.a.U(2, "BITWISE_RIGHT_SHIFT", arrayList);
                        return new g(Double.valueOf(i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()) >> ((int) (i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()) & 31))));
                    case 9:
                        i21.a.U(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                        return new g(Double.valueOf((i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()) & 4294967295L) >>> ((int) (i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()) & 31))));
                    case 10:
                        i21.a.U(2, "BITWISE_XOR", arrayList);
                        return new g(Double.valueOf(i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()) ^ i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                i21.a.U(2, i21.a.Z(str).name(), arrayList);
                n c3 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                n c4 = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                int ordinal = i21.a.Z(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        f2 = f(c3, c4);
                    } else if (ordinal == 42) {
                        f = d(c3, c4);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                f = d(c4, c3);
                                break;
                            case 38:
                                f = h(c4, c3);
                                break;
                            case 39:
                                f = i21.a.a0(c3, c4);
                                break;
                            case 40:
                                f2 = i21.a.a0(c3, c4);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        f = h(c3, c4);
                    }
                    f = !f2;
                } else {
                    f = f(c3, c4);
                }
                return f ? n.g : n.h;
            case 2:
                w wVar2 = w.s;
                int ordinal2 = i21.a.Z(str).ordinal();
                if (ordinal2 == 2) {
                    i21.a.U(3, "APPLY", arrayList);
                    n nVar = (n) arrayList.get(0);
                    t tVar = (t) rVar.t;
                    t tVar2 = (t) rVar.t;
                    n c5 = tVar.c(rVar, nVar);
                    String k = tVar2.c(rVar, (n) arrayList.get(1)).k();
                    n c6 = tVar2.c(rVar, (n) arrayList.get(2));
                    if (!(c6 instanceof d)) {
                        throw new IllegalArgumentException(f1.e.g("Function arguments for Apply are not a list found ", c6.getClass().getCanonicalName()));
                    }
                    if (k.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return c5.g(k, rVar, (ArrayList) ((d) c6).m());
                }
                if (ordinal2 == 15) {
                    i21.a.U(0, "BREAK", arrayList);
                    return n.d;
                }
                if (ordinal2 == 25) {
                    return c(rVar, arrayList);
                }
                if (ordinal2 == 41) {
                    i21.a.W(2, "IF", arrayList);
                    n nVar2 = (n) arrayList.get(0);
                    t tVar3 = (t) rVar.t;
                    t tVar4 = (t) rVar.t;
                    n c7 = tVar3.c(rVar, nVar2);
                    n c8 = tVar4.c(rVar, (n) arrayList.get(1));
                    n c9 = arrayList.size() > 2 ? tVar4.c(rVar, (n) arrayList.get(2)) : null;
                    n nVar3 = n.b;
                    n X = c7.a().booleanValue() ? rVar.X((d) c8) : c9 != null ? rVar.X((d) c9) : nVar3;
                    return true != (X instanceof f) ? nVar3 : X;
                }
                if (ordinal2 == 54) {
                    return new d(arrayList);
                }
                if (ordinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return n.f;
                    }
                    i21.a.U(1, "RETURN", arrayList);
                    return new f("return", ((t) rVar.t).c(rVar, (n) arrayList.get(0)));
                }
                if (ordinal2 != 19) {
                    if (ordinal2 == 20) {
                        i21.a.W(2, "DEFINE_FUNCTION", arrayList);
                        m c10 = c(rVar, arrayList);
                        String str3 = c10.r;
                        if (str3 == null) {
                            rVar.b0("", c10);
                            return c10;
                        }
                        rVar.b0(str3, c10);
                        return c10;
                    }
                    if (ordinal2 == 60) {
                        i21.a.U(3, "SWITCH", arrayList);
                        n nVar4 = (n) arrayList.get(0);
                        t tVar5 = (t) rVar.t;
                        t tVar6 = (t) rVar.t;
                        n c12 = tVar5.c(rVar, nVar4);
                        n c13 = tVar6.c(rVar, (n) arrayList.get(1));
                        n c14 = tVar6.c(rVar, (n) arrayList.get(2));
                        if (!(c13 instanceof d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(c14 instanceof d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        d dVar = (d) c13;
                        d dVar2 = (d) c14;
                        boolean z = false;
                        for (int i2 = 0; i2 < dVar.o(); i2++) {
                            if (z || c12.equals(tVar6.c(rVar, dVar.p(i2)))) {
                                n c15 = tVar6.c(rVar, dVar2.p(i2));
                                if (c15 instanceof f) {
                                    return ((f) c15).s.equals("break") ? n.b : c15;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (dVar.o() + 1 == dVar2.o()) {
                            n c16 = tVar6.c(rVar, dVar2.p(dVar.o()));
                            if (c16 instanceof f) {
                                String str4 = ((f) c16).s;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return c16;
                                }
                            }
                        }
                        return n.b;
                    }
                    if (ordinal2 == 61) {
                        i21.a.U(3, "TERNARY", arrayList);
                        n nVar5 = (n) arrayList.get(0);
                        t tVar7 = (t) rVar.t;
                        t tVar8 = (t) rVar.t;
                        return tVar7.c(rVar, nVar5).a().booleanValue() ? tVar8.c(rVar, (n) arrayList.get(1)) : tVar8.c(rVar, (n) arrayList.get(2));
                    }
                    switch (ordinal2) {
                        case 11:
                            return rVar.Z().X(new d(arrayList));
                        case 12:
                            i21.a.U(0, "BREAK", arrayList);
                            return n.e;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return n.b;
                }
                n c17 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                return c17 instanceof d ? rVar.X((d) c17) : n.b;
            case 3:
                w wVar3 = w.s;
                int ordinal3 = i21.a.Z(str).ordinal();
                if (ordinal3 == 1) {
                    i21.a.U(2, "AND", arrayList);
                    n c18 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                    if (c18.a().booleanValue()) {
                        return ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                    }
                    return c18;
                }
                if (ordinal3 == 47) {
                    i21.a.U(1, "NOT", arrayList);
                    return new e(Boolean.valueOf(!((t) rVar.t).c(rVar, (n) arrayList.get(0)).a().booleanValue()));
                }
                if (ordinal3 != 50) {
                    b(str);
                    throw null;
                }
                i21.a.U(2, "OR", arrayList);
                n c19 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                if (c19.a().booleanValue()) {
                    return c19;
                }
                return ((t) rVar.t).c(rVar, (n) arrayList.get(1));
            case 4:
                w wVar4 = w.s;
                int ordinal4 = i21.a.Z(str).ordinal();
                if (ordinal4 == 65) {
                    i21.a.U(4, "WHILE", arrayList);
                    n nVar6 = (n) arrayList.get(0);
                    n nVar7 = (n) arrayList.get(1);
                    n nVar8 = (n) arrayList.get(2);
                    n nVar9 = (n) arrayList.get(3);
                    t tVar9 = (t) rVar.t;
                    t tVar10 = (t) rVar.t;
                    n c20 = tVar9.c(rVar, nVar9);
                    if (tVar10.c(rVar, nVar8).a().booleanValue()) {
                        n X2 = rVar.X((d) c20);
                        if (X2 instanceof f) {
                            fVar = (f) X2;
                            String str5 = fVar.s;
                            if ("break".equals(str5)) {
                                return n.b;
                            }
                            break;
                        }
                    }
                    while (tVar10.c(rVar, nVar6).a().booleanValue()) {
                        n X3 = rVar.X((d) c20);
                        if (X3 instanceof f) {
                            fVar = (f) X3;
                            String str6 = fVar.s;
                            if ("break".equals(str6)) {
                                return n.b;
                            }
                            if ("return".equals(str6)) {
                            }
                        }
                        rVar.V(nVar7);
                    }
                    return n.b;
                }
                switch (ordinal4) {
                    case 26:
                        i21.a.U(3, "FOR_IN", arrayList);
                        if (!(arrayList.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                        }
                        String k2 = ((n) arrayList.get(0)).k();
                        n c22 = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                        n c23 = ((t) rVar.t).c(rVar, (n) arrayList.get(2));
                        Iterator b = c22.b();
                        if (b != null) {
                            while (b.hasNext()) {
                                rVar.c0(k2, (n) b.next());
                                n X4 = rVar.X((d) c23);
                                if (X4 instanceof f) {
                                    fVar = (f) X4;
                                    String str7 = fVar.s;
                                    if ("break".equals(str7)) {
                                        return n.b;
                                    }
                                    if ("return".equals(str7)) {
                                        break;
                                    }
                                }
                            }
                        }
                        return n.b;
                    case 27:
                        i21.a.U(3, "FOR_IN_CONST", arrayList);
                        if (arrayList.get(0) instanceof q) {
                            return g(new v(rVar, ((n) arrayList.get(0)).k(), 0), ((t) rVar.t).c(rVar, (n) arrayList.get(1)).b(), ((t) rVar.t).c(rVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    case 28:
                        i21.a.U(3, "FOR_IN_LET", arrayList);
                        if (!(arrayList.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                        }
                        String k3 = ((n) arrayList.get(0)).k();
                        n c24 = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                        n c25 = ((t) rVar.t).c(rVar, (n) arrayList.get(2));
                        Iterator b2 = c24.b();
                        if (b2 != null) {
                            while (b2.hasNext()) {
                                n nVar10 = (n) b2.next();
                                w51.r Z = rVar.Z();
                                Z.c0(k3, nVar10);
                                n X5 = Z.X((d) c25);
                                if (X5 instanceof f) {
                                    fVar = (f) X5;
                                    String str8 = fVar.s;
                                    if ("break".equals(str8)) {
                                        return n.b;
                                    }
                                    if ("return".equals(str8)) {
                                        break;
                                    }
                                }
                            }
                        }
                        return n.b;
                    case 29:
                        i21.a.U(4, "FOR_LET", arrayList);
                        n nVar11 = (n) arrayList.get(0);
                        t tVar11 = (t) rVar.t;
                        t tVar12 = (t) rVar.t;
                        n c26 = tVar11.c(rVar, nVar11);
                        if (!(c26 instanceof d)) {
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        }
                        d dVar3 = (d) c26;
                        n nVar12 = (n) arrayList.get(1);
                        n nVar13 = (n) arrayList.get(2);
                        n c27 = tVar12.c(rVar, (n) arrayList.get(3));
                        w51.r Z2 = rVar.Z();
                        for (int i3 = 0; i3 < dVar3.o(); i3++) {
                            String k4 = dVar3.p(i3).k();
                            Z2.b0(k4, rVar.d0(k4));
                        }
                        while (tVar12.c(rVar, nVar12).a().booleanValue()) {
                            n X6 = rVar.X((d) c27);
                            if (X6 instanceof f) {
                                f fVar2 = (f) X6;
                                String str9 = fVar2.s;
                                if ("break".equals(str9)) {
                                    return n.b;
                                }
                                if ("return".equals(str9)) {
                                    return fVar2;
                                }
                            }
                            w51.r Z3 = rVar.Z();
                            for (int i4 = 0; i4 < dVar3.o(); i4++) {
                                String k5 = dVar3.p(i4).k();
                                Z3.b0(k5, Z2.d0(k5));
                            }
                            Z3.V(nVar13);
                            Z2 = Z3;
                        }
                        return n.b;
                    case 30:
                        i21.a.U(3, "FOR_OF", arrayList);
                        if (arrayList.get(0) instanceof q) {
                            return e(new v(rVar, ((n) arrayList.get(0)).k(), 2), ((t) rVar.t).c(rVar, (n) arrayList.get(1)), ((t) rVar.t).c(rVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    case 31:
                        i21.a.U(3, "FOR_OF_CONST", arrayList);
                        if (arrayList.get(0) instanceof q) {
                            return e(new v(rVar, ((n) arrayList.get(0)).k(), 0), ((t) rVar.t).c(rVar, (n) arrayList.get(1)), ((t) rVar.t).c(rVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    case 32:
                        i21.a.U(3, "FOR_OF_LET", arrayList);
                        if (arrayList.get(0) instanceof q) {
                            return e(new v(rVar, ((n) arrayList.get(0)).k(), 1), ((t) rVar.t).c(rVar, (n) arrayList.get(1)), ((t) rVar.t).c(rVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    default:
                        b(str);
                        throw null;
                }
                return fVar;
            case 5:
                w wVar5 = w.s;
                int ordinal5 = i21.a.Z(str).ordinal();
                if (ordinal5 == 0) {
                    i21.a.U(2, "ADD", arrayList);
                    n c28 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                    n c29 = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                    qVar = ((c28 instanceof j) || (c28 instanceof q) || (c29 instanceof j) || (c29 instanceof q)) ? new q(String.valueOf(c28.k()).concat(String.valueOf(c29.k()))) : new g(Double.valueOf(c29.d().doubleValue() + c28.d().doubleValue()));
                } else {
                    if (ordinal5 == 21) {
                        i21.a.U(2, "DIVIDE", arrayList);
                        return new g(Double.valueOf(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue() / ((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()));
                    }
                    if (ordinal5 == 59) {
                        i21.a.U(2, "SUBTRACT", arrayList);
                        return new g(Double.valueOf(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue() + (-((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue())));
                    }
                    if (ordinal5 == 52 || ordinal5 == 53) {
                        i21.a.U(2, str, arrayList);
                        n c30 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                        rVar.V((n) arrayList.get(1));
                        return c30;
                    }
                    if (ordinal5 == 55 || ordinal5 == 56) {
                        i21.a.U(1, str, arrayList);
                        return ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                    }
                    switch (ordinal5) {
                        case 44:
                            i21.a.U(2, "MODULUS", arrayList);
                            return new g(Double.valueOf(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue() % ((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()));
                        case 45:
                            i21.a.U(2, "MULTIPLY", arrayList);
                            qVar = new g(Double.valueOf(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue() * ((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()));
                            break;
                        case 46:
                            i21.a.U(1, "NEGATE", arrayList);
                            return new g(Double.valueOf(-((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return qVar;
            case 6:
                if (str == null || str.isEmpty() || !rVar.a0(str)) {
                    throw new IllegalArgumentException(f1.e.g("Command not found: ", str));
                }
                n d0 = rVar.d0(str);
                if (d0 instanceof h) {
                    return ((h) d0).c(rVar, arrayList);
                }
                throw new IllegalArgumentException(f1.e.z("Function ", str, " is not defined"));
            default:
                w wVar6 = w.s;
                int ordinal6 = i21.a.Z(str).ordinal();
                if (ordinal6 != 3) {
                    if (ordinal6 == 14) {
                        i21.a.W(2, "CONST", arrayList);
                        if (arrayList.size() % 2 != 0) {
                            throw new IllegalArgumentException(no.a.k("CONST requires an even number of arguments, found ", arrayList.size()));
                        }
                        while (i < arrayList.size() - 1) {
                            n c32 = ((t) rVar.t).c(rVar, (n) arrayList.get(i));
                            if (!(c32 instanceof q)) {
                                throw new IllegalArgumentException(f1.e.g("Expected string for const name. got ", c32.getClass().getCanonicalName()));
                            }
                            String str10 = ((q) c32).r;
                            rVar.c0(str10, ((t) rVar.t).c(rVar, (n) arrayList.get(i + 1)));
                            ((HashMap) rVar.v).put(str10, Boolean.TRUE);
                            i += 2;
                        }
                        return n.b;
                    }
                    if (ordinal6 == 24) {
                        i21.a.W(1, "EXPRESSION_LIST", arrayList);
                        n nVar14 = n.b;
                        while (i < arrayList.size()) {
                            nVar14 = ((t) rVar.t).c(rVar, (n) arrayList.get(i));
                            if (nVar14 instanceof f) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            i++;
                        }
                        return nVar14;
                    }
                    if (ordinal6 == 33) {
                        i21.a.U(1, "GET", arrayList);
                        n c33 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                        if (c33 instanceof q) {
                            return rVar.d0(((q) c33).r);
                        }
                        throw new IllegalArgumentException(f1.e.g("Expected string for get var. got ", c33.getClass().getCanonicalName()));
                    }
                    if (ordinal6 == 49) {
                        i21.a.U(0, "NULL", arrayList);
                        return n.c;
                    }
                    if (ordinal6 == 58) {
                        i21.a.U(3, "SET_PROPERTY", arrayList);
                        n nVar15 = (n) arrayList.get(0);
                        t tVar13 = (t) rVar.t;
                        t tVar14 = (t) rVar.t;
                        n c34 = tVar13.c(rVar, nVar15);
                        n c35 = tVar14.c(rVar, (n) arrayList.get(1));
                        c2 = tVar14.c(rVar, (n) arrayList.get(2));
                        if (c34 == n.b || c34 == n.c) {
                            throw new IllegalStateException(a0.s0.k("Can't set property ", c35.k(), " of ", c34.k()));
                        }
                        if ((c34 instanceof d) && (c35 instanceof g)) {
                            ((d) c34).q(((g) c35).r.intValue(), c2);
                        } else if (c34 instanceof j) {
                            ((j) c34).f(c35.k(), c2);
                        }
                    } else {
                        if (ordinal6 == 17) {
                            if (arrayList.isEmpty()) {
                                return new d();
                            }
                            d dVar4 = new d();
                            int size = arrayList.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj = arrayList.get(i5);
                                i5++;
                                n c36 = ((t) rVar.t).c(rVar, (n) obj);
                                if (c36 instanceof f) {
                                    throw new IllegalStateException("Failed to evaluate array element");
                                }
                                dVar4.q(i, c36);
                                i++;
                            }
                            return dVar4;
                        }
                        if (ordinal6 == 18) {
                            if (arrayList.isEmpty()) {
                                return new k();
                            }
                            if (arrayList.size() % 2 != 0) {
                                throw new IllegalArgumentException(no.a.k("CREATE_OBJECT requires an even number of arguments, found ", arrayList.size()));
                            }
                            k kVar = new k();
                            while (i < arrayList.size() - 1) {
                                n c37 = ((t) rVar.t).c(rVar, (n) arrayList.get(i));
                                n c38 = ((t) rVar.t).c(rVar, (n) arrayList.get(i + 1));
                                if ((c37 instanceof f) || (c38 instanceof f)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                kVar.f(c37.k(), c38);
                                i += 2;
                            }
                            return kVar;
                        }
                        if (ordinal6 == 35 || ordinal6 == 36) {
                            i21.a.U(2, "GET_PROPERTY", arrayList);
                            n c39 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                            n c40 = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                            if ((c39 instanceof d) && i21.a.Y(c40)) {
                                return ((d) c39).p(c40.d().intValue());
                            }
                            if (c39 instanceof j) {
                                return ((j) c39).e(c40.k());
                            }
                            if (c39 instanceof q) {
                                if ("length".equals(c40.k())) {
                                    c2 = new g(Double.valueOf(((q) c39).r.length()));
                                } else if (i21.a.Y(c40)) {
                                    double doubleValue = c40.d().doubleValue();
                                    String str11 = ((q) c39).r;
                                    if (doubleValue < str11.length()) {
                                        c = new q(String.valueOf(str11.charAt(c40.d().intValue())));
                                    }
                                }
                            }
                            return n.b;
                        }
                        switch (ordinal6) {
                            case 62:
                                i21.a.U(1, "TYPEOF", arrayList);
                                n c42 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                                if (c42 instanceof r) {
                                    str2 = "undefined";
                                } else if (c42 instanceof e) {
                                    str2 = "boolean";
                                } else if (c42 instanceof g) {
                                    str2 = "number";
                                } else if (c42 instanceof q) {
                                    str2 = "string";
                                } else if (c42 instanceof m) {
                                    str2 = "function";
                                } else {
                                    if ((c42 instanceof o) || (c42 instanceof f)) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", c42));
                                    }
                                    str2 = "object";
                                }
                                c2 = new q(str2);
                                break;
                            case 63:
                                i21.a.U(0, "UNDEFINED", arrayList);
                                return n.b;
                            case 64:
                                i21.a.W(1, "VAR", arrayList);
                                int size2 = arrayList.size();
                                while (i < size2) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    n c43 = ((t) rVar.t).c(rVar, (n) obj2);
                                    if (!(c43 instanceof q)) {
                                        throw new IllegalArgumentException(f1.e.g("Expected string for var name. got ", c43.getClass().getCanonicalName()));
                                    }
                                    rVar.c0(((q) c43).r, n.b);
                                }
                                return n.b;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    return c2;
                }
                i21.a.U(2, "ASSIGN", arrayList);
                n c44 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                if (!(c44 instanceof q)) {
                    throw new IllegalArgumentException(f1.e.g("Expected string for assign var. got ", c44.getClass().getCanonicalName()));
                }
                String str12 = ((q) c44).r;
                if (!rVar.a0(str12)) {
                    throw new IllegalArgumentException(f1.e.g("Attempting to assign undefined value ", str12));
                }
                c = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                rVar.b0(str12, c);
                return c;
        }
    }

    public final void b(String str) {
        if (!this.a.contains(i21.a.Z(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}

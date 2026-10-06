package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements Iterable, n, j {
    public final TreeMap r;
    public final TreeMap s;

    public d() {
        this.r = new TreeMap();
        this.s = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new c(this, this.r.keySet().iterator(), this.s.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        TreeMap treeMap = this.r;
        return treeMap.size() == 1 ? p(0).d() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n e(String str) {
        n nVar;
        return "length".equals(str) ? new g(Double.valueOf(o())) : (!i(str) || (nVar = (n) this.s.get(str)) == null) ? n.b : nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (o() != dVar.o()) {
            return false;
        }
        TreeMap treeMap = this.r;
        if (treeMap.isEmpty()) {
            return dVar.r.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!p(intValue).equals(dVar.p(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void f(String str, n nVar) {
        TreeMap treeMap = this.s;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e5, code lost:
    
        if (b31.b.m0(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).o() == r7.o()) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f7  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n g(String str, w51.r rVar, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        w51.r rVar2;
        String str5;
        Object obj2;
        d dVar;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d;
        double d2;
        String str6;
        double d3;
        String str7 = "toString";
        String str8 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str3 = "filter";
            str4 = "sort";
            if (str4.equals(str)) {
                str2 = "lastIndexOf";
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str8.equals(str)) {
                    str2 = "lastIndexOf";
                    str8 = str8;
                } else {
                    str8 = str8;
                    if (str7.equals(str)) {
                        str2 = "lastIndexOf";
                        str7 = str7;
                    } else {
                        str7 = str7;
                        if (!"unshift".equals(str)) {
                            return j.j(this, new q(str), rVar, arrayList);
                        }
                        str2 = "lastIndexOf";
                        str5 = "forEach";
                        obj = "unshift";
                        dVar = this;
                        rVar2 = rVar;
                    }
                }
            }
            obj = "unshift";
            rVar2 = rVar;
            arrayList2 = arrayList;
            str5 = "forEach";
            dVar = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = dVar.r;
            n nVar = n.b;
            TreeMap treeMap3 = treeMap2;
            h hVar = null;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        i21.a.U(0, str9, arrayList2);
                        return new q(dVar.u(","));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1354795244:
                    if (str.equals("concat")) {
                        d dVar2 = (d) dVar.l();
                        if (!arrayList2.isEmpty()) {
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj3 = arrayList2.get(i);
                                i++;
                                n c = ((t) rVar2.t).c(rVar2, (n) obj3);
                                if (c instanceof f) {
                                    throw new IllegalStateException("Failed evaluation of arguments");
                                }
                                int o = dVar2.o();
                                if (c instanceof d) {
                                    d dVar3 = (d) c;
                                    Iterator n = dVar3.n();
                                    while (n.hasNext()) {
                                        Integer num = (Integer) n.next();
                                        dVar2.q(num.intValue() + o, dVar3.p(num.intValue()));
                                    }
                                } else {
                                    dVar2.q(o, c);
                                }
                            }
                        }
                        return dVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        i21.a.U(1, str10, arrayList2);
                        n c2 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                        if (!(c2 instanceof m)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (treeMap3.size() == 0) {
                            return new d();
                        }
                        d dVar4 = (d) dVar.l();
                        d m0 = b31.b.m0(dVar, rVar2, (m) c2, null, Boolean.TRUE);
                        d dVar5 = new d();
                        Iterator n2 = m0.n();
                        while (n2.hasNext()) {
                            dVar5.q(dVar5.o(), dVar4.p(((Integer) n2.next()).intValue()));
                        }
                        return dVar5;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -934873754:
                    if (str.equals(obj2)) {
                        return b31.b.l0(dVar, rVar2, arrayList2, true);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new d();
                        }
                        n nVar2 = (n) arrayList2.get(0);
                        t tVar = (t) rVar2.t;
                        t tVar2 = (t) rVar2.t;
                        int c0 = (int) i21.a.c0(tVar.c(rVar2, nVar2).d().doubleValue());
                        if (c0 < 0) {
                            c0 = Math.max(0, dVar.o() + c0);
                        } else if (c0 > dVar.o()) {
                            c0 = dVar.o();
                        }
                        int o2 = dVar.o();
                        d dVar6 = new d();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) i21.a.c0(tVar2.c(rVar2, (n) arrayList2.get(1)).d().doubleValue()));
                            if (max > 0) {
                                for (int i2 = c0; i2 < Math.min(o2, c0 + max); i2++) {
                                    dVar6.q(dVar6.o(), dVar.p(c0));
                                    dVar.t(c0);
                                }
                            }
                            int i3 = 2;
                            if (arrayList2.size() > 2) {
                                while (i3 < arrayList2.size()) {
                                    n c3 = tVar2.c(rVar2, (n) arrayList2.get(i3));
                                    if (c3 instanceof f) {
                                        throw new IllegalArgumentException("Failed to parse elements to add");
                                    }
                                    int i4 = (c0 + i3) - 2;
                                    if (i4 < 0) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 21);
                                        sb.append("Invalid value index: ");
                                        sb.append(i4);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    if (i4 >= dVar.o()) {
                                        dVar.q(i4, c3);
                                        treeMap = treeMap3;
                                    } else {
                                        int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                        while (intValue >= i4) {
                                            Integer valueOf2 = Integer.valueOf(intValue);
                                            TreeMap treeMap4 = treeMap3;
                                            n nVar3 = (n) treeMap4.get(valueOf2);
                                            if (nVar3 != null) {
                                                dVar.q(intValue + 1, nVar3);
                                                treeMap4.remove(valueOf2);
                                            }
                                            intValue--;
                                            treeMap3 = treeMap4;
                                        }
                                        treeMap = treeMap3;
                                        dVar.q(i4, c3);
                                    }
                                    i3++;
                                    treeMap3 = treeMap;
                                }
                            }
                        } else {
                            while (c0 < o2) {
                                dVar6.q(dVar6.o(), dVar.p(c0));
                                dVar.q(c0, null);
                                c0++;
                            }
                        }
                        return dVar6;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        i21.a.U(1, str11, arrayList2);
                        n c4 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                        if (!(c4 instanceof m)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (treeMap3.size() != 0) {
                            b31.b.m0(dVar, rVar2, (m) c4, null, null);
                            return nVar;
                        }
                        return nVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        i21.a.X(2, str12, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            nVar = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                        }
                        n nVar4 = nVar;
                        int o3 = dVar.o() - 1;
                        if (arrayList2.size() > 1) {
                            n c5 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(1));
                            d2 = Double.isNaN(c5.d().doubleValue()) ? dVar.o() - 1 : i21.a.c0(c5.d().doubleValue());
                            d = 0.0d;
                            if (d2 < 0.0d) {
                                d2 += dVar.o();
                            }
                        } else {
                            d = 0.0d;
                            d2 = o3;
                        }
                        if (d2 < d) {
                            return new g(valueOf);
                        }
                        for (int min = (int) Math.min(dVar.o(), d2); min >= 0; min--) {
                            if (dVar.s(min) && i21.a.a0(dVar.p(min), nVar4)) {
                                return new g(Double.valueOf(min));
                            }
                        }
                        return new g(valueOf);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            d dVar7 = new d();
                            int size2 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj4 = arrayList2.get(i5);
                                i5++;
                                n c6 = ((t) rVar2.t).c(rVar2, (n) obj4);
                                if (c6 instanceof f) {
                                    throw new IllegalStateException("Argument evaluation failed");
                                }
                                dVar7.q(dVar7.o(), c6);
                            }
                            int o4 = dVar7.o();
                            Iterator n3 = dVar.n();
                            while (n3.hasNext()) {
                                Integer num2 = (Integer) n3.next();
                                dVar7.q(num2.intValue() + o4, dVar.p(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator n4 = dVar7.n();
                            while (n4.hasNext()) {
                                Integer num3 = (Integer) n4.next();
                                dVar.q(num3.intValue(), dVar7.p(num3.intValue()));
                            }
                        }
                        return new g(Double.valueOf(dVar.o()));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 107868:
                    if (str.equals("map")) {
                        i21.a.U(1, "map", arrayList2);
                        n c7 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                        if (c7 instanceof m) {
                            return dVar.o() == 0 ? new d() : b31.b.m0(dVar, rVar2, (m) c7, null, null);
                        }
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 111185:
                    if (str.equals("pop")) {
                        i21.a.U(0, "pop", arrayList2);
                        int o5 = dVar.o();
                        if (o5 != 0) {
                            int i6 = o5 - 1;
                            n p = dVar.p(i6);
                            dVar.t(i6);
                            return p;
                        }
                        return nVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3267882:
                    if (str.equals("join")) {
                        i21.a.X(1, "join", arrayList2);
                        if (dVar.o() == 0) {
                            return n.i;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = ",";
                        } else {
                            n c8 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                            str6 = ((c8 instanceof l) || (c8 instanceof r)) ? "" : c8.k();
                        }
                        return new q(dVar.u(str6));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            int i7 = 0;
                            while (i7 < size3) {
                                Object obj5 = arrayList2.get(i7);
                                i7++;
                                dVar.q(dVar.o(), ((t) rVar2.t).c(rVar2, (n) obj5));
                            }
                        }
                        return new g(Double.valueOf(dVar.o()));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3536116:
                    if (str.equals("some")) {
                        i21.a.U(1, "some", arrayList2);
                        n c9 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                        if (!(c9 instanceof h)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (dVar.o() != 0) {
                            h hVar2 = (h) c9;
                            Iterator n5 = dVar.n();
                            while (n5.hasNext()) {
                                int intValue2 = ((Integer) n5.next()).intValue();
                                if (dVar.s(intValue2) && hVar2.c(rVar2, Arrays.asList(dVar.p(intValue2), new g(Double.valueOf(intValue2)), dVar)).a().booleanValue()) {
                                    return n.g;
                                }
                            }
                        }
                        return n.h;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3536286:
                    if (str.equals(str4)) {
                        i21.a.X(1, str4, arrayList2);
                        if (dVar.o() >= 2) {
                            List m = dVar.m();
                            if (!arrayList2.isEmpty()) {
                                n c10 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                                if (!(c10 instanceof h)) {
                                    throw new IllegalArgumentException("Comparator should be a method");
                                }
                                hVar = (h) c10;
                            }
                            Collections.sort(m, new u(hVar, rVar2));
                            treeMap3.clear();
                            ArrayList arrayList3 = (ArrayList) m;
                            int size4 = arrayList3.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size4) {
                                Object obj6 = arrayList3.get(i8);
                                i8++;
                                dVar.q(i9, (n) obj6);
                                i9++;
                            }
                        }
                        return dVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 96891675:
                    if (str.equals("every")) {
                        i21.a.U(1, "every", arrayList2);
                        n c12 = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                        if (!(c12 instanceof m)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (dVar.o() != 0) {
                            break;
                        }
                        return n.g;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109407362:
                    if (str.equals("shift")) {
                        i21.a.U(0, "shift", arrayList2);
                        if (dVar.o() != 0) {
                            n p2 = dVar.p(0);
                            dVar.t(0);
                            return p2;
                        }
                        return nVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109526418:
                    if (str.equals("slice")) {
                        i21.a.X(2, "slice", arrayList2);
                        if (arrayList2.isEmpty()) {
                            return dVar.l();
                        }
                        double o6 = dVar.o();
                        double c02 = i21.a.c0(((t) rVar2.t).c(rVar2, (n) arrayList2.get(0)).d().doubleValue());
                        double max2 = c02 < 0.0d ? Math.max(c02 + o6, 0.0d) : Math.min(c02, o6);
                        if (arrayList2.size() == 2) {
                            double c03 = i21.a.c0(((t) rVar2.t).c(rVar2, (n) arrayList2.get(1)).d().doubleValue());
                            o6 = c03 < 0.0d ? Math.max(o6 + c03, 0.0d) : Math.min(o6, c03);
                        }
                        d dVar8 = new d();
                        for (int i10 = (int) max2; i10 < o6; i10++) {
                            dVar8.q(dVar8.o(), dVar.p(i10));
                        }
                        return dVar8;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return b31.b.l0(dVar, rVar2, arrayList2, false);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1099846370:
                    if (str.equals("reverse")) {
                        i21.a.U(0, "reverse", arrayList2);
                        int o7 = dVar.o();
                        if (o7 != 0) {
                            for (int i12 = 0; i12 < o7 / 2; i12++) {
                                if (dVar.s(i12)) {
                                    n p3 = dVar.p(i12);
                                    dVar.q(i12, null);
                                    int i13 = (o7 - 1) - i12;
                                    if (dVar.s(i13)) {
                                        dVar.q(i12, dVar.p(i13));
                                    }
                                    dVar.q(i13, p3);
                                }
                            }
                        }
                        return dVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1943291465:
                    if (str.equals("indexOf")) {
                        i21.a.X(2, "indexOf", arrayList2);
                        if (!arrayList2.isEmpty()) {
                            nVar = ((t) rVar2.t).c(rVar2, (n) arrayList2.get(0));
                        }
                        n nVar5 = nVar;
                        if (arrayList2.size() > 1) {
                            double c04 = i21.a.c0(((t) rVar2.t).c(rVar2, (n) arrayList2.get(1)).d().doubleValue());
                            if (c04 >= dVar.o()) {
                                return new g(valueOf);
                            }
                            d3 = c04 < 0.0d ? dVar.o() + c04 : c04;
                        } else {
                            d3 = 0.0d;
                        }
                        Iterator n6 = dVar.n();
                        while (n6.hasNext()) {
                            int intValue3 = ((Integer) n6.next()).intValue();
                            double d4 = intValue3;
                            if (d4 >= d3 && i21.a.a0(dVar.p(intValue3), nVar5)) {
                                return new g(Double.valueOf(d4));
                            }
                        }
                        return new g(valueOf);
                    }
                    throw new IllegalArgumentException("Command not supported");
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "lastIndexOf";
        str3 = "filter";
        obj = "unshift";
        str4 = "sort";
        rVar2 = rVar;
        str5 = "forEach";
        obj2 = "reduce";
        dVar = this;
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = dVar.r;
        n nVar6 = n.b;
        TreeMap treeMap32 = treeMap22;
        h hVar3 = null;
        switch (hashCode) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
    }

    public final int hashCode() {
        return this.r.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean i(String str) {
        return "length".equals(str) || this.s.containsKey(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c4.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String k() {
        return u(",");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        d dVar = new d();
        for (Map.Entry entry : this.r.entrySet()) {
            boolean z = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.r;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).l());
            }
        }
        return dVar;
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(o());
        for (int i = 0; i < o(); i++) {
            arrayList.add(p(i));
        }
        return arrayList;
    }

    public final Iterator n() {
        return this.r.keySet().iterator();
    }

    public final int o() {
        TreeMap treeMap = this.r;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n p(int i) {
        n nVar;
        if (i < o()) {
            return (!s(i) || (nVar = (n) this.r.get(Integer.valueOf(i))) == null) ? n.b : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void q(int i, n nVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.r;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), nVar);
        }
    }

    public final boolean s(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.r;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void t(int i) {
        TreeMap treeMap = this.r;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            treeMap.put(valueOf, n.b);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            n nVar = (n) treeMap.get(valueOf2);
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i - 1), nVar);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String toString() {
        return u(",");
    }

    public final String u(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.r.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= o()) {
                    break;
                }
                n p = p(i);
                sb.append(str2);
                if (!(p instanceof r) && !(p instanceof l)) {
                    sb.append(p.k());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public d(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                q(i, (n) list.get(i));
            }
        }
    }

    public d(Object... a) {
    }
    public Object ordinal() { return null; }
    public Object a = null;
    public Object b = null;
    public Object c = null;
}

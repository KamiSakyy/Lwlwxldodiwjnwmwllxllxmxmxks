package com.google.android.gms.measurement.internal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlinx.serialization.KSerializer;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public int a;
    public String b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Serializable f;

    public c(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public static Boolean e(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean f(String str, com.google.android.gms.internal.measurement.w1 w1Var, s0 s0Var) {
        List u;
        c21.uShadow.g(w1Var);
        if (str != null && w1Var.p() && w1Var.x() != 1 && (w1Var.x() != 7 ? w1Var.q() : w1Var.v() != 0)) {
            int x = w1Var.x();
            boolean t = w1Var.t();
            String r = (t || x == 2 || x == 7) ? w1Var.r() : w1Var.r().toUpperCase(Locale.ENGLISH);
            if (w1Var.v() == 0) {
                u = null;
            } else {
                u = w1Var.u();
                if (!t) {
                    ArrayList arrayList = new ArrayList(u.size());
                    Iterator it = u.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    u = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = x == 2 ? r : null;
            if (x != 7 ? r != null : u != null && !u.isEmpty()) {
                if (!t && x != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (x - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != t ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (s0Var != null) {
                                    s0Var.A.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(r));
                    case 3:
                        return Boolean.valueOf(str.endsWith(r));
                    case 4:
                        return Boolean.valueOf(str.contains(r));
                    case 5:
                        return Boolean.valueOf(str.equals(r));
                    case 6:
                        if (u != null) {
                            return Boolean.valueOf(u.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean g(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.t1 t1Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        c21.uShadow.g(t1Var);
        if (t1Var.p()) {
            if (t1Var.z() != 1 && (t1Var.z() != 5 ? t1Var.s() : t1Var.u() && t1Var.w())) {
                int z = t1Var.z();
                try {
                    if (t1Var.z() == 5) {
                        if (w0.f0(t1Var.v()) && w0.f0(t1Var.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(t1Var.v());
                            bigDecimal4 = new BigDecimal(t1Var.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (w0.f0(t1Var.t())) {
                        bigDecimal2 = new BigDecimal(t1Var.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (z != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = z - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public x6.w a() {
        x6.w a = ((x6.o0) this.c).a();
        a7.n nVar = a.s;
        a.u = null;
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            String str = (String) entry.getKey();
            x6.j jVar = (x6.j) entry.getValue();
            k71.k.g(str, "argumentName");
            k71.k.g(jVar, "argument");
            nVar.getClass();
            ((LinkedHashMap) nVar.f).put(str, jVar);
        }
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a.a((x6.t) obj);
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.f).entrySet()) {
            a.k(((Number) entry2.getKey()).intValue(), (x6.i) entry2.getValue());
        }
        String str2 = this.b;
        if (str2 != null) {
            a.l(str2);
        }
        int i2 = this.a;
        if (i2 != -1) {
            nVar.b = i2;
            nVar.a = null;
        }
        return a;
    }

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public c(x6.o0 o0Var, r71.b bVar, Map map) {
        k71.k.g(map, "typeMap");
        int b = bVar != null ? b7.i.b(b91.g.J(bVar)) : -1;
        int i = 0;
        if (bVar != null) {
            g81.b J = b91.g.J(bVar);
            if (J instanceof g81.b) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                r71.b n = w8.s.n(J.getDescriptor());
                throw new IllegalArgumentException(com.github.rudroid.copilot.h1.p(sb, n != null ? ((k71.e) n).c() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            w51.r rVar = new w51.r((KSerializer) J);
            androidx.compose.runtime.b1 b1Var = new androidx.compose.runtime.b1(2, rVar);
            int f = J.getDescriptor().f();
            for (int i2 = 0; i2 < f; i2++) {
                String g = J.getDescriptor().g(i2);
                x6.l0 a = b7.i.a(J.getDescriptor().j(i2), map);
                if (a == null) {
                    throw new IllegalArgumentException(b7.i.i(g, J.getDescriptor().j(i2).a(), J.getDescriptor().a(), map.toString()));
                }
                b1Var.f(Integer.valueOf(i2), g, a);
            }
            r2 = ((String) rVar.s) + ((String) rVar.u) + ((String) rVar.v);
        }
        this.c = o0Var;
        this.a = b;
        this.b = r2;
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
        this.f = new LinkedHashMap();
        if (bVar != null) {
            ArrayList c = b7.i.c(b91.g.J(bVar), map);
            int size = c.size();
            while (i < size) {
                Object obj = c.get(i);
                i++;
                x6.h hVar = (x6.h) obj;
                ((LinkedHashMap) this.d).put(hVar.a, hVar.b);
            }
        }
    }
    public Object A(Object p1, Object p2, Object p3) { return null; }
    public static Object k(Object p1, Object p2) { return null; }
    public Object s(Object p1, Object p2, Object p3) { return null; }
    public Object t(Object p1) { return null; }
    public Object z(Object p1, Object p2, Object p3) { return null; }
    public Object A(int p1, int p2, Object p3) { return null; }
    public Object r(Object p1) { return null; }
    public Object s(int p1, int p2, Object p3) { return null; }
    public Object t(int p1) { return null; }
    public Object z(Object p1, int p2, Object p3) { return null; }
    public Object z(Object p1, int p2, Object p3) { return null; }
    public Object z(Object p1, int p2, Object p3) { return null; }
    public Object z(Object p1, int p2, Object p3) { return null; }
}

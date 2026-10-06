package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.r7;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends c {
    public final /* synthetic */ int g;
    public final /* synthetic */ d h;
    public g5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, String str, int i, g5 g5Var, int i2) {
        super(str, i);
        this.g = i2;
        this.h = dVar;
        this.i = g5Var;
    }

    @Override // com.google.android.gms.measurement.internal.c
    public final int b() {
        switch (this.g) {
            case 0:
                return ((com.google.android.gms.internal.measurement.o1) this.i).q();
            default:
                return ((com.google.android.gms.internal.measurement.v1) this.i).q();
        }
    }

    @Override // com.google.android.gms.measurement.internal.c
    public final boolean c() {
        switch (this.g) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // com.google.android.gms.measurement.internal.c
    public final boolean d() {
        switch (this.g) {
            case 0:
                return ((com.google.android.gms.internal.measurement.o1) this.i).v();
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c9 A[EDGE_INSN: B:160:0x03c9->B:52:0x03c9 BREAK  A[LOOP:3: B:132:0x0246->B:157:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(Long l, Long l2, com.google.android.gms.internal.measurement.b3 b3Var, long j, t tVar, boolean z) {
        Object r16 = null;
        boolean z2;
        s0 s0Var;
        Boolean bool;
        Boolean bool2;
        long j2;
        Boolean bool3;
        Boolean bool4;
        int i;
        r7.a();
        d dVar = this.h;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) dVar).s;
        h hVar = o1Var.u;
        s0 s0Var2 = o1Var.w;
        n0 n0Var = o1Var.A;
        b0 b0Var = c0.F0;
        String str = this.b;
        boolean J = hVar.J(str, b0Var);
        com.google.android.gms.internal.measurement.o1 o1Var2 = (com.google.android.gms.internal.measurement.o1) this.i;
        long j3 = o1Var2.A() ? tVar.e : j;
        o1.m(s0Var2);
        q0 q0Var = s0Var2.F;
        q0 q0Var2 = s0Var2.A;
        boolean isLoggable = Log.isLoggable(s0Var2.J(), 2);
        int i2 = this.a;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        Boolean bool5 = null;
        if (isLoggable) {
            o1.m(s0Var2);
            q0Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), o1Var2.p() ? Integer.valueOf(o1Var2.q()) : null, n0Var.a(o1Var2.r()));
            o1.m(s0Var2);
            w0 w0Var = dVar.t.x;
            o4.U(w0Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (o1Var2.p()) {
                i = 0;
                w0.R(sb, 0, "filter_id", Integer.valueOf(o1Var2.q()));
            } else {
                i = 0;
            }
            w0.R(sb, i, "event_name", ((o1) ((androidx.compose.foundation.lazy.layout.s0) w0Var).s).A.a(o1Var2.r()));
            String N = w0.N(o1Var2.x(), o1Var2.y(), o1Var2.A());
            if (!N.isEmpty()) {
                w0.R(sb, 0, "filter_type", N);
            }
            if (o1Var2.v()) {
                w0.S(sb, 1, "event_count_filter", o1Var2.w());
            }
            if (o1Var2.t() > 0) {
                sb.append("  filters {\n");
                Iterator it = o1Var2.s().iterator();
                while (it.hasNext()) {
                    w0Var.K(sb, 2, (com.google.android.gms.internal.measurement.q1) it.next());
                }
            }
            w0.L(1, sb);
            sb.append("}\n}\n");
            q0Var.b(sb.toString(), "Filter definition");
        }
        if (!o1Var2.p() || o1Var2.q() > 256) {
            o1.m(s0Var2);
            q0Var2.c("Invalid event filter ID. appId, id", s0.H(str), String.valueOf(o1Var2.p() ? Integer.valueOf(o1Var2.q()) : null));
            return false;
        }
        boolean z3 = o1Var2.x() || o1Var2.y() || o1Var2.A();
        if (z && !z3) {
            o1.m(s0Var2);
            q0Var.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i2), o1Var2.p() ? Integer.valueOf(o1Var2.q()) : null);
            return true;
        }
        String s = b3Var.s();
        if (o1Var2.v()) {
            try {
                bool4 = c.g(new BigDecimal(j3), o1Var2.w(), 0.0d);
            } catch (NumberFormatException unused) {
                bool4 = null;
            }
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    bool5 = Boolean.FALSE;
                }
            }
            z2 = J;
            s0Var = s0Var2;
            o1.m(s0Var);
            q0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
            if (bool5 == null) {
                return false;
            }
            Boolean bool6 = Boolean.TRUE;
            this.c = bool6;
            if (!bool5.booleanValue()) {
                return true;
            }
            this.d = bool6;
            if (!z3 || !b3Var.t()) {
                return true;
            }
            Long valueOf = Long.valueOf(b3Var.u());
            if (o1Var2.y()) {
                if (z2 && o1Var2.v()) {
                    valueOf = l;
                }
                this.f = valueOf;
                return true;
            }
            if (z2 && o1Var2.v()) {
                valueOf = l2;
            }
            this.e = valueOf;
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = o1Var2.s().iterator();
        while (true) {
            if (!it2.hasNext()) {
                x.e eVar = new x.e(0);
                Iterator it3 = b3Var.p().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = o1Var2.s().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z2 = J;
                                s0Var = s0Var2;
                                bool5 = Boolean.TRUE;
                                break;
                            }
                            com.google.android.gms.internal.measurement.q1 q1Var = (com.google.android.gms.internal.measurement.q1) it4.next();
                            boolean z4 = q1Var.t() && q1Var.u();
                            String w = q1Var.w();
                            if (w.isEmpty()) {
                                o1.m(s0Var2);
                                q0Var2.b(n0Var.a(s), "Event has empty param name. event");
                                break;
                            }
                            Object obj = eVar.get(w);
                            if (obj instanceof Long) {
                                if (!q1Var.r()) {
                                    o1.m(s0Var2);
                                    q0Var2.c("No number filter for long param. event, param", n0Var.a(s), n0Var.b(w));
                                    break;
                                }
                                try {
                                    bool = c.g(new BigDecimal(((Long) obj).longValue()), q1Var.s(), 0.0d);
                                } catch (NumberFormatException unused2) {
                                    bool = null;
                                }
                                if (bool == null) {
                                    break;
                                }
                                if (bool.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!q1Var.r()) {
                                    o1.m(s0Var2);
                                    q0Var2.c("No number filter for double param. event, param", n0Var.a(s), n0Var.b(w));
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                try {
                                    bool2 = c.g(new BigDecimal(doubleValue), q1Var.s(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused3) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!q1Var.p()) {
                                    if (!q1Var.r()) {
                                        z2 = J;
                                        s0Var = s0Var2;
                                        o1.m(s0Var);
                                        q0Var2.c("No filter for String param. event, param", n0Var.a(s), n0Var.b(w));
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!w0.f0(str2)) {
                                        z2 = J;
                                        s0Var = s0Var2;
                                        o1.m(s0Var);
                                        q0Var2.c("Invalid param value for number filter. event, param", n0Var.a(s), n0Var.b(w));
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.t1 s2 = q1Var.s();
                                    if (w0.f0(str2)) {
                                        try {
                                            z2 = J;
                                            s0Var = s0Var2;
                                            j2 = 0;
                                        } catch (NumberFormatException unused4) {
                                            z2 = J;
                                            s0Var = s0Var2;
                                            j2 = 0;
                                        }
                                        try {
                                            bool3 = c.g(new BigDecimal(str2), s2, 0.0d);
                                        } catch (NumberFormatException unused5) {
                                            bool3 = null;
                                            if (bool3 == null) {
                                            }
                                            o1.m(s0Var);
                                            q0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
                                            if (bool5 == null) {
                                            }
                                        }
                                        if (bool3 == null) {
                                            break;
                                        }
                                        if (bool3.booleanValue() == z4) {
                                            bool5 = Boolean.FALSE;
                                            break;
                                        }
                                        s0Var2 = s0Var;
                                        J = z2;
                                    } else {
                                        z2 = J;
                                        s0Var = s0Var2;
                                        bool3 = null;
                                    }
                                } else {
                                    com.google.android.gms.internal.measurement.w1 q = q1Var.q();
                                    o1.m(s0Var2);
                                    bool3 = c.f((String) obj, q, s0Var2);
                                    z2 = J;
                                    s0Var = s0Var2;
                                }
                                j2 = 0;
                                if (bool3 == null) {
                                }
                            } else {
                                z2 = J;
                                s0Var = s0Var2;
                                if (obj == null) {
                                    o1.m(s0Var);
                                    q0Var.c("Missing param for filter. event, param", n0Var.a(s), n0Var.b(w));
                                    bool5 = Boolean.FALSE;
                                } else {
                                    o1.m(s0Var);
                                    q0Var2.c("Unknown param type. event, param", n0Var.a(s), n0Var.b(w));
                                }
                            }
                        }
                    } else {
                        com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it3.next();
                        if (hashSet.contains(e3Var.q())) {
                            if (!e3Var.t()) {
                                if (!e3Var.x()) {
                                    if (!e3Var.r()) {
                                        o1.m(s0Var2);
                                        q0Var2.c("Unknown value for param. event, param", n0Var.a(s), n0Var.b(e3Var.q()));
                                        break;
                                    }
                                    eVar.put(e3Var.q(), e3Var.s());
                                } else {
                                    eVar.put(e3Var.q(), e3Var.x() ? Double.valueOf(e3Var.y()) : null);
                                }
                            } else {
                                eVar.put(e3Var.q(), e3Var.t() ? Long.valueOf(e3Var.u()) : null);
                            }
                        }
                    }
                }
            } else {
                com.google.android.gms.internal.measurement.q1 q1Var2 = (com.google.android.gms.internal.measurement.q1) it2.next();
                if (q1Var2.w().isEmpty()) {
                    o1.m(s0Var2);
                    q0Var2.b(n0Var.a(s), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(q1Var2.w());
            }
        }
        o1.m(s0Var);
        q0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
        if (bool5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(Long l, Long l2, com.google.android.gms.internal.measurement.s3 s3Var, boolean z) {
        boolean z2;
        Boolean e;
        Boolean g;
        Boolean bool;
        Boolean bool2;
        r7.a();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.h).s;
        h hVar = o1Var.u;
        n0 n0Var = o1Var.A;
        s0 s0Var = o1Var.w;
        boolean J = hVar.J(this.b, c0.D0);
        com.google.android.gms.internal.measurement.v1 v1Var = (com.google.android.gms.internal.measurement.v1) this.i;
        boolean t = v1Var.t();
        boolean u = v1Var.u();
        boolean w = v1Var.w();
        boolean z3 = t || u || w;
        if (z && !z3) {
            o1.m(s0Var);
            s0Var.F.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.a), v1Var.p() ? Integer.valueOf(v1Var.q()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.q1 s = v1Var.s();
        boolean u2 = s.u();
        if (!s3Var.u()) {
            z2 = w;
            if (!s3Var.y()) {
                if (s3Var.s()) {
                    if (s.p()) {
                        String t2 = s3Var.t();
                        com.google.android.gms.internal.measurement.w1 q = s.q();
                        o1.m(s0Var);
                        e = c.e(c.f(t2, q, s0Var), u2);
                    } else if (!s.r()) {
                        o1.m(s0Var);
                        s0Var.A.b(n0Var.c(s3Var.r()), "No string or number filter defined. property");
                    } else if (w0.f0(s3Var.t())) {
                        String t3 = s3Var.t();
                        com.google.android.gms.internal.measurement.t1 s2 = s.s();
                        if (w0.f0(t3)) {
                            try {
                                g = c.g(new BigDecimal(t3), s2, 0.0d);
                            } catch (NumberFormatException unused) {
                            }
                            e = c.e(g, u2);
                        }
                        g = null;
                        e = c.e(g, u2);
                    } else {
                        o1.m(s0Var);
                        s0Var.A.c("Invalid user property value for Numeric number filter. property, value", n0Var.c(s3Var.r()), s3Var.t());
                    }
                    o1.m(s0Var);
                    s0Var.F.b(e != null ? "null" : e, "Property filter result");
                    if (e != null) {
                    }
                } else {
                    o1.m(s0Var);
                    s0Var.A.b(n0Var.c(s3Var.r()), "User property has no value, property");
                }
                e = null;
                o1.m(s0Var);
                s0Var.F.b(e != null ? "null" : e, "Property filter result");
                if (e != null) {
                }
            } else if (s.r()) {
                double z4 = s3Var.z();
                try {
                    bool = c.g(new BigDecimal(z4), s.s(), Math.ulp(z4));
                } catch (NumberFormatException unused2) {
                    bool = null;
                }
                e = c.e(bool, u2);
                o1.m(s0Var);
                s0Var.F.b(e != null ? "null" : e, "Property filter result");
                if (e != null) {
                }
            } else {
                o1.m(s0Var);
                s0Var.A.b(n0Var.c(s3Var.r()), "No number filter for double property. property");
                e = null;
                o1.m(s0Var);
                s0Var.F.b(e != null ? "null" : e, "Property filter result");
                if (e != null) {
                }
            }
        } else {
            if (!s.r()) {
                o1.m(s0Var);
                s0Var.A.b(n0Var.c(s3Var.r()), "No number filter for long property. property");
                z2 = w;
                e = null;
                o1.m(s0Var);
                s0Var.F.b(e != null ? "null" : e, "Property filter result");
                if (e != null) {
                    return false;
                }
                this.c = Boolean.TRUE;
                if (!z2 || e.booleanValue()) {
                    if (!z || v1Var.t()) {
                        this.d = e;
                    }
                    if (e.booleanValue() && z3 && s3Var.p()) {
                        long q2 = s3Var.q();
                        if (l != null) {
                            q2 = l.longValue();
                        }
                        if (J && v1Var.t() && !v1Var.u() && l2 != null) {
                            q2 = l2.longValue();
                        }
                        if (v1Var.u()) {
                            this.f = Long.valueOf(q2);
                        } else {
                            this.e = Long.valueOf(q2);
                        }
                    }
                }
                return true;
            }
            z2 = w;
            try {
                bool2 = c.g(new BigDecimal(s3Var.v()), s.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                bool2 = null;
            }
            e = c.e(bool2, u2);
            o1.m(s0Var);
            s0Var.F.b(e != null ? "null" : e, "Property filter result");
            if (e != null) {
            }
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d {
        public d() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b {
        public b() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class t {
        public t() {
        }
    }
}

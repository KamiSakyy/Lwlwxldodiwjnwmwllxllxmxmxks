package com.github.rudroid.uitoolkit.markdown.components;

import ch.a;
import d2.o0;
import g3.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final t71.n a = new t71.n("@[a-zA-Z0-9-]+");

    public static final void a(k91.a aVar, g3.d dVar, String str, ch.e eVar, boolean z, boolean z2) {
        String obj = k21.f.t(aVar, str).toString();
        String b0 = z ? t71.p.b0(t71.p.a0(obj, "<"), ">") : obj;
        if (b0.length() == 0) {
            dVar.g(obj);
            return;
        }
        String concat = z2 ? "mailto:".concat(b0) : t71.w.F(b0, "www.", true) ? "https://".concat(b0) : (!t71.p.J(b0, '@') || t71.p.I(b0, "://", false)) ? b0 : "mailto:".concat(b0);
        dVar.j(new h0(eVar.a, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, r3.l.c, (o0) null, 61438));
        int length = dVar.r.length();
        dVar.g(b0);
        dVar.h();
        dVar.a(length, b0.length() + length, "MARKDOWN_INLINE_LINK", concat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g3.g b(ch.e eVar, g3.d dVar, String str, Map map, k91.a aVar) {
        CharSequence t;
        Object obj;
        Object obj2;
        Character ch2;
        Character ch3;
        int j;
        g3.d dVar2 = dVar;
        c21.h0 h0Var = j91.a.j0;
        c21.h0 h0Var2 = j91.a.F;
        c21.h0 h0Var3 = j91.a.b0;
        c21.h0 h0Var4 = j91.a.f;
        c21.h0 h0Var5 = j91.a.T;
        StringBuilder sb = dVar2.r;
        k71.k.g(str, "content");
        k71.k.g(aVar, "node");
        k71.k.g(eVar, "markdownColors");
        k71.k.g(map, "mentionHighlightsToUrls");
        c21.h0 h0Var6 = aVar.a;
        if (k71.k.b(h0Var6, j91.a.j)) {
            Iterator it = aVar.a().iterator();
            while (it.hasNext()) {
                b(eVar, dVar2, str, map, (k91.a) it.next());
            }
        } else {
            boolean b = k71.k.b(h0Var6, j91.a.k);
            x61.s sVar = x61.s.r;
            if (b || k71.k.b(h0Var6, j91.a.a0)) {
                dVar2.j(new h0(0L, 0L, (k3.s) null, new k3.o(1), (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65527));
                Iterator it2 = aVar.a().iterator();
                while (it2.hasNext()) {
                    b(eVar, dVar2, str, sVar, (k91.a) it2.next());
                }
                dVar2.h();
            } else if (k71.k.b(h0Var6, j91.a.l)) {
                dVar2.j(new h0(0L, 0L, k3.s.z, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65531));
                Iterator it3 = aVar.a().iterator();
                while (it3.hasNext()) {
                    b(eVar, dVar2, str, sVar, (k91.a) it3.next());
                }
                dVar2.h();
            } else {
                if (k71.k.b(h0Var6, j91.a.d)) {
                    List a2 = aVar.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : a2) {
                        c21.h0 h0Var7 = ((k91.a) obj3).a;
                        if (!k71.k.b(h0Var7, j91.a.c) && !k71.k.b(h0Var7, j91.a.b) && !k71.k.b(h0Var7, j91.a.g0) && !k71.k.b(h0Var7, j91.a.d0) && !k71.k.b(h0Var7, h0Var5)) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    while (r15 < size) {
                        Object obj4 = arrayList.get(r15);
                        r15++;
                        arrayList2.add(b(eVar, dVar2, str, x61.s.r, (k91.a) obj4));
                    }
                } else {
                    c21.h0 h0Var8 = j91.a.g;
                    if (k71.k.b(h0Var6, h0Var8) || k71.k.b(h0Var6, h0Var4)) {
                        if (k71.k.b(h0Var6, h0Var8)) {
                            Iterator it4 = aVar.a().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it4.next();
                                if (k71.k.b(((k91.a) obj2).a, h0Var2)) {
                                    break;
                                }
                            }
                            k91.a aVar2 = (k91.a) obj2;
                            r15 = aVar2 != null ? aVar2.b : 0;
                            List a3 = aVar.a();
                            ListIterator listIterator = a3.listIterator(a3.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                Object previous = listIterator.previous();
                                if (k71.k.b(((k91.a) previous).a, h0Var2)) {
                                    r17 = previous;
                                    break;
                                }
                            }
                            k91.a aVar3 = (k91.a) r17;
                            t = t71.q.q(str.subSequence(r15, aVar3 != null ? aVar3.c : ((k91.a) x61.m.e0(aVar.a())).c).toString());
                        } else if (k71.k.b(h0Var6, h0Var4)) {
                            Iterator it5 = aVar.a().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it5.next();
                                if (k71.k.b(((k91.a) obj).a, h0Var)) {
                                    break;
                                }
                            }
                            k91.a aVar4 = (k91.a) obj;
                            r15 = aVar4 != null ? aVar4.b : 0;
                            List a4 = aVar.a();
                            ListIterator listIterator2 = a4.listIterator(a4.size());
                            while (true) {
                                if (!listIterator2.hasPrevious()) {
                                    break;
                                }
                                Object previous2 = listIterator2.previous();
                                if (k71.k.b(((k91.a) previous2).a, h0Var)) {
                                    r17 = previous2;
                                    break;
                                }
                            }
                            k91.a aVar5 = (k91.a) r17;
                            if (aVar5 == null) {
                                aVar5 = (k91.a) x61.m.e0(aVar.a());
                            }
                            t = t71.q.q(str.subSequence(r15, aVar5.c).toString());
                        } else {
                            Objects.toString(h0Var6);
                            t = k21.f.t(aVar, str);
                        }
                        dVar2.f(t);
                    } else if (k71.k.b(h0Var6, j91.a.h)) {
                        ch.d dVar3 = eVar.e;
                        h0 h0Var9 = dVar3.a.a;
                        List a5 = aVar.a();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : a5) {
                            if (!k71.k.b(((k91.a) obj5).a, h0Var3)) {
                                arrayList3.add(obj5);
                            }
                        }
                        if (dVar3.c.equals(a.C0000a.a)) {
                            j = dVar2.j(new h0(0L, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, dVar3.b, (r3.l) null, (o0) null, 63487));
                            try {
                                j = dVar2.j(h0Var9);
                                int size2 = arrayList3.size();
                                while (r15 < size2) {
                                    Object obj6 = arrayList3.get(r15);
                                    r15++;
                                    c(eVar, dVar2, str, sVar, (k91.a) obj6);
                                }
                                dVar2.i(j);
                            } finally {
                            }
                        } else {
                            int length = sb.length();
                            j = dVar2.j(h0Var9);
                            try {
                                int size3 = arrayList3.size();
                                while (r15 < size3) {
                                    Object obj7 = arrayList3.get(r15);
                                    r15++;
                                    c(eVar, dVar2, str, sVar, (k91.a) obj7);
                                }
                                dVar2.i(j);
                                dVar2.a(length, sb.length(), "MARKDOWN_CODE_SPAN", "");
                            } finally {
                            }
                        }
                    } else if (k71.k.b(h0Var6, j91.a.r)) {
                        String q = t71.q.q(str.subSequence(aVar.b, aVar.c).toString());
                        int i = 0;
                        while (true) {
                            if (i >= q.length()) {
                                ch2 = null;
                                break;
                            }
                            char charAt = q.charAt(i);
                            if (charAt == '[') {
                                ch2 = Character.valueOf(charAt);
                                break;
                            }
                            i++;
                        }
                        String obj8 = ch2 != null ? t71.p.t0(t71.p.q0(t71.p.k0(ch2.charValue(), q, q), ']')).toString() : null;
                        while (true) {
                            if (r15 >= q.length()) {
                                ch3 = null;
                                break;
                            }
                            char charAt2 = q.charAt(r15);
                            if (charAt2 == '(') {
                                ch3 = Character.valueOf(charAt2);
                                break;
                            }
                            r15++;
                        }
                        String obj9 = ch3 != null ? t71.p.t0(t71.p.q0(t71.p.k0(ch3.charValue(), q, q), ')')).toString() : null;
                        if (obj8 == null || obj8.length() == 0 || obj9 == null || obj9.length() == 0) {
                            dVar2.f(k21.f.t(aVar, str));
                        } else {
                            dVar2.j(new h0(eVar.a, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, r3.l.c, (o0) null, 61438));
                            int length2 = sb.length();
                            dVar2.g(obj8);
                            dVar2.h();
                            dVar2.a(length2, obj8.length() + length2, "MARKDOWN_INLINE_LINK", obj9);
                        }
                    } else if (k71.k.b(h0Var6, j91.a.v)) {
                        a(aVar, dVar2, str, eVar, true, false);
                        dVar2 = dVar;
                    } else if (k71.k.b(h0Var6, n91.c.c)) {
                        dVar2 = dVar;
                        a(aVar, dVar2, str, eVar, false, false);
                    } else if (k71.k.b(h0Var6, j91.a.n0)) {
                        dVar2 = dVar;
                        a(aVar, dVar2, str, eVar, false, true);
                    } else {
                        dVar2 = dVar;
                        if (k71.k.b(h0Var6, j91.a.Z)) {
                            dVar2.f(k21.f.t(aVar, str));
                        } else if (k71.k.b(h0Var6, j91.a.W)) {
                            dVar2.g(t71.q.q(k21.f.t(aVar, str).toString()));
                        } else if (k71.k.b(h0Var6, j91.a.E)) {
                            c(eVar, dVar, str, map, aVar);
                        } else if (k71.k.b(h0Var6, j91.a.I)) {
                            dVar2.c('\'');
                        } else if (k71.k.b(h0Var6, j91.a.J)) {
                            dVar2.c('\"');
                        } else if (k71.k.b(h0Var6, j91.a.K)) {
                            dVar2.c('(');
                        } else if (k71.k.b(h0Var6, j91.a.L)) {
                            dVar2.c(')');
                        } else if (k71.k.b(h0Var6, j91.a.M)) {
                            dVar2.c('[');
                        } else if (k71.k.b(h0Var6, j91.a.N)) {
                            dVar2.c(']');
                        } else if (k71.k.b(h0Var6, j91.a.O)) {
                            dVar2.c('<');
                        } else if (k71.k.b(h0Var6, j91.a.P)) {
                            dVar2.c('>');
                        } else if (k71.k.b(h0Var6, j91.a.Q)) {
                            dVar2.c(':');
                        } else if (k71.k.b(h0Var6, j91.a.R)) {
                            dVar2.c('!');
                        } else if (k71.k.b(h0Var6, h0Var3)) {
                            dVar2.c('`');
                        } else if (k71.k.b(h0Var6, j91.a.S)) {
                            dVar2.g("\n\n");
                        } else if (k71.k.b(h0Var6, h0Var5)) {
                            dVar2.c('\n');
                        } else if (!k71.k.b(h0Var6, j91.a.q0)) {
                            Objects.toString(h0Var6);
                            dVar2.f(k21.f.t(aVar, str));
                        } else if (sb.length() > 0) {
                            dVar2.c(' ');
                        }
                    }
                }
            }
        }
        return dVar2.k();
    }

    public static final void c(ch.e eVar, g3.d dVar, String str, Map map, k91.a aVar) {
        dVar.f(k21.f.t(aVar, str));
        if (map.isEmpty()) {
            return;
        }
        for (t71.l lVar : s71.j.l0(t71.n.b(a, str))) {
            String c = lVar.c();
            String substring = c.substring(1);
            k71.k.f(substring, "substring(...)");
            String str2 = (String) map.get(substring);
            if (str2 != null) {
                int i = ((q71.e) lVar.b()).r;
                dVar.b(new h0(eVar.b, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, eVar.c, (r3.l) null, (o0) null, 63486), i, c.length() + i);
                dVar.a(i, c.length() + i, "MARKDOWN_INLINE_LINK", str2);
            }
        }
    }
    public Object b(int, Object, int) { return null; }
}

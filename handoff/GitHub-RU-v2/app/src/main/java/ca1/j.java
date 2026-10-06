package ca1;

import da1.e0;
import da1.f0;
import da1.g0;
import da1.i0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.StreamSupport;

/* loaded from: /home/user/work/p/classes5.dex */
public class j extends o implements Iterable {
    public static final i x;
    public static final Pattern y;
    public static final String z;
    public g0 u;
    public i v;
    public b w;

    static {
        List list = Collections.EMPTY_LIST;
        x = new i(0);
        y = Pattern.compile("\\s+");
        z = "/baseUri";
    }

    public j(g0 g0Var, String str, b bVar) {
        aa1.b.K(g0Var);
        this.v = x;
        this.w = bVar;
        this.u = g0Var;
        if (ba1.h.e(str)) {
            return;
        }
        aa1.b.K(str);
        G(str);
    }

    public final void D(o oVar) {
        aa1.b.K(oVar);
        j jVar = oVar.r;
        if (jVar != null) {
            jVar.B(oVar);
        }
        oVar.r = this;
        k();
        this.v.add(oVar);
        oVar.s = this.v.size() - 1;
    }

    @Override // ca1.o
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public j i() {
        return (j) super.i();
    }

    public final void G(String str) {
        d().l(z, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j H() {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.v.get(i);
            if (oVar instanceof j) {
                return (j) oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a5.s] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a5.s, ca1.q] */
    public final String I() {
        ea1.r sVar;
        StringBuilder a = ba1.h.a();
        o l = l();
        if (l != null) {
            ba1.a e = ba1.a.e(a);
            g x2 = l.x();
            if (x2 == null) {
                x2 = new g();
            }
            f fVar = x2.A;
            fVar.getClass();
            if (fVar.t) {
                sVar = new q(l, e, fVar, 8);
                sVar.x = false;
                o oVar = l;
                while (true) {
                    if (oVar != null) {
                        if ((oVar instanceof j) && ((j) oVar).u.b(64)) {
                            sVar.x = true;
                            break;
                        }
                        oVar = oVar.r;
                    } else {
                        break;
                    }
                }
            } else {
                sVar = new a5.s(l, e, fVar, 8);
            }
            while (l != null) {
                w8.s.K(sVar, l);
                l = l.q();
            }
        }
        String k = ba1.h.k(a);
        g x3 = x();
        if (x3 == null) {
            x3 = new g();
        }
        return x3.A.t ? k.trim() : k;
    }

    public final void J(String str) {
        String str2 = this.u.r;
        aa1.b.J(str, "tagName");
        aa1.b.J(str2, "namespace");
        g x2 = x();
        f0 f0Var = x2 != null ? x2.B : new f0(new da1.bShadow());
        i0 a = f0Var.a();
        e0 e0Var = f0Var.t;
        a.getClass();
        this.u = a.d(str, null, str2, e0Var.a);
    }

    @Override // ca1.o
    public final b d() {
        if (this.w == null) {
            this.w = new b();
        }
        return this.w;
    }

    @Override // ca1.o
    public final String e() {
        String str;
        j jVar = this;
        while (true) {
            if (jVar == null) {
                str = null;
                break;
            }
            b bVar = jVar.w;
            if (bVar != null) {
                String str2 = z;
                if (bVar.i(str2) != -1) {
                    str = jVar.w.e(str2);
                    break;
                }
            }
            jVar = jVar.r;
        }
        return str != null ? str : "";
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        StreamSupport.stream(Spliterators.spliteratorUnknownSize(new p(this, j.class), 273), false).forEach(consumer);
    }

    @Override // ca1.o
    public final int g() {
        return this.v.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, j.class);
    }

    @Override // ca1.o
    public final o j(o oVar) {
        Map map;
        j jVar = (j) super.j(oVar);
        i iVar = new i(this.v.size());
        jVar.v = iVar;
        iVar.addAll(this.v);
        b bVar = this.w;
        if (bVar != null) {
            b clone = bVar.clone();
            jVar.w = clone;
            if (clone.i("/jsoup.userdata") != -1) {
                int i = clone.i("/jsoup.userdata");
                if (i == -1) {
                    HashMap hashMap = new HashMap();
                    clone.a("/jsoup.userdata", hashMap);
                    map = hashMap;
                } else {
                    map = (Map) clone.t[i];
                }
                map.remove("jsoup.childEls");
            }
        }
        return jVar;
    }

    @Override // ca1.o
    public final List k() {
        if (this.v == x) {
            this.v = new i(4);
        }
        return this.v;
    }

    @Override // ca1.o
    public final boolean o() {
        return this.w != null;
    }

    @Override // ca1.o
    public String s() {
        return this.u.s;
    }

    @Override // ca1.o
    public final String u() {
        return this.u.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r0.c() != false) goto L27;
     */
    @Override // ca1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(ba1.a aVar, f fVar) {
        int i = fVar.w;
        String a = i == 2 ? a.a(this.u.s, 2) : this.u.s;
        aVar.a('<').b(a);
        b bVar = this.w;
        if (bVar != null) {
            bVar.g(aVar, fVar);
        }
        if (!this.v.isEmpty()) {
            aVar.a('>');
            return;
        }
        boolean z2 = i == 2 || !this.u.r.equals("http://www.w3.org/1999/xhtml");
        if (z2) {
            if (!this.u.b(32)) {
                g0 g0Var = this.u;
                int i2 = g0Var.u;
                if ((i2 & 1) != 0) {
                    if ((i2 & 2) == 0) {
                    }
                }
            }
            aVar.b(" />");
            return;
        }
        if (z2 || (this.u.u & 2) == 0) {
            aVar.b("></").b(a).a('>');
        } else {
            aVar.a('>');
        }
    }

    @Override // ca1.o
    public final j z() {
        return this.r;
    }
}

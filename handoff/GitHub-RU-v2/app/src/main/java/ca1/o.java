package ca1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class o implements Cloneable {
    public static final List t = Collections.EMPTY_LIST;
    public j r;
    public int s;

    public final o A() {
        if (this.r == null || C() <= 0) {
            return null;
        }
        return (o) ((ArrayList) this.r.k()).get(this.s - 1);
    }

    public void B(o oVar) {
        aa1.b.G(oVar.r == this);
        j jVar = (j) this;
        if (jVar.v.r) {
            ((ArrayList) k()).remove(oVar.s);
        } else {
            ((ArrayList) k()).remove(oVar);
        }
        jVar.v.r = false;
        oVar.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int C() {
        j jVar = this.r;
        if (jVar != null) {
            i iVar = jVar.v;
            if (!iVar.r) {
                int size = iVar.size();
                for (int i = 0; i < size; i++) {
                    ((o) jVar.v.get(i)).s = i;
                }
                jVar.v.r = true;
            }
        }
        return this.s;
    }

    public String a(String str) {
        Object obj;
        aa1.b.H(str);
        if (!o() || d().j(str) == -1) {
            return "";
        }
        String e = e();
        b d = d();
        int j = d.j(str);
        String str2 = (j == -1 || (obj = d.t[j]) == null) ? "" : (String) obj;
        Pattern pattern = ba1.h.d;
        String replaceAll = pattern.matcher(e).replaceAll("");
        String replaceAll2 = pattern.matcher(str2).replaceAll("");
        try {
            try {
                return ba1.h.l(new URL(replaceAll), replaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(replaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return ba1.h.c.matcher(replaceAll2).find() ? replaceAll2 : "";
        }
    }

    public String b(String str) {
        Object obj;
        aa1.b.K(str);
        if (o()) {
            b d = d();
            int j = d.j(str);
            String str2 = (j == -1 || (obj = d.t[j]) == null) ? "" : (String) obj;
            if (str2.length() > 0) {
                return str2;
            }
            if (str.startsWith("abs:")) {
                return a(str.substring(4));
            }
        }
        return "";
    }

    public abstract b d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract int g();

    @Override // 
    public o i() {
        o j = j(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(j);
        while (!linkedList.isEmpty()) {
            o oVar = (o) linkedList.remove();
            int g = oVar.g();
            for (int i = 0; i < g; i++) {
                List k = oVar.k();
                o j2 = ((o) k.get(i)).j(oVar);
                k.set(i, j2);
                linkedList.add(j2);
            }
        }
        return j;
    }

    public o j(o oVar) {
        g x;
        try {
            o oVar2 = (o) super.clone();
            oVar2.r = (j) oVar;
            oVar2.s = oVar == null ? 0 : C();
            if (oVar == null && !(this instanceof g) && (x = x()) != null) {
                g gVar = new g(x.u.r, x.e(), x.B);
                b bVar = x.w;
                if (bVar != null) {
                    gVar.w = bVar.clone();
                }
                gVar.A = x.A.clone();
                oVar2.r = gVar;
                ((ArrayList) gVar.k()).add(oVar2);
            }
            return oVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract List k();

    public final o l() {
        if (g() == 0) {
            return null;
        }
        return (o) k().get(0);
    }

    public final boolean n(String str) {
        if (!o()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (d().j(substring) != -1 && !a(substring).isEmpty()) {
                return true;
            }
        }
        return d().j(str) != -1;
    }

    public abstract boolean o();

    public final boolean p(String str) {
        return u().equals(str);
    }

    public final o q() {
        j jVar = this.r;
        if (jVar == null) {
            return null;
        }
        List k = jVar.k();
        int C = C() + 1;
        ArrayList arrayList = (ArrayList) k;
        if (arrayList.size() > C) {
            return (o) arrayList.get(C);
        }
        return null;
    }

    public abstract String s();

    public String toString() {
        return v();
    }

    public String u() {
        return s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [a5.s] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a5.s, ca1.q] */
    public String v() {
        ea1.r sVar;
        StringBuilder a = ba1.h.a();
        ba1.a e = ba1.a.e(a);
        g x = x();
        if (x == null) {
            x = new g();
        }
        f fVar = x.A;
        fVar.getClass();
        if (fVar.t) {
            sVar = new q(this, e, fVar, 8);
            sVar.x = false;
            o oVar = this;
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
            sVar = new a5.s(this, e, fVar, 8);
        }
        w8.s.K(sVar, this);
        return ba1.h.k(a);
    }

    public abstract void w(ba1.a aVar, f fVar);

    public final g x() {
        for (o oVar = this; oVar != null; oVar = oVar.r) {
            if (oVar instanceof g) {
                return (g) oVar;
            }
        }
        return null;
    }

    public abstract j z();
}

package m6;

import k71.k;
import s3.o;
import z70.m2;

/* loaded from: /home/user/work/p/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public n6.a f28934a;

    /* renamed from: b, reason: collision with root package name */
    public o f28935b;

    /* renamed from: c, reason: collision with root package name */
    public b f28936c;

    /* renamed from: d, reason: collision with root package name */
    public c f28937d;

    /* renamed from: e, reason: collision with root package name */
    public m2 f28938e;

    public e(n6.a aVar, o oVar, b bVar, c cVar, m2 m2Var) {
        this.f28934a = aVar;
        this.f28935b = oVar;
        this.f28936c = bVar;
        this.f28937d = cVar;
        this.f28938e = m2Var;
    }

    public static e a(e eVar, n6.a aVar, o oVar, b bVar, c cVar, int i) {
        if ((i & 1) != 0) {
            aVar = eVar.f28934a;
        }
        n6.a aVar2 = aVar;
        if ((i & 2) != 0) {
            oVar = eVar.f28935b;
        }
        o oVar2 = oVar;
        if ((i & 4) != 0) {
            bVar = eVar.f28936c;
        }
        b bVar2 = bVar;
        if ((i & 16) != 0) {
            cVar = eVar.f28937d;
        }
        return new e(aVar2, oVar2, bVar2, cVar, eVar.f28938e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.f28934a, eVar.f28934a) && k.b(this.f28935b, eVar.f28935b) && k.b(this.f28936c, eVar.f28936c) && k.b(this.f28937d, eVar.f28937d) && k.b(this.f28938e, eVar.f28938e);
    }

    public final int hashCode() {
        int hashCode = this.f28934a.hashCode() * 31;
        o oVar = this.f28935b;
        int hashCode2 = (hashCode + (oVar != null ? Long.hashCode(oVar.f31710a) : 0)) * 31;
        b bVar = this.f28936c;
        int hashCode3 = (hashCode2 + (bVar != null ? Integer.hashCode(bVar.f28931a) : 0)) * 29791;
        c cVar = this.f28937d;
        int hashCode4 = (hashCode3 + (cVar != null ? Integer.hashCode(cVar.f28932a) : 0)) * 31;
        m2 m2Var = this.f28938e;
        return hashCode4 + (m2Var != null ? m2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextStyle(color=" + this.f28934a + ", fontSize=" + this.f28935b + ", fontWeight=" + this.f28936c + ", fontStyle=null, textDecoration=null, textAlign=" + this.f28937d + ", fontFamily=" + this.f28938e + ')';
    }

    public static Object a;
    public Object b = null;
    public Object c = null;
    public Object d = null;
}

package a71;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a implements f {
    public final g r;

    public a(g gVar) {
        k.g(gVar, "key");
        this.r = gVar;
    }

    @Override // a71.h
    public final /* bridge */ h A(h hVar) {
        return k21.f.y(this, hVar);
    }

    @Override // a71.h
    public /* bridge */ h b0(g gVar) {
        return k21.f.x(this, gVar);
    }

    @Override // a71.f
    public final g getKey() {
        return this.r;
    }

    @Override // a71.h
    public /* bridge */ f w0(g gVar) {
        return k21.f.q(this, gVar);
    }

    @Override // a71.h
    public final Object x0(j71.e eVar, Object obj) {
        return eVar.s(obj, this);
    }
}

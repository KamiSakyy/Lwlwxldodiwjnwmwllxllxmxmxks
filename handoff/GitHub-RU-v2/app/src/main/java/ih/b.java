package ih;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public r0.d a;
    public r0.d b;
    public r0.d c;
    public r0.d d;
    public r0.d e;
    public r0.d f;
    public r0.d g;
    public r0.d h;

    public b(r0.d dVar, r0.d dVar2, r0.d dVar3, r0.d dVar4, r0.d dVar5, r0.d dVar6, r0.d dVar7, r0.d dVar8) {
        k.g(dVar8, "circle");
        this.a = dVar;
        this.b = dVar2;
        this.c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
        this.f = dVar6;
        this.g = dVar7;
        this.h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && k.b(this.f, bVar.f) && k.b(this.g, bVar.g) && k.b(this.h, bVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GitHubShapes(squared=" + this.a + ", button=" + this.b + ", card=" + this.c + ", cardLarge=" + this.d + ", cardExtraLarge=" + this.e + ", chip=" + this.f + ", bottomSheet=" + this.g + ", circle=" + this.h + ")";
    }
}
